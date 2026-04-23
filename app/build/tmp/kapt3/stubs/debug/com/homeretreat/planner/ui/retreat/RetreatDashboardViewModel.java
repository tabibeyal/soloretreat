package com.homeretreat.planner.ui.retreat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/homeretreat/planner/ui/retreat/RetreatDashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "retreatRepository", "Lcom/homeretreat/planner/data/repository/RetreatRepository;", "scheduleRepository", "Lcom/homeretreat/planner/data/repository/ScheduleRepository;", "alarmScheduler", "Lcom/homeretreat/planner/service/RetreatAlarmScheduler;", "context", "Landroid/content/Context;", "(Lcom/homeretreat/planner/data/repository/RetreatRepository;Lcom/homeretreat/planner/data/repository/ScheduleRepository;Lcom/homeretreat/planner/service/RetreatAlarmScheduler;Landroid/content/Context;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/homeretreat/planner/ui/retreat/RetreatDashboardViewModel$DashboardState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "endRetreat", "", "refreshBlocks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateWidget", "DashboardState", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class RetreatDashboardViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.RetreatRepository retreatRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.ScheduleRepository scheduleRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.service.RetreatAlarmScheduler alarmScheduler = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.homeretreat.planner.ui.retreat.RetreatDashboardViewModel.DashboardState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.ui.retreat.RetreatDashboardViewModel.DashboardState> state = null;
    
    @javax.inject.Inject()
    public RetreatDashboardViewModel(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.RetreatRepository retreatRepository, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.ScheduleRepository scheduleRepository, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.service.RetreatAlarmScheduler alarmScheduler, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.ui.retreat.RetreatDashboardViewModel.DashboardState> getState() {
        return null;
    }
    
    public final void endRetreat() {
    }
    
    private final void updateWidget() {
    }
    
    private final java.lang.Object refreshBlocks(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003JA\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/homeretreat/planner/ui/retreat/RetreatDashboardViewModel$DashboardState;", "", "config", "Lcom/homeretreat/planner/data/local/entity/RetreatConfig;", "currentBlock", "Lcom/homeretreat/planner/data/local/entity/ScheduleBlock;", "nextBlock", "showMealCountdown", "", "mealCutoffApproaching", "(Lcom/homeretreat/planner/data/local/entity/RetreatConfig;Lcom/homeretreat/planner/data/local/entity/ScheduleBlock;Lcom/homeretreat/planner/data/local/entity/ScheduleBlock;ZZ)V", "getConfig", "()Lcom/homeretreat/planner/data/local/entity/RetreatConfig;", "getCurrentBlock", "()Lcom/homeretreat/planner/data/local/entity/ScheduleBlock;", "getMealCutoffApproaching", "()Z", "getNextBlock", "getShowMealCountdown", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class DashboardState {
        @org.jetbrains.annotations.Nullable()
        private final com.homeretreat.planner.data.local.entity.RetreatConfig config = null;
        @org.jetbrains.annotations.Nullable()
        private final com.homeretreat.planner.data.local.entity.ScheduleBlock currentBlock = null;
        @org.jetbrains.annotations.Nullable()
        private final com.homeretreat.planner.data.local.entity.ScheduleBlock nextBlock = null;
        private final boolean showMealCountdown = false;
        private final boolean mealCutoffApproaching = false;
        
        public DashboardState(@org.jetbrains.annotations.Nullable()
        com.homeretreat.planner.data.local.entity.RetreatConfig config, @org.jetbrains.annotations.Nullable()
        com.homeretreat.planner.data.local.entity.ScheduleBlock currentBlock, @org.jetbrains.annotations.Nullable()
        com.homeretreat.planner.data.local.entity.ScheduleBlock nextBlock, boolean showMealCountdown, boolean mealCutoffApproaching) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.homeretreat.planner.data.local.entity.RetreatConfig getConfig() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.homeretreat.planner.data.local.entity.ScheduleBlock getCurrentBlock() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.homeretreat.planner.data.local.entity.ScheduleBlock getNextBlock() {
            return null;
        }
        
        public final boolean getShowMealCountdown() {
            return false;
        }
        
        public final boolean getMealCutoffApproaching() {
            return false;
        }
        
        public DashboardState() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.homeretreat.planner.data.local.entity.RetreatConfig component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.homeretreat.planner.data.local.entity.ScheduleBlock component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.homeretreat.planner.data.local.entity.ScheduleBlock component3() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean component5() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.homeretreat.planner.ui.retreat.RetreatDashboardViewModel.DashboardState copy(@org.jetbrains.annotations.Nullable()
        com.homeretreat.planner.data.local.entity.RetreatConfig config, @org.jetbrains.annotations.Nullable()
        com.homeretreat.planner.data.local.entity.ScheduleBlock currentBlock, @org.jetbrains.annotations.Nullable()
        com.homeretreat.planner.data.local.entity.ScheduleBlock nextBlock, boolean showMealCountdown, boolean mealCutoffApproaching) {
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
}