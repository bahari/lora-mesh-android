package com.geeksville.mesh.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u0012\u0010\u0007\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002\u00a8\u0006\b"}, d2 = {"startMeshService", "Landroid/content/ComponentName;", "Landroid/content/Context;", "startService", "", "Lcom/geeksville/mesh/service/MeshService$Companion;", "context", "startServiceLater", "app_debug"})
public final class MeshServiceStarterKt {
    
    private static final android.content.ComponentName startMeshService(android.content.Context $this$startMeshService) {
        return null;
    }
    
    /**
     * Just after boot the android OS is super busy, so if we call startForegroundService then, our
     * thread might be stalled long enough to expose this Google/Samsung bug:
     * https://issuetracker.google.com/issues/76112072#comment56
     */
    public static final void startServiceLater(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.service.MeshService.Companion $this$startServiceLater, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public static final void startService(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.service.MeshService.Companion $this$startService, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}