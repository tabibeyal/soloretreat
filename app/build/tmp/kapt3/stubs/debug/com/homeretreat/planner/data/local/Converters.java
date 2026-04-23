package com.homeretreat.planner.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0019\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0007\u00a2\u0006\u0002\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0007\u00a2\u0006\u0002\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\u00162\b\u0010%\u001a\u0004\u0018\u00010\u0014H\u0007\u00a2\u0006\u0002\u0010&J\u0010\u0010\'\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007\u00a8\u0006("}, d2 = {"Lcom/homeretreat/planner/data/local/Converters;", "", "()V", "fromActivityType", "", "type", "Lcom/homeretreat/planner/data/model/ActivityType;", "fromDownloadStatus", "status", "Lcom/homeretreat/planner/data/model/DownloadStatus;", "fromInstant", "", "instant", "Ljava/time/Instant;", "(Ljava/time/Instant;)Ljava/lang/Long;", "fromLocalDate", "date", "Ljava/time/LocalDate;", "(Ljava/time/LocalDate;)Ljava/lang/Long;", "fromLocalTime", "", "time", "Ljava/time/LocalTime;", "(Ljava/time/LocalTime;)Ljava/lang/Integer;", "fromPhase", "phase", "Lcom/homeretreat/planner/data/model/Phase;", "toActivityType", "name", "toDownloadStatus", "toInstant", "millis", "(Ljava/lang/Long;)Ljava/time/Instant;", "toLocalDate", "epochDay", "(Ljava/lang/Long;)Ljava/time/LocalDate;", "toLocalTime", "seconds", "(Ljava/lang/Integer;)Ljava/time/LocalTime;", "toPhase", "app_debug"})
public final class Converters {
    
    public Converters() {
        super();
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long fromLocalDate(@org.jetbrains.annotations.Nullable()
    java.time.LocalDate date) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDate toLocalDate(@org.jetbrains.annotations.Nullable()
    java.lang.Long epochDay) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer fromLocalTime(@org.jetbrains.annotations.Nullable()
    java.time.LocalTime time) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalTime toLocalTime(@org.jetbrains.annotations.Nullable()
    java.lang.Integer seconds) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long fromInstant(@org.jetbrains.annotations.Nullable()
    java.time.Instant instant) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.time.Instant toInstant(@org.jetbrains.annotations.Nullable()
    java.lang.Long millis) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String fromPhase(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.Phase phase) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.model.Phase toPhase(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String fromActivityType(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.ActivityType type) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.model.ActivityType toActivityType(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String fromDownloadStatus(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.DownloadStatus status) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.model.DownloadStatus toDownloadStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
}