package com.homeretreat.planner.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/homeretreat/planner/util/Constants;", "", "()V", "ACTION_BLOCK_ALARM", "", "ACTION_BLOCK_TRANSITION", "ACTION_DAILY_ROLLOVER", "ACTION_MEAL_CUTOFF_POST_NOON", "ACTION_MEAL_CUTOFF_WARN", "ACTION_STOP_RETREAT", "ACTION_STOP_TIMER", "ALARM_REQUEST_BLOCK", "", "ALARM_REQUEST_DAILY_ROLLOVER", "ALARM_REQUEST_MEAL_POST_NOON", "ALARM_REQUEST_MEAL_WARN", "ALARM_REQUEST_STOP", "ALARM_REQUEST_TIMER_STOP", "CHANNEL_BLOCK_REMINDER", "CHANNEL_MEAL_CUTOFF", "CHANNEL_PRECEPT_REMINDER", "CHANNEL_RETREAT_SERVICE", "CHANNEL_TIMER_SERVICE", "NOTIFICATION_ID_BLOCK_REMINDER", "NOTIFICATION_ID_MEAL_CUTOFF", "NOTIFICATION_ID_SERVICE", "NOTIFICATION_ID_TIMER", "WORK_NAME_NOTIFICATION_REFRESH", "app_debug"})
@kotlin.Suppress(names = {"SpellCheckingInspection"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_RETREAT_SERVICE = "retreat_session_service";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_BLOCK_REMINDER = "block_reminder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_MEAL_CUTOFF = "meal_cutoff";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_PRECEPT_REMINDER = "precept_reminder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_TIMER_SERVICE = "timer_session_service";
    public static final int NOTIFICATION_ID_SERVICE = 1001;
    public static final int NOTIFICATION_ID_BLOCK_REMINDER = 1002;
    public static final int NOTIFICATION_ID_MEAL_CUTOFF = 1003;
    public static final int NOTIFICATION_ID_TIMER = 1004;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_STOP_RETREAT = "com.homeretreat.planner.STOP_RETREAT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_STOP_TIMER = "com.homeretreat.planner.STOP_TIMER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_BLOCK_TRANSITION = "com.homeretreat.planner.BLOCK_TRANSITION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_BLOCK_ALARM = "com.homeretreat.planner.BLOCK_ALARM";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_MEAL_CUTOFF_WARN = "com.homeretreat.planner.MEAL_CUTOFF_WARN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_MEAL_CUTOFF_POST_NOON = "com.homeretreat.planner.MEAL_CUTOFF_POST_NOON";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_DAILY_ROLLOVER = "com.homeretreat.planner.DAILY_ROLLOVER";
    public static final int ALARM_REQUEST_BLOCK = 100;
    public static final int ALARM_REQUEST_MEAL_WARN = 101;
    public static final int ALARM_REQUEST_MEAL_POST_NOON = 102;
    public static final int ALARM_REQUEST_DAILY_ROLLOVER = 103;
    public static final int ALARM_REQUEST_STOP = 104;
    public static final int ALARM_REQUEST_TIMER_STOP = 105;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_NAME_NOTIFICATION_REFRESH = "retreat_notification_refresh";
    @org.jetbrains.annotations.NotNull()
    public static final com.homeretreat.planner.util.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
}