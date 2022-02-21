package com.geeksville.mesh.service;

import java.lang.System;

/**
 * A simulated interface that is used for testing in the simulator
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J(\u0010\u001a\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00152\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J9\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\"\u00a2\u0006\u0002\b$H\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0007H\u0002J\u0010\u0010\'\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/geeksville/mesh/service/MockInterface;", "Lcom/geeksville/android/Logging;", "Lcom/geeksville/mesh/service/IRadioInterface;", "service", "Lcom/geeksville/mesh/service/RadioInterfaceService;", "(Lcom/geeksville/mesh/service/RadioInterfaceService;)V", "messageCount", "", "messageNumSequence", "", "close", "", "handleAdminPacket", "pr", "Lcom/geeksville/mesh/MeshProtos$ToRadio;", "d", "Lcom/geeksville/mesh/AdminProtos$AdminMessage;", "handleSendToRadio", "p", "", "makeAck", "Lcom/geeksville/mesh/MeshProtos$FromRadio$Builder;", "kotlin.jvm.PlatformType", "fromIn", "toIn", "msgId", "makeDataPacket", "data", "Lcom/geeksville/mesh/MeshProtos$Data$Builder;", "makeTextMessage", "numIn", "sendAdmin", "reqId", "initFn", "Lkotlin/Function1;", "Lcom/geeksville/mesh/AdminProtos$AdminMessage$Builder;", "Lkotlin/ExtensionFunctionType;", "sendConfigResponse", "configId", "sendFakeAck", "Companion", "app_debug"})
public final class MockInterface implements com.geeksville.android.Logging, com.geeksville.mesh.service.IRadioInterface {
    private final com.geeksville.mesh.service.RadioInterfaceService service = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.service.MockInterface.Companion Companion = null;
    private int messageCount = 50;
    private final java.util.Iterator<java.lang.Integer> messageNumSequence = null;
    
    public MockInterface(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.service.RadioInterfaceService service) {
        super();
    }
    
    @java.lang.Override()
    public void handleSendToRadio(@org.jetbrains.annotations.NotNull()
    byte[] p) {
    }
    
    private final void handleAdminPacket(com.geeksville.mesh.MeshProtos.ToRadio pr, com.geeksville.mesh.AdminProtos.AdminMessage d) {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    private final com.geeksville.mesh.MeshProtos.FromRadio.Builder makeTextMessage(int numIn) {
        return null;
    }
    
    private final com.geeksville.mesh.MeshProtos.FromRadio.Builder makeDataPacket(int fromIn, int toIn, com.geeksville.mesh.MeshProtos.Data.Builder data) {
        return null;
    }
    
    private final com.geeksville.mesh.MeshProtos.FromRadio.Builder makeAck(int fromIn, int toIn, int msgId) {
        return null;
    }
    
    private final void sendAdmin(int fromIn, int toIn, int reqId, kotlin.jvm.functions.Function1<? super com.geeksville.mesh.AdminProtos.AdminMessage.Builder, kotlin.Unit> initFn) {
    }
    
    private final void sendFakeAck(com.geeksville.mesh.MeshProtos.ToRadio pr) {
    }
    
    private final void sendConfigResponse(int configId) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/geeksville/mesh/service/MockInterface$Companion;", "Lcom/geeksville/android/Logging;", "Lcom/geeksville/mesh/service/InterfaceFactory;", "()V", "addressValid", "", "context", "Landroid/content/Context;", "rest", "", "createInterface", "Lcom/geeksville/mesh/service/IRadioInterface;", "service", "Lcom/geeksville/mesh/service/RadioInterfaceService;", "app_debug"})
    public static final class Companion extends com.geeksville.mesh.service.InterfaceFactory implements com.geeksville.android.Logging {
        
        private Companion() {
            super('\u0000');
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.geeksville.mesh.service.IRadioInterface createInterface(@org.jetbrains.annotations.NotNull()
        com.geeksville.mesh.service.RadioInterfaceService service, @org.jetbrains.annotations.NotNull()
        java.lang.String rest) {
            return null;
        }
        
        @java.lang.Override()
        public boolean addressValid(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String rest) {
            return false;
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
}