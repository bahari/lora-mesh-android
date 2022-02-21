package com.geeksville.mesh.service;

import java.lang.System;

/**
 * A helper class to call onChanged when bluetooth is enabled or disabled
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0016R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/geeksville/mesh/service/BluetoothStateReceiver;", "Landroid/content/BroadcastReceiver;", "onChanged", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "intentFilter", "Landroid/content/IntentFilter;", "getIntentFilter", "()Landroid/content/IntentFilter;", "bluetoothAdapterState", "", "Landroid/content/Intent;", "getBluetoothAdapterState", "(Landroid/content/Intent;)I", "onReceive", "context", "Landroid/content/Context;", "intent", "app_debug"})
public final class BluetoothStateReceiver extends android.content.BroadcastReceiver {
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onChanged = null;
    
    public BluetoothStateReceiver(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onChanged) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.IntentFilter getIntentFilter() {
        return null;
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final int getBluetoothAdapterState(android.content.Intent $this$bluetoothAdapterState) {
        return 0;
    }
}