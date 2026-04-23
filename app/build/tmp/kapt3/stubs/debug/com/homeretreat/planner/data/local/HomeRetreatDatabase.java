package com.homeretreat.planner.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&\u00a8\u0006\u0013"}, d2 = {"Lcom/homeretreat/planner/data/local/HomeRetreatDatabase;", "Landroidx/room/RoomDatabase;", "()V", "checklistItemDao", "Lcom/homeretreat/planner/data/local/dao/ChecklistItemDao;", "dhammaTalkDao", "Lcom/homeretreat/planner/data/local/dao/DhammaTalkDao;", "journalEntryDao", "Lcom/homeretreat/planner/data/local/dao/JournalEntryDao;", "mealLogDao", "Lcom/homeretreat/planner/data/local/dao/MealLogDao;", "meditationSessionDao", "Lcom/homeretreat/planner/data/local/dao/MeditationSessionDao;", "preceptLogDao", "Lcom/homeretreat/planner/data/local/dao/PreceptLogDao;", "retreatConfigDao", "Lcom/homeretreat/planner/data/local/dao/RetreatConfigDao;", "scheduleBlockDao", "Lcom/homeretreat/planner/data/local/dao/ScheduleBlockDao;", "app_debug"})
@androidx.room.Database(entities = {com.homeretreat.planner.data.local.entity.RetreatConfig.class, com.homeretreat.planner.data.local.entity.ScheduleBlock.class, com.homeretreat.planner.data.local.entity.DhammaTalk.class, com.homeretreat.planner.data.local.entity.PreceptLog.class, com.homeretreat.planner.data.local.entity.MeditationSession.class, com.homeretreat.planner.data.local.entity.MealLog.class, com.homeretreat.planner.data.local.entity.JournalEntry.class, com.homeretreat.planner.data.local.entity.ChecklistItem.class}, version = 1, exportSchema = true)
@androidx.room.TypeConverters(value = {com.homeretreat.planner.data.local.Converters.class})
public abstract class HomeRetreatDatabase extends androidx.room.RoomDatabase {
    
    public HomeRetreatDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.homeretreat.planner.data.local.dao.RetreatConfigDao retreatConfigDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.homeretreat.planner.data.local.dao.ScheduleBlockDao scheduleBlockDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.homeretreat.planner.data.local.dao.DhammaTalkDao dhammaTalkDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.homeretreat.planner.data.local.dao.PreceptLogDao preceptLogDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.homeretreat.planner.data.local.dao.MeditationSessionDao meditationSessionDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.homeretreat.planner.data.local.dao.MealLogDao mealLogDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.homeretreat.planner.data.local.dao.JournalEntryDao journalEntryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.homeretreat.planner.data.local.dao.ChecklistItemDao checklistItemDao();
}