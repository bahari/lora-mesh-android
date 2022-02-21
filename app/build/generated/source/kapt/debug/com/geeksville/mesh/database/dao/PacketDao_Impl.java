package com.geeksville.mesh.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.geeksville.mesh.database.entity.Packet;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PacketDao_Impl implements PacketDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Packet> __insertionAdapterOfPacket;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PacketDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPacket = new EntityInsertionAdapter<Packet>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `packet` (`uuid`,`type`,`received_date`,`message`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Packet value) {
        if (value.getUuid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUuid());
        }
        if (value.getMessage_type() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMessage_type());
        }
        stmt.bindLong(3, value.getReceived_date());
        if (value.getRaw_message() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getRaw_message());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from packet";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Packet packet) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPacket.insert(packet);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Packet>> getAllPacket(final int maxItem) {
    final String _sql = "Select * from packet order by received_date desc limit 0,?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, maxItem);
    return __db.getInvalidationTracker().createLiveData(new String[]{"packet"}, false, new Callable<List<Packet>>() {
      @Override
      public List<Packet> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUuid = CursorUtil.getColumnIndexOrThrow(_cursor, "uuid");
          final int _cursorIndexOfMessageType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfReceivedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "received_date");
          final int _cursorIndexOfRawMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
          final List<Packet> _result = new ArrayList<Packet>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Packet _item;
            final String _tmpUuid;
            if (_cursor.isNull(_cursorIndexOfUuid)) {
              _tmpUuid = null;
            } else {
              _tmpUuid = _cursor.getString(_cursorIndexOfUuid);
            }
            final String _tmpMessage_type;
            if (_cursor.isNull(_cursorIndexOfMessageType)) {
              _tmpMessage_type = null;
            } else {
              _tmpMessage_type = _cursor.getString(_cursorIndexOfMessageType);
            }
            final long _tmpReceived_date;
            _tmpReceived_date = _cursor.getLong(_cursorIndexOfReceivedDate);
            final String _tmpRaw_message;
            if (_cursor.isNull(_cursorIndexOfRawMessage)) {
              _tmpRaw_message = null;
            } else {
              _tmpRaw_message = _cursor.getString(_cursorIndexOfRawMessage);
            }
            _item = new Packet(_tmpUuid,_tmpMessage_type,_tmpReceived_date,_tmpRaw_message);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
