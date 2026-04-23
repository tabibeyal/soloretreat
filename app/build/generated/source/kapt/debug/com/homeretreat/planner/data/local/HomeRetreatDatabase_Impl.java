package com.homeretreat.planner.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.homeretreat.planner.data.local.dao.ChecklistItemDao;
import com.homeretreat.planner.data.local.dao.ChecklistItemDao_Impl;
import com.homeretreat.planner.data.local.dao.DhammaTalkDao;
import com.homeretreat.planner.data.local.dao.DhammaTalkDao_Impl;
import com.homeretreat.planner.data.local.dao.JournalEntryDao;
import com.homeretreat.planner.data.local.dao.JournalEntryDao_Impl;
import com.homeretreat.planner.data.local.dao.MealLogDao;
import com.homeretreat.planner.data.local.dao.MealLogDao_Impl;
import com.homeretreat.planner.data.local.dao.MeditationSessionDao;
import com.homeretreat.planner.data.local.dao.MeditationSessionDao_Impl;
import com.homeretreat.planner.data.local.dao.PreceptLogDao;
import com.homeretreat.planner.data.local.dao.PreceptLogDao_Impl;
import com.homeretreat.planner.data.local.dao.RetreatConfigDao;
import com.homeretreat.planner.data.local.dao.RetreatConfigDao_Impl;
import com.homeretreat.planner.data.local.dao.ScheduleBlockDao;
import com.homeretreat.planner.data.local.dao.ScheduleBlockDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class HomeRetreatDatabase_Impl extends HomeRetreatDatabase {
  private volatile RetreatConfigDao _retreatConfigDao;

  private volatile ScheduleBlockDao _scheduleBlockDao;

  private volatile DhammaTalkDao _dhammaTalkDao;

  private volatile PreceptLogDao _preceptLogDao;

  private volatile MeditationSessionDao _meditationSessionDao;

  private volatile MealLogDao _mealLogDao;

  private volatile JournalEntryDao _journalEntryDao;

  private volatile ChecklistItemDao _checklistItemDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `retreat_config` (`id` INTEGER NOT NULL, `startDate` INTEGER, `endDate` INTEGER, `phase` TEXT NOT NULL, `preceptsCommitted` INTEGER NOT NULL, `allTalksDownloaded` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `schedule_blocks` (`id` TEXT NOT NULL, `retreatId` INTEGER NOT NULL, `dayOffset` INTEGER NOT NULL, `startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `activityType` TEXT NOT NULL, `dhammaTalkId` TEXT, `notes` TEXT, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `dhamma_talks` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `teacher` TEXT NOT NULL, `remoteUrl` TEXT NOT NULL, `localPath` TEXT, `downloadStatus` TEXT NOT NULL, `durationMinutes` INTEGER NOT NULL, `category` TEXT NOT NULL, `description` TEXT NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `precept_logs` (`date` INTEGER NOT NULL, `p1` INTEGER, `p2` INTEGER, `p3` INTEGER, `p4` INTEGER, `p5` INTEGER, `p6` INTEGER, `p7` INTEGER, `p8` INTEGER, `eveningReflection` TEXT, PRIMARY KEY(`date`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `meditation_sessions` (`id` TEXT NOT NULL, `blockId` TEXT NOT NULL, `actualStart` INTEGER NOT NULL, `actualEnd` INTEGER, `interrupted` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `meal_logs` (`date` INTEGER NOT NULL, `lastMealTime` INTEGER, `beforeNoon` INTEGER, `cutoffReminderShown` INTEGER NOT NULL, PRIMARY KEY(`date`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `journal_entries` (`id` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `entryText` TEXT NOT NULL, `tags` TEXT NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `checklist_items` (`id` TEXT NOT NULL, `phase` TEXT NOT NULL, `sortOrder` INTEGER NOT NULL, `text` TEXT NOT NULL, `completed` INTEGER NOT NULL, `required` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '98bb919d07756713b512060038209e0b')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `retreat_config`");
        db.execSQL("DROP TABLE IF EXISTS `schedule_blocks`");
        db.execSQL("DROP TABLE IF EXISTS `dhamma_talks`");
        db.execSQL("DROP TABLE IF EXISTS `precept_logs`");
        db.execSQL("DROP TABLE IF EXISTS `meditation_sessions`");
        db.execSQL("DROP TABLE IF EXISTS `meal_logs`");
        db.execSQL("DROP TABLE IF EXISTS `journal_entries`");
        db.execSQL("DROP TABLE IF EXISTS `checklist_items`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsRetreatConfig = new HashMap<String, TableInfo.Column>(6);
        _columnsRetreatConfig.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRetreatConfig.put("startDate", new TableInfo.Column("startDate", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRetreatConfig.put("endDate", new TableInfo.Column("endDate", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRetreatConfig.put("phase", new TableInfo.Column("phase", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRetreatConfig.put("preceptsCommitted", new TableInfo.Column("preceptsCommitted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRetreatConfig.put("allTalksDownloaded", new TableInfo.Column("allTalksDownloaded", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRetreatConfig = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRetreatConfig = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRetreatConfig = new TableInfo("retreat_config", _columnsRetreatConfig, _foreignKeysRetreatConfig, _indicesRetreatConfig);
        final TableInfo _existingRetreatConfig = TableInfo.read(db, "retreat_config");
        if (!_infoRetreatConfig.equals(_existingRetreatConfig)) {
          return new RoomOpenHelper.ValidationResult(false, "retreat_config(com.homeretreat.planner.data.local.entity.RetreatConfig).\n"
                  + " Expected:\n" + _infoRetreatConfig + "\n"
                  + " Found:\n" + _existingRetreatConfig);
        }
        final HashMap<String, TableInfo.Column> _columnsScheduleBlocks = new HashMap<String, TableInfo.Column>(8);
        _columnsScheduleBlocks.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsScheduleBlocks.put("retreatId", new TableInfo.Column("retreatId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsScheduleBlocks.put("dayOffset", new TableInfo.Column("dayOffset", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsScheduleBlocks.put("startTime", new TableInfo.Column("startTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsScheduleBlocks.put("endTime", new TableInfo.Column("endTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsScheduleBlocks.put("activityType", new TableInfo.Column("activityType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsScheduleBlocks.put("dhammaTalkId", new TableInfo.Column("dhammaTalkId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsScheduleBlocks.put("notes", new TableInfo.Column("notes", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysScheduleBlocks = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesScheduleBlocks = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoScheduleBlocks = new TableInfo("schedule_blocks", _columnsScheduleBlocks, _foreignKeysScheduleBlocks, _indicesScheduleBlocks);
        final TableInfo _existingScheduleBlocks = TableInfo.read(db, "schedule_blocks");
        if (!_infoScheduleBlocks.equals(_existingScheduleBlocks)) {
          return new RoomOpenHelper.ValidationResult(false, "schedule_blocks(com.homeretreat.planner.data.local.entity.ScheduleBlock).\n"
                  + " Expected:\n" + _infoScheduleBlocks + "\n"
                  + " Found:\n" + _existingScheduleBlocks);
        }
        final HashMap<String, TableInfo.Column> _columnsDhammaTalks = new HashMap<String, TableInfo.Column>(9);
        _columnsDhammaTalks.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDhammaTalks.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDhammaTalks.put("teacher", new TableInfo.Column("teacher", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDhammaTalks.put("remoteUrl", new TableInfo.Column("remoteUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDhammaTalks.put("localPath", new TableInfo.Column("localPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDhammaTalks.put("downloadStatus", new TableInfo.Column("downloadStatus", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDhammaTalks.put("durationMinutes", new TableInfo.Column("durationMinutes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDhammaTalks.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDhammaTalks.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDhammaTalks = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDhammaTalks = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDhammaTalks = new TableInfo("dhamma_talks", _columnsDhammaTalks, _foreignKeysDhammaTalks, _indicesDhammaTalks);
        final TableInfo _existingDhammaTalks = TableInfo.read(db, "dhamma_talks");
        if (!_infoDhammaTalks.equals(_existingDhammaTalks)) {
          return new RoomOpenHelper.ValidationResult(false, "dhamma_talks(com.homeretreat.planner.data.local.entity.DhammaTalk).\n"
                  + " Expected:\n" + _infoDhammaTalks + "\n"
                  + " Found:\n" + _existingDhammaTalks);
        }
        final HashMap<String, TableInfo.Column> _columnsPreceptLogs = new HashMap<String, TableInfo.Column>(10);
        _columnsPreceptLogs.put("date", new TableInfo.Column("date", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPreceptLogs.put("p1", new TableInfo.Column("p1", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPreceptLogs.put("p2", new TableInfo.Column("p2", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPreceptLogs.put("p3", new TableInfo.Column("p3", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPreceptLogs.put("p4", new TableInfo.Column("p4", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPreceptLogs.put("p5", new TableInfo.Column("p5", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPreceptLogs.put("p6", new TableInfo.Column("p6", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPreceptLogs.put("p7", new TableInfo.Column("p7", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPreceptLogs.put("p8", new TableInfo.Column("p8", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPreceptLogs.put("eveningReflection", new TableInfo.Column("eveningReflection", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPreceptLogs = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPreceptLogs = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPreceptLogs = new TableInfo("precept_logs", _columnsPreceptLogs, _foreignKeysPreceptLogs, _indicesPreceptLogs);
        final TableInfo _existingPreceptLogs = TableInfo.read(db, "precept_logs");
        if (!_infoPreceptLogs.equals(_existingPreceptLogs)) {
          return new RoomOpenHelper.ValidationResult(false, "precept_logs(com.homeretreat.planner.data.local.entity.PreceptLog).\n"
                  + " Expected:\n" + _infoPreceptLogs + "\n"
                  + " Found:\n" + _existingPreceptLogs);
        }
        final HashMap<String, TableInfo.Column> _columnsMeditationSessions = new HashMap<String, TableInfo.Column>(5);
        _columnsMeditationSessions.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMeditationSessions.put("blockId", new TableInfo.Column("blockId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMeditationSessions.put("actualStart", new TableInfo.Column("actualStart", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMeditationSessions.put("actualEnd", new TableInfo.Column("actualEnd", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMeditationSessions.put("interrupted", new TableInfo.Column("interrupted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMeditationSessions = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMeditationSessions = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMeditationSessions = new TableInfo("meditation_sessions", _columnsMeditationSessions, _foreignKeysMeditationSessions, _indicesMeditationSessions);
        final TableInfo _existingMeditationSessions = TableInfo.read(db, "meditation_sessions");
        if (!_infoMeditationSessions.equals(_existingMeditationSessions)) {
          return new RoomOpenHelper.ValidationResult(false, "meditation_sessions(com.homeretreat.planner.data.local.entity.MeditationSession).\n"
                  + " Expected:\n" + _infoMeditationSessions + "\n"
                  + " Found:\n" + _existingMeditationSessions);
        }
        final HashMap<String, TableInfo.Column> _columnsMealLogs = new HashMap<String, TableInfo.Column>(4);
        _columnsMealLogs.put("date", new TableInfo.Column("date", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealLogs.put("lastMealTime", new TableInfo.Column("lastMealTime", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealLogs.put("beforeNoon", new TableInfo.Column("beforeNoon", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealLogs.put("cutoffReminderShown", new TableInfo.Column("cutoffReminderShown", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMealLogs = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMealLogs = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMealLogs = new TableInfo("meal_logs", _columnsMealLogs, _foreignKeysMealLogs, _indicesMealLogs);
        final TableInfo _existingMealLogs = TableInfo.read(db, "meal_logs");
        if (!_infoMealLogs.equals(_existingMealLogs)) {
          return new RoomOpenHelper.ValidationResult(false, "meal_logs(com.homeretreat.planner.data.local.entity.MealLog).\n"
                  + " Expected:\n" + _infoMealLogs + "\n"
                  + " Found:\n" + _existingMealLogs);
        }
        final HashMap<String, TableInfo.Column> _columnsJournalEntries = new HashMap<String, TableInfo.Column>(4);
        _columnsJournalEntries.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJournalEntries.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJournalEntries.put("entryText", new TableInfo.Column("entryText", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJournalEntries.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysJournalEntries = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesJournalEntries = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoJournalEntries = new TableInfo("journal_entries", _columnsJournalEntries, _foreignKeysJournalEntries, _indicesJournalEntries);
        final TableInfo _existingJournalEntries = TableInfo.read(db, "journal_entries");
        if (!_infoJournalEntries.equals(_existingJournalEntries)) {
          return new RoomOpenHelper.ValidationResult(false, "journal_entries(com.homeretreat.planner.data.local.entity.JournalEntry).\n"
                  + " Expected:\n" + _infoJournalEntries + "\n"
                  + " Found:\n" + _existingJournalEntries);
        }
        final HashMap<String, TableInfo.Column> _columnsChecklistItems = new HashMap<String, TableInfo.Column>(6);
        _columnsChecklistItems.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChecklistItems.put("phase", new TableInfo.Column("phase", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChecklistItems.put("sortOrder", new TableInfo.Column("sortOrder", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChecklistItems.put("text", new TableInfo.Column("text", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChecklistItems.put("completed", new TableInfo.Column("completed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChecklistItems.put("required", new TableInfo.Column("required", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysChecklistItems = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesChecklistItems = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoChecklistItems = new TableInfo("checklist_items", _columnsChecklistItems, _foreignKeysChecklistItems, _indicesChecklistItems);
        final TableInfo _existingChecklistItems = TableInfo.read(db, "checklist_items");
        if (!_infoChecklistItems.equals(_existingChecklistItems)) {
          return new RoomOpenHelper.ValidationResult(false, "checklist_items(com.homeretreat.planner.data.local.entity.ChecklistItem).\n"
                  + " Expected:\n" + _infoChecklistItems + "\n"
                  + " Found:\n" + _existingChecklistItems);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "98bb919d07756713b512060038209e0b", "b2883a883293eff2232361bb9514d454");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "retreat_config","schedule_blocks","dhamma_talks","precept_logs","meditation_sessions","meal_logs","journal_entries","checklist_items");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `retreat_config`");
      _db.execSQL("DELETE FROM `schedule_blocks`");
      _db.execSQL("DELETE FROM `dhamma_talks`");
      _db.execSQL("DELETE FROM `precept_logs`");
      _db.execSQL("DELETE FROM `meditation_sessions`");
      _db.execSQL("DELETE FROM `meal_logs`");
      _db.execSQL("DELETE FROM `journal_entries`");
      _db.execSQL("DELETE FROM `checklist_items`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(RetreatConfigDao.class, RetreatConfigDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ScheduleBlockDao.class, ScheduleBlockDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(DhammaTalkDao.class, DhammaTalkDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PreceptLogDao.class, PreceptLogDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(MeditationSessionDao.class, MeditationSessionDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(MealLogDao.class, MealLogDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(JournalEntryDao.class, JournalEntryDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ChecklistItemDao.class, ChecklistItemDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public RetreatConfigDao retreatConfigDao() {
    if (_retreatConfigDao != null) {
      return _retreatConfigDao;
    } else {
      synchronized(this) {
        if(_retreatConfigDao == null) {
          _retreatConfigDao = new RetreatConfigDao_Impl(this);
        }
        return _retreatConfigDao;
      }
    }
  }

  @Override
  public ScheduleBlockDao scheduleBlockDao() {
    if (_scheduleBlockDao != null) {
      return _scheduleBlockDao;
    } else {
      synchronized(this) {
        if(_scheduleBlockDao == null) {
          _scheduleBlockDao = new ScheduleBlockDao_Impl(this);
        }
        return _scheduleBlockDao;
      }
    }
  }

  @Override
  public DhammaTalkDao dhammaTalkDao() {
    if (_dhammaTalkDao != null) {
      return _dhammaTalkDao;
    } else {
      synchronized(this) {
        if(_dhammaTalkDao == null) {
          _dhammaTalkDao = new DhammaTalkDao_Impl(this);
        }
        return _dhammaTalkDao;
      }
    }
  }

  @Override
  public PreceptLogDao preceptLogDao() {
    if (_preceptLogDao != null) {
      return _preceptLogDao;
    } else {
      synchronized(this) {
        if(_preceptLogDao == null) {
          _preceptLogDao = new PreceptLogDao_Impl(this);
        }
        return _preceptLogDao;
      }
    }
  }

  @Override
  public MeditationSessionDao meditationSessionDao() {
    if (_meditationSessionDao != null) {
      return _meditationSessionDao;
    } else {
      synchronized(this) {
        if(_meditationSessionDao == null) {
          _meditationSessionDao = new MeditationSessionDao_Impl(this);
        }
        return _meditationSessionDao;
      }
    }
  }

  @Override
  public MealLogDao mealLogDao() {
    if (_mealLogDao != null) {
      return _mealLogDao;
    } else {
      synchronized(this) {
        if(_mealLogDao == null) {
          _mealLogDao = new MealLogDao_Impl(this);
        }
        return _mealLogDao;
      }
    }
  }

  @Override
  public JournalEntryDao journalEntryDao() {
    if (_journalEntryDao != null) {
      return _journalEntryDao;
    } else {
      synchronized(this) {
        if(_journalEntryDao == null) {
          _journalEntryDao = new JournalEntryDao_Impl(this);
        }
        return _journalEntryDao;
      }
    }
  }

  @Override
  public ChecklistItemDao checklistItemDao() {
    if (_checklistItemDao != null) {
      return _checklistItemDao;
    } else {
      synchronized(this) {
        if(_checklistItemDao == null) {
          _checklistItemDao = new ChecklistItemDao_Impl(this);
        }
        return _checklistItemDao;
      }
    }
  }
}
