package com.homeretreat.planner.ui.preparation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J0\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\tJ\u0006\u0010$\u001a\u00020\u001cJ\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u000fJ\b\u0010\'\u001a\u00020\u001cH\u0002R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011\u00a8\u0006("}, d2 = {"Lcom/homeretreat/planner/ui/preparation/ScheduleBuilderViewModel;", "Landroidx/lifecycle/ViewModel;", "scheduleRepository", "Lcom/homeretreat/planner/data/repository/ScheduleRepository;", "retreatRepository", "Lcom/homeretreat/planner/data/repository/RetreatRepository;", "(Lcom/homeretreat/planner/data/repository/ScheduleRepository;Lcom/homeretreat/planner/data/repository/RetreatRepository;)V", "_error", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_validationResult", "Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult;", "blocks", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/homeretreat/planner/data/local/entity/ScheduleBlock;", "getBlocks", "()Lkotlinx/coroutines/flow/StateFlow;", "error", "getError", "<set-?>", "", "totalDays", "getTotalDays", "()I", "validationResult", "getValidationResult", "addBlock", "", "dayOffset", "activityType", "Lcom/homeretreat/planner/data/model/ActivityType;", "startTime", "Ljava/time/LocalTime;", "endTime", "notes", "clearError", "removeBlock", "block", "validateSchedule", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ScheduleBuilderViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.ScheduleRepository scheduleRepository = null;
    private int totalDays = 3;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.homeretreat.planner.data.local.entity.ScheduleBlock>> blocks = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.homeretreat.planner.data.repository.ScheduleRepository.ScheduleValidationResult> _validationResult = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.data.repository.ScheduleRepository.ScheduleValidationResult> validationResult = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _error = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> error = null;
    
    @javax.inject.Inject()
    public ScheduleBuilderViewModel(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.ScheduleRepository scheduleRepository, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.RetreatRepository retreatRepository) {
        super();
    }
    
    public final int getTotalDays() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.homeretreat.planner.data.local.entity.ScheduleBlock>> getBlocks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.data.repository.ScheduleRepository.ScheduleValidationResult> getValidationResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getError() {
        return null;
    }
    
    public final void addBlock(int dayOffset, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.ActivityType activityType, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime startTime, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime endTime, @org.jetbrains.annotations.Nullable()
    java.lang.String notes) {
    }
    
    public final void clearError() {
    }
    
    public final void removeBlock(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.ScheduleBlock block) {
    }
    
    private final void validateSchedule() {
    }
}