package com.geeksville.mesh;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002IJBM\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fBC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010/\u001a\u00020\nH\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003JI\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003H\u00c6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001J\u0017\u00104\u001a\u0004\u0018\u00010\u00032\b\u00105\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0002\u00106J\u0012\u00107\u001a\u0004\u0018\u0001082\b\u00105\u001a\u0004\u0018\u00010\u0000J\u0013\u00109\u001a\u00020\u00152\b\u0010:\u001a\u0004\u0018\u00010;H\u00d6\u0003J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001J\t\u0010=\u001a\u000208H\u00d6\u0001J!\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u00c7\u0001J\u0019\u0010E\u001a\u00020?2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u001d\u00a8\u0006K"}, d2 = {"Lcom/geeksville/mesh/NodeInfo;", "Landroid/os/Parcelable;", "seen1", "", "num", "user", "Lcom/geeksville/mesh/MeshUser;", "position", "Lcom/geeksville/mesh/Position;", "snr", "", "rssi", "lastHeard", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/geeksville/mesh/MeshUser;Lcom/geeksville/mesh/Position;FIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILcom/geeksville/mesh/MeshUser;Lcom/geeksville/mesh/Position;FII)V", "batteryPctLevel", "getBatteryPctLevel", "()Ljava/lang/Integer;", "isOnline", "", "()Z", "getLastHeard", "()I", "setLastHeard", "(I)V", "getNum", "getPosition", "()Lcom/geeksville/mesh/Position;", "setPosition", "(Lcom/geeksville/mesh/Position;)V", "getRssi", "setRssi", "getSnr", "()F", "setSnr", "(F)V", "getUser", "()Lcom/geeksville/mesh/MeshUser;", "setUser", "(Lcom/geeksville/mesh/MeshUser;)V", "validPosition", "getValidPosition", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "distance", "o", "(Lcom/geeksville/mesh/NodeInfo;)Ljava/lang/Integer;", "distanceStr", "", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "app_debug"})
public final class NodeInfo implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.NodeInfo.Companion Companion = null;
    private final int num = 0;
    @org.jetbrains.annotations.Nullable()
    private com.geeksville.mesh.MeshUser user;
    @org.jetbrains.annotations.Nullable()
    private com.geeksville.mesh.Position position;
    private float snr;
    private int rssi;
    private int lastHeard;
    public static final android.os.Parcelable.Creator<com.geeksville.mesh.NodeInfo> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.NodeInfo copy(int num, @org.jetbrains.annotations.Nullable()
    com.geeksville.mesh.MeshUser user, @org.jetbrains.annotations.Nullable()
    com.geeksville.mesh.Position position, float snr, int rssi, int lastHeard) {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.NodeInfo self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public NodeInfo(int num, @org.jetbrains.annotations.Nullable()
    com.geeksville.mesh.MeshUser user, @org.jetbrains.annotations.Nullable()
    com.geeksville.mesh.Position position, float snr, int rssi, int lastHeard) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getNum() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.geeksville.mesh.MeshUser component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.geeksville.mesh.MeshUser getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    com.geeksville.mesh.MeshUser p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.geeksville.mesh.Position component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.geeksville.mesh.Position getPosition() {
        return null;
    }
    
    public final void setPosition(@org.jetbrains.annotations.Nullable()
    com.geeksville.mesh.Position p0) {
    }
    
    public final float component4() {
        return 0.0F;
    }
    
    public final float getSnr() {
        return 0.0F;
    }
    
    public final void setSnr(float p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getRssi() {
        return 0;
    }
    
    public final void setRssi(int p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getLastHeard() {
        return 0;
    }
    
    public final void setLastHeard(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBatteryPctLevel() {
        return null;
    }
    
    public final boolean isOnline() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.geeksville.mesh.Position getValidPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer distance(@org.jetbrains.annotations.Nullable()
    com.geeksville.mesh.NodeInfo o) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String distanceStr(@org.jetbrains.annotations.Nullable()
    com.geeksville.mesh.NodeInfo o) {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.geeksville.mesh.NodeInfo> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.geeksville.mesh.NodeInfo createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.geeksville.mesh.NodeInfo[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/geeksville/mesh/NodeInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/geeksville/mesh/NodeInfo;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.geeksville.mesh.NodeInfo> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/geeksville/mesh/NodeInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/geeksville/mesh/NodeInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.geeksville.mesh.NodeInfo> {
        @org.jetbrains.annotations.NotNull()
        public static final com.geeksville.mesh.NodeInfo.$serializer INSTANCE = null;
        
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
        public com.geeksville.mesh.NodeInfo deserialize(@org.jetbrains.annotations.NotNull()
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
        com.geeksville.mesh.NodeInfo value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        @java.lang.Deprecated()
        public com.geeksville.mesh.NodeInfo patch(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder, @org.jetbrains.annotations.NotNull()
        com.geeksville.mesh.NodeInfo old) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}