package com.geeksville.mesh.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006#"}, d2 = {"Lcom/geeksville/mesh/service/TCPInterface;", "Lcom/geeksville/mesh/service/StreamInterface;", "service", "Lcom/geeksville/mesh/service/RadioInterfaceService;", "address", "", "(Lcom/geeksville/mesh/service/RadioInterfaceService;Ljava/lang/String;)V", "inStream", "Ljava/io/InputStream;", "getInStream", "()Ljava/io/InputStream;", "setInStream", "(Ljava/io/InputStream;)V", "outStream", "Ljava/io/OutputStream;", "getOutStream", "()Ljava/io/OutputStream;", "setOutStream", "(Ljava/io/OutputStream;)V", "socket", "Ljava/net/Socket;", "getSocket", "()Ljava/net/Socket;", "setSocket", "(Ljava/net/Socket;)V", "connect", "", "flushBytes", "onDeviceDisconnect", "waitForStopped", "", "sendBytes", "p", "", "Companion", "app_debug"})
public final class TCPInterface extends com.geeksville.mesh.service.StreamInterface {
    private final java.lang.String address = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.service.TCPInterface.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private java.net.Socket socket;
    public java.io.OutputStream outStream;
    public java.io.InputStream inStream;
    
    public TCPInterface(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.service.RadioInterfaceService service, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.net.Socket getSocket() {
        return null;
    }
    
    public final void setSocket(@org.jetbrains.annotations.Nullable()
    java.net.Socket p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.OutputStream getOutStream() {
        return null;
    }
    
    public final void setOutStream(@org.jetbrains.annotations.NotNull()
    java.io.OutputStream p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.InputStream getInStream() {
        return null;
    }
    
    public final void setInStream(@org.jetbrains.annotations.NotNull()
    java.io.InputStream p0) {
    }
    
    @java.lang.Override()
    public void sendBytes(@org.jetbrains.annotations.NotNull()
    byte[] p) {
    }
    
    @java.lang.Override()
    public void flushBytes() {
    }
    
    @java.lang.Override()
    protected void onDeviceDisconnect(boolean waitForStopped) {
    }
    
    @java.lang.Override()
    protected void connect() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/geeksville/mesh/service/TCPInterface$Companion;", "Lcom/geeksville/android/Logging;", "Lcom/geeksville/mesh/service/InterfaceFactory;", "()V", "createInterface", "Lcom/geeksville/mesh/service/IRadioInterface;", "service", "Lcom/geeksville/mesh/service/RadioInterfaceService;", "rest", "", "app_debug"})
    public static final class Companion extends com.geeksville.mesh.service.InterfaceFactory implements com.geeksville.android.Logging {
        
        private Companion() {
            super('\u0000');
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.geeksville.mesh.service.IRadioInterface createInterface(@org.jetbrains.annotations.NotNull()
        com.geeksville.mesh.service.RadioInterfaceService service, @org.jetbrains.annotations.NotNull()
        java.lang.String rest) {
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
    }
}