package com.homeretreat.planner.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
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
import com.homeretreat.planner.data.local.entity.ScheduleBlock;
import com.homeretreat.planner.data.model.ActivityType;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
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
public final class ScheduleBlockDao_Impl implements ScheduleBlockDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ScheduleBlock> __insertionAdapterOfScheduleBlock;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<ScheduleBlock> __deletionAdapterOfScheduleBlock;

  private final EntityDeletionOrUpdateAdapter<ScheduleBlock> __updateAdapterOfScheduleBlock;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ScheduleBlockDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfScheduleBlock = new EntityInsertionAdapter<ScheduleBlock>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `schedule_blocks` (`id`,`retreatId`,`dayOffset`,`startTime`,`endTime`,`activityType`,`dhammaTalkId`,`notes`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ScheduleBlock entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        statement.bindLong(2, entity.getRetreatId());
        statement.bindLong(3, entity.getDayOffset());
        final Integer _tmp = __converters.fromLocalTime(entity.getStartTime());
        if (_tmp == null) {
          statement.bindNull(4);
        } else {
          statement.bindLong(4, _tmp);
        }
        final Integer _tmp_1 = __converters.fromLocalTime(entity.getEndTime());
        if (_tmp_1 == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, _tmp_1);
        }
        final String _tmp_2 = __converters.fromActivityType(entity.getActivityType());
        if (_tmp_2 == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, _tmp_2);
        }
        if (entity.getDhammaTalkId() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getDhammaTalkId());
        }
        if (entity.getNotes() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getNotes());
        }
      }
    };
    this.__deletionAdapterOfScheduleBlock = new EntityDeletionOrUpdateAdapter<ScheduleBlock>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `schedule_blocks` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ScheduleBlock entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
      }
    };
    this.__updateAdapterOfScheduleBlock = new EntityDeletionOrUpdateAdapter<ScheduleBlock>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `schedule_blocks` SET `id` = ?,`retreatId` = ?,`dayOffset` = ?,`startTime` = ?,`endTime` = ?,`activityType` = ?,`dhammaTalkId` = ?,`notes` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ScheduleBlock entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        statement.bindLong(2, entity.getRetreatId());
        statement.bindLong(3, entity.getDayOffset());
        final Integer _tmp = __converters.fromLocalTime(entity.getStartTime());
        if (_tmp == null) {
          statement.bindNull(4);
        } else {
          statement.bindLong(4, _tmp);
        }
        final Integer _tmp_1 = __converters.fromLocalTime(entity.getEndTime());
        if (_tmp_1 == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, _tmp_1);
        }
        final String _tmp_2 = __converters.fromActivityType(entity.getActivityType());
        if (_tmp_2 == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, _tmp_2);
        }
        if (entity.getDhammaTalkId() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getDhammaTalkId());
        }
        if (entity.getNotes() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getNotes());
        }
        if (entity.getId() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM schedule_blocks WHERE retreatId = 1";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final ScheduleBlock block, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfScheduleBlock.insert(block);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<ScheduleBlock> blocks,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfScheduleBlock.insert(blocks);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final ScheduleBlock block, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfScheduleBlock.handle(block);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final ScheduleBlock block, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfScheduleBlock.handle(block);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
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
  public Flow<List<ScheduleBlock>> getAllBlocks() {
    final String _sql = "SELECT * FROM schedule_blocks WHERE retreatId = 1 ORDER BY dayOffset, startTime";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"schedule_blocks"}, new Callable<List<ScheduleBlock>>() {
      @Override
      @NonNull
      public List<ScheduleBlock> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfRetreatId = CursorUtil.getColumnIndexOrThrow(_cursor, "retreatId");
          final int _cursorIndexOfDayOffset = CursorUtil.getColumnIndexOrThrow(_cursor, "dayOffset");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfActivityType = CursorUtil.getColumnIndexOrThrow(_cursor, "activityType");
          final int _cursorIndexOfDhammaTalkId = CursorUtil.getColumnIndexOrThrow(_cursor, "dhammaTalkId");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final List<ScheduleBlock> _result = new ArrayList<ScheduleBlock>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ScheduleBlock _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final int _tmpRetreatId;
            _tmpRetreatId = _cursor.getInt(_cursorIndexOfRetreatId);
            final int _tmpDayOffset;
            _tmpDayOffset = _cursor.getInt(_cursorIndexOfDayOffset);
            final LocalTime _tmpStartTime;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfStartTime);
            }
            _tmpStartTime = __converters.toLocalTime(_tmp);
            final LocalTime _tmpEndTime;
            final Integer _tmp_1;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(_cursorIndexOfEndTime);
            }
            _tmpEndTime = __converters.toLocalTime(_tmp_1);
            final ActivityType _tmpActivityType;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfActivityType)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfActivityType);
            }
            _tmpActivityType = __converters.toActivityType(_tmp_2);
            final String _tmpDhammaTalkId;
            if (_cursor.isNull(_cursorIndexOfDhammaTalkId)) {
              _tmpDhammaTalkId = null;
            } else {
              _tmpDhammaTalkId = _cursor.getString(_cursorIndexOfDhammaTalkId);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            _item = new ScheduleBlock(_tmpId,_tmpRetreatId,_tmpDayOffset,_tmpStartTime,_tmpEndTime,_tmpActivityType,_tmpDhammaTalkId,_tmpNotes);
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
  public Object getBlocksForDay(final int dayOffset,
      final Continuation<? super List<ScheduleBlock>> $completion) {
    final String _sql = "SELECT * FROM schedule_blocks WHERE retreatId = 1 AND dayOffset = ? ORDER BY startTime";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, dayOffset);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ScheduleBlock>>() {
      @Override
      @NonNull
      public List<ScheduleBlock> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfRetreatId = CursorUtil.getColumnIndexOrThrow(_cursor, "retreatId");
          final int _cursorIndexOfDayOffset = CursorUtil.getColumnIndexOrThrow(_cursor, "dayOffset");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfActivityType = CursorUtil.getColumnIndexOrThrow(_cursor, "activityType");
          final int _cursorIndexOfDhammaTalkId = CursorUtil.getColumnIndexOrThrow(_cursor, "dhammaTalkId");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final List<ScheduleBlock> _result = new ArrayList<ScheduleBlock>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ScheduleBlock _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final int _tmpRetreatId;
            _tmpRetreatId = _cursor.getInt(_cursorIndexOfRetreatId);
            final int _tmpDayOffset;
            _tmpDayOffset = _cursor.getInt(_cursorIndexOfDayOffset);
            final LocalTime _tmpStartTime;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfStartTime);
            }
            _tmpStartTime = __converters.toLocalTime(_tmp);
            final LocalTime _tmpEndTime;
            final Integer _tmp_1;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(_cursorIndexOfEndTime);
            }
            _tmpEndTime = __converters.toLocalTime(_tmp_1);
            final ActivityType _tmpActivityType;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfActivityType)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfActivityType);
            }
            _tmpActivityType = __converters.toActivityType(_tmp_2);
            final String _tmpDhammaTalkId;
            if (_cursor.isNull(_cursorIndexOfDhammaTalkId)) {
              _tmpDhammaTalkId = null;
            } else {
              _tmpDhammaTalkId = _cursor.getString(_cursorIndexOfDhammaTalkId);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            _item = new ScheduleBlock(_tmpId,_tmpRetreatId,_tmpDayOffset,_tmpStartTime,_tmpEndTime,_tmpActivityType,_tmpDhammaTalkId,_tmpNotes);
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
  public Flow<List<ScheduleBlock>> getBlocksForDayFlow(final int dayOffset) {
    final String _sql = "SELECT * FROM schedule_blocks WHERE retreatId = 1 AND dayOffset = ? ORDER BY startTime";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, dayOffset);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"schedule_blocks"}, new Callable<List<ScheduleBlock>>() {
      @Override
      @NonNull
      public List<ScheduleBlock> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfRetreatId = CursorUtil.getColumnIndexOrThrow(_cursor, "retreatId");
          final int _cursorIndexOfDayOffset = CursorUtil.getColumnIndexOrThrow(_cursor, "dayOffset");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfActivityType = CursorUtil.getColumnIndexOrThrow(_cursor, "activityType");
          final int _cursorIndexOfDhammaTalkId = CursorUtil.getColumnIndexOrThrow(_cursor, "dhammaTalkId");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final List<ScheduleBlock> _result = new ArrayList<ScheduleBlock>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ScheduleBlock _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final int _tmpRetreatId;
            _tmpRetreatId = _cursor.getInt(_cursorIndexOfRetreatId);
            final int _tmpDayOffset;
            _tmpDayOffset = _cursor.getInt(_cursorIndexOfDayOffset);
            final LocalTime _tmpStartTime;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfStartTime);
            }
            _tmpStartTime = __converters.toLocalTime(_tmp);
            final LocalTime _tmpEndTime;
            final Integer _tmp_1;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(_cursorIndexOfEndTime);
            }
            _tmpEndTime = __converters.toLocalTime(_tmp_1);
            final ActivityType _tmpActivityType;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfActivityType)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfActivityType);
            }
            _tmpActivityType = __converters.toActivityType(_tmp_2);
            final String _tmpDhammaTalkId;
            if (_cursor.isNull(_cursorIndexOfDhammaTalkId)) {
              _tmpDhammaTalkId = null;
            } else {
              _tmpDhammaTalkId = _cursor.getString(_cursorIndexOfDhammaTalkId);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            _item = new ScheduleBlock(_tmpId,_tmpRetreatId,_tmpDayOffset,_tmpStartTime,_tmpEndTime,_tmpActivityType,_tmpDhammaTalkId,_tmpNotes);
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
  public Object count(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM schedule_blocks WHERE retreatId = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
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
