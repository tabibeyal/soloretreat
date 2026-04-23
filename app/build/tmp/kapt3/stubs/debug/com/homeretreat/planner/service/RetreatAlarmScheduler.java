package com.homeretreat.planner.service;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0002J\u001e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u0010J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002J\u0016\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\nH\u0002J\u001e\u0010\u001e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/homeretreat/planner/service/RetreatAlarmScheduler;", "", "context", "Landroid/content/Context;", "scheduleRepository", "Lcom/homeretreat/planner/data/repository/ScheduleRepository;", "(Landroid/content/Context;Lcom/homeretreat/planner/data/repository/ScheduleRepository;)V", "alarmManager", "Landroid/app/AlarmManager;", "cancelAll", "", "enqueueNotificationWorker", "rescheduleNextBlock", "startDate", "Ljava/time/LocalDate;", "endDate", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleAlarm", "requestCode", "", "action", "", "triggerAtMillis", "", "scheduleDailyRollover", "scheduleForRetreat", "config", "Lcom/homeretreat/planner/data/local/entity/RetreatConfig;", "(Lcom/homeretreat/planner/data/local/entity/RetreatConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleMealCutoffAlarms", "scheduleNextBlockAlarm", "app_debug"})
public final class RetreatAlarmScheduler {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.ScheduleRepository scheduleRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.AlarmManager alarmManager = null;
    
    @javax.inject.Inject()
    public RetreatAlarmScheduler(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.ScheduleRepository scheduleRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object scheduleForRetreat(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.RetreatConfig config, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object rescheduleNextBlock(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate startDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate endDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void cancelAll() {
    }
    
    private final java.lang.Object scheduleNextBlockAlarm(java.time.LocalDate startDate, java.time.LocalDate endDate, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void scheduleMealCutoffAlarms() {
    }
    
    private final void scheduleDailyRollover() {
    }
    
    private final void scheduleAlarm(int requestCode, java.lang.String action, long triggerAtMillis) {
    }
    
    private final void enqueueNotificationWorker() {
    }
}