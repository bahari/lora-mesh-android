package com.geeksville.mesh.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u0002\u001a\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a\n\u0010\u0012\u001a\u00020\u0013*\u00020\u0002\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"bluetoothManager", "Landroid/bluetooth/BluetoothManager;", "Landroid/content/Context;", "getBluetoothManager", "(Landroid/content/Context;)Landroid/bluetooth/BluetoothManager;", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "(Landroid/content/Context;)Landroid/app/NotificationManager;", "usbManager", "Landroid/hardware/usb/UsbManager;", "getUsbManager", "(Landroid/content/Context;)Landroid/hardware/usb/UsbManager;", "getBackgroundPermissions", "", "", "getMissingPermissions", "perms", "hasBackgroundPermission", "", "app_debug"})
public final class ContextServicesKt {
    
    @org.jetbrains.annotations.Nullable()
    public static final android.bluetooth.BluetoothManager getBluetoothManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$bluetoothManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.hardware.usb.UsbManager getUsbManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$usbManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.app.NotificationManager getNotificationManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$notificationManager) {
        return null;
    }
    
    /**
     * return a list of the permissions we don't have
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> getMissingPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getMissingPermissions, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> perms) {
        return null;
    }
    
    /**
     * A list of missing background location permissions (or empty if we already have what we need)
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> getBackgroundPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getBackgroundPermissions) {
        return null;
    }
    
    /**
     * @return true if the user already has background location permission
     */
    public static final boolean hasBackgroundPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hasBackgroundPermission) {
        return false;
    }
}