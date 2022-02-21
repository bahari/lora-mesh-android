package com.geeksville.mesh.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u0014\u0010\u0014\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/geeksville/mesh/model/MessagesState;", "Lcom/geeksville/android/Logging;", "ui", "Lcom/geeksville/mesh/model/UIViewModel;", "(Lcom/geeksville/mesh/model/UIViewModel;)V", "messages", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/geeksville/mesh/DataPacket;", "getMessages", "()Landroidx/lifecycle/MutableLiveData;", "messagesList", "", "addMessage", "", "m", "sendMessage", "str", "", "dest", "setMessages", "updateStatus", "id", "", "status", "Lcom/geeksville/mesh/MessageStatus;", "app_debug"})
public final class MessagesState implements com.geeksville.android.Logging {
    private final com.geeksville.mesh.model.UIViewModel ui = null;
    private final java.util.List<com.geeksville.mesh.DataPacket> messagesList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.geeksville.mesh.DataPacket>> messages = null;
    
    public MessagesState(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.model.UIViewModel ui) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.geeksville.mesh.DataPacket>> getMessages() {
        return null;
    }
    
    public final void setMessages(@org.jetbrains.annotations.NotNull()
    java.util.List<com.geeksville.mesh.DataPacket> m) {
    }
    
    public final void addMessage(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.DataPacket m) {
    }
    
    public final void updateStatus(int id, @org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.MessageStatus status) {
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String str, @org.jetbrains.annotations.NotNull()
    java.lang.String dest) {
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
}