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
import com.homeretreat.planner.data.local.entity.ChecklistItem;
import com.homeretreat.planner.data.model.Phase;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
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
public final class ChecklistItemDao_Impl implements ChecklistItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ChecklistItem> __insertionAdapterOfChecklistItem;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<ChecklistItem> __updateAdapterOfChecklistItem;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCompleted;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ChecklistItemDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChecklistItem = new EntityInsertionAdapter<ChecklistItem>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `checklist_items` (`id`,`phase`,`sortOrder`,`text`,`completed`,`required`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ChecklistItem entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        final String _tmp = __converters.fromPhase(entity.getPhase());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, _tmp);
        }
        statement.bindLong(3, entity.getSortOrder());
        if (entity.getText() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getText());
        }
        final int _tmp_1 = entity.getCompleted() ? 1 : 0;
        statement.bindLong(5, _tmp_1);
        final int _tmp_2 = entity.getRequired() ? 1 : 0;
        statement.bindLong(6, _tmp_2);
      }
    };
    this.__updateAdapterOfChecklistItem = new EntityDeletionOrUpdateAdapter<ChecklistItem>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `checklist_items` SET `id` = ?,`phase` = ?,`sortOrder` = ?,`text` = ?,`completed` = ?,`required` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ChecklistItem entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        final String _tmp = __converters.fromPhase(entity.getPhase());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, _tmp);
        }
        statement.bindLong(3, entity.getSortOrder());
        if (entity.getText() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getText());
        }
        final int _tmp_1 = entity.getCompleted() ? 1 : 0;
        statement.bindLong(5, _tmp_1);
        final int _tmp_2 = entity.getRequired() ? 1 : 0;
        statement.bindLong(6, _tmp_2);
        if (entity.getId() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getId());
        }
      }
    };
    this.__preparedStmtOfUpdateCompleted = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE checklist_items SET completed = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM checklist_items";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final List<ChecklistItem> items,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfChecklistItem.insert(items);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final ChecklistItem item, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfChecklistItem.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateCompleted(final String id, final boolean completed,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCompleted.acquire();
        int _argIndex = 1;
        final int _tmp = completed ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
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
          __preparedStmtOfUpdateCompleted.release(_stmt);
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
  public Flow<List<ChecklistItem>> getItemsForPhase(final Phase phase) {
    final String _sql = "SELECT * FROM checklist_items WHERE phase = ? ORDER BY sortOrder";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __converters.fromPhase(phase);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"checklist_items"}, new Callable<List<ChecklistItem>>() {
      @Override
      @NonNull
      public List<ChecklistItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPhase = CursorUtil.getColumnIndexOrThrow(_cursor, "phase");
          final int _cursorIndexOfSortOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "sortOrder");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "completed");
          final int _cursorIndexOfRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "required");
          final List<ChecklistItem> _result = new ArrayList<ChecklistItem>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ChecklistItem _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final Phase _tmpPhase;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfPhase)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfPhase);
            }
            _tmpPhase = __converters.toPhase(_tmp_1);
            final int _tmpSortOrder;
            _tmpSortOrder = _cursor.getInt(_cursorIndexOfSortOrder);
            final String _tmpText;
            if (_cursor.isNull(_cursorIndexOfText)) {
              _tmpText = null;
            } else {
              _tmpText = _cursor.getString(_cursorIndexOfText);
            }
            final boolean _tmpCompleted;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfCompleted);
            _tmpCompleted = _tmp_2 != 0;
            final boolean _tmpRequired;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfRequired);
            _tmpRequired = _tmp_3 != 0;
            _item = new ChecklistItem(_tmpId,_tmpPhase,_tmpSortOrder,_tmpText,_tmpCompleted,_tmpRequired);
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
  public Object getItemsForPhaseSync(final Phase phase,
      final Continuation<? super List<ChecklistItem>> $completion) {
    final String _sql = "SELECT * FROM checklist_items WHERE phase = ? ORDER BY sortOrder";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __converters.fromPhase(phase);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ChecklistItem>>() {
      @Override
      @NonNull
      public List<ChecklistItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPhase = CursorUtil.getColumnIndexOrThrow(_cursor, "phase");
          final int _cursorIndexOfSortOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "sortOrder");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "completed");
          final int _cursorIndexOfRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "required");
          final List<ChecklistItem> _result = new ArrayList<ChecklistItem>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ChecklistItem _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final Phase _tmpPhase;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfPhase)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfPhase);
            }
            _tmpPhase = __converters.toPhase(_tmp_1);
            final int _tmpSortOrder;
            _tmpSortOrder = _cursor.getInt(_cursorIndexOfSortOrder);
            final String _tmpText;
            if (_cursor.isNull(_cursorIndexOfText)) {
              _tmpText = null;
            } else {
              _tmpText = _cursor.getString(_cursorIndexOfText);
            }
            final boolean _tmpCompleted;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfCompleted);
            _tmpCompleted = _tmp_2 != 0;
            final boolean _tmpRequired;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfRequired);
            _tmpRequired = _tmp_3 != 0;
            _item = new ChecklistItem(_tmpId,_tmpPhase,_tmpSortOrder,_tmpText,_tmpCompleted,_tmpRequired);
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
  public Object countIncompleteRequired(final Phase phase,
      final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM checklist_items WHERE phase = ? AND required = 1 AND completed = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __converters.fromPhase(phase);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
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
            final Integer _tmp_1;
            if (_cursor.isNull(0)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(0);
            }
            _result = _tmp_1;
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
