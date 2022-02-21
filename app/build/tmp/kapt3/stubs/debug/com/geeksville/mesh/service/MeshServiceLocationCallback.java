package com.geeksville.mesh.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019BY\u0012.\u0010\u0002\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003j\u0002`\b\u0012\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\nj\u0002`\u000b\u0012\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00050\nj\u0002`\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0006H\u0002R\u0018\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00050\nj\u0002`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R6\u0010\u0002\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003j\u0002`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\nj\u0002`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/geeksville/mesh/service/MeshServiceLocationCallback;", "Lcom/google/android/gms/location/LocationCallback;", "onSendPosition", "Lkotlin/Function5;", "", "", "", "", "Lcom/geeksville/mesh/service/SendPosition;", "onSendPositionFailed", "Lkotlin/Function0;", "Lcom/geeksville/mesh/service/OnSendFailure;", "getNodeNum", "Lcom/geeksville/mesh/service/GetNodeNum;", "(Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "lastSendTimeMs", "", "onLocationResult", "locationResult", "Lcom/google/android/gms/location/LocationResult;", "sendPosition", "location", "Landroid/location/Location;", "destinationNumber", "wantResponse", "Companion", "app_debug"})
public final class MeshServiceLocationCallback extends com.google.android.gms.location.LocationCallback {
    private final kotlin.jvm.functions.Function5<java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Integer, java.lang.Boolean, kotlin.Unit> onSendPosition = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onSendPositionFailed = null;
    private final kotlin.jvm.functions.Function0<java.lang.Integer> getNodeNum = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.service.MeshServiceLocationCallback.Companion Companion = null;
    public static final int DEFAULT_SEND_RATE_LIMIT = 30;
    private long lastSendTimeMs = 0L;
    
    public MeshServiceLocationCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function5<? super java.lang.Double, ? super java.lang.Double, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> onSendPosition, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSendPositionFailed, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Integer> getNodeNum) {
        super();
    }
    
    @java.lang.Override()
    public void onLocationResult(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.LocationResult locationResult) {
    }
    
    private final void sendPosition(android.location.Location location, int destinationNumber, boolean wantResponse) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/geeksville/mesh/service/MeshServiceLocationCallback$Companion;", "", "()V", "DEFAULT_SEND_RATE_LIMIT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}