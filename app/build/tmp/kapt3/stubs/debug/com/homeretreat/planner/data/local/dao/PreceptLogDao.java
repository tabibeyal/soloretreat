package com.homeretreat.planner.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f2\u0006\u0010\f\u001a\u00020\u0007H\'J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00110\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\'J \u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0017J&\u0010\u0019\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u00a7@\u00a2\u0006\u0002\u0010\u001e\u00a8\u0006\u001f"}, d2 = {"Lcom/homeretreat/planner/data/local/dao/PreceptLogDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteForRange", "start", "Ljava/time/LocalDate;", "end", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLogForDate", "Lcom/homeretreat/planner/data/local/entity/PreceptLog;", "date", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLogForDateFlow", "Lkotlinx/coroutines/flow/Flow;", "getLogsForRange", "", "getLogsForRangeFlow", "getObservanceRate", "", "insert", "log", "(Lcom/homeretreat/planner/data/local/entity/PreceptLog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "updatePrecept", "preceptNum", "", "observed", "", "(Ljava/time/LocalDate;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface PreceptLogDao {
    
    @androidx.room.Query(value = "SELECT * FROM precept_logs WHERE date = :date")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLogForDate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.PreceptLog> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM precept_logs WHERE date = :date")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.homeretreat.planner.data.local.entity.PreceptLog> getLogForDateFlow(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date);
    
    @androidx.room.Query(value = "SELECT * FROM precept_logs WHERE date BETWEEN :start AND :end ORDER BY date")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLogsForRange(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.homeretreat.planner.data.local.entity.PreceptLog>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM precept_logs WHERE date BETWEEN :start AND :end ORDER BY date")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.PreceptLog>> getLogsForRangeFlow(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end);
    
    @androidx.room.Query(value = "\n        SELECT AVG(\n            (COALESCE(p1,0) + COALESCE(p2,0) + COALESCE(p3,0) + COALESCE(p4,0) +\n             COALESCE(p5,0) + COALESCE(p6,0) + COALESCE(p7,0) + COALESCE(p8,0)) / 8.0\n        ) FROM precept_logs\n        WHERE date BETWEEN :start AND :end\n        AND (p1 IS NOT NULL OR p2 IS NOT NULL OR p3 IS NOT NULL OR p4 IS NOT NULL\n             OR p5 IS NOT NULL OR p6 IS NOT NULL OR p7 IS NOT NULL OR p8 IS NOT NULL)\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getObservanceRate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Float> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.PreceptLog log, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.PreceptLog log, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "\n        UPDATE precept_logs \n        SET p1 = CASE WHEN :preceptNum = 1 THEN :observed ELSE p1 END,\n            p2 = CASE WHEN :preceptNum = 2 THEN :observed ELSE p2 END,\n            p3 = CASE WHEN :preceptNum = 3 THEN :observed ELSE p3 END,\n            p4 = CASE WHEN :preceptNum = 4 THEN :observed ELSE p4 END,\n            p5 = CASE WHEN :preceptNum = 5 THEN :observed ELSE p5 END,\n            p6 = CASE WHEN :preceptNum = 6 THEN :observed ELSE p6 END,\n            p7 = CASE WHEN :preceptNum = 7 THEN :observed ELSE p7 END,\n            p8 = CASE WHEN :preceptNum = 8 THEN :observed ELSE p8 END\n        WHERE date = :date\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updatePrecept(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, int preceptNum, boolean observed, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM precept_logs WHERE date BETWEEN :start AND :end")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteForRange(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM precept_logs")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}