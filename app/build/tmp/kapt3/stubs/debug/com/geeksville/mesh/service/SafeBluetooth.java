package com.geeksville.mesh.service;

import java.lang.System;

/**
 * Uses coroutines to safely access a bluetooth GATT device with a synchronous API
 *
 * The BTLE API on android is dumb.  You can only have one outstanding operation in flight to
 * the device.  If you try to do something when something is pending, the operation just returns
 * false.  You are expected to chain your operations from the results callbacks.
 *
 * This class fixes the API by using coroutines to let you safely do a series of BTLE operations.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0085\u0001\u0086\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J;\u0010G\u001a\u00020\u00172\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0018\u0010H\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u00170\u00152\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00170/\u00f8\u0001\u0000J#\u0010J\u001a\u00020\u00172\u0018\u0010H\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u00f8\u0001\u0000J+\u0010K\u001a\u00020\u00172\u0006\u0010L\u001a\u0002042\u0018\u0010H\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u00f8\u0001\u0000J+\u0010M\u001a\u00020\u00172\u0006\u0010N\u001a\u00020\t2\u0018\u0010H\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u00f8\u0001\u0000J3\u0010O\u001a\u00020\u00172\u0006\u0010L\u001a\u0002042\u0006\u0010P\u001a\u00020\u001a2\u0018\u0010H\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u00f8\u0001\u0000J+\u0010Q\u001a\u00020\u00172\u0006\u0010L\u001a\u00020R2\u0018\u0010H\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u00f8\u0001\u0000J+\u0010S\u001a\u00020\u00172\u0006\u0010L\u001a\u0002042\u0018\u0010H\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u00f8\u0001\u0000J\b\u0010T\u001a\u00020\u0017H\u0016J\u0006\u0010U\u001a\u00020\u0017J\u0006\u0010V\u001a\u00020\u0017J\'\u0010W\u001a\u00020\u0017\"\b\b\u0000\u0010X*\u00020Y2\u0006\u0010Z\u001a\u00020\t2\u0006\u0010[\u001a\u0002HXH\u0002\u00a2\u0006\u0002\u0010\\J\u0010\u0010]\u001a\u00020\u00172\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u0006\u0010^\u001a\u00020\u0017J\b\u0010_\u001a\u00020\u0017H\u0002J\u0014\u0010`\u001a\u00020\u00172\n\u0010a\u001a\u00060bj\u0002`cH\u0002J\u0010\u0010d\u001a\u00020\u00172\u0006\u0010e\u001a\u00020fH\u0002J\u0012\u0010g\u001a\u0004\u0018\u00010%2\u0006\u0010h\u001a\u00020\u0010H\u0002J-\u0010i\u001a\u0002HX\"\u0004\b\u0000\u0010X2\u0018\u0010j\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002HX0k\u0012\u0004\u0012\u00020\u00170\u0015H\u0002\u00a2\u0006\u0002\u0010lJ*\u0010m\u001a\u00020\u00172\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00170o2\b\b\u0002\u0010p\u001a\u00020@H\u0002J \u0010q\u001a\u00020\u00172\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00170o2\b\b\u0002\u0010p\u001a\u00020@H\u0002J(\u0010r\u001a\u00020\u00172\u0006\u0010L\u001a\u0002042\f\u0010n\u001a\b\u0012\u0004\u0012\u0002040o2\b\b\u0002\u0010p\u001a\u00020@H\u0002J\u001e\u0010s\u001a\u00020\u00172\u0006\u0010N\u001a\u00020\t2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00170oH\u0002J:\u0010t\u001a\u00020\u0017\"\u0004\b\u0000\u0010X2\u0006\u0010u\u001a\u00020f2\f\u0010n\u001a\b\u0012\u0004\u0012\u0002HX0o2\u0006\u0010p\u001a\u00020@2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00100/H\u0002J0\u0010w\u001a\u00020\u00172\u0006\u0010L\u001a\u0002042\u0006\u0010P\u001a\u00020\u001a2\f\u0010n\u001a\b\u0012\u0004\u0012\u0002040o2\b\b\u0002\u0010p\u001a\u00020@H\u0002J(\u0010x\u001a\u00020\u00172\u0006\u0010L\u001a\u00020R2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020R0o2\b\b\u0002\u0010p\u001a\u00020@H\u0002J(\u0010y\u001a\u00020\u00172\u0006\u0010L\u001a\u0002042\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00170o2\b\b\u0002\u0010p\u001a\u00020@H\u0002J\u0018\u0010z\u001a\u0002042\u0006\u0010L\u001a\u0002042\b\b\u0002\u0010p\u001a\u00020@J\b\u0010{\u001a\u00020\u0017H\u0002J\u000e\u0010|\u001a\u00020\u00172\u0006\u0010N\u001a\u00020\tJ\u0006\u0010}\u001a\u00020\u0017J+\u0010~\u001a\u00020\u00172\u0006\u0010L\u001a\u0002042\u0006\u0010\u007f\u001a\u00020\u00102\u0013\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00170\u0015J\t\u0010\u0081\u0001\u001a\u00020\u0017H\u0002J\t\u0010\u0082\u0001\u001a\u00020\u0017H\u0002J!\u0010\u0083\u0001\u001a\u0002042\u0006\u0010L\u001a\u0002042\u0006\u0010P\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020@J\u000f\u0010\u0084\u0001\u001a\u00020\u00172\u0006\u0010L\u001a\u000204R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\u0014\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u0082\u000e\u00f8\u0001\u0000\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u00102\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00170\u001503X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00107\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010!R\u001a\u0010?\u001a\u00020@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0FX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0087\u0001"}, d2 = {"Lcom/geeksville/mesh/service/SafeBluetooth;", "Lcom/geeksville/android/Logging;", "Ljava/io/Closeable;", "context", "Landroid/content/Context;", "device", "Landroid/bluetooth/BluetoothDevice;", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)V", "STATUS_NOSTART", "", "STATUS_RELIABLE_WRITE_FAILED", "STATUS_SIMFAILURE", "STATUS_TIMEOUT", "activeTimeout", "Lkotlinx/coroutines/Job;", "autoConnect", "", "autoReconnect", "configurationDescriptorUUID", "Ljava/util/UUID;", "connectionCallback", "Lkotlin/Function1;", "Lkotlin/Result;", "", "currentConnectIsAuto", "currentReliableWrite", "", "currentWork", "Lcom/geeksville/mesh/service/SafeBluetooth$BluetoothContinuation;", "failPercent", "getFailPercent", "()I", "setFailPercent", "(I)V", "failRandom", "Ljava/util/Random;", "gatt", "Landroid/bluetooth/BluetoothGatt;", "getGatt", "()Landroid/bluetooth/BluetoothGatt;", "setGatt", "(Landroid/bluetooth/BluetoothGatt;)V", "gattCallback", "Landroid/bluetooth/BluetoothGattCallback;", "isClosing", "isSettingMtu", "lostConnectCallback", "Lkotlin/Function0;", "mHandler", "Landroid/os/Handler;", "notifyHandlers", "", "Landroid/bluetooth/BluetoothGattCharacteristic;", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "simFailures", "getSimFailures", "()Z", "setSimFailures", "(Z)V", "state", "getState", "setState", "timeoutMsec", "", "getTimeoutMsec", "()J", "setTimeoutMsec", "(J)V", "workQueue", "", "asyncConnect", "cb", "lostConnectCb", "asyncDiscoverServices", "asyncReadCharacteristic", "c", "asyncRequestMtu", "len", "asyncWriteCharacteristic", "v", "asyncWriteDescriptor", "Landroid/bluetooth/BluetoothGattDescriptor;", "asyncWriteReliable", "close", "closeConnection", "closeGatt", "completeWork", "T", "", "status", "res", "(ILjava/lang/Object;)V", "connect", "discoverServices", "dropAndReconnect", "failAllWork", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "lostConnection", "reason", "", "lowLevelConnect", "autoNow", "makeSync", "wrappedFn", "Lcom/geeksville/concurrent/SyncContinuation;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "queueConnect", "cont", "Lcom/geeksville/concurrent/Continuation;", "timeout", "queueDiscoverServices", "queueReadCharacteristic", "queueRequestMtu", "queueWork", "tag", "initFn", "queueWriteCharacteristic", "queueWriteDescriptor", "queueWriteReliable", "readCharacteristic", "reconnect", "requestMtu", "restartBle", "setNotify", "enable", "onChanged", "startNewWork", "stopCurrentWork", "writeCharacteristic", "writeReliable", "BLEStatusException", "BluetoothContinuation", "app_debug"})
public final class SafeBluetooth implements com.geeksville.android.Logging, java.io.Closeable {
    private final android.content.Context context = null;
    private final android.bluetooth.BluetoothDevice device = null;
    private long timeoutMsec = 20000L;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Volatile()
    private volatile android.bluetooth.BluetoothGatt gatt;
    @kotlin.jvm.Volatile()
    private volatile int state = android.bluetooth.BluetoothProfile.STATE_DISCONNECTED;
    @kotlin.jvm.Volatile()
    private volatile com.geeksville.mesh.service.SafeBluetooth.BluetoothContinuation currentWork;
    private final java.util.List<com.geeksville.mesh.service.SafeBluetooth.BluetoothContinuation> workQueue = null;
    @kotlin.jvm.Volatile()
    private volatile kotlin.jvm.functions.Function1<? super kotlin.Result<kotlin.Unit>, kotlin.Unit> connectionCallback;
    @kotlin.jvm.Volatile()
    private volatile kotlin.jvm.functions.Function0<kotlin.Unit> lostConnectCallback;
    private final java.util.Map<java.util.UUID, kotlin.jvm.functions.Function1<android.bluetooth.BluetoothGattCharacteristic, kotlin.Unit>> notifyHandlers = null;
    private final kotlinx.coroutines.CoroutineScope serviceScope = null;
    private final java.util.UUID configurationDescriptorUUID = null;
    
    /**
     * skanky hack to restart BLE if it says it is hosed
     * https://stackoverflow.com/questions/35103701/ble-android-onconnectionstatechange-not-being-called
     */
    private final android.os.Handler mHandler = null;
    private final int STATUS_RELIABLE_WRITE_FAILED = 4403;
    private final int STATUS_TIMEOUT = 4404;
    private final int STATUS_NOSTART = 4405;
    private final int STATUS_SIMFAILURE = 4406;
    
    /**
     * Should we automatically try to reconnect when we lose our connection?
     *
     * Originally this was true, but over time (now that clients are smarter and need to build
     * up more state) I see this was a mistake.  Now if the connection drops we just call
     * the lostConnection callback and the client of this API is responsible for reconnecting.
     * This also prevents nasty races when sometimes both the upperlayer and this layer decide to reconnect
     * simultaneously.
     */
    private final boolean autoReconnect = false;
    private final android.bluetooth.BluetoothGattCallback gattCallback = null;
    private boolean simFailures = false;
    private int failPercent = 10;
    private final java.util.Random failRandom = null;
    private kotlinx.coroutines.Job activeTimeout;
    private boolean autoConnect = false;
    private boolean currentConnectIsAuto = false;
    
    /**
     * On some phones we receive bogus mtu gatt callbacks, we need to ignore them if we weren't setting the mtu
     */
    private boolean isSettingMtu = false;
    private byte[] currentReliableWrite;
    
    /**
     * Some old androids have a bug where calling disconnect doesn't guarantee that the onConnectionStateChange callback gets called
     * but the only safe way to call gatt.close is from that callback.  So we set a flag once we start closing and then poll
     * until we see the callback has set gatt to null (indicating the CALLBACK has close the gatt).  If the timeout expires we assume the bug
     * has occurred, and we manually close the gatt here.
     *
     * Log of typical failure
     * 06-29 08:47:15.035 29788-30155/com.geeksville.mesh D/BluetoothGatt: cancelOpen() - device: 24:62:AB:F8:40:9A
     *   06-29 08:47:15.036 29788-30155/com.geeksville.mesh D/BluetoothGatt: close()
     *   06-29 08:47:15.037 29788-30155/com.geeksville.mesh D/BluetoothGatt: unregisterApp() - mClientIf=5
     *   06-29 08:47:15.037 29788-29813/com.geeksville.mesh D/BluetoothGatt: onClientConnectionState() - status=0 clientIf=5 device=24:62:AB:F8:40:9A
     *   06-29 08:47:15.037 29788-29813/com.geeksville.mesh W/BluetoothGatt: Unhandled exception in callback
     *   java.lang.NullPointerException: Attempt to invoke virtual method 'void android.bluetooth.BluetoothGattCallback.onConnectionStateChange(android.bluetooth.BluetoothGatt, int, int)' on a null object reference
     *   at android.bluetooth.BluetoothGatt$1.onClientConnectionState(BluetoothGatt.java:182)
     *   at android.bluetooth.IBluetoothGattCallback$Stub.onTransact(IBluetoothGattCallback.java:70)
     *   at android.os.Binder.execTransact(Binder.java:446)
     *
     * per https://github.com/don/cordova-plugin-ble-central/issues/473#issuecomment-367687575
     */
    @kotlin.jvm.Volatile()
    private volatile boolean isClosing = false;
    
    public SafeBluetooth(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothDevice device) {
        super();
    }
    
    public final long getTimeoutMsec() {
        return 0L;
    }
    
    public final void setTimeoutMsec(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.bluetooth.BluetoothGatt getGatt() {
        return null;
    }
    
    public final void setGatt(@org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGatt p0) {
    }
    
    public final int getState() {
        return 0;
    }
    
    public final void setState(int p0) {
    }
    
    public final void restartBle() {
    }
    
    public final boolean getSimFailures() {
        return false;
    }
    
    public final void setSimFailures(boolean p0) {
    }
    
    public final int getFailPercent() {
        return 0;
    }
    
    public final void setFailPercent(int p0) {
    }
    
    private final void startNewWork() {
    }
    
    private final <T extends java.lang.Object>void queueWork(java.lang.String tag, com.geeksville.concurrent.Continuation<? super T> cont, long timeout, kotlin.jvm.functions.Function0<java.lang.Boolean> initFn) {
    }
    
    /**
     * Stop any current work
     */
    private final void stopCurrentWork() {
    }
    
    /**
     * Called from our big GATT callback, completes the current job and then schedules a new one
     */
    private final <T extends java.lang.Object>void completeWork(int status, T res) {
    }
    
    /**
     * Something went wrong, abort all queued
     */
    private final void failAllWork(java.lang.Exception ex) {
    }
    
    private final <T extends java.lang.Object>T makeSync(kotlin.jvm.functions.Function1<? super com.geeksville.concurrent.SyncContinuation<T>, kotlin.Unit> wrappedFn) {
        return null;
    }
    
    private final android.bluetooth.BluetoothGatt lowLevelConnect(boolean autoNow) {
        return null;
    }
    
    private final void queueConnect(boolean autoConnect, com.geeksville.concurrent.Continuation<? super kotlin.Unit> cont, long timeout) {
    }
    
    /**
     * start a connection attempt.
     *
     * Note: if autoConnect is true, the callback you provide will be kept around _even after the connection is complete.
     * If we ever lose the connection, this class will immediately requque the attempt (after canceling
     * any outstanding queued operations).
     *
     * So you should expect your callback might be called multiple times, each time to reestablish a new connection.
     */
    public final void asyncConnect(boolean autoConnect, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<kotlin.Unit>, kotlin.Unit> cb, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> lostConnectCb) {
    }
    
    private final void reconnect() {
    }
    
    private final void lostConnection(java.lang.String reason) {
    }
    
    private final void dropAndReconnect() {
    }
    
    public final void connect(boolean autoConnect) {
    }
    
    private final void queueReadCharacteristic(android.bluetooth.BluetoothGattCharacteristic c, com.geeksville.concurrent.Continuation<? super android.bluetooth.BluetoothGattCharacteristic> cont, long timeout) {
    }
    
    public final void asyncReadCharacteristic(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothGattCharacteristic c, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<? extends android.bluetooth.BluetoothGattCharacteristic>, kotlin.Unit> cb) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.bluetooth.BluetoothGattCharacteristic readCharacteristic(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothGattCharacteristic c, long timeout) {
        return null;
    }
    
    private final void queueDiscoverServices(com.geeksville.concurrent.Continuation<? super kotlin.Unit> cont, long timeout) {
    }
    
    public final void asyncDiscoverServices(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<kotlin.Unit>, kotlin.Unit> cb) {
    }
    
    public final void discoverServices() {
    }
    
    /**
     * mtu operations seem to hang sometimes.  To cope with this we have a 5 second timeout before throwing an exception and cancelling the work
     */
    private final void queueRequestMtu(int len, com.geeksville.concurrent.Continuation<? super kotlin.Unit> cont) {
    }
    
    public final void asyncRequestMtu(int len, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<kotlin.Unit>, kotlin.Unit> cb) {
    }
    
    public final void requestMtu(int len) {
    }
    
    private final void queueWriteCharacteristic(android.bluetooth.BluetoothGattCharacteristic c, byte[] v, com.geeksville.concurrent.Continuation<? super android.bluetooth.BluetoothGattCharacteristic> cont, long timeout) {
    }
    
    public final void asyncWriteCharacteristic(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothGattCharacteristic c, @org.jetbrains.annotations.NotNull()
    byte[] v, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<? extends android.bluetooth.BluetoothGattCharacteristic>, kotlin.Unit> cb) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.bluetooth.BluetoothGattCharacteristic writeCharacteristic(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothGattCharacteristic c, @org.jetbrains.annotations.NotNull()
    byte[] v, long timeout) {
        return null;
    }
    
    /**
     * Like write, but we use the extra reliable flow documented here:
     * https://stackoverflow.com/questions/24485536/what-is-reliable-write-in-ble
     */
    private final void queueWriteReliable(android.bluetooth.BluetoothGattCharacteristic c, com.geeksville.concurrent.Continuation<? super kotlin.Unit> cont, long timeout) {
    }
    
    public final void asyncWriteReliable(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothGattCharacteristic c, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<kotlin.Unit>, kotlin.Unit> cb) {
    }
    
    public final void writeReliable(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothGattCharacteristic c) {
    }
    
    private final void queueWriteDescriptor(android.bluetooth.BluetoothGattDescriptor c, com.geeksville.concurrent.Continuation<? super android.bluetooth.BluetoothGattDescriptor> cont, long timeout) {
    }
    
    public final void asyncWriteDescriptor(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothGattDescriptor c, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<? extends android.bluetooth.BluetoothGattDescriptor>, kotlin.Unit> cb) {
    }
    
    /**
     * Close just the GATT device but keep our pending callbacks active
     */
    public final void closeGatt() {
    }
    
    /**
     * Close down any existing connection, any existing calls (including async connects will be
     * cancelled and you'll need to recall connect to use this againt
     */
    public final void closeConnection() {
    }
    
    /**
     * Close and destroy this SafeBluetooth instance.  You'll need to make a new instance before using it again
     */
    @java.lang.Override()
    public void close() {
    }
    
    public final void setNotify(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothGattCharacteristic c, boolean enable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.bluetooth.BluetoothGattCharacteristic, kotlin.Unit> onChanged) {
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
    
    /**
     * A BLE status code based error
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/geeksville/mesh/service/SafeBluetooth$BLEStatusException;", "Lcom/geeksville/mesh/service/BLEException;", "status", "", "msg", "", "(ILjava/lang/String;)V", "getStatus", "()I", "app_debug"})
    public static final class BLEStatusException extends com.geeksville.mesh.service.BLEException {
        private final int status = 0;
        
        public BLEStatusException(int status, @org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            super(null);
        }
        
        public final int getStatus() {
            return 0;
        }
    }
    
    /**
     * a schedulable bit of bluetooth work, includes both the closure to call to start the operation
     * and the completion (either async or sync) to call when it completes
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\nJ\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lcom/geeksville/mesh/service/SafeBluetooth$BluetoothContinuation;", "Lcom/geeksville/android/Logging;", "tag", "", "completion", "Lcom/geeksville/concurrent/Continuation;", "timeoutMillis", "", "startWorkFn", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lcom/geeksville/concurrent/Continuation;JLkotlin/jvm/functions/Function0;)V", "getCompletion", "()Lcom/geeksville/concurrent/Continuation;", "getTag", "()Ljava/lang/String;", "getTimeoutMillis", "()J", "isConnect", "startWork", "toString", "app_debug"})
    static final class BluetoothContinuation implements com.geeksville.android.Logging {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tag = null;
        @org.jetbrains.annotations.NotNull()
        private final com.geeksville.concurrent.Continuation<?> completion = null;
        private final long timeoutMillis = 0L;
        private final kotlin.jvm.functions.Function0<java.lang.Boolean> startWorkFn = null;
        
        public BluetoothContinuation(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        com.geeksville.concurrent.Continuation<?> completion, long timeoutMillis, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<java.lang.Boolean> startWorkFn) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTag() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.geeksville.concurrent.Continuation<?> getCompletion() {
            return null;
        }
        
        public final long getTimeoutMillis() {
            return 0L;
        }
        
        public final boolean startWork() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public final boolean isConnect() {
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
    }
}