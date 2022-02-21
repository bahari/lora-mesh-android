/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.geeksville.mesh;
/**
This is the public android API for talking to meshtastic radios.

To connect to meshtastic you should bind to it per https://developer.android.com/guide/components/bound-services

The intent you use to reach the service should look like this:

        val intent = Intent().apply {
            setClassName(
                "com.geeksville.mesh",
                "com.geeksville.mesh.service.MeshService"
            )
        }

Once you have bound to the service you should register your broadcast receivers per https://developer.android.com/guide/components/broadcasts#context-registered-receivers

    // com.geeksville.mesh.x broadcast intents, where x is:

    // RECEIVED_DATA for data received from other nodes.  payload will contain a DataPacket, this action is DEPRECATED (because it sends all received data)
    // far better to instead use RECEIVED.<portnumm>

    // RECEIVED.<portnumm> -  will **only** deliver packets for the specified port number.  If a wellknown portnums.proto name for portnum is known it will be used
    // (i.e. com.geeksville.mesh.RECEIVED.TEXT_MESSAGE_APP) else the numeric portnum will be included as a base 10 integer (com.geeksville.mesh.RECEIVED.4403 etc...)

    // NODE_CHANGE  for new IDs appearing or disappearing
    // CONNECTION_CHANGED for losing/gaining connection to the packet radio
    // MESSAGE_STATUS_CHANGED for any message status changes (for sent messages only, other messages come via RECEIVED_DATA.  payload will contain a message ID and a MessageStatus)

At the very least you will probably want to receive RECEIVED_DATA.

Note - these calls might throw RemoteException to indicate mesh error states
*/
public interface IMeshService extends android.os.IInterface
{
  /** Default implementation for IMeshService. */
  public static class Default implements com.geeksville.mesh.IMeshService
  {
    /// Tell the service where to send its broadcasts of received packets
    /// This call is only required for manifest declared receivers.  If your receiver is context-registered
    /// you don't need this.

    @Override public void subscribeReceiver(java.lang.String packageName, java.lang.String receiverName) throws android.os.RemoteException
    {
    }
    /**
        * Set the ID info for this node

        If myId is null, then the existing unique node ID is preserved, only the human visible longName/shortName is changed
        */
    @Override public void setOwner(java.lang.String myId, java.lang.String longName, java.lang.String shortName) throws android.os.RemoteException
    {
    }
    /// Return my unique user ID string

    @Override public java.lang.String getMyId() throws android.os.RemoteException
    {
      return null;
    }
    /*
        Send a packet to a specified node name

        typ is defined in mesh.proto Data.Type.  For now juse use 0 to mean opaque bytes.

        destId can be null to indicate "broadcast message"

        messageStatus and id of the provided message will be updated by this routine to indicate
        message send status and the ID that can be used to locate the message in the future
        */
    @Override public void send(com.geeksville.mesh.DataPacket packet) throws android.os.RemoteException
    {
    }
    /**
        Get the IDs of everyone on the mesh.  You should also subscribe for NODE_CHANGE broadcasts.
        */
    @Override public java.util.List<com.geeksville.mesh.NodeInfo> getNodes() throws android.os.RemoteException
    {
      return null;
    }
    /// Return an list of MeshPacket protobuf (byte arrays) which were received while your client app was offline (recent messages only).
    /// Also includes any messages we have sent recently (useful for finding current message status)

    @Override public java.util.List<com.geeksville.mesh.DataPacket> getOldMessages() throws android.os.RemoteException
    {
      return null;
    }
    /// This method is only intended for use in our GUI, so the user can set radio options
    /// It returns a RadioConfig protobuf.

    @Override public byte[] getRadioConfig() throws android.os.RemoteException
    {
      return null;
    }
    /// This method is only intended for use in our GUI, so the user can set radio options
    /// It sets a RadioConfig protobuf

    @Override public void setRadioConfig(byte[] payload) throws android.os.RemoteException
    {
    }
    /// This method is only intended for use in our GUI, so the user can set radio options
    /// It returns a ChannelSet protobuf.

