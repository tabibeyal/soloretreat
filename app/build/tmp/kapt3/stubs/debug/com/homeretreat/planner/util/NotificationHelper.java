package com.homeretreat.planner.util;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0006J*\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0012\u001a\u00020\u0006J\u001e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/homeretreat/planner/util/NotificationHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "buildBlockReminderNotification", "Landroid/app/Notification;", "activityType", "Lcom/homeretreat/planner/data/model/ActivityType;", "blockName", "", "buildMealCutoffNotification", "buildOngoingRetreatNotification", "day", "", "totalDays", "nextBlock", "nextTime", "buildPersistentMealReminder", "buildTimerNotification", "activityLabel", "remainingSeconds", "", "isPaused", "", "createBaseNotification", "Landroidx/core/app/NotificationCompat$Builder;", "channelId", "notifyTimer", "", "notification", "app_debug"})
public final class NotificationHelper {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public NotificationHelper(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final androidx.core.app.NotificationCompat.Builder createBaseNotification(java.lang.String channelId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification buildOngoingRetreatNotification(int day, int totalDays, @org.jetbrains.annotations.Nullable()
    java.lang.String nextBlock, @org.jetbrains.annotations.Nullable()
    java.lang.String nextTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification buildBlockReminderNotification(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.ActivityType activityType, @org.jetbrains.annotations.NotNull()
    java.lang.String blockName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification buildMealCutoffNotification() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification buildTimerNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String activityLabel, long remainingSeconds, boolean isPaused) {
        return null;
    }
    
    public final void notifyTimer(@org.jetbrains.annotations.NotNull()
    android.app.Notification notification) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification buildPersistentMealReminder() {
        return null;
    }
}