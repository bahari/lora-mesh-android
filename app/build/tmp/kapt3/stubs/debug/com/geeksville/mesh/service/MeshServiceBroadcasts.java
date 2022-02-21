package com.geeksville.mesh.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000fJ\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/geeksville/mesh/service/MeshServiceBroadcasts;", "", "context", "Landroid/content/Context;", "clientPackages", "", "", "getConnectionState", "Lkotlin/Function0;", "Lcom/geeksville/mesh/service/MeshService$ConnectionState;", "(Landroid/content/Context;Ljava/util/Map;Lkotlin/jvm/functions/Function0;)V", "broadcastConnection", "", "broadcastMessageStatus", "p", "Lcom/geeksville/mesh/DataPacket;", "broadcastNodeChange", "info", "Lcom/geeksville/mesh/NodeInfo;", "broadcastReceivedData", "payload", "explicitBroadcast", "intent", "Landroid/content/Intent;", "app_debug"})
public final class MeshServiceBroadcasts {
    private final android.content.Context context = null;
    private final java.util.Map<java.lang.String, java.lang.String> clientPackages = null;
    private final kotlin.jvm.functions.Function0<com.geeksville.mesh.service.MeshService.ConnectionState> getConnectionState = null;
    
    public MeshServiceBroadcasts(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> clientPackages, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends com.geeksville.mesh.service.MeshService.ConnectionState> getConnectionState) {
        super();
    }
    
    /**
     * Broadcast some received data
     * Payload will be a DataPacket
     */
    public final void broadcastReceivedData(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.DataPacket payload) {
    }
    
    public final void broadcastNodeChange(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.NodeInfo info) {
    }
    
    public final void broadcastMessageStatus(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.DataPacket p) {
    }
    
    /**
     * Broadcast our current connection status
     */
    public final void broadcastConnection() {
    }
    
    /**
     * See com.geeksville.mesh broadcast intents.
     *
     *    RECEIVED_OPAQUE  for data received from other nodes
     *    NODE_CHANGE  for new IDs appearing or disappearing
     *    ACTION_MESH_CONNECTED for losing/gaining connection to the packet radio
     *        Note: this is not the same as RadioInterfaceService.RADIO_CONNECTED_ACTION,
     *        because it implies we have assembled a valid node db.
     */
    private final void explicitBroadcast(android.content.Intent intent) {
    }
}