    @Override public byte[] getChannels() throws android.os.RemoteException
    {
      return null;
    }
    /// This method is only intended for use in our GUI, so the user can set radio options
    /// It sets a ChannelSet protobuf

    @Override public void setChannels(byte[] payload) throws android.os.RemoteException
    {
    }
    /**
        Is the packet radio currently connected to the phone?  Returns a ConnectionState string.
        */
    @Override public java.lang.String connectionState() throws android.os.RemoteException
    {
      return null;
    }
    /// If a macaddress we will try to talk to our device, if null we will be idle.
    /// Any current connection will be dropped (even if the device address is the same) before reconnecting.
    /// Users should not call this directly, only used internally by the MeshUtil activity
    /// Returns true if the device address actually changed, or false if no change was needed

    @Override public boolean setDeviceAddress(java.lang.String deviceAddr) throws android.os.RemoteException
    {
      return false;
    }
    /// Get basic device hardware info about our connected radio.  Will never return NULL.  Will return NULL
    /// if no my node info is available (i.e. it will not throw an exception)

    @Override public com.geeksville.mesh.MyNodeInfo getMyNodeInfo() throws android.os.RemoteException
    {
      return null;
    }
    /// Start updating the radios firmware

    @Override public void startFirmwareUpdate() throws android.os.RemoteException
    {
    }
    /**
        Return a number 0-100 for progress. -1 for completed and success, -2 for failure
        */
    @Override public int getUpdateStatus() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int getRegion() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void setRegion(int regionCode) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.geeksville.mesh.IMeshService
  {
    private static final java.lang.String DESCRIPTOR = "com.geeksville.mesh.IMeshService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.geeksville.mesh.IMeshService interface,
     * generating a proxy if needed.
     */
    public static com.geeksville.mesh.IMeshService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.geeksville.mesh.IMeshService))) {
        return ((com.geeksville.mesh.IMeshService)iin);
      }
      return new com.geeksville.mesh.IMeshService.Stub.Proxy(obj);
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
        case TRANSACTION_subscribeReceiver:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.subscribeReceiver(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setOwner:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          this.setOwner(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getMyId:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getMyId();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_send:
        {
          data.enforceInterface(descriptor);
          com.geeksville.mesh.DataPacket _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.geeksville.mesh.DataPacket.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.send(_arg0);
          reply.writeNoException();
          if ((_arg0!=null)) {
            reply.writeInt(1);
            _arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_getNodes:
        {
          data.enforceInterface(descriptor);
          java.util.List<com.geeksville.mesh.NodeInfo> _result = this.getNodes();
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_getOldMessages:
        {
          data.enforceInterface(descriptor);
          java.util.List<com.geeksville.mesh.DataPacket> _result = this.getOldMessages();
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_getRadioConfig:
        {
          data.enforceInterface(descriptor);
          byte[] _result = this.getRadioConfig();
          reply.writeNoException();
          reply.writeByteArray(_result);
          return true;
        }
        case TRANSACTION_setRadioConfig:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          this.setRadioConfig(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getChannels:
        {
          data.enforceInterface(descriptor);
          byte[] _result = this.getChannels();
          reply.writeNoException();
          reply.writeByteArray(_result);
          return true;
        }
        case TRANSACTION_setChannels:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          this.setChannels(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_connectionState:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.connectionState();
          reply.writeNoException();
          reply.writeString(_result);
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
        case TRANSACTION_getMyNodeInfo:
        {
          data.enforceInterface(descriptor);
          com.geeksville.mesh.MyNodeInfo _result = this.getMyNodeInfo();
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_startFirmwareUpdate:
        {
          data.enforceInterface(descriptor);
          this.startFirmwareUpdate();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getUpdateStatus:
        {
          data.enforceInterface(descriptor);
          int _result = this.getUpdateStatus();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getRegion:
        {
          data.enforceInterface(descriptor);
          int _result = this.getRegion();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setRegion:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.setRegion(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.geeksville.mesh.IMeshService
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
      /// Tell the service where to send its broadcasts of received packets
      /// This call is only required for manifest declared receivers.  If your receiver is context-registered
      /// you don't need this.

      @Override public void subscribeReceiver(java.lang.String packageName, java.lang.String receiverName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(receiverName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_subscribeReceiver, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().subscribeReceiver(packageName, receiverName);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          * Set the ID info for this node

          If myId is null, then the existing unique node ID is preserved, only the human visible longName/shortName is changed
          */
      @Override public void setOwner(java.lang.String myId, java.lang.String longName, java.lang.String shortName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(myId);
          _data.writeString(longName);
          _data.writeString(shortName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setOwner, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setOwner(myId, longName, shortName);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /// Return my unique user ID string

      @Override public java.lang.String getMyId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMyId, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getMyId();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /*
          Send a packet to a specified node name

          typ is defined in mesh.proto Data.Type.  For now juse use 0 to mean opaque bytes.

          destId can be null to indicate "broadcast message"

          messageStatus and id of the provided message will be updated by this routine to indicate
          message send status and the ID that can be used to locate the message in the future
          */
      @Override public void send(com.geeksville.mesh.DataPacket packet) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((packet!=null)) {
            _data.writeInt(1);
            packet.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_send, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().send(packet);
            return;
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            packet.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          Get the IDs of everyone on the mesh.  You should also subscribe for NODE_CHANGE broadcasts.
          */
      @Override public java.util.List<com.geeksville.mesh.NodeInfo> getNodes() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<com.geeksville.mesh.NodeInfo> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNodes, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getNodes();
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(com.geeksville.mesh.NodeInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /// Return an list of MeshPacket protobuf (byte arrays) which were received while your client app was offline (recent messages only).
      /// Also includes any messages we have sent recently (useful for finding current message status)

      @Override public java.util.List<com.geeksville.mesh.DataPacket> getOldMessages() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<com.geeksville.mesh.DataPacket> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getOldMessages, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getOldMessages();
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(com.geeksville.mesh.DataPacket.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /// This method is only intended for use in our GUI, so the user can set radio options
      /// It returns a RadioConfig protobuf.

      @Override public byte[] getRadioConfig() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRadioConfig, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getRadioConfig();
          }
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /// This method is only intended for use in our GUI, so the user can set radio options
      /// It sets a RadioConfig protobuf

      @Override public void setRadioConfig(byte[] payload) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(payload);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setRadioConfig, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setRadioConfig(payload);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /// This method is only intended for use in our GUI, so the user can set radio options
      /// It returns a ChannelSet protobuf.

      @Override public byte[] getChannels() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getChannels, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getChannels();
          }
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /// This method is only intended for use in our GUI, so the user can set radio options
      /// It sets a ChannelSet protobuf

      @Override public void setChannels(byte[] payload) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(payload);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setChannels, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setChannels(payload);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          Is the packet radio currently connected to the phone?  Returns a ConnectionState string.
          */
      @Override public java.lang.String connectionState() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_connectionState, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().connectionState();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /// If a macaddress we will try to talk to our device, if null we will be idle.
      /// Any current connection will be dropped (even if the device address is the same) before reconnecting.
      /// Users should not call this directly, only used internally by the MeshUtil activity
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
      /// Get basic device hardware info about our connected radio.  Will never return NULL.  Will return NULL
      /// if no my node info is available (i.e. it will not throw an exception)

      @Override public com.geeksville.mesh.MyNodeInfo getMyNodeInfo() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.geeksville.mesh.MyNodeInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMyNodeInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getMyNodeInfo();
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = com.geeksville.mesh.MyNodeInfo.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /// Start updating the radios firmware

      @Override public void startFirmwareUpdate() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startFirmwareUpdate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().startFirmwareUpdate();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          Return a number 0-100 for progress. -1 for completed and success, -2 for failure
          */
      @Override public int getUpdateStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUpdateStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getUpdateStatus();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getRegion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRegion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getRegion();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setRegion(int regionCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(regionCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setRegion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setRegion(regionCode);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.geeksville.mesh.IMeshService sDefaultImpl;
    }
    static final int TRANSACTION_subscribeReceiver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_setOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getMyId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_send = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getNodes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getOldMessages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getRadioConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_setRadioConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getChannels = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_setChannels = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_connectionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_setDeviceAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getMyNodeInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_startFirmwareUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getUpdateStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getRegion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_setRegion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    public static boolean setDefaultImpl(com.geeksville.mesh.IMeshService impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.geeksville.mesh.IMeshService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /// Tell the service where to send its broadcasts of received packets
  /// This call is only required for manifest declared receivers.  If your receiver is context-registered
  /// you don't need this.

  public void subscribeReceiver(java.lang.String packageName, java.lang.String receiverName) throws android.os.RemoteException;
  /**
      * Set the ID info for this node

      If myId is null, then the existing unique node ID is preserved, only the human visible longName/shortName is changed
      */
  public void setOwner(java.lang.String myId, java.lang.String longName, java.lang.String shortName) throws android.os.RemoteException;
  /// Return my unique user ID string

  public java.lang.String getMyId() throws android.os.RemoteException;
  /*
      Send a packet to a specified node name

      typ is defined in mesh.proto Data.Type.  For now juse use 0 to mean opaque bytes.

      destId can be null to indicate "broadcast message"

      messageStatus and id of the provided message will be updated by this routine to indicate
      message send status and the ID that can be used to locate the message in the future
      */
  public void send(com.geeksville.mesh.DataPacket packet) throws android.os.RemoteException;
  /**
      Get the IDs of everyone on the mesh.  You should also subscribe for NODE_CHANGE broadcasts.
      */
  public java.util.List<com.geeksville.mesh.NodeInfo> getNodes() throws android.os.RemoteException;
  /// Return an list of MeshPacket protobuf (byte arrays) which were received while your client app was offline (recent messages only).
  /// Also includes any messages we have sent recently (useful for finding current message status)

  public java.util.List<com.geeksville.mesh.DataPacket> getOldMessages() throws android.os.RemoteException;
  /// This method is only intended for use in our GUI, so the user can set radio options
  /// It returns a RadioConfig protobuf.

  public byte[] getRadioConfig() throws android.os.RemoteException;
  /// This method is only intended for use in our GUI, so the user can set radio options
  /// It sets a RadioConfig protobuf

  public void setRadioConfig(byte[] payload) throws android.os.RemoteException;
  /// This method is only intended for use in our GUI, so the user can set radio options
  /// It returns a ChannelSet protobuf.

  public byte[] getChannels() throws android.os.RemoteException;
  /// This method is only intended for use in our GUI, so the user can set radio options
  /// It sets a ChannelSet protobuf

  public void setChannels(byte[] payload) throws android.os.RemoteException;
  /**
      Is the packet radio currently connected to the phone?  Returns a ConnectionState string.
      */
  public java.lang.String connectionState() throws android.os.RemoteException;
  /// If a macaddress we will try to talk to our device, if null we will be idle.
  /// Any current connection will be dropped (even if the device address is the same) before reconnecting.
  /// Users should not call this directly, only used internally by the MeshUtil activity
  /// Returns true if the device address actually changed, or false if no change was needed

  public boolean setDeviceAddress(java.lang.String deviceAddr) throws android.os.RemoteException;
  /// Get basic device hardware info about our connected radio.  Will never return NULL.  Will return NULL
  /// if no my node info is available (i.e. it will not throw an exception)

  public com.geeksville.mesh.MyNodeInfo getMyNodeInfo() throws android.os.RemoteException;
  /// Start updating the radios firmware

  public void startFirmwareUpdate() throws android.os.RemoteException;
  /**
      Return a number 0-100 for progress. -1 for completed and success, -2 for failure
      */
  public int getUpdateStatus() throws android.os.RemoteException;
  public int getRegion() throws android.os.RemoteException;
  public void setRegion(int regionCode) throws android.os.RemoteException;
}
