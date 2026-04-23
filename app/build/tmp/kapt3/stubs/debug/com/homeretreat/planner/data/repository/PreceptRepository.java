package com.homeretreat.planner.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0002\u0010\u001bJ&\u0010\u001c\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0086@\u00a2\u0006\u0002\u0010!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\""}, d2 = {"Lcom/homeretreat/planner/data/repository/PreceptRepository;", "", "preceptLogDao", "Lcom/homeretreat/planner/data/local/dao/PreceptLogDao;", "(Lcom/homeretreat/planner/data/local/dao/PreceptLogDao;)V", "precepts", "", "Lcom/homeretreat/planner/data/model/Precept;", "getPrecepts", "()Ljava/util/List;", "getLogForDate", "Lkotlinx/coroutines/flow/Flow;", "Lcom/homeretreat/planner/data/local/entity/PreceptLog;", "date", "Ljava/time/LocalDate;", "getLogsForRange", "start", "end", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getObservanceRate", "", "getOrCreateLog", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateEveningReflection", "", "reflection", "", "(Ljava/time/LocalDate;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePreceptObservance", "preceptNumber", "", "observed", "", "(Ljava/time/LocalDate;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PreceptRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.PreceptLogDao preceptLogDao = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.homeretreat.planner.data.model.Precept> precepts = null;
    
    @javax.inject.Inject()
    public PreceptRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.PreceptLogDao preceptLogDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.homeretreat.planner.data.model.Precept> getPrecepts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.homeretreat.planner.data.local.entity.PreceptLog> getLogForDate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrCreateLog(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.PreceptLog> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updatePreceptObservance(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, int preceptNumber, boolean observed, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateEveningReflection(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    java.lang.String reflection, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getObservanceRate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Float> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLogsForRange(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.homeretreat.planner.data.local.entity.PreceptLog>> $completion) {
        return null;
    }
}