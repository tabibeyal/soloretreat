package com.homeretreat.planner.ui.integration;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lcom/homeretreat/planner/ui/integration/RetreatSummaryViewModel;", "Landroidx/lifecycle/ViewModel;", "retreatRepository", "Lcom/homeretreat/planner/data/repository/RetreatRepository;", "meditationSessionRepository", "Lcom/homeretreat/planner/data/repository/MeditationSessionRepository;", "preceptRepository", "Lcom/homeretreat/planner/data/repository/PreceptRepository;", "mealLogRepository", "Lcom/homeretreat/planner/data/repository/MealLogRepository;", "(Lcom/homeretreat/planner/data/repository/RetreatRepository;Lcom/homeretreat/planner/data/repository/MeditationSessionRepository;Lcom/homeretreat/planner/data/repository/PreceptRepository;Lcom/homeretreat/planner/data/repository/MealLogRepository;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/homeretreat/planner/ui/integration/RetreatSummaryViewModel$SummaryState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "generateExportText", "", "SummaryState", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class RetreatSummaryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.RetreatRepository retreatRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.MeditationSessionRepository meditationSessionRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.PreceptRepository preceptRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.MealLogRepository mealLogRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.homeretreat.planner.ui.integration.RetreatSummaryViewModel.SummaryState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.ui.integration.RetreatSummaryViewModel.SummaryState> state = null;
    
    @javax.inject.Inject()
    public RetreatSummaryViewModel(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.RetreatRepository retreatRepository, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.MeditationSessionRepository meditationSessionRepository, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.PreceptRepository preceptRepository, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.MealLogRepository mealLogRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.ui.integration.RetreatSummaryViewModel.SummaryState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String generateExportText() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\t\u0010#\u001a\u00020\tH\u00c6\u0003J\t\u0010$\u001a\u00020\tH\u00c6\u0003J\t\u0010%\u001a\u00020\fH\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\tH\u00c6\u0003J\t\u0010(\u001a\u00020\u0010H\u00c6\u0003Je\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010*\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\tH\u00d6\u0001J\t\u0010-\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006."}, d2 = {"Lcom/homeretreat/planner/ui/integration/RetreatSummaryViewModel$SummaryState;", "", "config", "Lcom/homeretreat/planner/data/local/entity/RetreatConfig;", "totalMeditationMinutes", "", "formattedMeditationTime", "", "completedSessions", "", "interruptedSessions", "preceptRate", "", "onTimeMeals", "lateMeals", "isLoading", "", "(Lcom/homeretreat/planner/data/local/entity/RetreatConfig;JLjava/lang/String;IIFIIZ)V", "getCompletedSessions", "()I", "getConfig", "()Lcom/homeretreat/planner/data/local/entity/RetreatConfig;", "getFormattedMeditationTime", "()Ljava/lang/String;", "getInterruptedSessions", "()Z", "getLateMeals", "getOnTimeMeals", "getPreceptRate", "()F", "getTotalMeditationMinutes", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
    public static final class SummaryState {
        @org.jetbrains.annotations.Nullable()
        private final com.homeretreat.planner.data.local.entity.RetreatConfig config = null;
        private final long totalMeditationMinutes = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String formattedMeditationTime = null;
        private final int completedSessions = 0;
        private final int interruptedSessions = 0;
        private final float preceptRate = 0.0F;
        private final int onTimeMeals = 0;
        private final int lateMeals = 0;
        private final boolean isLoading = false;
        
        public SummaryState(@org.jetbrains.annotations.Nullable()
        com.homeretreat.planner.data.local.entity.RetreatConfig config, long totalMeditationMinutes, @org.jetbrains.annotations.NotNull()
        java.lang.String formattedMeditationTime, int completedSessions, int interruptedSessions, float preceptRate, int onTimeMeals, int lateMeals, boolean isLoading) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.homeretreat.planner.data.local.entity.RetreatConfig getConfig() {
            return null;
        }
        
        public final long getTotalMeditationMinutes() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFormattedMeditationTime() {
            return null;
        }
        
        public final int getCompletedSessions() {
            return 0;
        }
        
        public final int getInterruptedSessions() {
            return 0;
        }
        
        public final float getPreceptRate() {
            return 0.0F;
        }
        
        public final int getOnTimeMeals() {
            return 0;
        }
        
        public final int getLateMeals() {
            return 0;
        }
        
        public final boolean isLoading() {
            return false;
        }
        
        public SummaryState() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.homeretreat.planner.data.local.entity.RetreatConfig component1() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final float component6() {
            return 0.0F;
        }
        
        public final int component7() {
            return 0;
        }
        
        public final int component8() {
            return 0;
        }
        
        public final boolean component9() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.homeretreat.planner.ui.integration.RetreatSummaryViewModel.SummaryState copy(@org.jetbrains.annotations.Nullable()
        com.homeretreat.planner.data.local.entity.RetreatConfig config, long totalMeditationMinutes, @org.jetbrains.annotations.NotNull()
        java.lang.String formattedMeditationTime, int completedSessions, int interruptedSessions, float preceptRate, int onTimeMeals, int lateMeals, boolean isLoading) {
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