package com.homeretreat.planner.ui.preparation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0015J\b\u0010\u001b\u001a\u00020\u0015H\u0002R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/homeretreat/planner/ui/preparation/PreparationViewModel;", "Landroidx/lifecycle/ViewModel;", "retreatRepository", "Lcom/homeretreat/planner/data/repository/RetreatRepository;", "scheduleRepository", "Lcom/homeretreat/planner/data/repository/ScheduleRepository;", "talkRepository", "Lcom/homeretreat/planner/data/repository/TalkRepository;", "alarmScheduler", "Lcom/homeretreat/planner/service/RetreatAlarmScheduler;", "context", "Landroid/content/Context;", "(Lcom/homeretreat/planner/data/repository/RetreatRepository;Lcom/homeretreat/planner/data/repository/ScheduleRepository;Lcom/homeretreat/planner/data/repository/TalkRepository;Lcom/homeretreat/planner/service/RetreatAlarmScheduler;Landroid/content/Context;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/homeretreat/planner/ui/preparation/PreparationViewModel$PreparationState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "createRetreat", "", "startDate", "Ljava/time/LocalDate;", "endDate", "resetRetreat", "startRetreat", "updateWidget", "PreparationState", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class PreparationViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.RetreatRepository retreatRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.ScheduleRepository scheduleRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.TalkRepository talkRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.service.RetreatAlarmScheduler alarmScheduler = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.homeretreat.planner.ui.preparation.PreparationViewModel.PreparationState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.ui.preparation.PreparationViewModel.PreparationState> state = null;
    
    @javax.inject.Inject()
    public PreparationViewModel(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.RetreatRepository retreatRepository, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.ScheduleRepository scheduleRepository, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.TalkRepository talkRepository, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.service.RetreatAlarmScheduler alarmScheduler, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.ui.preparation.PreparationViewModel.PreparationState> getState() {
        return null;
    }
    
    public final void createRetreat(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate startDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate endDate) {
    }
    
    public final void startRetreat() {
    }
    
    public final void resetRetreat() {
    }
    
    private final void updateWidget() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\nH\u00c6\u0003JI\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/homeretreat/planner/ui/preparation/PreparationViewModel$PreparationState;", "", "config", "Lcom/homeretreat/planner/data/local/entity/RetreatConfig;", "checklistItems", "", "Lcom/homeretreat/planner/data/local/entity/ChecklistItem;", "talks", "Lcom/homeretreat/planner/data/local/entity/DhammaTalk;", "hasSchedule", "", "isLoading", "(Lcom/homeretreat/planner/data/local/entity/RetreatConfig;Ljava/util/List;Ljava/util/List;ZZ)V", "getChecklistItems", "()Ljava/util/List;", "getConfig", "()Lcom/homeretreat/planner/data/local/entity/RetreatConfig;", "getHasSchedule", "()Z", "getTalks", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class PreparationState {
        @org.jetbrains.annotations.Nullable()
        private final com.homeretreat.planner.data.local.entity.RetreatConfig config = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.homeretreat.planner.data.local.entity.ChecklistItem> checklistItems = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.homeretreat.planner.data.local.entity.DhammaTalk> talks = null;
        private final boolean hasSchedule = false;
        private final boolean isLoading = false;
        
        public PreparationState(@org.jetbrains.annotations.Nullable()
        com.homeretreat.planner.data.local.entity.RetreatConfig config, @org.jetbrains.annotations.NotNull()
        java.util.List<com.homeretreat.planner.data.local.entity.ChecklistItem> checklistItems, @org.jetbrains.annotations.NotNull()
        java.util.List<com.homeretreat.planner.data.local.entity.DhammaTalk> talks, boolean hasSchedule, boolean isLoading) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.homeretreat.planner.data.local.entity.RetreatConfig getConfig() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.homeretreat.planner.data.local.entity.ChecklistItem> getChecklistItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.homeretreat.planner.data.local.entity.DhammaTalk> getTalks() {
            return null;
        }
        
        public final boolean getHasSchedule() {
            return false;
        }
        
        public final boolean isLoading() {
            return false;
        }
        
        public PreparationState() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.homeretreat.planner.data.local.entity.RetreatConfig component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.homeretreat.planner.data.local.entity.ChecklistItem> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.homeretreat.planner.data.local.entity.DhammaTalk> component3() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean component5() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.homeretreat.planner.ui.preparation.PreparationViewModel.PreparationState copy(@org.jetbrains.annotations.Nullable()
        com.homeretreat.planner.data.local.entity.RetreatConfig config, @org.jetbrains.annotations.NotNull()
        java.util.List<com.homeretreat.planner.data.local.entity.ChecklistItem> checklistItems, @org.jetbrains.annotations.NotNull()
        java.util.List<com.homeretreat.planner.data.local.entity.DhammaTalk> talks, boolean hasSchedule, boolean isLoading) {
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