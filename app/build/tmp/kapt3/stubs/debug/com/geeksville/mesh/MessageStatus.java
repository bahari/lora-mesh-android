package com.geeksville.mesh;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u00d6\u0001j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/geeksville/mesh/MessageStatus;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "UNKNOWN", "RECEIVED", "QUEUED", "ENROUTE", "DELIVERED", "ERROR", "app_debug"})
public enum MessageStatus implements android.os.Parcelable {
    /*public static final*/ UNKNOWN /* = new UNKNOWN() */,
    /*public static final*/ RECEIVED /* = new RECEIVED() */,
    /*public static final*/ QUEUED /* = new QUEUED() */,
    /*public static final*/ ENROUTE /* = new ENROUTE() */,
    /*public static final*/ DELIVERED /* = new DELIVERED() */,
    /*public static final*/ ERROR /* = new ERROR() */;
    public static final android.os.Parcelable.Creator<com.geeksville.mesh.MessageStatus> CREATOR = null;
    
    MessageStatus() {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.geeksville.mesh.MessageStatus> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.geeksville.mesh.MessageStatus createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.geeksville.mesh.MessageStatus[] newArray(int size) {
            return null;
        }
    }
}