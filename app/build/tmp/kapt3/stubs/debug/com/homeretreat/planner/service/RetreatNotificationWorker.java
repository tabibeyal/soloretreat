package com.homeretreat.planner.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/homeretreat/planner/service/RetreatNotificationWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "retreatRepository", "Lcom/homeretreat/planner/data/repository/RetreatRepository;", "scheduleRepository", "Lcom/homeretreat/planner/data/repository/ScheduleRepository;", "notificationHelper", "Lcom/homeretreat/planner/util/NotificationHelper;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/homeretreat/planner/data/repository/RetreatRepository;Lcom/homeretreat/planner/data/repository/ScheduleRepository;Lcom/homeretreat/planner/util/NotificationHelper;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.hilt.work.HiltWorker()
public final class RetreatNotificationWorker extends androidx.work.CoroutineWorker {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.RetreatRepository retreatRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.ScheduleRepository scheduleRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.util.NotificationHelper notificationHelper = null;
    
    @dagger.assisted.AssistedInject()
    public RetreatNotificationWorker(@dagger.assisted.Assisted()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @dagger.assisted.Assisted()
    @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters params, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.RetreatRepository retreatRepository, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.ScheduleRepository scheduleRepository, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.util.NotificationHelper notificationHelper) {
        super(null, null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> $completion) {
        return null;
    }
}