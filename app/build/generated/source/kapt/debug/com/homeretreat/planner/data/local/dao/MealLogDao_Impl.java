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
import com.homeretreat.planner.data.local.entity.MealLog;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.time.LocalTime;
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
public final class MealLogDao_Impl implements MealLogDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MealLog> __insertionAdapterOfMealLog;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<MealLog> __updateAdapterOfMealLog;

  private final SharedSQLiteStatement __preparedStmtOfMarkReminderShown;

  private final SharedSQLiteStatement __preparedStmtOfDeleteForRange;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public MealLogDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMealLog = new EntityInsertionAdapter<MealLog>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `meal_logs` (`date`,`lastMealTime`,`beforeNoon`,`cutoffReminderShown`) VALUES (?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final MealLog entity) {
        final Long _tmp = __converters.fromLocalDate(entity.getDate());
        if (_tmp == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, _tmp);
        }
        final Integer _tmp_1 = __converters.fromLocalTime(entity.getLastMealTime());
        if (_tmp_1 == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, _tmp_1);
        }
        final Integer _tmp_2 = entity.getBeforeNoon() == null ? null : (entity.getBeforeNoon() ? 1 : 0);
        if (_tmp_2 == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, _tmp_2);
        }
        final int _tmp_3 = entity.getCutoffReminderShown() ? 1 : 0;
        statement.bindLong(4, _tmp_3);
      }
    };
    this.__updateAdapterOfMealLog = new EntityDeletionOrUpdateAdapter<MealLog>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `meal_logs` SET `date` = ?,`lastMealTime` = ?,`beforeNoon` = ?,`cutoffReminderShown` = ? WHERE `date` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final MealLog entity) {
        final Long _tmp = __converters.fromLocalDate(entity.getDate());
        if (_tmp == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, _tmp);
        }
        final Integer _tmp_1 = __converters.fromLocalTime(entity.getLastMealTime());
        if (_tmp_1 == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, _tmp_1);
        }
        final Integer _tmp_2 = entity.getBeforeNoon() == null ? null : (entity.getBeforeNoon() ? 1 : 0);
        if (_tmp_2 == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, _tmp_2);
        }
        final int _tmp_3 = entity.getCutoffReminderShown() ? 1 : 0;
        statement.bindLong(4, _tmp_3);
        final Long _tmp_4 = __converters.fromLocalDate(entity.getDate());
        if (_tmp_4 == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, _tmp_4);
        }
      }
    };
    this.__preparedStmtOfMarkReminderShown = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE meal_logs SET cutoffReminderShown = 1 WHERE date = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteForRange = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM meal_logs WHERE date BETWEEN ? AND ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM meal_logs";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final MealLog log, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMealLog.insert(log);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final MealLog log, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfMealLog.handle(log);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object markReminderShown(final LocalDate date,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfMarkReminderShown.acquire();
        int _argIndex = 1;
        final Long _tmp = __converters.fromLocalDate(date);
        if (_tmp == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindLong(_argIndex, _tmp);
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
          __preparedStmtOfMarkReminderShown.release(_stmt);
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
      final Continuation<? super MealLog> $completion) {
    final String _sql = "SELECT * FROM meal_logs WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final Long _tmp = __converters.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<MealLog>() {
      @Override
      @Nullable
      public MealLog call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfLastMealTime = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMealTime");
          final int _cursorIndexOfBeforeNoon = CursorUtil.getColumnIndexOrThrow(_cursor, "beforeNoon");
          final int _cursorIndexOfCutoffReminderShown = CursorUtil.getColumnIndexOrThrow(_cursor, "cutoffReminderShown");
          final MealLog _result;
          if (_cursor.moveToFirst()) {
            final LocalDate _tmpDate;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp_1);
            final LocalTime _tmpLastMealTime;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfLastMealTime)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfLastMealTime);
            }
            _tmpLastMealTime = __converters.toLocalTime(_tmp_2);
            final Boolean _tmpBeforeNoon;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfBeforeNoon)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfBeforeNoon);
            }
            _tmpBeforeNoon = _tmp_3 == null ? null : _tmp_3 != 0;
            final boolean _tmpCutoffReminderShown;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfCutoffReminderShown);
            _tmpCutoffReminderShown = _tmp_4 != 0;
            _result = new MealLog(_tmpDate,_tmpLastMealTime,_tmpBeforeNoon,_tmpCutoffReminderShown);
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
  public Flow<MealLog> getLogForDateFlow(final LocalDate date) {
    final String _sql = "SELECT * FROM meal_logs WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final Long _tmp = __converters.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"meal_logs"}, new Callable<MealLog>() {
      @Override
      @Nullable
      public MealLog call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfLastMealTime = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMealTime");
          final int _cursorIndexOfBeforeNoon = CursorUtil.getColumnIndexOrThrow(_cursor, "beforeNoon");
          final int _cursorIndexOfCutoffReminderShown = CursorUtil.getColumnIndexOrThrow(_cursor, "cutoffReminderShown");
          final MealLog _result;
          if (_cursor.moveToFirst()) {
            final LocalDate _tmpDate;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp_1);
            final LocalTime _tmpLastMealTime;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfLastMealTime)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfLastMealTime);
            }
            _tmpLastMealTime = __converters.toLocalTime(_tmp_2);
            final Boolean _tmpBeforeNoon;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfBeforeNoon)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfBeforeNoon);
            }
            _tmpBeforeNoon = _tmp_3 == null ? null : _tmp_3 != 0;
            final boolean _tmpCutoffReminderShown;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfCutoffReminderShown);
            _tmpCutoffReminderShown = _tmp_4 != 0;
            _result = new MealLog(_tmpDate,_tmpLastMealTime,_tmpBeforeNoon,_tmpCutoffReminderShown);
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
      final Continuation<? super List<MealLog>> $completion) {
    final String _sql = "SELECT * FROM meal_logs WHERE date BETWEEN ? AND ? ORDER BY date";
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
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<MealLog>>() {
      @Override
      @NonNull
      public List<MealLog> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfLastMealTime = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMealTime");
          final int _cursorIndexOfBeforeNoon = CursorUtil.getColumnIndexOrThrow(_cursor, "beforeNoon");
          final int _cursorIndexOfCutoffReminderShown = CursorUtil.getColumnIndexOrThrow(_cursor, "cutoffReminderShown");
          final List<MealLog> _result = new ArrayList<MealLog>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MealLog _item;
            final LocalDate _tmpDate;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp_2);
            final LocalTime _tmpLastMealTime;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfLastMealTime)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfLastMealTime);
            }
            _tmpLastMealTime = __converters.toLocalTime(_tmp_3);
            final Boolean _tmpBeforeNoon;
            final Integer _tmp_4;
            if (_cursor.isNull(_cursorIndexOfBeforeNoon)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getInt(_cursorIndexOfBeforeNoon);
            }
            _tmpBeforeNoon = _tmp_4 == null ? null : _tmp_4 != 0;
            final boolean _tmpCutoffReminderShown;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfCutoffReminderShown);
            _tmpCutoffReminderShown = _tmp_5 != 0;
            _item = new MealLog(_tmpDate,_tmpLastMealTime,_tmpBeforeNoon,_tmpCutoffReminderShown);
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
  public Flow<List<MealLog>> getLogsForRangeFlow(final LocalDate start, final LocalDate end) {
    final String _sql = "SELECT * FROM meal_logs WHERE date BETWEEN ? AND ? ORDER BY date";
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
    return CoroutinesRoom.createFlow(__db, false, new String[] {"meal_logs"}, new Callable<List<MealLog>>() {
      @Override
      @NonNull
      public List<MealLog> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfLastMealTime = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMealTime");
          final int _cursorIndexOfBeforeNoon = CursorUtil.getColumnIndexOrThrow(_cursor, "beforeNoon");
          final int _cursorIndexOfCutoffReminderShown = CursorUtil.getColumnIndexOrThrow(_cursor, "cutoffReminderShown");
          final List<MealLog> _result = new ArrayList<MealLog>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MealLog _item;
            final LocalDate _tmpDate;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp_2);
            final LocalTime _tmpLastMealTime;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfLastMealTime)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfLastMealTime);
            }
            _tmpLastMealTime = __converters.toLocalTime(_tmp_3);
            final Boolean _tmpBeforeNoon;
            final Integer _tmp_4;
            if (_cursor.isNull(_cursorIndexOfBeforeNoon)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getInt(_cursorIndexOfBeforeNoon);
            }
            _tmpBeforeNoon = _tmp_4 == null ? null : _tmp_4 != 0;
            final boolean _tmpCutoffReminderShown;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfCutoffReminderShown);
            _tmpCutoffReminderShown = _tmp_5 != 0;
            _item = new MealLog(_tmpDate,_tmpLastMealTime,_tmpBeforeNoon,_tmpCutoffReminderShown);
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
  public Object countOnTimeMeals(final LocalDate start, final LocalDate end,
      final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM meal_logs WHERE date BETWEEN ? AND ? AND beforeNoon = 1";
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
  public Object countLateMeals(final LocalDate start, final LocalDate end,
      final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM meal_logs WHERE date BETWEEN ? AND ? AND beforeNoon = 0";
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
