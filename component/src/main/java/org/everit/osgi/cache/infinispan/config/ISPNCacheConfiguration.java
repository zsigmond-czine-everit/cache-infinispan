/**
 * This file is part of Everit - Infinispan Cache.
 *
 * Everit - Infinispan Cache is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - Infinispan Cache is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - Infinispan Cache.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.cache.infinispan.config;

import java.util.Map;

import javax.transaction.TransactionManager;
import javax.transaction.TransactionSynchronizationRegistry;

import org.everit.osgi.cache.api.CacheConfiguration;
import org.infinispan.configuration.cache.ConfigurationBuilder;

public class ISPNCacheConfiguration<K, V> implements CacheConfiguration<K, V> {

    private final String cacheName;

    private final Map<String, Object> properties;

    private final TransactionManager transactionManager;

    private final TransactionSynchronizationRegistry transactionSynchronizationRegistry;

    public ISPNCacheConfiguration(final String cacheName, final Map<String, Object> properties,
            final TransactionManager transactionManager,
            final TransactionSynchronizationRegistry transactionSynchronizationRegistry) {
        this.cacheName = cacheName;
        this.properties = properties;
        this.transactionManager = transactionManager;
        this.transactionSynchronizationRegistry = transactionSynchronizationRegistry;
    }

    public void applySettingsOnConfigurationBuilder(final ConfigurationBuilder configurationBuilder) {

    }

    public String getCacheName() {
        return cacheName;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }
}