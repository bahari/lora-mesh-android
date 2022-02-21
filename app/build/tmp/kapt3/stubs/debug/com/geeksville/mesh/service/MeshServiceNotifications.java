package com.geeksville.mesh.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006J\b\u0010\'\u001a\u00020\u0006H\u0003J\b\u0010(\u001a\u00020\u0006H\u0003J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0006J\u000e\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0011J\u0016\u0010-\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006J\u000e\u0010.\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u0006R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0011X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006/"}, d2 = {"Lcom/geeksville/mesh/service/MeshServiceNotifications;", "Ljava/io/Closeable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "channelId", "", "getChannelId", "()Ljava/lang/String;", "channelId$delegate", "Lkotlin/Lazy;", "largeIcon", "Landroid/graphics/Bitmap;", "messageChannelId", "getMessageChannelId", "messageChannelId$delegate", "messageNotifyId", "", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "()Landroid/app/NotificationManager;", "notifyId", "getNotifyId", "()I", "openAppIntent", "Landroid/app/PendingIntent;", "getOpenAppIntent", "()Landroid/app/PendingIntent;", "openAppIntent$delegate", "close", "", "commonBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "channel", "createMessageNotifcation", "Landroid/app/Notification;", "name", "message", "createMessageNotificationChannel", "createNotificationChannel", "createServiceStateNotification", "summaryString", "getBitmapFromVectorDrawable", "drawableId", "updateMessageNotification", "updateServiceStateNotification", "app_debug"})
public final class MeshServiceNotifications implements java.io.Closeable {
    private final android.content.Context context = null;
    private final int notifyId = 101;
    private final int messageNotifyId = 102;
    private android.graphics.Bitmap largeIcon;
    private final kotlin.Lazy channelId$delegate = null;
    private final kotlin.Lazy messageChannelId$delegate = null;
    private final kotlin.Lazy openAppIntent$delegate = null;
    
    public MeshServiceNotifications(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final android.app.NotificationManager getNotificationManager() {
        return null;
    }
    
    public final int getNotifyId() {
        return 0;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final java.lang.String createNotificationChannel() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final java.lang.String createMessageNotificationChannel() {
        return null;
    }
    
    private final java.lang.String getChannelId() {
        return null;
    }
    
    private final java.lang.String getMessageChannelId() {
        return null;
    }
    
    public final void updateServiceStateNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String summaryString) {
    }
    
    public final void updateMessageNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final android.app.PendingIntent getOpenAppIntent() {
        return null;
    }
    
    /**
     * Generate a bitmap from a vector drawable (even on old builds)
     * https://stackoverflow.com/questions/33696488/getting-bitmap-from-vector-drawable
     */
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getBitmapFromVectorDrawable(int drawableId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.core.app.NotificationCompat.Builder commonBuilder(@org.jetbrains.annotations.NotNull()
    java.lang.String channel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification createServiceStateNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String summaryString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification createMessageNotifcation(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    @java.lang.Override()
    public void close() {
    }
}