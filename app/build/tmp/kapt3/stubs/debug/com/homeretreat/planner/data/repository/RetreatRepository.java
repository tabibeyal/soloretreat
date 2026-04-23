package com.homeretreat.planner.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@\u00a2\u0006\u0002\u0010\u001fJ\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0!J\u0010\u0010&\u001a\u0004\u0018\u00010%H\u0086@\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\'\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010(\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u0015J\u001e\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020%H\u0086@\u00a2\u0006\u0002\u00100J\u0016\u00101\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/homeretreat/planner/data/repository/RetreatRepository;", "", "configDao", "Lcom/homeretreat/planner/data/local/dao/RetreatConfigDao;", "checklistDao", "Lcom/homeretreat/planner/data/local/dao/ChecklistItemDao;", "scheduleBlockDao", "Lcom/homeretreat/planner/data/local/dao/ScheduleBlockDao;", "meditationSessionDao", "Lcom/homeretreat/planner/data/local/dao/MeditationSessionDao;", "journalEntryDao", "Lcom/homeretreat/planner/data/local/dao/JournalEntryDao;", "mealLogDao", "Lcom/homeretreat/planner/data/local/dao/MealLogDao;", "preceptLogDao", "Lcom/homeretreat/planner/data/local/dao/PreceptLogDao;", "dhammaTalkDao", "Lcom/homeretreat/planner/data/local/dao/DhammaTalkDao;", "(Lcom/homeretreat/planner/data/local/dao/RetreatConfigDao;Lcom/homeretreat/planner/data/local/dao/ChecklistItemDao;Lcom/homeretreat/planner/data/local/dao/ScheduleBlockDao;Lcom/homeretreat/planner/data/local/dao/MeditationSessionDao;Lcom/homeretreat/planner/data/local/dao/JournalEntryDao;Lcom/homeretreat/planner/data/local/dao/MealLogDao;Lcom/homeretreat/planner/data/local/dao/PreceptLogDao;Lcom/homeretreat/planner/data/local/dao/DhammaTalkDao;)V", "advancePhaseIfReady", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "areAllRequiredItemsComplete", "phase", "Lcom/homeretreat/planner/data/model/Phase;", "(Lcom/homeretreat/planner/data/model/Phase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRetreat", "", "startDate", "Ljava/time/LocalDate;", "endDate", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChecklistForPhase", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/homeretreat/planner/data/local/entity/ChecklistItem;", "getConfig", "Lcom/homeretreat/planner/data/local/entity/RetreatConfig;", "getConfigSync", "populateDefaultChecklist", "resetRetreat", "toggleChecklistItem", "id", "", "completed", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateConfig", "config", "(Lcom/homeretreat/planner/data/local/entity/RetreatConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePhase", "app_debug"})
public final class RetreatRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.RetreatConfigDao configDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.ChecklistItemDao checklistDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.ScheduleBlockDao scheduleBlockDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.MeditationSessionDao meditationSessionDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.JournalEntryDao journalEntryDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.MealLogDao mealLogDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.PreceptLogDao preceptLogDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.DhammaTalkDao dhammaTalkDao = null;
    
    @javax.inject.Inject()
    public RetreatRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.RetreatConfigDao configDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.ChecklistItemDao checklistDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.ScheduleBlockDao scheduleBlockDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.MeditationSessionDao meditationSessionDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.JournalEntryDao journalEntryDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.MealLogDao mealLogDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.PreceptLogDao preceptLogDao, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.DhammaTalkDao dhammaTalkDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.homeretreat.planner.data.local.entity.RetreatConfig> getConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getConfigSync(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.RetreatConfig> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createRetreat(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate startDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate endDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updatePhase(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.Phase phase, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateConfig(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.RetreatConfig config, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object resetRetreat(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.ChecklistItem>> getChecklistForPhase(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.Phase phase) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object toggleChecklistItem(@org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean completed, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object areAllRequiredItemsComplete(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.Phase phase, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object advancePhaseIfReady(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    private final java.lang.Object populateDefaultChecklist(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}