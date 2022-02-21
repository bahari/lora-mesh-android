package com.geeksville.mesh.service;

import java.lang.System;

/**
 * A base class for the singleton factories that make interfaces.  One instance per interface type
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u0011\u001a\u00020\u0012H\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/geeksville/mesh/service/InterfaceFactory;", "", "prefix", "", "(C)V", "getPrefix", "()C", "addressValid", "", "context", "Landroid/content/Context;", "rest", "", "createInterface", "Lcom/geeksville/mesh/service/IRadioInterface;", "service", "Lcom/geeksville/mesh/service/RadioInterfaceService;", "registerFactory", "", "Companion", "app_debug"})
public abstract class InterfaceFactory {
    private final char prefix = '\u0000';
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.service.InterfaceFactory.Companion Companion = null;
    private static final java.util.Map<java.lang.Character, com.geeksville.mesh.service.InterfaceFactory> factories = null;
    
    public InterfaceFactory(char prefix) {
        super();
    }
    
    public final char getPrefix() {
        return '\u0000';
    }
    
    protected final void registerFactory() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.geeksville.mesh.service.IRadioInterface createInterface(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.service.RadioInterfaceService service, @org.jetbrains.annotations.NotNull()
    java.lang.String rest);
    
    /**
     * Return true if this address is still acceptable. For BLE that means, still bonded
     */
    public boolean addressValid(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String rest) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/geeksville/mesh/service/InterfaceFactory$Companion;", "", "()V", "factories", "", "", "Lcom/geeksville/mesh/service/InterfaceFactory;", "getFactory", "l", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.geeksville.mesh.service.InterfaceFactory getFactory(char l) {
            return null;
        }
    }
}