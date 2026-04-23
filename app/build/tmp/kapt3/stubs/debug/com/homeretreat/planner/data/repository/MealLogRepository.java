package com.homeretreat.planner.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00132\u0006\u0010\u0010\u001a\u00020\bJ$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\nJ\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00150\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/homeretreat/planner/data/repository/MealLogRepository;", "", "mealLogDao", "Lcom/homeretreat/planner/data/local/dao/MealLogDao;", "(Lcom/homeretreat/planner/data/local/dao/MealLogDao;)V", "countLateMeals", "", "start", "Ljava/time/LocalDate;", "end", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countOnTimeMeals", "deleteForRange", "", "getLogForDate", "Lcom/homeretreat/planner/data/local/entity/MealLog;", "date", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLogForDateFlow", "Lkotlinx/coroutines/flow/Flow;", "getLogsForRange", "", "getLogsForRangeFlow", "insert", "log", "(Lcom/homeretreat/planner/data/local/entity/MealLog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markReminderShown", "update", "app_debug"})
public final class MealLogRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.MealLogDao mealLogDao = null;
    
    @javax.inject.Inject()
    public MealLogRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.MealLogDao mealLogDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLogForDate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.MealLog> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.homeretreat.planner.data.local.entity.MealLog> getLogForDateFlow(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLogsForRange(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.homeretreat.planner.data.local.entity.MealLog>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.MealLog>> getLogsForRangeFlow(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object countOnTimeMeals(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object countLateMeals(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.MealLog log, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.MealLog log, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object markReminderShown(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteForRange(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}