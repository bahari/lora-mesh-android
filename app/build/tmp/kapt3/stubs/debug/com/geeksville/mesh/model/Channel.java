package com.geeksville.mesh.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0019\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lcom/geeksville/mesh/model/Channel;", "", "settings", "Lcom/geeksville/mesh/ChannelProtos$ChannelSettings;", "(Lcom/geeksville/mesh/ChannelProtos$ChannelSettings;)V", "humanName", "", "getHumanName", "()Ljava/lang/String;", "modemConfig", "Lcom/geeksville/mesh/ChannelProtos$ChannelSettings$ModemConfig;", "getModemConfig", "()Lcom/geeksville/mesh/ChannelProtos$ChannelSettings$ModemConfig;", "name", "getName", "psk", "Lcom/google/protobuf/ByteString;", "kotlin.jvm.PlatformType", "getPsk", "()Lcom/google/protobuf/ByteString;", "getSettings", "()Lcom/geeksville/mesh/ChannelProtos$ChannelSettings;", "component1", "copy", "equals", "", "o", "hashCode", "", "toString", "Companion", "app_debug"})
public final class Channel {
    @org.jetbrains.annotations.NotNull()
    private final com.geeksville.mesh.ChannelProtos.ChannelSettings settings = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.model.Channel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final byte[] channelDefaultKey = null;
    private static final com.google.protobuf.ByteString cleartextPSK = null;
    private static final byte[] defaultPSK = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.model.Channel copy(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.ChannelProtos.ChannelSettings settings) {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Channel(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.ChannelProtos.ChannelSettings settings) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.ChannelProtos.ChannelSettings component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.ChannelProtos.ChannelSettings getSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.ChannelProtos.ChannelSettings.ModemConfig getModemConfig() {
        return null;
    }
    
    public final com.google.protobuf.ByteString getPsk() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHumanName() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object o) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/geeksville/mesh/model/Channel$Companion;", "", "()V", "channelDefaultKey", "", "getChannelDefaultKey", "()[B", "cleartextPSK", "Lcom/google/protobuf/ByteString;", "kotlin.jvm.PlatformType", "default", "Lcom/geeksville/mesh/model/Channel;", "getDefault", "()Lcom/geeksville/mesh/model/Channel;", "defaultPSK", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] getChannelDefaultKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.geeksville.mesh.model.Channel getDefault() {
            return null;
        }
    }
}