package com.homeretreat.planner.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u0017J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u0012J\"\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00190\u001b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nJ\u001e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/homeretreat/planner/data/repository/MeditationSessionRepository;", "", "meditationSessionDao", "Lcom/homeretreat/planner/data/local/dao/MeditationSessionDao;", "(Lcom/homeretreat/planner/data/local/dao/MeditationSessionDao;)V", "completeSession", "", "id", "", "endTime", "Ljava/time/Instant;", "wasInterrupted", "", "(Ljava/lang/String;Ljava/time/Instant;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countCompletedSessions", "", "start", "end", "(Ljava/time/Instant;Ljava/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countInterruptedSessions", "getLatestForBlock", "Lcom/homeretreat/planner/data/local/entity/MeditationSession;", "blockId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionsForRange", "", "getSessionsForRangeFlow", "Lkotlinx/coroutines/flow/Flow;", "getTotalMinutes", "", "insert", "session", "(Lcom/homeretreat/planner/data/local/entity/MeditationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public final class MeditationSessionRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.MeditationSessionDao meditationSessionDao = null;
    
    @javax.inject.Inject()
    public MeditationSessionRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.MeditationSessionDao meditationSessionDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLatestForBlock(@org.jetbrains.annotations.NotNull()
    java.lang.String blockId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.MeditationSession> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSessionsForRange(@org.jetbrains.annotations.NotNull()
    java.time.Instant start, @org.jetbrains.annotations.NotNull()
    java.time.Instant end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.homeretreat.planner.data.local.entity.MeditationSession>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.MeditationSession>> getSessionsForRangeFlow(@org.jetbrains.annotations.NotNull()
    java.time.Instant start, @org.jetbrains.annotations.NotNull()
    java.time.Instant end) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object countCompletedSessions(@org.jetbrains.annotations.NotNull()
    java.time.Instant start, @org.jetbrains.annotations.NotNull()
    java.time.Instant end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object countInterruptedSessions(@org.jetbrains.annotations.NotNull()
    java.time.Instant start, @org.jetbrains.annotations.NotNull()
    java.time.Instant end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.MeditationSession session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.MeditationSession session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object completeSession(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.time.Instant endTime, boolean wasInterrupted, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTotalMinutes(@org.jetbrains.annotations.NotNull()
    java.time.Instant start, @org.jetbrains.annotations.NotNull()
    java.time.Instant end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
}