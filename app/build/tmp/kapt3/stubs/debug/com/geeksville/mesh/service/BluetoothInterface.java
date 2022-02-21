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
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0002J\u0010\u0010&\u001a\u00020$2\u0006\u0010\'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020$H\u0002J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020.H\u0016J\u001e\u0010/\u001a\u00020$2\f\u00100\u001a\b\u0012\u0004\u0012\u00020$01H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u0011\u00103\u001a\u00020$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u000e\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\u0006J\b\u00107\u001a\u00020$H\u0002J\b\u00108\u001a\u00020$H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006:"}, d2 = {"Lcom/geeksville/mesh/service/BluetoothInterface;", "Lcom/geeksville/mesh/service/IRadioInterface;", "Lcom/geeksville/android/Logging;", "service", "Lcom/geeksville/mesh/service/RadioInterfaceService;", "address", "", "(Lcom/geeksville/mesh/service/RadioInterfaceService;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "bservice", "Landroid/bluetooth/BluetoothGattService;", "getBservice", "()Landroid/bluetooth/BluetoothGattService;", "device", "Landroid/bluetooth/BluetoothGatt;", "getDevice", "()Landroid/bluetooth/BluetoothGatt;", "fromNum", "Landroid/bluetooth/BluetoothGattCharacteristic;", "fromNumChanged", "", "getFromNumChanged", "()Z", "setFromNumChanged", "(Z)V", "hasForcedRefresh", "isFirstSend", "isFirstTime", "needForceRefresh", "reconnectJob", "Lkotlinx/coroutines/Job;", "getService", "()Lcom/geeksville/mesh/service/RadioInterfaceService;", "shouldSetMtu", "close", "", "doDiscoverServicesAndInit", "doReadFromRadio", "firstRead", "forceServiceRefresh", "getCharacteristic", "uuid", "Ljava/util/UUID;", "handleSendToRadio", "p", "", "onConnect", "connRes", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "retryDueToException", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleReconnect", "reason", "startConnect", "startWatchingFromNum", "Companion", "app_debug"})
public final class BluetoothInterface implements com.geeksville.mesh.service.IRadioInterface, com.geeksville.android.Logging {
    @org.jetbrains.annotations.NotNull()
    private final com.geeksville.mesh.service.RadioInterfaceService service = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String address = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.service.BluetoothInterface.Companion Companion = null;
    private static final java.util.UUID BTM_SERVICE_UUID = null;
    private static final java.util.UUID BTM_FROMRADIO_CHARACTER = null;
    private static final java.util.UUID BTM_TORADIO_CHARACTER = null;
    private static final java.util.UUID BTM_FROMNUM_CHARACTER = null;
    
    /**
     * this is created in onCreate()
     * We do an ugly hack of keeping it in the singleton so we can share it for the rare software update case
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Volatile()
    private static volatile com.geeksville.mesh.service.SafeBluetooth safe;
    private android.bluetooth.BluetoothGattCharacteristic fromNum;
    
    /**
     * With the new rev2 api, our first send is to start the configure readbacks.  In that case,
     * rather than waiting for FromNum notifies - we try to just aggressively read all of the responses.
     */
    private boolean isFirstSend = true;
    private boolean needForceRefresh;
    @kotlin.jvm.Volatile()
    private volatile kotlinx.coroutines.Job reconnectJob;
    private boolean hasForcedRefresh = false;
    @kotlin.jvm.Volatile()
    private volatile boolean fromNumChanged = false;
    @kotlin.jvm.Volatile()
    private volatile boolean shouldSetMtu = true;
    @kotlin.jvm.Volatile()
    private volatile boolean isFirstTime = true;
    
    public BluetoothInterface(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.service.RadioInterfaceService service, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.service.RadioInterfaceService getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.bluetooth.BluetoothGatt getDevice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.bluetooth.BluetoothGattService getBservice() {
        return null;
    }
    
    @java.lang.Override()
    public void handleSendToRadio(@org.jetbrains.annotations.NotNull()
    byte[] p) {
    }
    
    /**
     * We had some problem, schedule a reconnection attempt (if one isn't already queued)
     */
    public final void scheduleReconnect(@org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
    }
    
    private final void doReadFromRadio(boolean firstRead) {
    }
    
    /**
     * Android caches old services.  But our service is still changing often, so force it to reread the service definitions every
     * time
     */
    private final void forceServiceRefresh() {
    }
    
    public final boolean getFromNumChanged() {
        return false;
    }
    
    public final void setFromNumChanged(boolean p0) {
    }
    
    private final void startWatchingFromNum() {
    }
    
    /**
     * Some buggy BLE stacks can fail on initial connect, with either missing services or missing characteristics.  If that happens we
     * disconnect and try again when the device reenumerates.
     */
    private final java.lang.Object retryDueToException(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void doDiscoverServicesAndInit() {
    }
    
    private final void onConnect(java.lang.Object connRes) {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    private final void startConnect() {
    }
    
    /**
     * Get a chracteristic, but in a safe manner because some buggy BLE implementations might return null
     */
    private final android.bluetooth.BluetoothGattCharacteristic getCharacteristic(java.util.UUID uuid) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u0019\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0019\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0019\u0010\r\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lcom/geeksville/mesh/service/BluetoothInterface$Companion;", "Lcom/geeksville/android/Logging;", "Lcom/geeksville/mesh/service/InterfaceFactory;", "()V", "BTM_FROMNUM_CHARACTER", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "getBTM_FROMNUM_CHARACTER", "()Ljava/util/UUID;", "BTM_FROMRADIO_CHARACTER", "getBTM_FROMRADIO_CHARACTER", "BTM_SERVICE_UUID", "getBTM_SERVICE_UUID", "BTM_TORADIO_CHARACTER", "getBTM_TORADIO_CHARACTER", "safe", "Lcom/geeksville/mesh/service/SafeBluetooth;", "getSafe", "()Lcom/geeksville/mesh/service/SafeBluetooth;", "setSafe", "(Lcom/geeksville/mesh/service/SafeBluetooth;)V", "addressValid", "", "context", "Landroid/content/Context;", "rest", "", "createInterface", "Lcom/geeksville/mesh/service/IRadioInterface;", "service", "Lcom/geeksville/mesh/service/RadioInterfaceService;", "getBluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "hasCompanionDeviceApi", "app_debug"})
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
        
        public final java.util.UUID getBTM_SERVICE_UUID() {
            return null;
        }
        
        public final java.util.UUID getBTM_FROMRADIO_CHARACTER() {
            return null;
        }
        
        public final java.util.UUID getBTM_TORADIO_CHARACTER() {
            return null;
        }
        
        public final java.util.UUID getBTM_FROMNUM_CHARACTER() {
            return null;
        }
        
        private final android.bluetooth.BluetoothAdapter getBluetoothAdapter(android.content.Context context) {
            return null;
        }
        
        /**
         * Return true if this address is still acceptable. For BLE that means, still bonded
         */
        @java.lang.Override()
        public boolean addressValid(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String rest) {
            return false;
        }
        
        public final boolean hasCompanionDeviceApi(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.geeksville.mesh.service.SafeBluetooth getSafe() {
            return null;
        }
        
        public final void setSafe(@org.jetbrains.annotations.Nullable()
        com.geeksville.mesh.service.SafeBluetooth p0) {
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