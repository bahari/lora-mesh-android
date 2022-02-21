package com.geeksville.mesh.ui;

import java.lang.System;

@android.annotation.SuppressLint(value = {"NewApi"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0012H\u0002J\b\u00104\u001a\u000200H\u0002J\b\u00105\u001a\u000200H\u0002J\b\u00106\u001a\u000200H\u0002J\b\u00107\u001a\u000200H\u0002J\b\u00108\u001a\u000200H\u0002J&\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010A\u001a\u000200H\u0016J\b\u0010B\u001a\u000200H\u0016J\b\u0010C\u001a\u000200H\u0016J\u001a\u0010D\u001a\u0002002\u0006\u0010E\u001a\u00020:2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010F\u001a\u0002002\u0006\u0010G\u001a\u00020\u0012H\u0002J\u0010\u0010H\u001a\u0002002\u0006\u0010I\u001a\u00020JH\u0002J\b\u0010K\u001a\u000200H\u0002J\u001e\u0010L\u001a\u0002002\u0014\u0010M\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u000202\u0018\u00010NH\u0002J\b\u0010O\u001a\u000200H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\u000e\u001a\u0004\b(\u0010)R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006P"}, d2 = {"Lcom/geeksville/mesh/ui/SettingsFragment;", "Lcom/geeksville/mesh/ui/ScreenFragment;", "Lcom/geeksville/android/Logging;", "()V", "_binding", "Lcom/geeksville/mesh/databinding/SettingsFragmentBinding;", "binding", "getBinding", "()Lcom/geeksville/mesh/databinding/SettingsFragmentBinding;", "deviceManager", "Landroid/companion/CompanionDeviceManager;", "getDeviceManager", "()Landroid/companion/CompanionDeviceManager;", "deviceManager$delegate", "Lkotlin/Lazy;", "guiJob", "Lkotlinx/coroutines/CompletableJob;", "hasCompanionDeviceApi", "", "getHasCompanionDeviceApi", "()Z", "hasCompanionDeviceApi$delegate", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "model", "Lcom/geeksville/mesh/model/UIViewModel;", "getModel", "()Lcom/geeksville/mesh/model/UIViewModel;", "model$delegate", "myActivity", "Lcom/geeksville/mesh/MainActivity;", "getMyActivity", "()Lcom/geeksville/mesh/MainActivity;", "regionSpinnerListener", "Landroid/widget/AdapterView$OnItemSelectedListener;", "regions", "", "", "scanModel", "Lcom/geeksville/mesh/ui/BTScanModel;", "getScanModel", "()Lcom/geeksville/mesh/ui/BTScanModel;", "scanModel$delegate", "updateProgressFilter", "Landroid/content/IntentFilter;", "updateProgressReceiver", "Landroid/content/BroadcastReceiver;", "addDeviceButton", "", "device", "Lcom/geeksville/mesh/ui/BTScanModel$DeviceListEntry;", "enabled", "checkLocationEnabled", "doFirmwareUpdate", "initClassicScan", "initCommonUI", "initModernScan", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onViewCreated", "view", "refreshUpdateButton", "enable", "showClassicWidgets", "visible", "", "startBackgroundScan", "updateDevicesButtons", "devices", "", "updateNodeInfo", "app_debug"})
public final class SettingsFragment extends com.geeksville.mesh.ui.ScreenFragment implements com.geeksville.android.Logging {
    private com.geeksville.mesh.databinding.SettingsFragmentBinding _binding;
    private final kotlin.Lazy scanModel$delegate = null;
    private final kotlin.Lazy model$delegate = null;
    private final kotlinx.coroutines.CompletableJob guiJob = null;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private final kotlin.Lazy hasCompanionDeviceApi$delegate = null;
    private final kotlin.Lazy deviceManager$delegate = null;
    private final android.widget.AdapterView.OnItemSelectedListener regionSpinnerListener = null;
    private final java.util.List<java.lang.String> regions = null;
    private final android.content.IntentFilter updateProgressFilter = null;
    private final android.content.BroadcastReceiver updateProgressReceiver = null;
    
    public SettingsFragment() {
        super(null);
    }
    
    private final com.geeksville.mesh.databinding.SettingsFragmentBinding getBinding() {
        return null;
    }
    
    private final com.geeksville.mesh.ui.BTScanModel getScanModel() {
        return null;
    }
    
    private final com.geeksville.mesh.model.UIViewModel getModel() {
        return null;
    }
    
    private final boolean getHasCompanionDeviceApi() {
        return false;
    }
    
    private final android.companion.CompanionDeviceManager getDeviceManager() {
        return null;
    }
    
    private final com.geeksville.mesh.MainActivity getMyActivity() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void doFirmwareUpdate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void refreshUpdateButton(boolean enable) {
    }
    
    /**
     * Pull the latest device info from the model and into the GUI
     */
    private final void updateNodeInfo() {
    }
    
    private final void initCommonUI() {
    }
    
    private final void addDeviceButton(com.geeksville.mesh.ui.BTScanModel.DeviceListEntry device, boolean enabled) {
    }
    
    private final void showClassicWidgets(int visible) {
    }
    
    private final void updateDevicesButtons(java.util.Map<java.lang.String, com.geeksville.mesh.ui.BTScanModel.DeviceListEntry> devices) {
    }
    
    private final void initClassicScan() {
    }
    
    private final void startBackgroundScan() {
    }
    
    private final void initModernScan() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * If the user has not turned on location access throw up a toast warning
     */
    private final void checkLocationEnabled() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
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