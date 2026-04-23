package com.homeretreat.planner.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.homeretreat.planner.data.local.Converters;
import com.homeretreat.planner.data.local.entity.DhammaTalk;
import com.homeretreat.planner.data.model.DownloadStatus;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
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
public final class DhammaTalkDao_Impl implements DhammaTalkDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DhammaTalk> __insertionAdapterOfDhammaTalk;

  private final Converters __converters = new Converters();

  private final EntityInsertionAdapter<DhammaTalk> __insertionAdapterOfDhammaTalk_1;

  private final EntityDeletionOrUpdateAdapter<DhammaTalk> __updateAdapterOfDhammaTalk;

  private final SharedSQLiteStatement __preparedStmtOfUpdateDownloadStatus;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public DhammaTalkDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDhammaTalk = new EntityInsertionAdapter<DhammaTalk>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `dhamma_talks` (`id`,`title`,`teacher`,`remoteUrl`,`localPath`,`downloadStatus`,`durationMinutes`,`category`,`description`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DhammaTalk entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        if (entity.getTeacher() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTeacher());
        }
        if (entity.getRemoteUrl() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getRemoteUrl());
        }
        if (entity.getLocalPath() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getLocalPath());
        }
        final String _tmp = __converters.fromDownloadStatus(entity.getDownloadStatus());
        if (_tmp == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, _tmp);
        }
        statement.bindLong(7, entity.getDurationMinutes());
        if (entity.getCategory() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getCategory());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getDescription());
        }
      }
    };
    this.__insertionAdapterOfDhammaTalk_1 = new EntityInsertionAdapter<DhammaTalk>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR IGNORE INTO `dhamma_talks` (`id`,`title`,`teacher`,`remoteUrl`,`localPath`,`downloadStatus`,`durationMinutes`,`category`,`description`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DhammaTalk entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        if (entity.getTeacher() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTeacher());
        }
        if (entity.getRemoteUrl() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getRemoteUrl());
        }
        if (entity.getLocalPath() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getLocalPath());
        }
        final String _tmp = __converters.fromDownloadStatus(entity.getDownloadStatus());
        if (_tmp == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, _tmp);
        }
        statement.bindLong(7, entity.getDurationMinutes());
        if (entity.getCategory() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getCategory());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getDescription());
        }
      }
    };
    this.__updateAdapterOfDhammaTalk = new EntityDeletionOrUpdateAdapter<DhammaTalk>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `dhamma_talks` SET `id` = ?,`title` = ?,`teacher` = ?,`remoteUrl` = ?,`localPath` = ?,`downloadStatus` = ?,`durationMinutes` = ?,`category` = ?,`description` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DhammaTalk entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        if (entity.getTeacher() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTeacher());
        }
        if (entity.getRemoteUrl() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getRemoteUrl());
        }
        if (entity.getLocalPath() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getLocalPath());
        }
        final String _tmp = __converters.fromDownloadStatus(entity.getDownloadStatus());
        if (_tmp == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, _tmp);
        }
        statement.bindLong(7, entity.getDurationMinutes());
        if (entity.getCategory() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getCategory());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getDescription());
        }
        if (entity.getId() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getId());
        }
      }
    };
    this.__preparedStmtOfUpdateDownloadStatus = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE dhamma_talks SET downloadStatus = ?, localPath = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM dhamma_talks";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final List<DhammaTalk> talks,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDhammaTalk.insert(talks);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertIgnore(final DhammaTalk talk, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfDhammaTalk_1.insertAndReturnId(talk);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final DhammaTalk talk, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfDhammaTalk.handle(talk);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object upsertPreservingStatus(final List<DhammaTalk> talks,
      final Continuation<? super Unit> $completion) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> DhammaTalkDao.DefaultImpls.upsertPreservingStatus(DhammaTalkDao_Impl.this, talks, __cont), $completion);
  }

  @Override
  public Object updateDownloadStatus(final String id, final DownloadStatus status,
      final String path, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateDownloadStatus.acquire();
        int _argIndex = 1;
        final String _tmp = __converters.fromDownloadStatus(status);
        if (_tmp == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, _tmp);
        }
        _argIndex = 2;
        if (path == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, path);
        }
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
          __preparedStmtOfUpdateDownloadStatus.release(_stmt);
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
  public Flow<List<DhammaTalk>> getAllTalks() {
    final String _sql = "SELECT * FROM dhamma_talks ORDER BY category, title";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"dhamma_talks"}, new Callable<List<DhammaTalk>>() {
      @Override
      @NonNull
      public List<DhammaTalk> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "teacher");
          final int _cursorIndexOfRemoteUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteUrl");
          final int _cursorIndexOfLocalPath = CursorUtil.getColumnIndexOrThrow(_cursor, "localPath");
          final int _cursorIndexOfDownloadStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadStatus");
          final int _cursorIndexOfDurationMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "durationMinutes");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final List<DhammaTalk> _result = new ArrayList<DhammaTalk>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DhammaTalk _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpTeacher;
            if (_cursor.isNull(_cursorIndexOfTeacher)) {
              _tmpTeacher = null;
            } else {
              _tmpTeacher = _cursor.getString(_cursorIndexOfTeacher);
            }
            final String _tmpRemoteUrl;
            if (_cursor.isNull(_cursorIndexOfRemoteUrl)) {
              _tmpRemoteUrl = null;
            } else {
              _tmpRemoteUrl = _cursor.getString(_cursorIndexOfRemoteUrl);
            }
            final String _tmpLocalPath;
            if (_cursor.isNull(_cursorIndexOfLocalPath)) {
              _tmpLocalPath = null;
            } else {
              _tmpLocalPath = _cursor.getString(_cursorIndexOfLocalPath);
            }
            final DownloadStatus _tmpDownloadStatus;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDownloadStatus)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDownloadStatus);
            }
            _tmpDownloadStatus = __converters.toDownloadStatus(_tmp);
            final int _tmpDurationMinutes;
            _tmpDurationMinutes = _cursor.getInt(_cursorIndexOfDurationMinutes);
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item = new DhammaTalk(_tmpId,_tmpTitle,_tmpTeacher,_tmpRemoteUrl,_tmpLocalPath,_tmpDownloadStatus,_tmpDurationMinutes,_tmpCategory,_tmpDescription);
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
  public Object getDownloadedTalks(final Continuation<? super List<DhammaTalk>> $completion) {
    final String _sql = "SELECT * FROM dhamma_talks WHERE downloadStatus = 'COMPLETE'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<DhammaTalk>>() {
      @Override
      @NonNull
      public List<DhammaTalk> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "teacher");
          final int _cursorIndexOfRemoteUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteUrl");
          final int _cursorIndexOfLocalPath = CursorUtil.getColumnIndexOrThrow(_cursor, "localPath");
          final int _cursorIndexOfDownloadStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadStatus");
          final int _cursorIndexOfDurationMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "durationMinutes");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final List<DhammaTalk> _result = new ArrayList<DhammaTalk>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DhammaTalk _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpTeacher;
            if (_cursor.isNull(_cursorIndexOfTeacher)) {
              _tmpTeacher = null;
            } else {
              _tmpTeacher = _cursor.getString(_cursorIndexOfTeacher);
            }
            final String _tmpRemoteUrl;
            if (_cursor.isNull(_cursorIndexOfRemoteUrl)) {
              _tmpRemoteUrl = null;
            } else {
              _tmpRemoteUrl = _cursor.getString(_cursorIndexOfRemoteUrl);
            }
            final String _tmpLocalPath;
            if (_cursor.isNull(_cursorIndexOfLocalPath)) {
              _tmpLocalPath = null;
            } else {
              _tmpLocalPath = _cursor.getString(_cursorIndexOfLocalPath);
            }
            final DownloadStatus _tmpDownloadStatus;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDownloadStatus)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDownloadStatus);
            }
            _tmpDownloadStatus = __converters.toDownloadStatus(_tmp);
            final int _tmpDurationMinutes;
            _tmpDurationMinutes = _cursor.getInt(_cursorIndexOfDurationMinutes);
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item = new DhammaTalk(_tmpId,_tmpTitle,_tmpTeacher,_tmpRemoteUrl,_tmpLocalPath,_tmpDownloadStatus,_tmpDurationMinutes,_tmpCategory,_tmpDescription);
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
  public Object getTalkById(final String id, final Continuation<? super DhammaTalk> $completion) {
    final String _sql = "SELECT * FROM dhamma_talks WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<DhammaTalk>() {
      @Override
      @Nullable
      public DhammaTalk call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "teacher");
          final int _cursorIndexOfRemoteUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteUrl");
          final int _cursorIndexOfLocalPath = CursorUtil.getColumnIndexOrThrow(_cursor, "localPath");
          final int _cursorIndexOfDownloadStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadStatus");
          final int _cursorIndexOfDurationMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "durationMinutes");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final DhammaTalk _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpTeacher;
            if (_cursor.isNull(_cursorIndexOfTeacher)) {
              _tmpTeacher = null;
            } else {
              _tmpTeacher = _cursor.getString(_cursorIndexOfTeacher);
            }
            final String _tmpRemoteUrl;
            if (_cursor.isNull(_cursorIndexOfRemoteUrl)) {
              _tmpRemoteUrl = null;
            } else {
              _tmpRemoteUrl = _cursor.getString(_cursorIndexOfRemoteUrl);
            }
            final String _tmpLocalPath;
            if (_cursor.isNull(_cursorIndexOfLocalPath)) {
              _tmpLocalPath = null;
            } else {
              _tmpLocalPath = _cursor.getString(_cursorIndexOfLocalPath);
            }
            final DownloadStatus _tmpDownloadStatus;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDownloadStatus)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDownloadStatus);
            }
            _tmpDownloadStatus = __converters.toDownloadStatus(_tmp);
            final int _tmpDurationMinutes;
            _tmpDurationMinutes = _cursor.getInt(_cursorIndexOfDurationMinutes);
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _result = new DhammaTalk(_tmpId,_tmpTitle,_tmpTeacher,_tmpRemoteUrl,_tmpLocalPath,_tmpDownloadStatus,_tmpDurationMinutes,_tmpCategory,_tmpDescription);
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
  public Object countPendingDownloads(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM dhamma_talks WHERE downloadStatus != 'COMPLETE'";
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
