package com.homeretreat.planner.ui.widget;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/homeretreat/planner/ui/widget/RetreatWidget;", "Landroidx/glance/appwidget/GlanceAppWidget;", "()V", "WidgetContent", "", "data", "Lcom/homeretreat/planner/ui/widget/RetreatWidget$WidgetData;", "provideGlance", "context", "Landroid/content/Context;", "id", "Landroidx/glance/GlanceId;", "(Landroid/content/Context;Landroidx/glance/GlanceId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RetreatWidgetEntryPoint", "WidgetData", "app_debug"})
public final class RetreatWidget extends androidx.glance.appwidget.GlanceAppWidget {
    
    public RetreatWidget() {
        super(0);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object provideGlance(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.glance.GlanceId id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    private final void WidgetContent(com.homeretreat.planner.ui.widget.RetreatWidget.WidgetData data) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/homeretreat/planner/ui/widget/RetreatWidget$RetreatWidgetEntryPoint;", "", "retreatRepository", "Lcom/homeretreat/planner/data/repository/RetreatRepository;", "scheduleRepository", "Lcom/homeretreat/planner/data/repository/ScheduleRepository;", "app_debug"})
    @dagger.hilt.EntryPoint()
    @dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
    public static abstract interface RetreatWidgetEntryPoint {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.homeretreat.planner.data.repository.RetreatRepository retreatRepository();
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.homeretreat.planner.data.repository.ScheduleRepository scheduleRepository();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/homeretreat/planner/ui/widget/RetreatWidget$WidgetData;", "", "()V", "Active", "NoRetreat", "Lcom/homeretreat/planner/ui/widget/RetreatWidget$WidgetData$Active;", "Lcom/homeretreat/planner/ui/widget/RetreatWidget$WidgetData$NoRetreat;", "app_debug"})
    public static abstract class WidgetData {
        
        private WidgetData() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/homeretreat/planner/ui/widget/RetreatWidget$WidgetData$Active;", "Lcom/homeretreat/planner/ui/widget/RetreatWidget$WidgetData;", "day", "", "totalDays", "currentBlock", "Lcom/homeretreat/planner/data/local/entity/ScheduleBlock;", "nextBlock", "mealCutoffApproaching", "", "(IILcom/homeretreat/planner/data/local/entity/ScheduleBlock;Lcom/homeretreat/planner/data/local/entity/ScheduleBlock;Z)V", "getCurrentBlock", "()Lcom/homeretreat/planner/data/local/entity/ScheduleBlock;", "getDay", "()I", "getMealCutoffApproaching", "()Z", "getNextBlock", "getTotalDays", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class Active extends com.homeretreat.planner.ui.widget.RetreatWidget.WidgetData {
            private final int day = 0;
            private final int totalDays = 0;
            @org.jetbrains.annotations.Nullable()
            private final com.homeretreat.planner.data.local.entity.ScheduleBlock currentBlock = null;
            @org.jetbrains.annotations.Nullable()
            private final com.homeretreat.planner.data.local.entity.ScheduleBlock nextBlock = null;
            private final boolean mealCutoffApproaching = false;
            
            public Active(int day, int totalDays, @org.jetbrains.annotations.Nullable()
            com.homeretreat.planner.data.local.entity.ScheduleBlock currentBlock, @org.jetbrains.annotations.Nullable()
            com.homeretreat.planner.data.local.entity.ScheduleBlock nextBlock, boolean mealCutoffApproaching) {
            }
            
            public final int getDay() {
                return 0;
            }
            
            public final int getTotalDays() {
                return 0;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.homeretreat.planner.data.local.entity.ScheduleBlock getCurrentBlock() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.homeretreat.planner.data.local.entity.ScheduleBlock getNextBlock() {
                return null;
            }
            
            public final boolean getMealCutoffApproaching() {
                return false;
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int component2() {
                return 0;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.homeretreat.planner.data.local.entity.ScheduleBlock component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.homeretreat.planner.data.local.entity.ScheduleBlock component4() {
                return null;
            }
            
            public final boolean component5() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.homeretreat.planner.ui.widget.RetreatWidget.WidgetData.Active copy(int day, int totalDays, @org.jetbrains.annotations.Nullable()
            com.homeretreat.planner.data.local.entity.ScheduleBlock currentBlock, @org.jetbrains.annotations.Nullable()
            com.homeretreat.planner.data.local.entity.ScheduleBlock nextBlock, boolean mealCutoffApproaching) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/homeretreat/planner/ui/widget/RetreatWidget$WidgetData$NoRetreat;", "Lcom/homeretreat/planner/ui/widget/RetreatWidget$WidgetData;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class NoRetreat extends com.homeretreat.planner.ui.widget.RetreatWidget.WidgetData {
            @org.jetbrains.annotations.NotNull()
            public static final com.homeretreat.planner.ui.widget.RetreatWidget.WidgetData.NoRetreat INSTANCE = null;
            
            private NoRetreat() {
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
    }
}