package com.geeksville.mesh.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/geeksville/mesh/model/ChannelOption;", "", "modemConfig", "Lcom/geeksville/mesh/ChannelProtos$ChannelSettings$ModemConfig;", "configRes", "", "minBroadcastPeriodSecs", "(Ljava/lang/String;ILcom/geeksville/mesh/ChannelProtos$ChannelSettings$ModemConfig;II)V", "getConfigRes", "()I", "getMinBroadcastPeriodSecs", "getModemConfig", "()Lcom/geeksville/mesh/ChannelProtos$ChannelSettings$ModemConfig;", "SHORT", "MEDIUM", "LONG", "VERY_LONG", "Companion", "app_debug"})
public enum ChannelOption {
    /*public static final*/ SHORT /* = new SHORT(null, 0, 0) */,
    /*public static final*/ MEDIUM /* = new MEDIUM(null, 0, 0) */,
    /*public static final*/ LONG /* = new LONG(null, 0, 0) */,
    /*public static final*/ VERY_LONG /* = new VERY_LONG(null, 0, 0) */;
    @org.jetbrains.annotations.NotNull()
    private final com.geeksville.mesh.ChannelProtos.ChannelSettings.ModemConfig modemConfig = null;
    private final int configRes = 0;
    private final int minBroadcastPeriodSecs = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.model.ChannelOption.Companion Companion = null;
    private static final int defaultMinBroadcastPeriod = 0;
    
    ChannelOption(com.geeksville.mesh.ChannelProtos.ChannelSettings.ModemConfig modemConfig, int configRes, int minBroadcastPeriodSecs) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.ChannelProtos.ChannelSettings.ModemConfig getModemConfig() {
        return null;
    }
    
    public final int getConfigRes() {
        return 0;
    }
    
    public final int getMinBroadcastPeriodSecs() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/geeksville/mesh/model/ChannelOption$Companion;", "", "()V", "defaultMinBroadcastPeriod", "", "getDefaultMinBroadcastPeriod", "()I", "fromConfig", "Lcom/geeksville/mesh/model/ChannelOption;", "modemConfig", "Lcom/geeksville/mesh/ChannelProtos$ChannelSettings$ModemConfig;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.geeksville.mesh.model.ChannelOption fromConfig(@org.jetbrains.annotations.Nullable()
        com.geeksville.mesh.ChannelProtos.ChannelSettings.ModemConfig modemConfig) {
            return null;
        }
        
        public final int getDefaultMinBroadcastPeriod() {
            return 0;
        }
    }
}