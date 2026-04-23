package com.homeretreat.planner.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00122\u0006\u0010\u000f\u001a\u00020\u0005H\'J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0007J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00140\u00122\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0016\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u0018\u00a8\u0006\u001b"}, d2 = {"Lcom/homeretreat/planner/data/local/dao/MealLogDao;", "", "countLateMeals", "", "start", "Ljava/time/LocalDate;", "end", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countOnTimeMeals", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteForRange", "getLogForDate", "Lcom/homeretreat/planner/data/local/entity/MealLog;", "date", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLogForDateFlow", "Lkotlinx/coroutines/flow/Flow;", "getLogsForRange", "", "getLogsForRangeFlow", "insert", "log", "(Lcom/homeretreat/planner/data/local/entity/MealLog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markReminderShown", "update", "app_debug"})
@androidx.room.Dao()
public abstract interface MealLogDao {
    
    @androidx.room.Query(value = "SELECT * FROM meal_logs WHERE date = :date")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLogForDate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.MealLog> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM meal_logs WHERE date = :date")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.homeretreat.planner.data.local.entity.MealLog> getLogForDateFlow(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date);
    
    @androidx.room.Query(value = "SELECT * FROM meal_logs WHERE date BETWEEN :start AND :end ORDER BY date")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLogsForRange(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.homeretreat.planner.data.local.entity.MealLog>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM meal_logs WHERE date BETWEEN :start AND :end ORDER BY date")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.MealLog>> getLogsForRangeFlow(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM meal_logs WHERE date BETWEEN :start AND :end AND beforeNoon = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object countOnTimeMeals(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM meal_logs WHERE date BETWEEN :start AND :end AND beforeNoon = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object countLateMeals(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.MealLog log, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.MealLog log, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE meal_logs SET cutoffReminderShown = 1 WHERE date = :date")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object markReminderShown(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM meal_logs WHERE date BETWEEN :start AND :end")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteForRange(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM meal_logs")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}