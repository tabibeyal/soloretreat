package com.homeretreat.planner.service;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\"\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/homeretreat/planner/service/MeditationTimerService;", "Landroid/app/Service;", "()V", "notificationHelper", "Lcom/homeretreat/planner/util/NotificationHelper;", "getNotificationHelper", "()Lcom/homeretreat/planner/util/NotificationHelper;", "setNotificationHelper", "(Lcom/homeretreat/planner/util/NotificationHelper;)V", "observerJob", "Lkotlinx/coroutines/Job;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "timerEngine", "Lcom/homeretreat/planner/service/TimerEngine;", "getTimerEngine", "()Lcom/homeretreat/planner/service/TimerEngine;", "setTimerEngine", "(Lcom/homeretreat/planner/service/TimerEngine;)V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "", "flags", "startId", "app_debug"})
public final class MeditationTimerService extends android.app.Service {
    @javax.inject.Inject()
    public com.homeretreat.planner.service.TimerEngine timerEngine;
    @javax.inject.Inject()
    public com.homeretreat.planner.util.NotificationHelper notificationHelper;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job observerJob;
    
    public MeditationTimerService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.service.TimerEngine getTimerEngine() {
        return null;
    }
    
    public final void setTimerEngine(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.service.TimerEngine p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.util.NotificationHelper getNotificationHelper() {
        return null;
    }
    
    public final void setNotificationHelper(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.util.NotificationHelper p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}