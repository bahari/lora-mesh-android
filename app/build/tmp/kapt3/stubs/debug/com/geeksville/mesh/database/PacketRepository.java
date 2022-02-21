package com.geeksville.mesh.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/geeksville/mesh/database/PacketRepository;", "", "packetDao", "Lcom/geeksville/mesh/database/dao/PacketDao;", "(Lcom/geeksville/mesh/database/dao/PacketDao;)V", "allPackets", "Landroidx/lifecycle/LiveData;", "", "Lcom/geeksville/mesh/database/entity/Packet;", "getAllPackets", "()Landroidx/lifecycle/LiveData;", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "packet", "(Lcom/geeksville/mesh/database/entity/Packet;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PacketRepository {
    private final com.geeksville.mesh.database.dao.PacketDao packetDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.geeksville.mesh.database.entity.Packet>> allPackets = null;
    
    public PacketRepository(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.database.dao.PacketDao packetDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.geeksville.mesh.database.entity.Packet>> getAllPackets() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.database.entity.Packet packet, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}