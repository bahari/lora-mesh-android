package com.geeksville.mesh.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020&H\u0016J\u001e\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\b\u0010.\u001a\u00020&H\u0016J\b\u0010/\u001a\u00020&H\u0016J\u0010\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020$H\u0016J\b\u00102\u001a\u00020&H\u0016J\b\u00103\u001a\u00020&H\u0016J\u001a\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u000e\u00106\u001a\u00020&2\u0006\u0010)\u001a\u00020*R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/geeksville/mesh/ui/MapFragment;", "Lcom/geeksville/mesh/ui/ScreenFragment;", "Lcom/geeksville/android/Logging;", "()V", "isViewVisible", "", "()Z", "labelLayer", "Lcom/mapbox/mapboxsdk/style/layers/SymbolLayer;", "labelLayerId", "", "mapView", "Lcom/mapbox/mapboxsdk/maps/MapView;", "getMapView", "()Lcom/mapbox/mapboxsdk/maps/MapView;", "setMapView", "(Lcom/mapbox/mapboxsdk/maps/MapView;)V", "markerImageId", "model", "Lcom/geeksville/mesh/model/UIViewModel;", "getModel", "()Lcom/geeksville/mesh/model/UIViewModel;", "model$delegate", "Lkotlin/Lazy;", "nodeLayer", "nodeLayerId", "nodePositions", "Lcom/mapbox/mapboxsdk/style/sources/GeoJsonSource;", "nodeSourceId", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onLowMemory", "onNodesChanged", "map", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "nodes", "", "Lcom/geeksville/mesh/NodeInfo;", "onPause", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "onViewCreated", "viewIn", "zoomToNodes", "app_debug"})
public final class MapFragment extends com.geeksville.mesh.ui.ScreenFragment implements com.geeksville.android.Logging {
    private final kotlin.Lazy model$delegate = null;
    private final java.lang.String nodeSourceId = "node-positions";
    private final java.lang.String nodeLayerId = "node-layer";
    private final java.lang.String labelLayerId = "label-layer";
    private final java.lang.String markerImageId = "my-marker-image";
    private final com.mapbox.mapboxsdk.style.sources.GeoJsonSource nodePositions = null;
    private final com.mapbox.mapboxsdk.style.layers.SymbolLayer nodeLayer = null;
    private final com.mapbox.mapboxsdk.style.layers.SymbolLayer labelLayer = null;
    @org.jetbrains.annotations.Nullable()
    private com.mapbox.mapboxsdk.maps.MapView mapView;
    
    public MapFragment() {
        super(null);
    }
    
    private final com.geeksville.mesh.model.UIViewModel getModel() {
        return null;
    }
    
    private final void onNodesChanged(com.mapbox.mapboxsdk.maps.MapboxMap map, java.util.Collection<com.geeksville.mesh.NodeInfo> nodes) {
    }
    
    public final void zoomToNodes(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.MapboxMap map) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mapbox.mapboxsdk.maps.MapView getMapView() {
        return null;
    }
    
    public final void setMapView(@org.jetbrains.annotations.Nullable()
    com.mapbox.mapboxsdk.maps.MapView p0) {
    }
    
    private final boolean isViewVisible() {
        return false;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View viewIn, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
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