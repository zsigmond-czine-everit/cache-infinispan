package org.everit.osgi.cache.infinispan.component;
/**
 * Defines standard names for infinispan cache factory component configuration
 */
public final class Constants {

    /**
     * Specifies the mode of the Cache to be created.
     */
    public static final String PARAM_CACHEMODE = "cacheMode";
    /**
     * Option for "PARAM_CACHEMODE". Sets Synchronous distributed cache mode.
     */
    public static final String CACHEMODE_DIST_SYNC = "DIST_SYNC";
    /**
     * Option for "PARAM_CACHEMODE". Sets Asynchronous distributed cache mode.
     */
    public static final String CACHEMODE_DIST_ASYNC = "DIST_ASYNC";
    /**
     * Option for "PARAM_CACHEMODE". Sets Local cache mode.
     */
    public static final String CACHEMODE_LOCAL = "LOCAL";
    /**
     * Option for "PARAM_CACHEMODE". Sets Asynchronous Data replicated cache mode.
     */
    public static final String CACHEMODE_REPL_ASYNC = "REPL_ASYNC";
    /**
     * Option for "PARAM_CACHEMODE". Sets Synchronous Data replicated cache mode.
     */
    public static final String CACHEMODE_REPL_SYNC = "REPL_SYNC";
    /**
     * Option for "PARAM_CACHEMODE". Sets Invalidated asynchronous cache mode.
     */
    public static final String CACHEMODE_INVALIDATION_ASYNC = "INV_ASYNC";
    /**
     * Option for "PARAM_CACHEMODE". Sets Invalidated synchronous cache mode.
     */
    public static final String CACHEMODE_INVALIDATION_SYNC = "INV_SYNC";

    /**
     * Interval (in milliseconds) between subsequent runs to purge expired entries from memory and any cache stores. If
     * you wish to disable the periodic eviction process altogether, set wakeupInterval to -1. The only acceptable type
     * for this setting is Long.
     */
    public static final String PARAM_WAKEUPINTERVAL = "wakeUpInterval";
    /**
     * Maximum idle time a cache entry will be maintained in the cache, in milliseconds. If the idle time is exceeded,
     * the entry will be expired cluster-wide. -1 means the entries never expire. Note that this can be overridden on a
     * per-entry basis by using the Cache API. The only acceptable type for this setting is Long.
     */
    public static final String PARAM_MAXIDLE = "maxIdle";
    /**
     * Number of cluster-wide replicas for each cache entry. The only acceptable type for this setting is Integer.
     */
    public static final String PARAM_NUMOWNERS = "numOwners";

    private Constants() {
    }
}
