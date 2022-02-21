package com.geeksville.mesh.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\'\u00a8\u0006\f"}, d2 = {"Lcom/geeksville/mesh/database/dao/PacketDao;", "", "deleteAll", "", "getAllPacket", "Landroidx/lifecycle/LiveData;", "", "Lcom/geeksville/mesh/database/entity/Packet;", "maxItem", "", "insert", "packet", "app_debug"})
public abstract interface PacketDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from packet order by received_date desc limit 0,:maxItem")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.geeksville.mesh.database.entity.Packet>> getAllPacket(int maxItem);
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.database.entity.Packet packet);
    
    @androidx.room.Query(value = "DELETE from packet")
    public abstract void deleteAll();
}