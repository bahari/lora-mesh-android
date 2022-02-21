package com.geeksville.mesh.service;

import java.lang.System;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eB3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003JB\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020\u0003H\u0016J\t\u0010$\u001a\u00020%H\u00d6\u0001J!\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u00c7\u0001R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006/"}, d2 = {"Lcom/geeksville/mesh/service/MeshServiceSettingsData;", "", "seen1", "", "nodeDB", "", "Lcom/geeksville/mesh/NodeInfo;", "myInfo", "Lcom/geeksville/mesh/MyNodeInfo;", "messages", "Lcom/geeksville/mesh/DataPacket;", "regionCode", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[Lcom/geeksville/mesh/NodeInfo;Lcom/geeksville/mesh/MyNodeInfo;[Lcom/geeksville/mesh/DataPacket;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([Lcom/geeksville/mesh/NodeInfo;Lcom/geeksville/mesh/MyNodeInfo;[Lcom/geeksville/mesh/DataPacket;I)V", "getMessages", "()[Lcom/geeksville/mesh/DataPacket;", "[Lcom/geeksville/mesh/DataPacket;", "getMyInfo", "()Lcom/geeksville/mesh/MyNodeInfo;", "getNodeDB", "()[Lcom/geeksville/mesh/NodeInfo;", "[Lcom/geeksville/mesh/NodeInfo;", "getRegionCode", "()I", "component1", "component2", "component3", "component4", "copy", "([Lcom/geeksville/mesh/NodeInfo;Lcom/geeksville/mesh/MyNodeInfo;[Lcom/geeksville/mesh/DataPacket;I)Lcom/geeksville/mesh/service/MeshServiceSettingsData;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
public final class MeshServiceSettingsData {
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.service.MeshServiceSettingsData.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private final com.geeksville.mesh.NodeInfo[] nodeDB = null;
    @org.jetbrains.annotations.NotNull()
    private final com.geeksville.mesh.MyNodeInfo myInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.geeksville.mesh.DataPacket[] messages = null;
    private final int regionCode = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.service.MeshServiceSettingsData copy(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.NodeInfo[] nodeDB, @org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.MyNodeInfo myInfo, @org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.DataPacket[] messages, int regionCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.service.MeshServiceSettingsData self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public MeshServiceSettingsData(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.NodeInfo[] nodeDB, @org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.MyNodeInfo myInfo, @org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.DataPacket[] messages, int regionCode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.NodeInfo[] component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.NodeInfo[] getNodeDB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.MyNodeInfo component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.MyNodeInfo getMyInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.DataPacket[] component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.DataPacket[] getMessages() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getRegionCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/geeksville/mesh/service/MeshServiceSettingsData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/geeksville/mesh/service/MeshServiceSettingsData;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.geeksville.mesh.service.MeshServiceSettingsData> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/geeksville/mesh/service/MeshServiceSettingsData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/geeksville/mesh/service/MeshServiceSettingsData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.geeksville.mesh.service.MeshServiceSettingsData> {
        @org.jetbrains.annotations.NotNull()
        public static final com.geeksville.mesh.service.MeshServiceSettingsData.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.geeksville.mesh.service.MeshServiceSettingsData deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        com.geeksville.mesh.service.MeshServiceSettingsData value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        @java.lang.Deprecated()
        public com.geeksville.mesh.service.MeshServiceSettingsData patch(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder, @org.jetbrains.annotations.NotNull()
        com.geeksville.mesh.service.MeshServiceSettingsData old) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}