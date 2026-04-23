package com.homeretreat.planner.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0011\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ$\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00180\u001a2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\'J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u001f\u00a8\u0006!"}, d2 = {"Lcom/homeretreat/planner/data/local/dao/MeditationSessionDao;", "", "completeSession", "", "id", "", "endTime", "Ljava/time/Instant;", "wasInterrupted", "", "(Ljava/lang/String;Ljava/time/Instant;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countCompletedSessions", "", "start", "end", "(Ljava/time/Instant;Ljava/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countInterruptedSessions", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestForBlock", "Lcom/homeretreat/planner/data/local/entity/MeditationSession;", "blockId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionsForRange", "", "getSessionsForRangeFlow", "Lkotlinx/coroutines/flow/Flow;", "getTotalMinutes", "", "insert", "session", "(Lcom/homeretreat/planner/data/local/entity/MeditationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
@androidx.room.Dao()
public abstract interface MeditationSessionDao {
    
    @androidx.room.Query(value = "SELECT * FROM meditation_sessions WHERE blockId = :blockId ORDER BY actualStart DESC LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLatestForBlock(@org.jetbrains.annotations.NotNull()
    java.lang.String blockId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.MeditationSession> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM meditation_sessions WHERE actualStart BETWEEN :start AND :end ORDER BY actualStart")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSessionsForRange(@org.jetbrains.annotations.NotNull()
    java.time.Instant start, @org.jetbrains.annotations.NotNull()
    java.time.Instant end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.homeretreat.planner.data.local.entity.MeditationSession>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM meditation_sessions WHERE actualStart BETWEEN :start AND :end ORDER BY actualStart")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.MeditationSession>> getSessionsForRangeFlow(@org.jetbrains.annotations.NotNull()
    java.time.Instant start, @org.jetbrains.annotations.NotNull()
    java.time.Instant end);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM meditation_sessions WHERE actualStart BETWEEN :start AND :end AND interrupted = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object countCompletedSessions(@org.jetbrains.annotations.NotNull()
    java.time.Instant start, @org.jetbrains.annotations.NotNull()
    java.time.Instant end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM meditation_sessions WHERE actualStart BETWEEN :start AND :end AND interrupted = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object countInterruptedSessions(@org.jetbrains.annotations.NotNull()
    java.time.Instant start, @org.jetbrains.annotations.NotNull()
    java.time.Instant end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.MeditationSession session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.MeditationSession session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE meditation_sessions SET actualEnd = :endTime, interrupted = :wasInterrupted WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object completeSession(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.time.Instant endTime, boolean wasInterrupted, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COALESCE(SUM((julianday(actualEnd) - julianday(actualStart)) * 24 * 60), 0) FROM meditation_sessions WHERE actualStart BETWEEN :start AND :end AND interrupted = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalMinutes(@org.jetbrains.annotations.NotNull()
    java.time.Instant start, @org.jetbrains.annotations.NotNull()
    java.time.Instant end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Query(value = "DELETE FROM meditation_sessions")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}