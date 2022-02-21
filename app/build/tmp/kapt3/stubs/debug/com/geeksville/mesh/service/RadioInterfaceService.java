package com.geeksville.mesh.service;

import java.lang.System;

/**
 * Handles the bluetooth link with a mesh radio device.  Does not cache any device state,
 * just does bluetooth comms etc...
 *
 * This service is not exposed outside of this process.
 *
 * Note - this class intentionally dumb.  It doesn't understand protobuf framing etc...
 * It is designed to be simple so it can be stubbed out with a simulated version as needed.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0002J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0014\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0006\u0010#\u001a\u00020\u0019J\b\u0010$\u001a\u00020\u0019H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tJ\u0012\u0010\'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)H\u0003J\b\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006-"}, d2 = {"Lcom/geeksville/mesh/service/RadioInterfaceService;", "Landroid/app/Service;", "Lcom/geeksville/android/Logging;", "()V", "binder", "Lcom/geeksville/mesh/IRadioInterfaceService$Stub;", "bluetoothStateReceiver", "Lcom/geeksville/mesh/service/BluetoothStateReceiver;", "isConnected", "", "isStarted", "logReceives", "logSends", "radioIf", "Lcom/geeksville/mesh/service/IRadioInterface;", "receivedPacketsLog", "Lcom/geeksville/android/BinaryLogFile;", "sentPacketsLog", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "getServiceScope", "()Lkotlinx/coroutines/CoroutineScope;", "setServiceScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "broadcastConnectionChanged", "", "isPermanent", "handleFromRadio", "p", "", "handleSendToRadio", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onConnect", "onCreate", "onDestroy", "onDisconnect", "setBondedDeviceAddress", "address", "", "startInterface", "stopInterface", "Companion", "app_debug"})
public final class RadioInterfaceService extends android.app.Service implements com.geeksville.android.Logging {
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.service.RadioInterfaceService.Companion Companion = null;
    
    /**
     * The RECEIVED_FROMRADIO
     * Payload will be the raw bytes which were contained within a MeshProtos.FromRadio protobuf
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RECEIVE_FROMRADIO_ACTION = "com.geeksville.mesh.RECEIVE_FROMRADIO";
    
    /**
     * This is broadcast when connection state changed
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RADIO_CONNECTED_ACTION = "com.geeksville.mesh.CONNECT_CHANGED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEVADDR_KEY = "devAddr2";
    private static com.geeksville.mesh.service.RadioInterfaceService runningService;
    private final boolean logSends = false;
    private final boolean logReceives = false;
    private com.geeksville.android.BinaryLogFile sentPacketsLog;
    private com.geeksville.android.BinaryLogFile receivedPacketsLog;
    
    /**
     * We recreate this scope each time we stop an interface
     */
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.CoroutineScope serviceScope;
    private com.geeksville.mesh.service.IRadioInterface radioIf;
    
    /**
     * true if we have started our interface
     *
     * Note: an interface may be started without necessarily yet having a connection
     */
    private boolean isStarted = false;
    private boolean isConnected = false;
    
    /**
     * If the user turns on bluetooth after we start, make sure to try and reconnected then
     */
    private final com.geeksville.mesh.service.BluetoothStateReceiver bluetoothStateReceiver = null;
    private final com.geeksville.mesh.IRadioInterfaceService.Stub binder = null;
    
    public RadioInterfaceService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getServiceScope() {
        return null;
    }
    
    public final void setServiceScope(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope p0) {
    }
    
    private final void broadcastConnectionChanged(boolean isConnected, boolean isPermanent) {
    }
    
    private final void handleSendToRadio(byte[] p) {
    }
    
    public final void handleFromRadio(@org.jetbrains.annotations.NotNull()
    byte[] p) {
    }
    
    public final void onConnect() {
    }
    
    public final void onDisconnect(boolean isPermanent) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    /**
     * Start our configured interface (if it isn't already running)
     */
    private final void startInterface() {
    }
    
    private final void stopInterface() {
    }
    
    /**
     * Change to a new device
     *
     * @return true if the device changed, false if no change
     */
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final boolean setBondedDeviceAddress(java.lang.String address) {
        return false;
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/geeksville/mesh/service/RadioInterfaceService$Companion;", "Lcom/geeksville/android/Logging;", "()V", "DEVADDR_KEY", "", "RADIO_CONNECTED_ACTION", "RECEIVE_FROMRADIO_ACTION", "runningService", "Lcom/geeksville/mesh/service/RadioInterfaceService;", "broadcastReceivedFromRadio", "", "context", "Landroid/content/Context;", "payload", "", "getBondedDeviceAddress", "getDeviceAddress", "getPrefs", "Landroid/content/SharedPreferences;", "app_debug"})
    public static final class Companion implements com.geeksville.android.Logging {
        
        private Companion() {
            super();
        }
        
        public final void broadcastReceivedFromRadio(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        byte[] payload) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.SharedPreferences getPrefs(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * Return the device we are configured to use, or null for none
         * device address strings are of the form:
         *
         * at
         *
         * where a is either x for bluetooth or s for serial
         * and t is an interface specific address (macaddr or a device path)
         */
        @org.jetbrains.annotations.Nullable()
        @android.annotation.SuppressLint(value = {"NewApi"})
        public final java.lang.String getDeviceAddress(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * Like getDeviceAddress, but filtered to return only devices we are currently bonded with
         *
         * at
         *
         * where a is either x for bluetooth or s for serial
         * and t is an interface specific address (macaddr or a device path)
         */
        @org.jetbrains.annotations.Nullable()
        @android.annotation.SuppressLint(value = {"NewApi"})
        public final java.lang.String getBondedDeviceAddress(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
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