package com.geeksville.mesh.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/geeksville/mesh/model/NodeDB;", "", "ui", "Lcom/geeksville/mesh/model/UIViewModel;", "(Lcom/geeksville/mesh/model/UIViewModel;)V", "myId", "Landroidx/lifecycle/MutableLiveData;", "", "getMyId", "()Landroidx/lifecycle/MutableLiveData;", "nodes", "", "Lcom/geeksville/mesh/NodeInfo;", "getNodes", "ourNodeInfo", "getOurNodeInfo", "()Lcom/geeksville/mesh/NodeInfo;", "seedWithTestNodes", "", "testNodeNoPosition", "getTestNodeNoPosition", "testNodes", "", "getTestNodes", "()Ljava/util/List;", "testPositions", "", "Lcom/geeksville/mesh/Position;", "[Lcom/geeksville/mesh/Position;", "app_debug"})
public final class NodeDB {
    private final com.geeksville.mesh.model.UIViewModel ui = null;
    private final com.geeksville.mesh.Position[] testPositions = null;
    @org.jetbrains.annotations.NotNull()
    private final com.geeksville.mesh.NodeInfo testNodeNoPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.geeksville.mesh.NodeInfo> testNodes = null;
    private final boolean seedWithTestNodes = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> myId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, com.geeksville.mesh.NodeInfo>> nodes = null;
    
    public NodeDB(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.model.UIViewModel ui) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.NodeInfo getTestNodeNoPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.geeksville.mesh.NodeInfo> getTestNodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMyId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, com.geeksville.mesh.NodeInfo>> getNodes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.geeksville.mesh.NodeInfo getOurNodeInfo() {
        return null;
    }
}