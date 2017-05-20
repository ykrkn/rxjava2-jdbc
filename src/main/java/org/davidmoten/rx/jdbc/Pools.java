package org.davidmoten.rx.jdbc;

import org.davidmoten.rx.jdbc.pool.NonBlockingConnectionPool;

public final class Pools {
    
    private Pools() {
        //prevent instantiation
    }
    
    public static NonBlockingConnectionPool.Builder nonBlocking() {
        return NonBlockingConnectionPool.builder();
    }
}
