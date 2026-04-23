package com.homeretreat.planner.service;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0082@\u00a2\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0002\u0010&J\u001e\u0010\'\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0082@\u00a2\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010*\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010+\u001a\u00020,H\u0016J&\u0010-\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0082@\u00a2\u0006\u0002\u0010$J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002J\u0016\u00102\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@\u00a2\u0006\u0002\u00103R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/homeretreat/planner/service/RetreatAlarmReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "notificationHelper", "Lcom/homeretreat/planner/util/NotificationHelper;", "getNotificationHelper", "()Lcom/homeretreat/planner/util/NotificationHelper;", "setNotificationHelper", "(Lcom/homeretreat/planner/util/NotificationHelper;)V", "retreatRepository", "Lcom/homeretreat/planner/data/repository/RetreatRepository;", "getRetreatRepository", "()Lcom/homeretreat/planner/data/repository/RetreatRepository;", "setRetreatRepository", "(Lcom/homeretreat/planner/data/repository/RetreatRepository;)V", "scheduleRepository", "Lcom/homeretreat/planner/data/repository/ScheduleRepository;", "getScheduleRepository", "()Lcom/homeretreat/planner/data/repository/ScheduleRepository;", "setScheduleRepository", "(Lcom/homeretreat/planner/data/repository/ScheduleRepository;)V", "scheduler", "Lcom/homeretreat/planner/service/RetreatAlarmScheduler;", "getScheduler", "()Lcom/homeretreat/planner/service/RetreatAlarmScheduler;", "setScheduler", "(Lcom/homeretreat/planner/service/RetreatAlarmScheduler;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "handleBlockAlarm", "", "context", "Landroid/content/Context;", "startDate", "Ljava/time/LocalDate;", "endDate", "(Landroid/content/Context;Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleDailyRollover", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleMealPostNoon", "(Landroid/content/Context;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleMealWarn", "onReceive", "intent", "Landroid/content/Intent;", "refreshOngoingNotification", "shouldNotifyForBlock", "", "activityType", "Lcom/homeretreat/planner/data/model/ActivityType;", "updateWidget", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RetreatAlarmReceiver extends android.content.BroadcastReceiver {
    @javax.inject.Inject()
    public com.homeretreat.planner.data.repository.RetreatRepository retreatRepository;
    @javax.inject.Inject()
    public com.homeretreat.planner.data.repository.ScheduleRepository scheduleRepository;
    @javax.inject.Inject()
    public com.homeretreat.planner.util.NotificationHelper notificationHelper;
    @javax.inject.Inject()
    public com.homeretreat.planner.service.RetreatAlarmScheduler scheduler;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public RetreatAlarmReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.repository.RetreatRepository getRetreatRepository() {
        return null;
    }
    
    public final void setRetreatRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.RetreatRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.repository.ScheduleRepository getScheduleRepository() {
        return null;
    }
    
    public final void setScheduleRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.ScheduleRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.util.NotificationHelper getNotificationHelper() {
        return null;
    }
    
    public final void setNotificationHelper(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.util.NotificationHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.service.RetreatAlarmScheduler getScheduler() {
        return null;
    }
    
    public final void setScheduler(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.service.RetreatAlarmScheduler p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final java.lang.Object handleBlockAlarm(android.content.Context context, java.time.LocalDate startDate, java.time.LocalDate endDate, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void handleMealWarn(android.content.Context context) {
    }
    
    private final java.lang.Object handleMealPostNoon(android.content.Context context, java.time.LocalDate startDate, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object handleDailyRollover(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object refreshOngoingNotification(android.content.Context context, java.time.LocalDate startDate, java.time.LocalDate endDate, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final boolean shouldNotifyForBlock(com.homeretreat.planner.data.model.ActivityType activityType) {
        return false;
    }
    
    private final java.lang.Object updateWidget(android.content.Context context, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}