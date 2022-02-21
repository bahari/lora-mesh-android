package com.geeksville.mesh.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/geeksville/mesh/service/NopInterface;", "Lcom/geeksville/mesh/service/IRadioInterface;", "()V", "close", "", "handleSendToRadio", "p", "", "Companion", "app_debug"})
public final class NopInterface implements com.geeksville.mesh.service.IRadioInterface {
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.service.NopInterface.Companion Companion = null;
    
    public NopInterface() {
        super();
    }
    
    @java.lang.Override()
    public void handleSendToRadio(@org.jetbrains.annotations.NotNull()
    byte[] p) {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/geeksville/mesh/service/NopInterface$Companion;", "Lcom/geeksville/android/Logging;", "Lcom/geeksville/mesh/service/InterfaceFactory;", "()V", "createInterface", "Lcom/geeksville/mesh/service/IRadioInterface;", "service", "Lcom/geeksville/mesh/service/RadioInterfaceService;", "rest", "", "app_debug"})
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