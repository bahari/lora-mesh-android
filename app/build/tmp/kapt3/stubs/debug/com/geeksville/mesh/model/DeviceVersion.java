package com.geeksville.mesh.model;

import java.lang.System;

/**
 * Provide structured access to parse and compare device version strings
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0004H\u00d6\u0001J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0004H\u0002R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/geeksville/mesh/model/DeviceVersion;", "", "Lcom/geeksville/android/Logging;", "asString", "", "(Ljava/lang/String;)V", "asInt", "", "getAsInt", "()I", "getAsString", "()Ljava/lang/String;", "compareTo", "other", "component1", "copy", "equals", "", "", "hashCode", "toString", "verStringToInt", "s", "app_debug"})
public final class DeviceVersion implements java.lang.Comparable<com.geeksville.mesh.model.DeviceVersion>, com.geeksville.android.Logging {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String asString = null;
    
    /**
     * Provide structured access to parse and compare device version strings
     */
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.model.DeviceVersion copy(@org.jetbrains.annotations.NotNull()
    java.lang.String asString) {
        return null;
    }
    
    /**
     * Provide structured access to parse and compare device version strings
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Provide structured access to parse and compare device version strings
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Provide structured access to parse and compare device version strings
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public DeviceVersion(@org.jetbrains.annotations.NotNull()
    java.lang.String asString) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAsString() {
        return null;
    }
    
    public final int getAsInt() {
        return 0;
    }
    
    /**
     * Convert a version string of the form 1.23.57 to a comparable integer of
     * the form 12357.
     *
     * Or throw an exception if the string can not be parsed
     */
    private final int verStringToInt(java.lang.String s) {
        return 0;
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.model.DeviceVersion other) {
        return 0;
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