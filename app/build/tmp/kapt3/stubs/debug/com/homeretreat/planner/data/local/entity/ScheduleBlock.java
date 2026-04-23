package com.homeretreat.planner.data.local.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J]\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016\u00a8\u0006)"}, d2 = {"Lcom/homeretreat/planner/data/local/entity/ScheduleBlock;", "", "id", "", "retreatId", "", "dayOffset", "startTime", "Ljava/time/LocalTime;", "endTime", "activityType", "Lcom/homeretreat/planner/data/model/ActivityType;", "dhammaTalkId", "notes", "(Ljava/lang/String;IILjava/time/LocalTime;Ljava/time/LocalTime;Lcom/homeretreat/planner/data/model/ActivityType;Ljava/lang/String;Ljava/lang/String;)V", "getActivityType", "()Lcom/homeretreat/planner/data/model/ActivityType;", "getDayOffset", "()I", "getDhammaTalkId", "()Ljava/lang/String;", "getEndTime", "()Ljava/time/LocalTime;", "getId", "getNotes", "getRetreatId", "getStartTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "schedule_blocks")
public final class ScheduleBlock {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final int retreatId = 0;
    private final int dayOffset = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalTime startTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalTime endTime = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.model.ActivityType activityType = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dhammaTalkId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String notes = null;
    
    public ScheduleBlock(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int retreatId, int dayOffset, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime startTime, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime endTime, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.ActivityType activityType, @org.jetbrains.annotations.Nullable()
    java.lang.String dhammaTalkId, @org.jetbrains.annotations.Nullable()
    java.lang.String notes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final int getRetreatId() {
        return 0;
    }
    
    public final int getDayOffset() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalTime getStartTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalTime getEndTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.model.ActivityType getActivityType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDhammaTalkId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalTime component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalTime component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.model.ActivityType component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.local.entity.ScheduleBlock copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int retreatId, int dayOffset, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime startTime, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime endTime, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.ActivityType activityType, @org.jetbrains.annotations.Nullable()
    java.lang.String dhammaTalkId, @org.jetbrains.annotations.Nullable()
    java.lang.String notes) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}