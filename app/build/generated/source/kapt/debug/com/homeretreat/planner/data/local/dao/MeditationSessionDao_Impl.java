package com.homeretreat.planner.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.homeretreat.planner.data.local.Converters;
import com.homeretreat.planner.data.local.entity.MeditationSession;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MeditationSessionDao_Impl implements MeditationSessionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MeditationSession> __insertionAdapterOfMeditationSession;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<MeditationSession> __updateAdapterOfMeditationSession;

  private final SharedSQLiteStatement __preparedStmtOfCompleteSession;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public MeditationSessionDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMeditationSession = new EntityInsertionAdapter<MeditationSession>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `meditation_sessions` (`id`,`blockId`,`actualStart`,`actualEnd`,`interrupted`) VALUES (?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final MeditationSession entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getBlockId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getBlockId());
        }
        final Long _tmp = __converters.fromInstant(entity.getActualStart());
        if (_tmp == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, _tmp);
        }
        final Long _tmp_1 = __converters.fromInstant(entity.getActualEnd());
        if (_tmp_1 == null) {
          statement.bindNull(4);
        } else {
          statement.bindLong(4, _tmp_1);
        }
        final int _tmp_2 = entity.getInterrupted() ? 1 : 0;
        statement.bindLong(5, _tmp_2);
      }
    };
    this.__updateAdapterOfMeditationSession = new EntityDeletionOrUpdateAdapter<MeditationSession>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `meditation_sessions` SET `id` = ?,`blockId` = ?,`actualStart` = ?,`actualEnd` = ?,`interrupted` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final MeditationSession entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getBlockId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getBlockId());
        }
        final Long _tmp = __converters.fromInstant(entity.getActualStart());
        if (_tmp == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, _tmp);
        }
        final Long _tmp_1 = __converters.fromInstant(entity.getActualEnd());
        if (_tmp_1 == null) {
          statement.bindNull(4);
        } else {
          statement.bindLong(4, _tmp_1);
        }
        final int _tmp_2 = entity.getInterrupted() ? 1 : 0;
        statement.bindLong(5, _tmp_2);
        if (entity.getId() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getId());
        }
      }
    };
    this.__preparedStmtOfCompleteSession = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE meditation_sessions SET actualEnd = ?, interrupted = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM meditation_sessions";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final MeditationSession session,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMeditationSession.insert(session);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final MeditationSession session,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfMeditationSession.handle(session);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object completeSession(final String id, final Instant endTime,
      final boolean wasInterrupted, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfCompleteSession.acquire();
        int _argIndex = 1;
        final Long _tmp = __converters.fromInstant(endTime);
        if (_tmp == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindLong(_argIndex, _tmp);
        }
        _argIndex = 2;
        final int _tmp_1 = wasInterrupted ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp_1);
        _argIndex = 3;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfCompleteSession.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getLatestForBlock(final String blockId,
      final Continuation<? super MeditationSession> $completion) {
    final String _sql = "SELECT * FROM meditation_sessions WHERE blockId = ? ORDER BY actualStart DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (blockId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, blockId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<MeditationSession>() {
      @Override
      @Nullable
      public MeditationSession call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBlockId = CursorUtil.getColumnIndexOrThrow(_cursor, "blockId");
          final int _cursorIndexOfActualStart = CursorUtil.getColumnIndexOrThrow(_cursor, "actualStart");
          final int _cursorIndexOfActualEnd = CursorUtil.getColumnIndexOrThrow(_cursor, "actualEnd");
          final int _cursorIndexOfInterrupted = CursorUtil.getColumnIndexOrThrow(_cursor, "interrupted");
          final MeditationSession _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpBlockId;
            if (_cursor.isNull(_cursorIndexOfBlockId)) {
              _tmpBlockId = null;
            } else {
              _tmpBlockId = _cursor.getString(_cursorIndexOfBlockId);
            }
            final Instant _tmpActualStart;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfActualStart)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfActualStart);
            }
            _tmpActualStart = __converters.toInstant(_tmp);
            final Instant _tmpActualEnd;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfActualEnd)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfActualEnd);
            }
            _tmpActualEnd = __converters.toInstant(_tmp_1);
            final boolean _tmpInterrupted;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfInterrupted);
            _tmpInterrupted = _tmp_2 != 0;
            _result = new MeditationSession(_tmpId,_tmpBlockId,_tmpActualStart,_tmpActualEnd,_tmpInterrupted);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getSessionsForRange(final Instant start, final Instant end,
      final Continuation<? super List<MeditationSession>> $completion) {
    final String _sql = "SELECT * FROM meditation_sessions WHERE actualStart BETWEEN ? AND ? ORDER BY actualStart";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final Long _tmp = __converters.fromInstant(start);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    _argIndex = 2;
    final Long _tmp_1 = __converters.fromInstant(end);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<MeditationSession>>() {
      @Override
      @NonNull
      public List<MeditationSession> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBlockId = CursorUtil.getColumnIndexOrThrow(_cursor, "blockId");
          final int _cursorIndexOfActualStart = CursorUtil.getColumnIndexOrThrow(_cursor, "actualStart");
          final int _cursorIndexOfActualEnd = CursorUtil.getColumnIndexOrThrow(_cursor, "actualEnd");
          final int _cursorIndexOfInterrupted = CursorUtil.getColumnIndexOrThrow(_cursor, "interrupted");
          final List<MeditationSession> _result = new ArrayList<MeditationSession>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MeditationSession _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpBlockId;
            if (_cursor.isNull(_cursorIndexOfBlockId)) {
              _tmpBlockId = null;
            } else {
              _tmpBlockId = _cursor.getString(_cursorIndexOfBlockId);
            }
            final Instant _tmpActualStart;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfActualStart)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfActualStart);
            }
            _tmpActualStart = __converters.toInstant(_tmp_2);
            final Instant _tmpActualEnd;
            final Long _tmp_3;
            if (_cursor.isNull(_cursorIndexOfActualEnd)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getLong(_cursorIndexOfActualEnd);
            }
            _tmpActualEnd = __converters.toInstant(_tmp_3);
            final boolean _tmpInterrupted;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfInterrupted);
            _tmpInterrupted = _tmp_4 != 0;
            _item = new MeditationSession(_tmpId,_tmpBlockId,_tmpActualStart,_tmpActualEnd,_tmpInterrupted);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<MeditationSession>> getSessionsForRangeFlow(final Instant start,
      final Instant end) {
    final String _sql = "SELECT * FROM meditation_sessions WHERE actualStart BETWEEN ? AND ? ORDER BY actualStart";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final Long _tmp = __converters.fromInstant(start);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    _argIndex = 2;
    final Long _tmp_1 = __converters.fromInstant(end);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"meditation_sessions"}, new Callable<List<MeditationSession>>() {
      @Override
      @NonNull
      public List<MeditationSession> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBlockId = CursorUtil.getColumnIndexOrThrow(_cursor, "blockId");
          final int _cursorIndexOfActualStart = CursorUtil.getColumnIndexOrThrow(_cursor, "actualStart");
          final int _cursorIndexOfActualEnd = CursorUtil.getColumnIndexOrThrow(_cursor, "actualEnd");
          final int _cursorIndexOfInterrupted = CursorUtil.getColumnIndexOrThrow(_cursor, "interrupted");
          final List<MeditationSession> _result = new ArrayList<MeditationSession>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MeditationSession _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpBlockId;
            if (_cursor.isNull(_cursorIndexOfBlockId)) {
              _tmpBlockId = null;
            } else {
              _tmpBlockId = _cursor.getString(_cursorIndexOfBlockId);
            }
            final Instant _tmpActualStart;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfActualStart)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfActualStart);
            }
            _tmpActualStart = __converters.toInstant(_tmp_2);
            final Instant _tmpActualEnd;
            final Long _tmp_3;
            if (_cursor.isNull(_cursorIndexOfActualEnd)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getLong(_cursorIndexOfActualEnd);
            }
            _tmpActualEnd = __converters.toInstant(_tmp_3);
            final boolean _tmpInterrupted;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfInterrupted);
            _tmpInterrupted = _tmp_4 != 0;
            _item = new MeditationSession(_tmpId,_tmpBlockId,_tmpActualStart,_tmpActualEnd,_tmpInterrupted);
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

  @Override
  public Object countCompletedSessions(final Instant start, final Instant end,
      final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM meditation_sessions WHERE actualStart BETWEEN ? AND ? AND interrupted = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final Long _tmp = __converters.fromInstant(start);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    _argIndex = 2;
    final Long _tmp_1 = __converters.fromInstant(end);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp_2;
            if (_cursor.isNull(0)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(0);
            }
            _result = _tmp_2;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object countInterruptedSessions(final Instant start, final Instant end,
      final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM meditation_sessions WHERE actualStart BETWEEN ? AND ? AND interrupted = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final Long _tmp = __converters.fromInstant(start);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    _argIndex = 2;
    final Long _tmp_1 = __converters.fromInstant(end);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp_2;
            if (_cursor.isNull(0)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(0);
            }
            _result = _tmp_2;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getTotalMinutes(final Instant start, final Instant end,
      final Continuation<? super Long> $completion) {
    final String _sql = "SELECT COALESCE(SUM((julianday(actualEnd) - julianday(actualStart)) * 24 * 60), 0) FROM meditation_sessions WHERE actualStart BETWEEN ? AND ? AND interrupted = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final Long _tmp = __converters.fromInstant(start);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    _argIndex = 2;
    final Long _tmp_1 = __converters.fromInstant(end);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if (_cursor.moveToFirst()) {
            final Long _tmp_2;
            if (_cursor.isNull(0)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(0);
            }
            _result = _tmp_2;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
