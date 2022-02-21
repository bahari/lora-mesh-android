package com.geeksville.mesh.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006$"}, d2 = {"Lcom/geeksville/mesh/ui/ChannelFragment;", "Lcom/geeksville/mesh/ui/ScreenFragment;", "Lcom/geeksville/android/Logging;", "()V", "_binding", "Lcom/geeksville/mesh/databinding/ChannelFragmentBinding;", "binding", "getBinding", "()Lcom/geeksville/mesh/databinding/ChannelFragmentBinding;", "model", "Lcom/geeksville/mesh/model/UIViewModel;", "getModel", "()Lcom/geeksville/mesh/model/UIViewModel;", "model$delegate", "Lkotlin/Lazy;", "getModemConfig", "Lcom/geeksville/mesh/ChannelProtos$ChannelSettings$ModemConfig;", "selectedChannelOptionString", "", "installSettings", "", "newChannel", "Lcom/geeksville/mesh/ChannelProtos$ChannelSettings;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onEditingChanged", "onViewCreated", "view", "setGUIfromModel", "shareChannel", "app_debug"})
public final class ChannelFragment extends com.geeksville.mesh.ui.ScreenFragment implements com.geeksville.android.Logging {
    private com.geeksville.mesh.databinding.ChannelFragmentBinding _binding;
    private final kotlin.Lazy model$delegate = null;
    
    public ChannelFragment() {
        super(null);
    }
    
    private final com.geeksville.mesh.databinding.ChannelFragmentBinding getBinding() {
        return null;
    }
    
    private final com.geeksville.mesh.model.UIViewModel getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void onEditingChanged() {
    }
    
    private final void setGUIfromModel() {
    }
    
    private final void shareChannel() {
    }
    
    private final void installSettings(com.geeksville.mesh.ChannelProtos.ChannelSettings newChannel) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.geeksville.mesh.ChannelProtos.ChannelSettings.ModemConfig getModemConfig(java.lang.String selectedChannelOptionString) {
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