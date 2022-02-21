package com.geeksville.mesh.service;

import java.lang.System;

/**
 * An interface that assumes we are talking to a meshtastic device via USB serial
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001dB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/geeksville/mesh/service/SerialInterface;", "Lcom/geeksville/mesh/service/StreamInterface;", "Lcom/geeksville/android/Logging;", "Lcom/hoho/android/usbserial/util/SerialInputOutputManager$Listener;", "service", "Lcom/geeksville/mesh/service/RadioInterfaceService;", "address", "", "(Lcom/geeksville/mesh/service/RadioInterfaceService;Ljava/lang/String;)V", "ioManager", "Lcom/hoho/android/usbserial/util/SerialInputOutputManager;", "uart", "Lcom/hoho/android/usbserial/driver/UsbSerialDriver;", "usbReceiver", "Landroid/content/BroadcastReceiver;", "close", "", "connect", "onDeviceDisconnect", "waitForStopped", "", "onNewData", "data", "", "onRunError", "e", "Ljava/lang/Exception;", "sendBytes", "p", "Companion", "app_debug"})
public final class SerialInterface extends com.geeksville.mesh.service.StreamInterface implements com.geeksville.android.Logging, com.hoho.android.usbserial.util.SerialInputOutputManager.Listener {
    private final java.lang.String address = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.service.SerialInterface.Companion Companion = null;
    
    /**
     * according to https://stackoverflow.com/questions/12388914/usb-device-access-pop-up-suppression/15151075#15151075
     * we should never ask for USB permissions ourselves, instead we should rely on the external dialog printed by the system.  If
     * we do that the system will remember we have accesss
     */
    public static final boolean assumePermission = true;
    private com.hoho.android.usbserial.driver.UsbSerialDriver uart;
    private com.hoho.android.usbserial.util.SerialInputOutputManager ioManager;
    private android.content.BroadcastReceiver usbReceiver;
    
    public SerialInterface(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.service.RadioInterfaceService service, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        super(null);
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    /**
     * Tell MeshService our device has gone away, but wait for it to come back
     *
     * @param waitForStopped if true we should wait for the manager to finish - must be false if called from inside the manager callbacks
     */
    @java.lang.Override()
    protected void onDeviceDisconnect(boolean waitForStopped) {
    }
    
    @java.lang.Override()
    protected void connect() {
    }
    
    @java.lang.Override()
    public void sendBytes(@org.jetbrains.annotations.NotNull()
    byte[] p) {
    }
    
    /**
     * Called when [SerialInputOutputManager.run] aborts due to an error.
     */
    @java.lang.Override()
    public void onRunError(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    /**
     * Called when new incoming data is available.
     */
    @java.lang.Override()
    public void onNewData(@org.jetbrains.annotations.NotNull()
    byte[] data) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/geeksville/mesh/service/SerialInterface$Companion;", "Lcom/geeksville/android/Logging;", "Lcom/geeksville/mesh/service/InterfaceFactory;", "()V", "assumePermission", "", "addressValid", "context", "Landroid/content/Context;", "rest", "", "createInterface", "Lcom/geeksville/mesh/service/IRadioInterface;", "service", "Lcom/geeksville/mesh/service/RadioInterfaceService;", "findDrivers", "", "Lcom/hoho/android/usbserial/driver/UsbSerialDriver;", "findSerial", "toInterfaceName", "deviceName", "app_debug"})
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
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String toInterfaceName(@org.jetbrains.annotations.NotNull()
        java.lang.String deviceName) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.hoho.android.usbserial.driver.UsbSerialDriver> findDrivers(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @java.lang.Override()
        public boolean addressValid(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String rest) {
            return false;
        }
        
        private final com.hoho.android.usbserial.driver.UsbSerialDriver findSerial(android.content.Context context, java.lang.String rest) {
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