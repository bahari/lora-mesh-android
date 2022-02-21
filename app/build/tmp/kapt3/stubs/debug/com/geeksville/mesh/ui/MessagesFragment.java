package com.geeksville.mesh.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/geeksville/mesh/ui/MessagesFragment;", "Lcom/geeksville/mesh/ui/ScreenFragment;", "Lcom/geeksville/android/Logging;", "()V", "_binding", "Lcom/geeksville/mesh/databinding/MessagesFragmentBinding;", "binding", "getBinding", "()Lcom/geeksville/mesh/databinding/MessagesFragmentBinding;", "dateTimeFormat", "Ljava/text/DateFormat;", "messagesAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/geeksville/mesh/ui/MessagesFragment$ViewHolder;", "model", "Lcom/geeksville/mesh/model/UIViewModel;", "getModel", "()Lcom/geeksville/mesh/model/UIViewModel;", "model$delegate", "Lkotlin/Lazy;", "timeFormat", "getShortDateTime", "", "time", "Ljava/util/Date;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "ViewHolder", "app_debug"})
public final class MessagesFragment extends com.geeksville.mesh.ui.ScreenFragment implements com.geeksville.android.Logging {
    private com.geeksville.mesh.databinding.MessagesFragmentBinding _binding;
    private final kotlin.Lazy model$delegate = null;
    private final java.text.DateFormat dateTimeFormat = null;
    private final java.text.DateFormat timeFormat = null;
    private final androidx.recyclerview.widget.RecyclerView.Adapter<com.geeksville.mesh.ui.MessagesFragment.ViewHolder> messagesAdapter = null;
    
    public MessagesFragment() {
        super(null);
    }
    
    private final com.geeksville.mesh.databinding.MessagesFragmentBinding getBinding() {
        return null;
    }
    
    private final com.geeksville.mesh.model.UIViewModel getModel() {
        return null;
    }
    
    private final java.lang.String getShortDateTime(java.util.Date time) {
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
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/geeksville/mesh/ui/MessagesFragment$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Lcom/geeksville/mesh/databinding/AdapterMessageLayoutBinding;", "(Lcom/geeksville/mesh/databinding/AdapterMessageLayoutBinding;)V", "card", "Landroidx/cardview/widget/CardView;", "getCard", "()Landroidx/cardview/widget/CardView;", "messageStatusIcon", "Landroid/widget/ImageView;", "getMessageStatusIcon", "()Landroid/widget/ImageView;", "messageText", "Landroid/widget/TextView;", "getMessageText", "()Landroid/widget/TextView;", "messageTime", "getMessageTime", "username", "Lcom/google/android/material/chip/Chip;", "getUsername", "()Lcom/google/android/material/chip/Chip;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.material.chip.Chip username = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView messageText = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView messageTime = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView messageStatusIcon = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView card = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.geeksville.mesh.databinding.AdapterMessageLayoutBinding itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.material.chip.Chip getUsername() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMessageText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMessageTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMessageStatusIcon() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCard() {
            return null;
        }
    }
}