package com.homeretreat.planner.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/homeretreat/planner/util/TimeUtils;", "", "()V", "fullDateFormatter", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "timeFormatter", "dayOfRetreat", "", "startDate", "Ljava/time/LocalDate;", "daysBetween", "start", "end", "formatDuration", "", "minutes", "", "formatFullDate", "date", "formatTime", "time", "Ljava/time/LocalTime;", "isMealCutoffApproaching", "", "localDateTimeToInstant", "Ljava/time/Instant;", "app_debug"})
public final class TimeUtils {
    private static final java.time.format.DateTimeFormatter timeFormatter = null;
    private static final java.time.format.DateTimeFormatter fullDateFormatter = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.homeretreat.planner.util.TimeUtils INSTANCE = null;
    
    private TimeUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatTime(@org.jetbrains.annotations.NotNull()
    java.time.LocalTime time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatFullDate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDuration(long minutes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Instant localDateTimeToInstant(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime time) {
        return null;
    }
    
    public final int daysBetween(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end) {
        return 0;
    }
    
    public final int dayOfRetreat(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate startDate) {
        return 0;
    }
    
    public final boolean isMealCutoffApproaching() {
        return false;
    }
}