package com.homeretreat.planner.data.local.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/homeretreat/planner/data/local/entity/MealLog;", "", "date", "Ljava/time/LocalDate;", "lastMealTime", "Ljava/time/LocalTime;", "beforeNoon", "", "cutoffReminderShown", "(Ljava/time/LocalDate;Ljava/time/LocalTime;Ljava/lang/Boolean;Z)V", "getBeforeNoon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCutoffReminderShown", "()Z", "getDate", "()Ljava/time/LocalDate;", "getLastMealTime", "()Ljava/time/LocalTime;", "component1", "component2", "component3", "component4", "copy", "(Ljava/time/LocalDate;Ljava/time/LocalTime;Ljava/lang/Boolean;Z)Lcom/homeretreat/planner/data/local/entity/MealLog;", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
@androidx.room.Entity(tableName = "meal_logs")
public final class MealLog {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDate date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.time.LocalTime lastMealTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean beforeNoon = null;
    private final boolean cutoffReminderShown = false;
    
    public MealLog(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.Nullable()
    java.time.LocalTime lastMealTime, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean beforeNoon, boolean cutoffReminderShown) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalTime getLastMealTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getBeforeNoon() {
        return null;
    }
    
    public final boolean getCutoffReminderShown() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalTime component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.homeretreat.planner.data.local.entity.MealLog copy(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.Nullable()
    java.time.LocalTime lastMealTime, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean beforeNoon, boolean cutoffReminderShown) {
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