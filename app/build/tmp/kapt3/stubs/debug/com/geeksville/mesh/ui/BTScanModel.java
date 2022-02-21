package com.geeksville.mesh.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u000278B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0012H\u0002J\u0016\u0010-\u001a\u00020+2\u0006\u0010\n\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0011J\b\u00100\u001a\u00020+H\u0014J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u00020.2\u0006\u00104\u001a\u00020\u0012J\u0006\u00105\u001a\u000202J\u0006\u00106\u001a\u00020+R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0013\u0010 \u001a\u0004\u0018\u00010\u00118F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0011\u0010\"\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0013\u0010$\u001a\u0004\u0018\u00010\u00118F\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0014\u0010&\u001a\u00020\'8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010)\u00a8\u00069"}, d2 = {"Lcom/geeksville/mesh/ui/BTScanModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/geeksville/android/Logging;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBluetoothAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "devices", "Landroidx/lifecycle/MutableLiveData;", "", "", "Lcom/geeksville/mesh/ui/BTScanModel$DeviceListEntry;", "getDevices", "()Landroidx/lifecycle/MutableLiveData;", "errorText", "getErrorText", "scanCallback", "Landroid/bluetooth/le/ScanCallback;", "scanner", "Landroid/bluetooth/le/BluetoothLeScanner;", "selectedAddress", "getSelectedAddress", "()Ljava/lang/String;", "setSelectedAddress", "(Ljava/lang/String;)V", "selectedBluetooth", "getSelectedBluetooth", "selectedNotNull", "getSelectedNotNull", "selectedUSB", "getSelectedUSB", "usbManager", "Landroid/hardware/usb/UsbManager;", "getUsbManager", "()Landroid/hardware/usb/UsbManager;", "addDevice", "", "entry", "changeScanSelection", "Lcom/geeksville/mesh/MainActivity;", "newAddr", "onCleared", "onSelected", "", "activity", "it", "startScan", "stopScan", "DeviceListEntry", "USBDeviceListEntry", "app_debug"})
public final class BTScanModel extends androidx.lifecycle.AndroidViewModel implements com.geeksville.android.Logging {
    @org.jetbrains.annotations.Nullable()
    private final android.bluetooth.BluetoothAdapter bluetoothAdapter = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedAddress;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorText = null;
    private android.bluetooth.le.BluetoothLeScanner scanner;
    private final android.bluetooth.le.ScanCallback scanCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, com.geeksville.mesh.ui.BTScanModel.DeviceListEntry>> devices = null;
    
    public BTScanModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
    
    private final android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.bluetooth.BluetoothAdapter getBluetoothAdapter() {
        return null;
    }
    
    private final android.hardware.usb.UsbManager getUsbManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedAddress() {
        return null;
    }
    
    public final void setSelectedAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedBluetooth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedUSB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedNotNull() {
        return null;
    }
    
    private final void addDevice(com.geeksville.mesh.ui.BTScanModel.DeviceListEntry entry) {
    }
    
    public final void stopScan() {
    }
    
    /**
     * returns true if we could start scanning, false otherwise
     */
    public final boolean startScan() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, com.geeksville.mesh.ui.BTScanModel.DeviceListEntry>> getDevices() {
        return null;
    }
    
    public final boolean onSelected(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.MainActivity activity, @org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.ui.BTScanModel.DeviceListEntry it) {
        return false;
    }
    
    public final void changeScanSelection(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.MainActivity context, @org.jetbrains.annotations.NotNull()
    java.lang.String newAddr) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/geeksville/mesh/ui/BTScanModel$DeviceListEntry;", "", "name", "", "address", "bonded", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAddress", "()Ljava/lang/String;", "bluetoothAddress", "getBluetoothAddress", "getBonded", "()Z", "isBluetooth", "isSerial", "getName", "toString", "app_debug"})
    public static class DeviceListEntry {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String address = null;
        private final boolean bonded = false;
        
        public DeviceListEntry(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String address, boolean bonded) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAddress() {
            return null;
        }
        
        public final boolean getBonded() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBluetoothAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public final boolean isBluetooth() {
            return false;
        }
        
        public final boolean isSerial() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/geeksville/mesh/ui/BTScanModel$USBDeviceListEntry;", "Lcom/geeksville/mesh/ui/BTScanModel$DeviceListEntry;", "usbManager", "Landroid/hardware/usb/UsbManager;", "usb", "Lcom/hoho/android/usbserial/driver/UsbSerialDriver;", "(Landroid/hardware/usb/UsbManager;Lcom/hoho/android/usbserial/driver/UsbSerialDriver;)V", "getUsb", "()Lcom/hoho/android/usbserial/driver/UsbSerialDriver;", "app_debug"})
    public static final class USBDeviceListEntry extends com.geeksville.mesh.ui.BTScanModel.DeviceListEntry {
        @org.jetbrains.annotations.NotNull()
        private final com.hoho.android.usbserial.driver.UsbSerialDriver usb = null;
        
        public USBDeviceListEntry(@org.jetbrains.annotations.NotNull()
        android.hardware.usb.UsbManager usbManager, @org.jetbrains.annotations.NotNull()
        com.hoho.android.usbserial.driver.UsbSerialDriver usb) {
            super(null, null, false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.hoho.android.usbserial.driver.UsbSerialDriver getUsb() {
            return null;
        }
    }
}