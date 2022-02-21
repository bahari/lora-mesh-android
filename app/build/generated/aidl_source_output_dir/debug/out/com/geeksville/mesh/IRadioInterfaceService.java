/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.geeksville.mesh;
// Declare any non-default types here with import statements

public interface IRadioInterfaceService extends android.os.IInterface
{
  /** Default implementation for IRadioInterfaceService. */
  public static class Default implements com.geeksville.mesh.IRadioInterfaceService
  {
    /** If the service is not currently connected to the radio, try to connect now.  At boot the radio interface service will
         * not connect to a radio until this call is received. */
    @Override public void connect() throws android.os.RemoteException
    {
    }
    @Override public void sendToRadio(byte[] a) throws android.os.RemoteException
    {
    }
    /// If a macaddress we will try to talk to our device, if null we will be idle.
    /// Any current connection will be dropped (even if the device address is the same) before reconnecting.
    /// Users should not call this directly, called only by MeshService
    /// Returns true if the device address actually changed, or false if no change was needed

    @Override public boolean setDeviceAddress(java.lang.String deviceAddr) throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.geeksville.mesh.IRadioInterfaceService
  {
    private static final java.lang.String DESCRIPTOR = "com.geeksville.mesh.IRadioInterfaceService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.geeksville.mesh.IRadioInterfaceService interface,
     * generating a proxy if needed.
     */
    public static com.geeksville.mesh.IRadioInterfaceService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.geeksville.mesh.IRadioInterfaceService))) {
        return ((com.geeksville.mesh.IRadioInterfaceService)iin);
      }
      return new com.geeksville.mesh.IRadioInterfaceService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_connect:
        {
          data.enforceInterface(descriptor);
          this.connect();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_sendToRadio:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          this.sendToRadio(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setDeviceAddress:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.setDeviceAddress(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.geeksville.mesh.IRadioInterfaceService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /** If the service is not currently connected to the radio, try to connect now.  At boot the radio interface service will
           * not connect to a radio until this call is received. */
      @Override public void connect() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_connect, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().connect();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void sendToRadio(byte[] a) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(a);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendToRadio, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().sendToRadio(a);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /// If a macaddress we will try to talk to our device, if null we will be idle.
      /// Any current connection will be dropped (even if the device address is the same) before reconnecting.
      /// Users should not call this directly, called only by MeshService
      /// Returns true if the device address actually changed, or false if no change was needed

      @Override public boolean setDeviceAddress(java.lang.String deviceAddr) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(deviceAddr);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDeviceAddress, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setDeviceAddress(deviceAddr);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.geeksville.mesh.IRadioInterfaceService sDefaultImpl;
    }
    static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_sendToRadio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_setDeviceAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(com.geeksville.mesh.IRadioInterfaceService impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.geeksville.mesh.IRadioInterfaceService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /** If the service is not currently connected to the radio, try to connect now.  At boot the radio interface service will
       * not connect to a radio until this call is received. */
  public void connect() throws android.os.RemoteException;
  public void sendToRadio(byte[] a) throws android.os.RemoteException;
  /// If a macaddress we will try to talk to our device, if null we will be idle.
  /// Any current connection will be dropped (even if the device address is the same) before reconnecting.
  /// Users should not call this directly, called only by MeshService
  /// Returns true if the device address actually changed, or false if no change was needed

  public boolean setDeviceAddress(java.lang.String deviceAddr) throws android.os.RemoteException;
}
