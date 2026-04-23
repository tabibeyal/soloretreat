package com.homeretreat.planner.ui.retreat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/homeretreat/planner/ui/retreat/MealLogViewModel;", "Landroidx/lifecycle/ViewModel;", "mealLogRepository", "Lcom/homeretreat/planner/data/repository/MealLogRepository;", "(Lcom/homeretreat/planner/data/repository/MealLogRepository;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/homeretreat/planner/ui/retreat/MealLogViewModel$MealLogState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "today", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "logMeal", "", "MealLogState", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class MealLogViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.MealLogRepository mealLogRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.homeretreat.planner.ui.retreat.MealLogViewModel.MealLogState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.ui.retreat.MealLogViewModel.MealLogState> state = null;
    private final java.time.LocalDate today = null;
    
    @javax.inject.Inject()
    public MealLogViewModel(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.MealLogRepository mealLogRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.ui.retreat.MealLogViewModel.MealLogState> getState() {
        return null;
    }
    
    public final void logMeal() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/homeretreat/planner/ui/retreat/MealLogViewModel$MealLogState;", "", "log", "Lcom/homeretreat/planner/data/local/entity/MealLog;", "mealLogged", "", "cutoffApproaching", "(Lcom/homeretreat/planner/data/local/entity/MealLog;ZZ)V", "getCutoffApproaching", "()Z", "getLog", "()Lcom/homeretreat/planner/data/local/entity/MealLog;", "getMealLogged", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class MealLogState {
        @org.jetbrains.annotations.Nullable()
        private final com.homeretreat.planner.data.local.entity.MealLog log = null;
        private final boolean mealLogged = false;
        private final boolean cutoffApproaching = false;
        
        public MealLogState(@org.jetbrains.annotations.Nullable()
        com.homeretreat.planner.data.local.entity.MealLog log, boolean mealLogged, boolean cutoffApproaching) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.homeretreat.planner.data.local.entity.MealLog getLog() {
            return null;
        }
        
        public final boolean getMealLogged() {
            return false;
        }
        
        public final boolean getCutoffApproaching() {
            return false;
        }
        
        public MealLogState() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.homeretreat.planner.data.local.entity.MealLog component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.homeretreat.planner.ui.retreat.MealLogViewModel.MealLogState copy(@org.jetbrains.annotations.Nullable()
        com.homeretreat.planner.data.local.entity.MealLog log, boolean mealLogged, boolean cutoffApproaching) {
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