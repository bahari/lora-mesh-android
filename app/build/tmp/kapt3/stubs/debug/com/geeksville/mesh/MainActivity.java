package com.geeksville.mesh;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00e8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 {2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002{|B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000202H\u0002J\b\u00104\u001a\u000202H\u0002J\u0012\u00105\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0002J\b\u0010;\u001a\u0004\u0018\u00010:J\b\u0010<\u001a\u000202H\u0002J\u0010\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020?H\u0002J\u0016\u0010@\u001a\u0002022\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0002J\b\u0010D\u001a\u000202H\u0002J\"\u0010E\u001a\u0002022\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\b\u0010I\u001a\u0004\u0018\u00010?H\u0015J\u0012\u0010J\u001a\u0002022\b\u0010K\u001a\u0004\u0018\u00010LH\u0014J\u0010\u0010M\u001a\u00020\u00172\u0006\u0010N\u001a\u00020OH\u0016J\b\u0010P\u001a\u000202H\u0014J\u0010\u0010Q\u001a\u0002022\u0006\u0010R\u001a\u00020SH\u0002J\u0010\u0010T\u001a\u0002022\u0006\u0010>\u001a\u00020?H\u0014J\u0010\u0010U\u001a\u00020\u00172\u0006\u0010V\u001a\u00020WH\u0016J\u0010\u0010X\u001a\u00020\u00172\u0006\u0010N\u001a\u00020OH\u0016J-\u0010Y\u001a\u0002022\u0006\u0010F\u001a\u00020G2\u000e\u0010Z\u001a\n\u0012\u0006\b\u0001\u0012\u00020:0*2\u0006\u0010[\u001a\u00020\\H\u0016\u00a2\u0006\u0002\u0010]J\b\u0010^\u001a\u000202H\u0014J\b\u0010_\u001a\u000202H\u0014J\b\u0010`\u001a\u000202H\u0002J\b\u0010a\u001a\u000202H\u0002J\u0006\u0010b\u001a\u00020\u0017J\"\u0010c\u001a\u00020\u00172\u000e\b\u0002\u0010d\u001a\b\u0012\u0004\u0012\u00020:092\b\b\u0002\u0010e\u001a\u00020\u0017H\u0002J\u001e\u0010f\u001a\u0002022\u0006\u0010g\u001a\u00020(2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020i09H\u0002J\b\u0010j\u001a\u000202H\u0002J\u0010\u0010k\u001a\u0002022\u0006\u0010l\u001a\u00020mH\u0002J\u0018\u0010n\u001a\u0002022\u0006\u0010o\u001a\u00020G2\u0006\u0010p\u001a\u00020GH\u0002J\b\u0010q\u001a\u000202H\u0002J\u0010\u0010r\u001a\u0002022\u0006\u0010s\u001a\u00020GH\u0002J\u0010\u0010r\u001a\u0002022\u0006\u0010t\u001a\u00020:H\u0002J\b\u0010u\u001a\u000202H\u0002J\b\u0010v\u001a\u000202H\u0002J\b\u0010w\u001a\u000202H\u0002J\u0010\u0010x\u001a\u0002022\u0006\u0010R\u001a\u00020SH\u0002J\b\u0010y\u001a\u000202H\u0002J\b\u0010z\u001a\u00020\u0017H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0016\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b#\u0010$R\u000e\u0010&\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006}"}, d2 = {"Lcom/geeksville/mesh/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/geeksville/android/Logging;", "Landroidx/core/app/ActivityCompat$OnRequestPermissionsResultCallback;", "()V", "binding", "Lcom/geeksville/mesh/databinding/ActivityMainBinding;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBluetoothAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter$delegate", "Lkotlin/Lazy;", "btStateReceiver", "Lcom/geeksville/mesh/service/BluetoothStateReceiver;", "connectionJob", "Lkotlinx/coroutines/Job;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "isInTestLab", "", "()Z", "isInTestLab$delegate", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "mesh", "Lcom/geeksville/android/ServiceClient;", "Lcom/geeksville/mesh/IMeshService;", "meshServiceReceiver", "Landroid/content/BroadcastReceiver;", "model", "Lcom/geeksville/mesh/model/UIViewModel;", "getModel", "()Lcom/geeksville/mesh/model/UIViewModel;", "model$delegate", "receiverRegistered", "requestedChannelUrl", "Landroid/net/Uri;", "tabInfos", "", "Lcom/geeksville/mesh/MainActivity$TabInfo;", "[Lcom/geeksville/mesh/MainActivity$TabInfo;", "tabsAdapter", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "usbDevice", "Landroid/hardware/usb/UsbDevice;", "askToRate", "", "bindMeshService", "chooseThemeDialog", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "getMinimumPermissions", "", "", "getMissingMessage", "getVersionInfo", "handleIntent", "intent", "Landroid/content/Intent;", "handleSignInResult", "completedTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "initToolbar", "onActivityResult", "requestCode", "", "resultCode", "data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onMeshConnectionChanged", "connected", "Lcom/geeksville/mesh/service/MeshService$ConnectionState;", "onNewIntent", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "onRequestPermissionsResult", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStart", "onStop", "perhapsChangeChannel", "registerMeshReceiver", "requestBackgroundPermission", "requestPermission", "missingPerms", "shouldShowDialog", "saveMessagesCSV", "file_uri", "packets", "Lcom/geeksville/mesh/database/entity/Packet;", "sendTestPackets", "setUITheme", "prefs", "Landroid/content/SharedPreferences;", "showAlert", "titleText", "messageText", "showSettingsPage", "showToast", "msgId", "msg", "unbindMeshService", "unregisterMeshReceiver", "updateBluetoothEnabled", "updateConnectionStatusImage", "updateNodesFromDevice", "warnMissingPermissions", "Companion", "TabInfo", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.geeksville.android.Logging, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback {
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.MainActivity.Companion Companion = null;
    public static final int REQUEST_ENABLE_BT = 10;
    public static final int DID_REQUEST_PERM = 11;
    public static final int RC_SIGN_IN = 12;
    public static final int RC_SELECT_DEVICE = 13;
    public static final int CREATE_CSV_FILE = 14;
    private com.geeksville.mesh.databinding.ActivityMainBinding binding;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private final kotlin.Lazy bluetoothAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy model$delegate = null;
    private final com.geeksville.mesh.MainActivity.TabInfo[] tabInfos = null;
    private final androidx.viewpager2.adapter.FragmentStateAdapter tabsAdapter = null;
    private final com.geeksville.mesh.service.BluetoothStateReceiver btStateReceiver = null;
    private final kotlin.Lazy isInTestLab$delegate = null;
    private android.net.Uri requestedChannelUrl;
    
    /**
     * We keep the usb device here, so later we can give it to our service
     */
    private android.hardware.usb.UsbDevice usbDevice;
    private boolean receiverRegistered = false;
    private final android.content.BroadcastReceiver meshServiceReceiver = null;
    private kotlinx.coroutines.Job connectionJob;
    private final com.geeksville.android.ServiceClient<com.geeksville.mesh.IMeshService> mesh = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy handler$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final android.bluetooth.BluetoothAdapter getBluetoothAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.model.UIViewModel getModel() {
        return null;
    }
    
    /**
     * Don't tell our app we have bluetooth until we have bluetooth _and_ location access
     */
    private final void updateBluetoothEnabled() {
    }
    
    /**
     * Get the minimum permissions our app needs to run correctly
     */
    private final java.util.List<java.lang.String> getMinimumPermissions() {
        return null;
    }
    
    /**
     * Ask the user to grant background location permission
     */
    public final boolean requestBackgroundPermission() {
        return false;
    }
    
    /**
     * @return a localized string warning user about missing permissions.  Or null if everything is find
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMissingMessage() {
        return null;
    }
    
    /**
     * Possibly prompt user to grant permissions
     * @param shouldShowDialog usually true, but in cases where we've already shown a dialog elsewhere we skip it.
     *
     * @return true if we already have the needed permissions
     */
    private final boolean requestPermission(java.util.List<java.lang.String> missingPerms, boolean shouldShowDialog) {
        return false;
    }
    
    /**
     * Remind user he's disabled permissions we need
     *
     * @return true if we did warn
     */
    @android.annotation.SuppressLint(value = {"InlinedApi"})
    public final boolean warnMissingPermissions() {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void sendTestPackets() {
    }
    
    private final void askToRate() {
    }
    
    private final boolean isInTestLab() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initToolbar() {
    }
    
    private final void updateConnectionStatusImage(com.geeksville.mesh.service.MeshService.ConnectionState connected) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void handleIntent(android.content.Intent intent) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * Dispatch incoming result to the correct fragment.
     */
    @android.annotation.SuppressLint(value = {"InlinedApi"})
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void handleSignInResult(com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> completedTask) {
    }
    
    private final void registerMeshReceiver() {
    }
    
    private final void unregisterMeshReceiver() {
    }
    
    private final void updateNodesFromDevice() {
    }
    
    /**
     * Show an alert that may contain HTML
     */
    private final void showAlert(int titleText, int messageText) {
    }
    
    private final void onMeshConnectionChanged(com.geeksville.mesh.service.MeshService.ConnectionState connected) {
    }
    
    private final void showToast(int msgId) {
    }
    
    private final void showToast(java.lang.String msg) {
    }
    
    private final void perhapsChangeChannel() {
    }
    
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
    
    private final void bindMeshService() {
    }
    
    private final void unbindMeshService() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void showSettingsPage() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getHandler() {
        return null;
    }
    
    @java.lang.Override()
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void getVersionInfo() {
    }
    
    private final void saveMessagesCSV(android.net.Uri file_uri, java.util.List<com.geeksville.mesh.database.entity.Packet> packets) {
    }
    
    private final void chooseThemeDialog() {
    }
    
    private final void setUITheme(android.content.SharedPreferences prefs) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/geeksville/mesh/MainActivity$TabInfo;", "", "text", "", "icon", "", "content", "Landroidx/fragment/app/Fragment;", "(Ljava/lang/String;ILandroidx/fragment/app/Fragment;)V", "getContent", "()Landroidx/fragment/app/Fragment;", "getIcon", "()I", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class TabInfo {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String text = null;
        private final int icon = 0;
        @org.jetbrains.annotations.NotNull()
        private final androidx.fragment.app.Fragment content = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.geeksville.mesh.MainActivity.TabInfo copy(@org.jetbrains.annotations.NotNull()
        java.lang.String text, int icon, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment content) {
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
        
        public TabInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String text, int icon, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment content) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getIcon() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment getContent() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/geeksville/mesh/MainActivity$Companion;", "", "()V", "CREATE_CSV_FILE", "", "DID_REQUEST_PERM", "RC_SELECT_DEVICE", "RC_SIGN_IN", "REQUEST_ENABLE_BT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}