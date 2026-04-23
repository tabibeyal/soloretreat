package com.homeretreat.planner.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001cH\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007JH\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\'2\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u000bH\u0007J\u0010\u0010)\u001a\u00020\'2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\'H\u0007J\u001a\u0010,\u001a\u00020-2\u0006\u0010(\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006."}, d2 = {"Lcom/homeretreat/planner/di/AppModule;", "", "()V", "provideChecklistItemDao", "Lcom/homeretreat/planner/data/local/dao/ChecklistItemDao;", "db", "Lcom/homeretreat/planner/data/local/HomeRetreatDatabase;", "provideDatabase", "context", "Landroid/content/Context;", "provideDhammaTalkDao", "Lcom/homeretreat/planner/data/local/dao/DhammaTalkDao;", "provideJournalEntryDao", "Lcom/homeretreat/planner/data/local/dao/JournalEntryDao;", "provideJournalRepository", "Lcom/homeretreat/planner/data/repository/JournalRepository;", "journalEntryDao", "provideMealLogDao", "Lcom/homeretreat/planner/data/local/dao/MealLogDao;", "provideMealLogRepository", "Lcom/homeretreat/planner/data/repository/MealLogRepository;", "mealLogDao", "provideMeditationSessionDao", "Lcom/homeretreat/planner/data/local/dao/MeditationSessionDao;", "provideMeditationSessionRepository", "Lcom/homeretreat/planner/data/repository/MeditationSessionRepository;", "meditationSessionDao", "providePreceptLogDao", "Lcom/homeretreat/planner/data/local/dao/PreceptLogDao;", "providePreceptRepository", "Lcom/homeretreat/planner/data/repository/PreceptRepository;", "preceptLogDao", "provideRetreatConfigDao", "Lcom/homeretreat/planner/data/local/dao/RetreatConfigDao;", "provideRetreatRepository", "Lcom/homeretreat/planner/data/repository/RetreatRepository;", "retreatConfigDao", "checklistItemDao", "scheduleBlockDao", "Lcom/homeretreat/planner/data/local/dao/ScheduleBlockDao;", "dhammaTalkDao", "provideScheduleBlockDao", "provideScheduleRepository", "Lcom/homeretreat/planner/data/repository/ScheduleRepository;", "provideTalkRepository", "Lcom/homeretreat/planner/data/repository/TalkRepository;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.homeretreat.planner.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.local.HomeRetreatDatabase provideDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.local.dao.RetreatConfigDao provideRetreatConfigDao(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.HomeRetreatDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.local.dao.ScheduleBlockDao provideScheduleBlockDao(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.HomeRetreatDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.local.dao.DhammaTalkDao provideDhammaTalkDao(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.HomeRetreatDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.local.dao.PreceptLogDao providePreceptLogDao(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.HomeRetreatDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.local.dao.MeditationSessionDao provideMeditationSessionDao(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.HomeRetreatDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.local.dao.MealLogDao provideMealLogDao(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.HomeRetreatDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.local.dao.JournalEntryDao provideJournalEntryDao(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.HomeRetreatDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.local.dao.ChecklistItemDao provideChecklistItemDao(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.HomeRetreatDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.repository.RetreatRepository provideRetreatRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.RetreatConfigDao retreatConfigDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.ChecklistItemDao checklistItemDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.ScheduleBlockDao scheduleBlockDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.MeditationSessionDao meditationSessionDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.JournalEntryDao journalEntryDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.MealLogDao mealLogDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.PreceptLogDao preceptLogDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.DhammaTalkDao dhammaTalkDao) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.repository.ScheduleRepository provideScheduleRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.ScheduleBlockDao scheduleBlockDao) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.repository.TalkRepository provideTalkRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.DhammaTalkDao dhammaTalkDao, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.repository.PreceptRepository providePreceptRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.PreceptLogDao preceptLogDao) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.repository.JournalRepository provideJournalRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.JournalEntryDao journalEntryDao) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.repository.MealLogRepository provideMealLogRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.MealLogDao mealLogDao) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.repository.MeditationSessionRepository provideMeditationSessionRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.MeditationSessionDao meditationSessionDao) {
        return null;
    }
}