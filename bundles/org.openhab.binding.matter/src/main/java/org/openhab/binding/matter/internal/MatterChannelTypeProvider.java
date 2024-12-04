/**
 * Copyright (c) 2010-2024 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.matter.internal;

import java.net.URI;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.storage.StorageService;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.binding.AbstractStorageBasedTypeProvider;
import org.openhab.core.thing.binding.ThingTypeProvider;
import org.openhab.core.thing.type.*;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 *
 * @author Dan Cunningham - Initial contribution
 */
@NonNullByDefault
@Component(immediate = false, service = { ThingTypeProvider.class, ChannelTypeProvider.class,
        ChannelGroupTypeProvider.class, MatterChannelTypeProvider.class })
public class MatterChannelTypeProvider extends AbstractStorageBasedTypeProvider {
    private final ThingTypeRegistry thingTypeRegistry;

    @Activate
    public MatterChannelTypeProvider(@Reference ThingTypeRegistry thingTypeRegistry,
            @Reference StorageService storageService) {
        super(storageService);
        this.thingTypeRegistry = thingTypeRegistry;
    }

    public ThingTypeBuilder derive(ThingTypeUID newTypeId, ThingTypeUID baseTypeId) {
        ThingType baseType = thingTypeRegistry.getThingType(baseTypeId);

        ThingTypeBuilder result = ThingTypeBuilder.instance(newTypeId, baseType.getLabel())
                .withChannelGroupDefinitions(baseType.getChannelGroupDefinitions())
                .withChannelDefinitions(baseType.getChannelDefinitions())
                .withExtensibleChannelTypeIds(baseType.getExtensibleChannelTypeIds())
                .withSupportedBridgeTypeUIDs(baseType.getSupportedBridgeTypeUIDs())
                .withProperties(baseType.getProperties()).isListed(false);

        String representationProperty = baseType.getRepresentationProperty();
        if (representationProperty != null) {
            result = result.withRepresentationProperty(representationProperty);
        }
        URI configDescriptionURI = baseType.getConfigDescriptionURI();
        if (configDescriptionURI != null) {
            result = result.withConfigDescriptionURI(configDescriptionURI);
        }
        String category = baseType.getCategory();
        if (category != null) {
            result = result.withCategory(category);
        }
        String description = baseType.getDescription();
        if (description != null) {
            result = result.withDescription(description);
        }

        return result;
    }

    public void updateChannelGroupTypesForPrefix(String prefix, Collection<ChannelGroupType> types) {
        Collection<ChannelGroupType> oldCgts = channelGroupTypesForPrefix(prefix);

        Set<ChannelGroupTypeUID> oldUids = oldCgts.stream().map(ChannelGroupType::getUID).collect(Collectors.toSet());
        Collection<ChannelGroupTypeUID> uids = types.stream().map(ChannelGroupType::getUID).toList();

        oldUids.removeAll(uids);
        // oldUids now contains only UIDs that no longer exist. so remove them
        oldUids.forEach(this::removeChannelGroupType);
        types.forEach(this::putChannelGroupType);
    }

    public void removeChannelGroupTypesForPrefix(String prefix) {
        channelGroupTypesForPrefix(prefix).forEach(cgt -> removeChannelGroupType(cgt.getUID()));
    }

    private Collection<ChannelGroupType> channelGroupTypesForPrefix(String prefix) {
        return getChannelGroupTypes(null).stream().filter(cgt -> cgt.getUID().getId().startsWith(prefix + "_"))
                .toList();
    }
}
