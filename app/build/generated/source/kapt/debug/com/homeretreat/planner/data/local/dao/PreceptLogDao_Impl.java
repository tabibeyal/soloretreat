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
import com.homeretreat.planner.data.local.entity.PreceptLog;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
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
public final class PreceptLogDao_Impl implements PreceptLogDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PreceptLog> __insertionAdapterOfPreceptLog;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<PreceptLog> __updateAdapterOfPreceptLog;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePrecept;

  private final SharedSQLiteStatement __preparedStmtOfDeleteForRange;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PreceptLogDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPreceptLog = new EntityInsertionAdapter<PreceptLog>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `precept_logs` (`date`,`p1`,`p2`,`p3`,`p4`,`p5`,`p6`,`p7`,`p8`,`eveningReflection`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final PreceptLog entity) {
        final Long _tmp = __converters.fromLocalDate(entity.getDate());
        if (_tmp == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, _tmp);
        }
        final Integer _tmp_1 = entity.getP1() == null ? null : (entity.getP1() ? 1 : 0);
        if (_tmp_1 == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, _tmp_1);
        }
        final Integer _tmp_2 = entity.getP2() == null ? null : (entity.getP2() ? 1 : 0);
        if (_tmp_2 == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, _tmp_2);
        }
        final Integer _tmp_3 = entity.getP3() == null ? null : (entity.getP3() ? 1 : 0);
        if (_tmp_3 == null) {
          statement.bindNull(4);
        } else {
          statement.bindLong(4, _tmp_3);
        }
        final Integer _tmp_4 = entity.getP4() == null ? null : (entity.getP4() ? 1 : 0);
        if (_tmp_4 == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, _tmp_4);
        }
        final Integer _tmp_5 = entity.getP5() == null ? null : (entity.getP5() ? 1 : 0);
        if (_tmp_5 == null) {
          statement.bindNull(6);
        } else {
          statement.bindLong(6, _tmp_5);
        }
        final Integer _tmp_6 = entity.getP6() == null ? null : (entity.getP6() ? 1 : 0);
        if (_tmp_6 == null) {
          statement.bindNull(7);
        } else {
          statement.bindLong(7, _tmp_6);
        }
        final Integer _tmp_7 = entity.getP7() == null ? null : (entity.getP7() ? 1 : 0);
        if (_tmp_7 == null) {
          statement.bindNull(8);
        } else {
          statement.bindLong(8, _tmp_7);
        }
        final Integer _tmp_8 = entity.getP8() == null ? null : (entity.getP8() ? 1 : 0);
        if (_tmp_8 == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, _tmp_8);
        }
        if (entity.getEveningReflection() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getEveningReflection());
        }
      }
    };
    this.__updateAdapterOfPreceptLog = new EntityDeletionOrUpdateAdapter<PreceptLog>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `precept_logs` SET `date` = ?,`p1` = ?,`p2` = ?,`p3` = ?,`p4` = ?,`p5` = ?,`p6` = ?,`p7` = ?,`p8` = ?,`eveningReflection` = ? WHERE `date` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final PreceptLog entity) {
        final Long _tmp = __converters.fromLocalDate(entity.getDate());
        if (_tmp == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, _tmp);
        }
        final Integer _tmp_1 = entity.getP1() == null ? null : (entity.getP1() ? 1 : 0);
        if (_tmp_1 == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, _tmp_1);
        }
        final Integer _tmp_2 = entity.getP2() == null ? null : (entity.getP2() ? 1 : 0);
        if (_tmp_2 == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, _tmp_2);
        }
        final Integer _tmp_3 = entity.getP3() == null ? null : (entity.getP3() ? 1 : 0);
        if (_tmp_3 == null) {
          statement.bindNull(4);
        } else {
          statement.bindLong(4, _tmp_3);
        }
        final Integer _tmp_4 = entity.getP4() == null ? null : (entity.getP4() ? 1 : 0);
        if (_tmp_4 == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, _tmp_4);
        }
        final Integer _tmp_5 = entity.getP5() == null ? null : (entity.getP5() ? 1 : 0);
        if (_tmp_5 == null) {
          statement.bindNull(6);
        } else {
          statement.bindLong(6, _tmp_5);
        }
        final Integer _tmp_6 = entity.getP6() == null ? null : (entity.getP6() ? 1 : 0);
        if (_tmp_6 == null) {
          statement.bindNull(7);
        } else {
          statement.bindLong(7, _tmp_6);
        }
        final Integer _tmp_7 = entity.getP7() == null ? null : (entity.getP7() ? 1 : 0);
        if (_tmp_7 == null) {
          statement.bindNull(8);
        } else {
          statement.bindLong(8, _tmp_7);
        }
        final Integer _tmp_8 = entity.getP8() == null ? null : (entity.getP8() ? 1 : 0);
        if (_tmp_8 == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, _tmp_8);
        }
        if (entity.getEveningReflection() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getEveningReflection());
        }
        final Long _tmp_9 = __converters.fromLocalDate(entity.getDate());
        if (_tmp_9 == null) {
          statement.bindNull(11);
        } else {
          statement.bindLong(11, _tmp_9);
        }
      }
    };
    this.__preparedStmtOfUpdatePrecept = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE precept_logs \n"
                + "        SET p1 = CASE WHEN ? = 1 THEN ? ELSE p1 END,\n"
                + "            p2 = CASE WHEN ? = 2 THEN ? ELSE p2 END,\n"
                + "            p3 = CASE WHEN ? = 3 THEN ? ELSE p3 END,\n"
                + "            p4 = CASE WHEN ? = 4 THEN ? ELSE p4 END,\n"
                + "            p5 = CASE WHEN ? = 5 THEN ? ELSE p5 END,\n"
                + "            p6 = CASE WHEN ? = 6 THEN ? ELSE p6 END,\n"
                + "            p7 = CASE WHEN ? = 7 THEN ? ELSE p7 END,\n"
                + "            p8 = CASE WHEN ? = 8 THEN ? ELSE p8 END\n"
                + "        WHERE date = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteForRange = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM precept_logs WHERE date BETWEEN ? AND ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM precept_logs";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final PreceptLog log, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPreceptLog.insert(log);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final PreceptLog log, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfPreceptLog.handle(log);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updatePrecept(final LocalDate date, final int preceptNum, final boolean observed,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePrecept.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, preceptNum);
        _argIndex = 2;
        final int _tmp = observed ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 3;
        _stmt.bindLong(_argIndex, preceptNum);
        _argIndex = 4;
        final int _tmp_1 = observed ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp_1);
        _argIndex = 5;
        _stmt.bindLong(_argIndex, preceptNum);
        _argIndex = 6;
        final int _tmp_2 = observed ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp_2);
        _argIndex = 7;
        _stmt.bindLong(_argIndex, preceptNum);
        _argIndex = 8;
        final int _tmp_3 = observed ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp_3);
        _argIndex = 9;
        _stmt.bindLong(_argIndex, preceptNum);
        _argIndex = 10;
        final int _tmp_4 = observed ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp_4);
        _argIndex = 11;
        _stmt.bindLong(_argIndex, preceptNum);
        _argIndex = 12;
        final int _tmp_5 = observed ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp_5);
        _argIndex = 13;
        _stmt.bindLong(_argIndex, preceptNum);
        _argIndex = 14;
        final int _tmp_6 = observed ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp_6);
        _argIndex = 15;
        _stmt.bindLong(_argIndex, preceptNum);
        _argIndex = 16;
        final int _tmp_7 = observed ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp_7);
        _argIndex = 17;
        final Long _tmp_8 = __converters.fromLocalDate(date);
        if (_tmp_8 == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindLong(_argIndex, _tmp_8);
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
          __preparedStmtOfUpdatePrecept.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteForRange(final LocalDate start, final LocalDate end,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteForRange.acquire();
        int _argIndex = 1;
        final Long _tmp = __converters.fromLocalDate(start);
        if (_tmp == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindLong(_argIndex, _tmp);
        }
        _argIndex = 2;
        final Long _tmp_1 = __converters.fromLocalDate(end);
        if (_tmp_1 == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindLong(_argIndex, _tmp_1);
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
          __preparedStmtOfDeleteForRange.release(_stmt);
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
  public Object getLogForDate(final LocalDate date,
      final Continuation<? super PreceptLog> $completion) {
    final String _sql = "SELECT * FROM precept_logs WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final Long _tmp = __converters.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<PreceptLog>() {
      @Override
      @Nullable
      public PreceptLog call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfP1 = CursorUtil.getColumnIndexOrThrow(_cursor, "p1");
          final int _cursorIndexOfP2 = CursorUtil.getColumnIndexOrThrow(_cursor, "p2");
          final int _cursorIndexOfP3 = CursorUtil.getColumnIndexOrThrow(_cursor, "p3");
          final int _cursorIndexOfP4 = CursorUtil.getColumnIndexOrThrow(_cursor, "p4");
          final int _cursorIndexOfP5 = CursorUtil.getColumnIndexOrThrow(_cursor, "p5");
          final int _cursorIndexOfP6 = CursorUtil.getColumnIndexOrThrow(_cursor, "p6");
          final int _cursorIndexOfP7 = CursorUtil.getColumnIndexOrThrow(_cursor, "p7");
          final int _cursorIndexOfP8 = CursorUtil.getColumnIndexOrThrow(_cursor, "p8");
          final int _cursorIndexOfEveningReflection = CursorUtil.getColumnIndexOrThrow(_cursor, "eveningReflection");
          final PreceptLog _result;
          if (_cursor.moveToFirst()) {
            final LocalDate _tmpDate;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp_1);
            final Boolean _tmpP1;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfP1)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfP1);
            }
            _tmpP1 = _tmp_2 == null ? null : _tmp_2 != 0;
            final Boolean _tmpP2;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfP2)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfP2);
            }
            _tmpP2 = _tmp_3 == null ? null : _tmp_3 != 0;
            final Boolean _tmpP3;
            final Integer _tmp_4;
            if (_cursor.isNull(_cursorIndexOfP3)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getInt(_cursorIndexOfP3);
            }
            _tmpP3 = _tmp_4 == null ? null : _tmp_4 != 0;
            final Boolean _tmpP4;
            final Integer _tmp_5;
            if (_cursor.isNull(_cursorIndexOfP4)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getInt(_cursorIndexOfP4);
            }
            _tmpP4 = _tmp_5 == null ? null : _tmp_5 != 0;
            final Boolean _tmpP5;
            final Integer _tmp_6;
            if (_cursor.isNull(_cursorIndexOfP5)) {
              _tmp_6 = null;
            } else {
              _tmp_6 = _cursor.getInt(_cursorIndexOfP5);
            }
            _tmpP5 = _tmp_6 == null ? null : _tmp_6 != 0;
            final Boolean _tmpP6;
            final Integer _tmp_7;
            if (_cursor.isNull(_cursorIndexOfP6)) {
              _tmp_7 = null;
            } else {
              _tmp_7 = _cursor.getInt(_cursorIndexOfP6);
            }
            _tmpP6 = _tmp_7 == null ? null : _tmp_7 != 0;
            final Boolean _tmpP7;
            final Integer _tmp_8;
            if (_cursor.isNull(_cursorIndexOfP7)) {
              _tmp_8 = null;
            } else {
              _tmp_8 = _cursor.getInt(_cursorIndexOfP7);
            }
            _tmpP7 = _tmp_8 == null ? null : _tmp_8 != 0;
            final Boolean _tmpP8;
            final Integer _tmp_9;
            if (_cursor.isNull(_cursorIndexOfP8)) {
              _tmp_9 = null;
            } else {
              _tmp_9 = _cursor.getInt(_cursorIndexOfP8);
            }
            _tmpP8 = _tmp_9 == null ? null : _tmp_9 != 0;
            final String _tmpEveningReflection;
            if (_cursor.isNull(_cursorIndexOfEveningReflection)) {
              _tmpEveningReflection = null;
            } else {
              _tmpEveningReflection = _cursor.getString(_cursorIndexOfEveningReflection);
            }
            _result = new PreceptLog(_tmpDate,_tmpP1,_tmpP2,_tmpP3,_tmpP4,_tmpP5,_tmpP6,_tmpP7,_tmpP8,_tmpEveningReflection);
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
  public Flow<PreceptLog> getLogForDateFlow(final LocalDate date) {
    final String _sql = "SELECT * FROM precept_logs WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final Long _tmp = __converters.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"precept_logs"}, new Callable<PreceptLog>() {
      @Override
      @Nullable
      public PreceptLog call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfP1 = CursorUtil.getColumnIndexOrThrow(_cursor, "p1");
          final int _cursorIndexOfP2 = CursorUtil.getColumnIndexOrThrow(_cursor, "p2");
          final int _cursorIndexOfP3 = CursorUtil.getColumnIndexOrThrow(_cursor, "p3");
          final int _cursorIndexOfP4 = CursorUtil.getColumnIndexOrThrow(_cursor, "p4");
          final int _cursorIndexOfP5 = CursorUtil.getColumnIndexOrThrow(_cursor, "p5");
          final int _cursorIndexOfP6 = CursorUtil.getColumnIndexOrThrow(_cursor, "p6");
          final int _cursorIndexOfP7 = CursorUtil.getColumnIndexOrThrow(_cursor, "p7");
          final int _cursorIndexOfP8 = CursorUtil.getColumnIndexOrThrow(_cursor, "p8");
          final int _cursorIndexOfEveningReflection = CursorUtil.getColumnIndexOrThrow(_cursor, "eveningReflection");
          final PreceptLog _result;
          if (_cursor.moveToFirst()) {
            final LocalDate _tmpDate;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp_1);
            final Boolean _tmpP1;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfP1)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfP1);
            }
            _tmpP1 = _tmp_2 == null ? null : _tmp_2 != 0;
            final Boolean _tmpP2;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfP2)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfP2);
            }
            _tmpP2 = _tmp_3 == null ? null : _tmp_3 != 0;
            final Boolean _tmpP3;
            final Integer _tmp_4;
            if (_cursor.isNull(_cursorIndexOfP3)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getInt(_cursorIndexOfP3);
            }
            _tmpP3 = _tmp_4 == null ? null : _tmp_4 != 0;
            final Boolean _tmpP4;
            final Integer _tmp_5;
            if (_cursor.isNull(_cursorIndexOfP4)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getInt(_cursorIndexOfP4);
            }
            _tmpP4 = _tmp_5 == null ? null : _tmp_5 != 0;
            final Boolean _tmpP5;
            final Integer _tmp_6;
            if (_cursor.isNull(_cursorIndexOfP5)) {
              _tmp_6 = null;
            } else {
              _tmp_6 = _cursor.getInt(_cursorIndexOfP5);
            }
            _tmpP5 = _tmp_6 == null ? null : _tmp_6 != 0;
            final Boolean _tmpP6;
            final Integer _tmp_7;
            if (_cursor.isNull(_cursorIndexOfP6)) {
              _tmp_7 = null;
            } else {
              _tmp_7 = _cursor.getInt(_cursorIndexOfP6);
            }
            _tmpP6 = _tmp_7 == null ? null : _tmp_7 != 0;
            final Boolean _tmpP7;
            final Integer _tmp_8;
            if (_cursor.isNull(_cursorIndexOfP7)) {
              _tmp_8 = null;
            } else {
              _tmp_8 = _cursor.getInt(_cursorIndexOfP7);
            }
            _tmpP7 = _tmp_8 == null ? null : _tmp_8 != 0;
            final Boolean _tmpP8;
            final Integer _tmp_9;
            if (_cursor.isNull(_cursorIndexOfP8)) {
              _tmp_9 = null;
            } else {
              _tmp_9 = _cursor.getInt(_cursorIndexOfP8);
            }
            _tmpP8 = _tmp_9 == null ? null : _tmp_9 != 0;
            final String _tmpEveningReflection;
            if (_cursor.isNull(_cursorIndexOfEveningReflection)) {
              _tmpEveningReflection = null;
            } else {
              _tmpEveningReflection = _cursor.getString(_cursorIndexOfEveningReflection);
            }
            _result = new PreceptLog(_tmpDate,_tmpP1,_tmpP2,_tmpP3,_tmpP4,_tmpP5,_tmpP6,_tmpP7,_tmpP8,_tmpEveningReflection);
          } else {
            _result = null;
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
  public Object getLogsForRange(final LocalDate start, final LocalDate end,
      final Continuation<? super List<PreceptLog>> $completion) {
    final String _sql = "SELECT * FROM precept_logs WHERE date BETWEEN ? AND ? ORDER BY date";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final Long _tmp = __converters.fromLocalDate(start);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    _argIndex = 2;
    final Long _tmp_1 = __converters.fromLocalDate(end);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<PreceptLog>>() {
      @Override
      @NonNull
      public List<PreceptLog> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfP1 = CursorUtil.getColumnIndexOrThrow(_cursor, "p1");
          final int _cursorIndexOfP2 = CursorUtil.getColumnIndexOrThrow(_cursor, "p2");
          final int _cursorIndexOfP3 = CursorUtil.getColumnIndexOrThrow(_cursor, "p3");
          final int _cursorIndexOfP4 = CursorUtil.getColumnIndexOrThrow(_cursor, "p4");
          final int _cursorIndexOfP5 = CursorUtil.getColumnIndexOrThrow(_cursor, "p5");
          final int _cursorIndexOfP6 = CursorUtil.getColumnIndexOrThrow(_cursor, "p6");
          final int _cursorIndexOfP7 = CursorUtil.getColumnIndexOrThrow(_cursor, "p7");
          final int _cursorIndexOfP8 = CursorUtil.getColumnIndexOrThrow(_cursor, "p8");
          final int _cursorIndexOfEveningReflection = CursorUtil.getColumnIndexOrThrow(_cursor, "eveningReflection");
          final List<PreceptLog> _result = new ArrayList<PreceptLog>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final PreceptLog _item;
            final LocalDate _tmpDate;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp_2);
            final Boolean _tmpP1;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfP1)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfP1);
            }
            _tmpP1 = _tmp_3 == null ? null : _tmp_3 != 0;
            final Boolean _tmpP2;
            final Integer _tmp_4;
            if (_cursor.isNull(_cursorIndexOfP2)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getInt(_cursorIndexOfP2);
            }
            _tmpP2 = _tmp_4 == null ? null : _tmp_4 != 0;
            final Boolean _tmpP3;
            final Integer _tmp_5;
            if (_cursor.isNull(_cursorIndexOfP3)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getInt(_cursorIndexOfP3);
            }
            _tmpP3 = _tmp_5 == null ? null : _tmp_5 != 0;
            final Boolean _tmpP4;
            final Integer _tmp_6;
            if (_cursor.isNull(_cursorIndexOfP4)) {
              _tmp_6 = null;
            } else {
              _tmp_6 = _cursor.getInt(_cursorIndexOfP4);
            }
            _tmpP4 = _tmp_6 == null ? null : _tmp_6 != 0;
            final Boolean _tmpP5;
            final Integer _tmp_7;
            if (_cursor.isNull(_cursorIndexOfP5)) {
              _tmp_7 = null;
            } else {
              _tmp_7 = _cursor.getInt(_cursorIndexOfP5);
            }
            _tmpP5 = _tmp_7 == null ? null : _tmp_7 != 0;
            final Boolean _tmpP6;
            final Integer _tmp_8;
            if (_cursor.isNull(_cursorIndexOfP6)) {
              _tmp_8 = null;
            } else {
              _tmp_8 = _cursor.getInt(_cursorIndexOfP6);
            }
            _tmpP6 = _tmp_8 == null ? null : _tmp_8 != 0;
            final Boolean _tmpP7;
            final Integer _tmp_9;
            if (_cursor.isNull(_cursorIndexOfP7)) {
              _tmp_9 = null;
            } else {
              _tmp_9 = _cursor.getInt(_cursorIndexOfP7);
            }
            _tmpP7 = _tmp_9 == null ? null : _tmp_9 != 0;
            final Boolean _tmpP8;
            final Integer _tmp_10;
            if (_cursor.isNull(_cursorIndexOfP8)) {
              _tmp_10 = null;
            } else {
              _tmp_10 = _cursor.getInt(_cursorIndexOfP8);
            }
            _tmpP8 = _tmp_10 == null ? null : _tmp_10 != 0;
            final String _tmpEveningReflection;
            if (_cursor.isNull(_cursorIndexOfEveningReflection)) {
              _tmpEveningReflection = null;
            } else {
              _tmpEveningReflection = _cursor.getString(_cursorIndexOfEveningReflection);
            }
            _item = new PreceptLog(_tmpDate,_tmpP1,_tmpP2,_tmpP3,_tmpP4,_tmpP5,_tmpP6,_tmpP7,_tmpP8,_tmpEveningReflection);
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
  public Flow<List<PreceptLog>> getLogsForRangeFlow(final LocalDate start, final LocalDate end) {
    final String _sql = "SELECT * FROM precept_logs WHERE date BETWEEN ? AND ? ORDER BY date";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final Long _tmp = __converters.fromLocalDate(start);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    _argIndex = 2;
    final Long _tmp_1 = __converters.fromLocalDate(end);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"precept_logs"}, new Callable<List<PreceptLog>>() {
      @Override
      @NonNull
      public List<PreceptLog> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfP1 = CursorUtil.getColumnIndexOrThrow(_cursor, "p1");
          final int _cursorIndexOfP2 = CursorUtil.getColumnIndexOrThrow(_cursor, "p2");
          final int _cursorIndexOfP3 = CursorUtil.getColumnIndexOrThrow(_cursor, "p3");
          final int _cursorIndexOfP4 = CursorUtil.getColumnIndexOrThrow(_cursor, "p4");
          final int _cursorIndexOfP5 = CursorUtil.getColumnIndexOrThrow(_cursor, "p5");
          final int _cursorIndexOfP6 = CursorUtil.getColumnIndexOrThrow(_cursor, "p6");
          final int _cursorIndexOfP7 = CursorUtil.getColumnIndexOrThrow(_cursor, "p7");
          final int _cursorIndexOfP8 = CursorUtil.getColumnIndexOrThrow(_cursor, "p8");
          final int _cursorIndexOfEveningReflection = CursorUtil.getColumnIndexOrThrow(_cursor, "eveningReflection");
          final List<PreceptLog> _result = new ArrayList<PreceptLog>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final PreceptLog _item;
            final LocalDate _tmpDate;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp_2);
            final Boolean _tmpP1;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfP1)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfP1);
            }
            _tmpP1 = _tmp_3 == null ? null : _tmp_3 != 0;
            final Boolean _tmpP2;
            final Integer _tmp_4;
            if (_cursor.isNull(_cursorIndexOfP2)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getInt(_cursorIndexOfP2);
            }
            _tmpP2 = _tmp_4 == null ? null : _tmp_4 != 0;
            final Boolean _tmpP3;
            final Integer _tmp_5;
            if (_cursor.isNull(_cursorIndexOfP3)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getInt(_cursorIndexOfP3);
            }
            _tmpP3 = _tmp_5 == null ? null : _tmp_5 != 0;
            final Boolean _tmpP4;
            final Integer _tmp_6;
            if (_cursor.isNull(_cursorIndexOfP4)) {
              _tmp_6 = null;
            } else {
              _tmp_6 = _cursor.getInt(_cursorIndexOfP4);
            }
            _tmpP4 = _tmp_6 == null ? null : _tmp_6 != 0;
            final Boolean _tmpP5;
            final Integer _tmp_7;
            if (_cursor.isNull(_cursorIndexOfP5)) {
              _tmp_7 = null;
            } else {
              _tmp_7 = _cursor.getInt(_cursorIndexOfP5);
            }
            _tmpP5 = _tmp_7 == null ? null : _tmp_7 != 0;
            final Boolean _tmpP6;
            final Integer _tmp_8;
            if (_cursor.isNull(_cursorIndexOfP6)) {
              _tmp_8 = null;
            } else {
              _tmp_8 = _cursor.getInt(_cursorIndexOfP6);
            }
            _tmpP6 = _tmp_8 == null ? null : _tmp_8 != 0;
            final Boolean _tmpP7;
            final Integer _tmp_9;
            if (_cursor.isNull(_cursorIndexOfP7)) {
              _tmp_9 = null;
            } else {
              _tmp_9 = _cursor.getInt(_cursorIndexOfP7);
            }
            _tmpP7 = _tmp_9 == null ? null : _tmp_9 != 0;
            final Boolean _tmpP8;
            final Integer _tmp_10;
            if (_cursor.isNull(_cursorIndexOfP8)) {
              _tmp_10 = null;
            } else {
              _tmp_10 = _cursor.getInt(_cursorIndexOfP8);
            }
            _tmpP8 = _tmp_10 == null ? null : _tmp_10 != 0;
            final String _tmpEveningReflection;
            if (_cursor.isNull(_cursorIndexOfEveningReflection)) {
              _tmpEveningReflection = null;
            } else {
              _tmpEveningReflection = _cursor.getString(_cursorIndexOfEveningReflection);
            }
            _item = new PreceptLog(_tmpDate,_tmpP1,_tmpP2,_tmpP3,_tmpP4,_tmpP5,_tmpP6,_tmpP7,_tmpP8,_tmpEveningReflection);
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
  public Object getObservanceRate(final LocalDate start, final LocalDate end,
      final Continuation<? super Float> $completion) {
    final String _sql = "\n"
            + "        SELECT AVG(\n"
            + "            (COALESCE(p1,0) + COALESCE(p2,0) + COALESCE(p3,0) + COALESCE(p4,0) +\n"
            + "             COALESCE(p5,0) + COALESCE(p6,0) + COALESCE(p7,0) + COALESCE(p8,0)) / 8.0\n"
            + "        ) FROM precept_logs\n"
            + "        WHERE date BETWEEN ? AND ?\n"
            + "        AND (p1 IS NOT NULL OR p2 IS NOT NULL OR p3 IS NOT NULL OR p4 IS NOT NULL\n"
            + "             OR p5 IS NOT NULL OR p6 IS NOT NULL OR p7 IS NOT NULL OR p8 IS NOT NULL)\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final Long _tmp = __converters.fromLocalDate(start);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    _argIndex = 2;
    final Long _tmp_1 = __converters.fromLocalDate(end);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Float>() {
      @Override
      @Nullable
      public Float call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Float _result;
          if (_cursor.moveToFirst()) {
            final Float _tmp_2;
            if (_cursor.isNull(0)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getFloat(0);
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
