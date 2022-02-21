package com.geeksville.mesh;

import java.lang.System;

/**
 * A parcelable version of the protobuf MeshPacket + Data subpacket.
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0002NOB\u001b\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bBk\b\u0017\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0019J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0010H\u00c6\u0003J\t\u00109\u001a\u00020\nH\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u0010;\u001a\u00020\nH\u00c6\u0003Ja\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\nH\u00c6\u0001J\b\u0010=\u001a\u00020\nH\u0016J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0096\u0002J\b\u0010B\u001a\u00020\nH\u0016J\u000e\u0010C\u001a\u00020D2\u0006\u0010\u0006\u001a\u00020\u0007J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001J!\u0010F\u001a\u00020D2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u00c7\u0001J\u0018\u0010L\u001a\u00020D2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\nH\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010&R\u001a\u0010\u0011\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001d\"\u0004\b(\u0010&R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!\u00a8\u0006P"}, d2 = {"Lcom/geeksville/mesh/DataPacket;", "Landroid/os/Parcelable;", "to", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "seen1", "", "bytes", "", "dataType", "from", "time", "", "id", "status", "Lcom/geeksville/mesh/MessageStatus;", "hopLimit", "errorMessage", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;[BILjava/lang/String;JILcom/geeksville/mesh/MessageStatus;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;[BILjava/lang/String;JILcom/geeksville/mesh/MessageStatus;I)V", "getBytes", "()[B", "getDataType", "()I", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "getFrom", "setFrom", "getHopLimit", "setHopLimit", "(I)V", "getId", "setId", "getStatus", "()Lcom/geeksville/mesh/MessageStatus;", "setStatus", "(Lcom/geeksville/mesh/MessageStatus;)V", "getText", "getTime", "()J", "setTime", "(J)V", "getTo", "setTo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "readFromParcel", "", "toString", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "flags", "$serializer", "CREATOR", "app_debug"})
public final class DataPacket implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String to;
    @org.jetbrains.annotations.Nullable()
    private final byte[] bytes = null;
    private final int dataType = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String from;
    private long time;
    private int id;
    @org.jetbrains.annotations.Nullable()
    private com.geeksville.mesh.MessageStatus status;
    private int hopLimit;
    
    /**
     * If there was an error with this message, this string describes what was wrong.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String errorMessage;
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.DataPacket.CREATOR CREATOR = null;
    
    /**
     * the Node ID for broadcast destinations
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_BROADCAST = "^all";
    
    /**
     * The Node ID for the local node - used for from when sender doesn't know our local node ID
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_LOCAL = "^local";
    public static final int NODENUM_BROADCAST = -1;
    private static final java.nio.charset.Charset utf8 = null;
    
    /**
     * A parcelable version of the protobuf MeshPacket + Data subpacket.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.DataPacket copy(@org.jetbrains.annotations.Nullable()
    java.lang.String to, @org.jetbrains.annotations.Nullable()
    byte[] bytes, int dataType, @org.jetbrains.annotations.Nullable()
    java.lang.String from, long time, int id, @org.jetbrains.annotations.Nullable()
    com.geeksville.mesh.MessageStatus status, int hopLimit) {
        return null;
    }
    
    /**
     * A parcelable version of the protobuf MeshPacket + Data subpacket.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * A parcelable version of the protobuf MeshPacket + Data subpacket.
     */
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.DataPacket self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public DataPacket(@org.jetbrains.annotations.Nullable()
    java.lang.String to, @org.jetbrains.annotations.Nullable()
    byte[] bytes, int dataType, @org.jetbrains.annotations.Nullable()
    java.lang.String from, long time, int id, @org.jetbrains.annotations.Nullable()
    com.geeksville.mesh.MessageStatus status, int hopLimit) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTo() {
        return null;
    }
    
    public final void setTo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getBytes() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getDataType() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFrom() {
        return null;
    }
    
    public final void setFrom(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getTime() {
        return 0L;
    }
    
    public final void setTime(long p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.geeksville.mesh.MessageStatus component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.geeksville.mesh.MessageStatus getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    com.geeksville.mesh.MessageStatus p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getHopLimit() {
        return 0;
    }
    
    public final void setHopLimit(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * Syntactic sugar to make it easy to create text messages
     */
    public DataPacket(@org.jetbrains.annotations.Nullable()
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getText() {
        return null;
    }
    
    public DataPacket(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
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
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public final void readFromParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001d\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\bJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u00c6\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/geeksville/mesh/DataPacket$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/geeksville/mesh/DataPacket;", "()V", "ID_BROADCAST", "", "ID_LOCAL", "NODENUM_BROADCAST", "", "utf8", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "getUtf8", "()Ljava/nio/charset/Charset;", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "(I)[Lcom/geeksville/mesh/DataPacket;", "nodeNumToDefaultId", "n", "serializer", "Lkotlinx/serialization/KSerializer;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.geeksville.mesh.DataPacket> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.geeksville.mesh.DataPacket> serializer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String nodeNumToDefaultId(int n) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.geeksville.mesh.DataPacket createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.geeksville.mesh.DataPacket[] newArray(int size) {
            return null;
        }
        
        public final java.nio.charset.Charset getUtf8() {
            return null;
        }
    }
    
    /**
     * A parcelable version of the protobuf MeshPacket + Data subpacket.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/geeksville/mesh/DataPacket.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/geeksville/mesh/DataPacket;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.geeksville.mesh.DataPacket> {
        
        /**
         * A parcelable version of the protobuf MeshPacket + Data subpacket.
         */
        @org.jetbrains.annotations.NotNull()
        public static final com.geeksville.mesh.DataPacket.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        /**
         * A parcelable version of the protobuf MeshPacket + Data subpacket.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        /**
         * A parcelable version of the protobuf MeshPacket + Data subpacket.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.geeksville.mesh.DataPacket deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        /**
         * A parcelable version of the protobuf MeshPacket + Data subpacket.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        /**
         * A parcelable version of the protobuf MeshPacket + Data subpacket.
         */
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        com.geeksville.mesh.DataPacket value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        @java.lang.Deprecated()
        public com.geeksville.mesh.DataPacket patch(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder, @org.jetbrains.annotations.NotNull()
        com.geeksville.mesh.DataPacket old) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}