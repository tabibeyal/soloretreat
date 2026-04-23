package com.homeretreat.planner.service;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/homeretreat/planner/service/BootCompletedReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "retreatRepository", "Lcom/homeretreat/planner/data/repository/RetreatRepository;", "getRetreatRepository", "()Lcom/homeretreat/planner/data/repository/RetreatRepository;", "setRetreatRepository", "(Lcom/homeretreat/planner/data/repository/RetreatRepository;)V", "scheduler", "Lcom/homeretreat/planner/service/RetreatAlarmScheduler;", "getScheduler", "()Lcom/homeretreat/planner/service/RetreatAlarmScheduler;", "setScheduler", "(Lcom/homeretreat/planner/service/RetreatAlarmScheduler;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
public final class BootCompletedReceiver extends android.content.BroadcastReceiver {
    @javax.inject.Inject()
    public com.homeretreat.planner.data.repository.RetreatRepository retreatRepository;
    @javax.inject.Inject()
    public com.homeretreat.planner.service.RetreatAlarmScheduler scheduler;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public BootCompletedReceiver() {
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
}