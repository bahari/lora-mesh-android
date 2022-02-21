package com.geeksville.mesh.service;

import java.lang.System;

/**
 * An interface that assumes we are talking to a meshtastic device over some sort of stream connection (serial or TCP probably)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0017H\u0004J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u000fH&R\u0012\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\""}, d2 = {"Lcom/geeksville/mesh/service/StreamInterface;", "Lcom/geeksville/android/Logging;", "Lcom/geeksville/mesh/service/IRadioInterface;", "service", "Lcom/geeksville/mesh/service/RadioInterfaceService;", "(Lcom/geeksville/mesh/service/RadioInterfaceService;)V", "debugLineBuf", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "lsb", "", "msb", "packetLen", "ptr", "rxPacket", "", "getService", "()Lcom/geeksville/mesh/service/RadioInterfaceService;", "close", "", "connect", "debugOut", "b", "", "flushBytes", "handleSendToRadio", "p", "onDeviceDisconnect", "waitForStopped", "", "readChar", "c", "sendBytes", "Companion", "app_debug"})
public abstract class StreamInterface implements com.geeksville.android.Logging, com.geeksville.mesh.service.IRadioInterface {
    @org.jetbrains.annotations.NotNull()
    private final com.geeksville.mesh.service.RadioInterfaceService service = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.service.StreamInterface.Companion Companion = null;
    private static final byte START1 = (byte)-108;
    private static final byte START2 = (byte)-61;
    private static final int MAX_TO_FROM_RADIO_SIZE = 512;
    private final java.lang.StringBuilder debugLineBuf = null;
    
    /**
     * The index of the next byte we are hoping to receive
     */
    private int ptr = 0;
    
    /**
     * The two halves of our length
     */
    private int msb = 0;
    private int lsb = 0;
    private int packetLen = 0;
    private final byte[] rxPacket = null;
    
    public StreamInterface(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.service.RadioInterfaceService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.geeksville.mesh.service.RadioInterfaceService getService() {
        return null;
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    /**
     * Tell MeshService our device has gone away, but wait for it to come back
     *
     * @param waitForStopped if true we should wait for the manager to finish - must be false if called from inside the manager callbacks
     */
    protected void onDeviceDisconnect(boolean waitForStopped) {
    }
    
    protected void connect() {
    }
    
    public abstract void sendBytes(@org.jetbrains.annotations.NotNull()
    byte[] p);
    
    public void flushBytes() {
    }
    
    @java.lang.Override()
    public void handleSendToRadio(@org.jetbrains.annotations.NotNull()
    byte[] p) {
    }
    
    /**
     * Print device serial debug output somewhere
     */
    private final void debugOut(byte b) {
    }
    
    protected final void readChar(byte c) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/geeksville/mesh/service/StreamInterface$Companion;", "Lcom/geeksville/android/Logging;", "()V", "MAX_TO_FROM_RADIO_SIZE", "", "START1", "", "START2", "app_debug"})
    public static final class Companion implements com.geeksville.android.Logging {
        
        private Companion() {
            super();
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