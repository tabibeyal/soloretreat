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
import com.homeretreat.planner.data.local.entity.RetreatConfig;
import com.homeretreat.planner.data.model.Phase;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class RetreatConfigDao_Impl implements RetreatConfigDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RetreatConfig> __insertionAdapterOfRetreatConfig;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<RetreatConfig> __updateAdapterOfRetreatConfig;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePhase;

  private final SharedSQLiteStatement __preparedStmtOfUpdateTalksDownloaded;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public RetreatConfigDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRetreatConfig = new EntityInsertionAdapter<RetreatConfig>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `retreat_config` (`id`,`startDate`,`endDate`,`phase`,`preceptsCommitted`,`allTalksDownloaded`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final RetreatConfig entity) {
        statement.bindLong(1, entity.getId());
        final Long _tmp = __converters.fromLocalDate(entity.getStartDate());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, _tmp);
        }
        final Long _tmp_1 = __converters.fromLocalDate(entity.getEndDate());
        if (_tmp_1 == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, _tmp_1);
        }
        final String _tmp_2 = __converters.fromPhase(entity.getPhase());
        if (_tmp_2 == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, _tmp_2);
        }
        final int _tmp_3 = entity.getPreceptsCommitted() ? 1 : 0;
        statement.bindLong(5, _tmp_3);
        final int _tmp_4 = entity.getAllTalksDownloaded() ? 1 : 0;
        statement.bindLong(6, _tmp_4);
      }
    };
    this.__updateAdapterOfRetreatConfig = new EntityDeletionOrUpdateAdapter<RetreatConfig>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `retreat_config` SET `id` = ?,`startDate` = ?,`endDate` = ?,`phase` = ?,`preceptsCommitted` = ?,`allTalksDownloaded` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final RetreatConfig entity) {
        statement.bindLong(1, entity.getId());
        final Long _tmp = __converters.fromLocalDate(entity.getStartDate());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, _tmp);
        }
        final Long _tmp_1 = __converters.fromLocalDate(entity.getEndDate());
        if (_tmp_1 == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, _tmp_1);
        }
        final String _tmp_2 = __converters.fromPhase(entity.getPhase());
        if (_tmp_2 == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, _tmp_2);
        }
        final int _tmp_3 = entity.getPreceptsCommitted() ? 1 : 0;
        statement.bindLong(5, _tmp_3);
        final int _tmp_4 = entity.getAllTalksDownloaded() ? 1 : 0;
        statement.bindLong(6, _tmp_4);
        statement.bindLong(7, entity.getId());
      }
    };
    this.__preparedStmtOfUpdatePhase = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE retreat_config SET phase = ? WHERE id = 1";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateTalksDownloaded = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE retreat_config SET allTalksDownloaded = ? WHERE id = 1";
        return _query;
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM retreat_config WHERE id = 1";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final RetreatConfig config, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRetreatConfig.insert(config);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final RetreatConfig config, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfRetreatConfig.handle(config);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updatePhase(final Phase phase, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePhase.acquire();
        int _argIndex = 1;
        final String _tmp = __converters.fromPhase(phase);
        if (_tmp == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, _tmp);
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
          __preparedStmtOfUpdatePhase.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateTalksDownloaded(final boolean downloaded,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateTalksDownloaded.acquire();
        int _argIndex = 1;
        final int _tmp = downloaded ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
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
          __preparedStmtOfUpdateTalksDownloaded.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
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
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<RetreatConfig> getConfig() {
    final String _sql = "SELECT * FROM retreat_config WHERE id = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"retreat_config"}, new Callable<RetreatConfig>() {
      @Override
      @Nullable
      public RetreatConfig call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "startDate");
          final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "endDate");
          final int _cursorIndexOfPhase = CursorUtil.getColumnIndexOrThrow(_cursor, "phase");
          final int _cursorIndexOfPreceptsCommitted = CursorUtil.getColumnIndexOrThrow(_cursor, "preceptsCommitted");
          final int _cursorIndexOfAllTalksDownloaded = CursorUtil.getColumnIndexOrThrow(_cursor, "allTalksDownloaded");
          final RetreatConfig _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final LocalDate _tmpStartDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfStartDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfStartDate);
            }
            _tmpStartDate = __converters.toLocalDate(_tmp);
            final LocalDate _tmpEndDate;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfEndDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfEndDate);
            }
            _tmpEndDate = __converters.toLocalDate(_tmp_1);
            final Phase _tmpPhase;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfPhase)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfPhase);
            }
            _tmpPhase = __converters.toPhase(_tmp_2);
            final boolean _tmpPreceptsCommitted;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfPreceptsCommitted);
            _tmpPreceptsCommitted = _tmp_3 != 0;
            final boolean _tmpAllTalksDownloaded;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfAllTalksDownloaded);
            _tmpAllTalksDownloaded = _tmp_4 != 0;
            _result = new RetreatConfig(_tmpId,_tmpStartDate,_tmpEndDate,_tmpPhase,_tmpPreceptsCommitted,_tmpAllTalksDownloaded);
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
  public Object getConfigSync(final Continuation<? super RetreatConfig> $completion) {
    final String _sql = "SELECT * FROM retreat_config WHERE id = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<RetreatConfig>() {
      @Override
      @Nullable
      public RetreatConfig call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "startDate");
          final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "endDate");
          final int _cursorIndexOfPhase = CursorUtil.getColumnIndexOrThrow(_cursor, "phase");
          final int _cursorIndexOfPreceptsCommitted = CursorUtil.getColumnIndexOrThrow(_cursor, "preceptsCommitted");
          final int _cursorIndexOfAllTalksDownloaded = CursorUtil.getColumnIndexOrThrow(_cursor, "allTalksDownloaded");
          final RetreatConfig _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final LocalDate _tmpStartDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfStartDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfStartDate);
            }
            _tmpStartDate = __converters.toLocalDate(_tmp);
            final LocalDate _tmpEndDate;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfEndDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfEndDate);
            }
            _tmpEndDate = __converters.toLocalDate(_tmp_1);
            final Phase _tmpPhase;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfPhase)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfPhase);
            }
            _tmpPhase = __converters.toPhase(_tmp_2);
            final boolean _tmpPreceptsCommitted;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfPreceptsCommitted);
            _tmpPreceptsCommitted = _tmp_3 != 0;
            final boolean _tmpAllTalksDownloaded;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfAllTalksDownloaded);
            _tmpAllTalksDownloaded = _tmp_4 != 0;
            _result = new RetreatConfig(_tmpId,_tmpStartDate,_tmpEndDate,_tmpPhase,_tmpPreceptsCommitted,_tmpAllTalksDownloaded);
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
