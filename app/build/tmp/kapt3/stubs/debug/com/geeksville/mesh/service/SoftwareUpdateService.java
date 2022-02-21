package com.geeksville.mesh.service;

import java.lang.System;

/**
 * typical flow
 *
 * startScan
 * startUpdate
 *
 * stopScan
 *
 * FIXME - if we don't find a device stop our scan
 * FIXME - broadcast when we found devices, made progress sending blocks or when the update is complete
 * FIXME - make the user decide to start an update on a particular device
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/geeksville/mesh/service/SoftwareUpdateService;", "Landroidx/core/app/JobIntentService;", "Lcom/geeksville/android/Logging;", "()V", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBluetoothAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter$delegate", "Lkotlin/Lazy;", "onHandleWork", "", "intent", "Landroid/content/Intent;", "startUpdate", "macaddr", "", "Companion", "app_debug"})
public final class SoftwareUpdateService extends androidx.core.app.JobIntentService implements com.geeksville.android.Logging {
    private final kotlin.Lazy bluetoothAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.service.SoftwareUpdateService.Companion Companion = null;
    
    /**
     * Unique job ID for this service.  Must be the same for all work.
     */
    private static final int JOB_ID = 1000;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_START_UPDATE = "com.geeksville.mesh.START_UPDATE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_UPDATE_PROGRESS = "com.geeksville.mesh.UPDATE_PROGRESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MACADDR = "macaddr";
    private static final long SCAN_PERIOD = 10000L;
    private static final java.lang.String TAG = null;
    private static final java.util.UUID SW_UPDATE_UUID = null;
    private static final java.util.UUID SW_UPDATE_TOTALSIZE_CHARACTER = null;
    private static final java.util.UUID SW_UPDATE_DATA_CHARACTER = null;
    private static final java.util.UUID SW_UPDATE_CRC32_CHARACTER = null;
    private static final java.util.UUID SW_UPDATE_RESULT_CHARACTER = null;
    private static final java.util.UUID SW_UPDATE_REGION_CHARACTER = null;
    private static final java.util.UUID SW_VERSION_CHARACTER = null;
    private static final java.util.UUID MANUFACTURE_CHARACTER = null;
    private static final java.util.UUID HW_VERSION_CHARACTER = null;
    public static final int ProgressSuccess = -1;
    public static final int ProgressUpdateFailed = -2;
    public static final int ProgressBleException = -3;
    public static final int ProgressNotStarted = -4;
    
    /**
     * % progress through the update
     */
    private static int progress = -4;
    private static final int FLASH_REGION_APPLOAD = 0;
    private static final int FLASH_REGION_SPIFFS = 100;
    
    public SoftwareUpdateService() {
        super();
    }
    
    private final android.bluetooth.BluetoothAdapter getBluetoothAdapter() {
        return null;
    }
    
    private final void startUpdate(java.lang.String macaddr) {
    }
    
    @java.lang.Override()
    protected void onHandleWork(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J*\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\bH\u0002J\u0016\u0010/\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u00100\u001a\u000201J\u0018\u00102\u001a\u0004\u0018\u00010,2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u0016\u00102\u001a\u00020,2\u0006\u0010\'\u001a\u00020(2\u0006\u00103\u001a\u00020\u0004J\u001e\u00104\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\u001eJ\u0016\u00107\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020(2\u0006\u00108\u001a\u000209J\u000e\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0015*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0015*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0015*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010 \u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006<"}, d2 = {"Lcom/geeksville/mesh/service/SoftwareUpdateService$Companion;", "Lcom/geeksville/android/Logging;", "()V", "ACTION_START_UPDATE", "", "ACTION_UPDATE_PROGRESS", "EXTRA_MACADDR", "FLASH_REGION_APPLOAD", "", "FLASH_REGION_SPIFFS", "HW_VERSION_CHARACTER", "Ljava/util/UUID;", "JOB_ID", "MANUFACTURE_CHARACTER", "ProgressBleException", "ProgressNotStarted", "ProgressSuccess", "ProgressUpdateFailed", "SCAN_PERIOD", "", "SW_UPDATE_CRC32_CHARACTER", "kotlin.jvm.PlatformType", "SW_UPDATE_DATA_CHARACTER", "SW_UPDATE_REGION_CHARACTER", "SW_UPDATE_RESULT_CHARACTER", "SW_UPDATE_TOTALSIZE_CHARACTER", "SW_UPDATE_UUID", "SW_VERSION_CHARACTER", "TAG", "isUpdating", "", "()Z", "progress", "getProgress", "()I", "setProgress", "(I)V", "doUpdate", "", "context", "Landroid/content/Context;", "sync", "Lcom/geeksville/mesh/service/SafeBluetooth;", "assets", "Lcom/geeksville/mesh/service/UpdateFilenames;", "assetName", "flashRegion", "enqueueWork", "work", "Landroid/content/Intent;", "getUpdateFilename", "mfg", "sendProgress", "p", "isAppload", "shouldUpdate", "deviceVersion", "Lcom/geeksville/mesh/model/DeviceVersion;", "startUpdateIntent", "macAddress", "app_debug"})
    public static final class Companion implements com.geeksville.android.Logging {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent startUpdateIntent(@org.jetbrains.annotations.NotNull()
        java.lang.String macAddress) {
            return null;
        }
        
        public final int getProgress() {
            return 0;
        }
        
        public final void setProgress(int p0) {
        }
        
        /**
         * Convenience method for enqueuing work in to this service.
         */
        public final void enqueueWork(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent work) {
        }
        
        public final boolean isUpdating() {
            return false;
        }
        
        /**
         * Update our progress indication for GUIs
         *
         * @param isAppload if false, we don't report failure indications (because we consider spiffs non critical for now).  But do report to analytics
         */
        public final void sendProgress(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int p, boolean isAppload) {
        }
        
        /**
         * Return true if we thing the firmwarte shoulde be updated
         *
         * @param swVer the version of the software running on the target
         */
        public final boolean shouldUpdate(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.geeksville.mesh.model.DeviceVersion deviceVersion) {
            return false;
        }
        
        /**
         * Return a Pair of apploadfilename, spiffs filename this device needs to use as an update (or null if no update needed)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.geeksville.mesh.service.UpdateFilenames getUpdateFilename(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String mfg) {
            return null;
        }
        
        /**
         * Return the filename this device needs to use as an update (or null if no update needed)
         * No longer used, because we get update info inband from our radio API
         */
        @org.jetbrains.annotations.Nullable()
        public final com.geeksville.mesh.service.UpdateFilenames getUpdateFilename(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.geeksville.mesh.service.SafeBluetooth sync) {
            return null;
        }
        
        /**
         * A public function so that if you have your own SafeBluetooth connection already open
         * you can use it for the software update.
         */
        public final void doUpdate(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.geeksville.mesh.service.SafeBluetooth sync, @org.jetbrains.annotations.NotNull()
        com.geeksville.mesh.service.UpdateFilenames assets) {
        }
        
        /**
         * A public function so that if you have your own SafeBluetooth connection already open
         * you can use it for the software update.
         */
        private final void doUpdate(android.content.Context context, com.geeksville.mesh.service.SafeBluetooth sync, java.lang.String assetName, int flashRegion) {
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