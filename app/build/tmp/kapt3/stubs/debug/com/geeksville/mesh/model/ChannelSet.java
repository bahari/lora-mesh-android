package com.geeksville.mesh.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\u0013\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\u0010\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\tJ\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/geeksville/mesh/model/ChannelSet;", "Lcom/geeksville/android/Logging;", "url", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "protobuf", "Lcom/geeksville/mesh/AppOnlyProtos$ChannelSet;", "(Lcom/geeksville/mesh/AppOnlyProtos$ChannelSet;)V", "editable", "", "getEditable", "()Z", "setEditable", "(Z)V", "primaryChannel", "Lcom/geeksville/mesh/model/Channel;", "getPrimaryChannel", "()Lcom/geeksville/mesh/model/Channel;", "getProtobuf", "()Lcom/geeksville/mesh/AppOnlyProtos$ChannelSet;", "qrCode", "Landroid/graphics/Bitmap;", "getQrCode", "()Landroid/graphics/Bitmap;", "component1", "copy", "equals", "other", "", "getChannelUrl", "upperCasePrefix", "hashCode", "", "toString", "", "Companion", "app_debug"})
public final class ChannelSet implements com.geeksville.android.Logging {
    @org.jetbrains.annotations.NotNull()
    private final com.geeksville.mesh.AppOnlyProtos.ChannelSet protobuf = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.model.ChannelSet.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String prefix = "https://www.meshtastic.org/d/#";
    private static final int base64Flags = 11;
    private boolean editable = false;
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.model.ChannelSet copy(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.AppOnlyProtos.ChannelSet protobuf) {
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
    
    public ChannelSet() {
        super();
    }
    
    public ChannelSet(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.AppOnlyProtos.ChannelSet protobuf) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.AppOnlyProtos.ChannelSet component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.AppOnlyProtos.ChannelSet getProtobuf() {
        return null;
    }
    
    public ChannelSet(@org.jetbrains.annotations.NotNull()
    android.net.Uri url) {
        super();
    }
    
    public final boolean getEditable() {
        return false;
    }
    
    public final void setEditable(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.geeksville.mesh.model.Channel getPrimaryChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getChannelUrl(boolean upperCasePrefix) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getQrCode() {
        return null;
    }
    
    public void debug(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public void errormsg(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable ex) {
    }
    
    public void info(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public void logAssert(boolean f) {
    }
    
    public void reportError(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    public void verbose(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public void warn(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/geeksville/mesh/model/ChannelSet$Companion;", "", "()V", "base64Flags", "", "prefix", "", "urlToChannels", "Lcom/geeksville/mesh/AppOnlyProtos$ChannelSet;", "url", "Landroid/net/Uri;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.geeksville.mesh.AppOnlyProtos.ChannelSet urlToChannels(android.net.Uri url) {
            return null;
        }
    }
}