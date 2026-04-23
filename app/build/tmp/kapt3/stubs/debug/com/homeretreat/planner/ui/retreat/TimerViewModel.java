package com.homeretreat.planner.ui.retreat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0002J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010\u0016\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/homeretreat/planner/ui/retreat/TimerViewModel;", "Landroidx/lifecycle/ViewModel;", "engine", "Lcom/homeretreat/planner/service/TimerEngine;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/homeretreat/planner/service/TimerEngine;Landroidx/lifecycle/SavedStateHandle;)V", "initialActivityType", "", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/homeretreat/planner/service/TimerEngine$TimerState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "abandonSession", "", "getActivityLabel", "type", "selectDuration", "minutes", "", "startTimer", "togglePause", "Companion", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class TimerViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.service.TimerEngine engine = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String initialActivityType = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.service.TimerEngine.TimerState> state = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.homeretreat.planner.ui.retreat.TimerViewModel.Companion Companion = null;
    
    @javax.inject.Inject()
    public TimerViewModel(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.service.TimerEngine engine, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.service.TimerEngine.TimerState> getState() {
        return null;
    }
    
    public final void selectDuration(int minutes) {
    }
    
    public final void startTimer() {
    }
    
    public final void togglePause() {
    }
    
    public final void abandonSession() {
    }
    
    private final java.lang.String getActivityLabel(java.lang.String type) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/homeretreat/planner/ui/retreat/TimerViewModel$Companion;", "", "()V", "formatSeconds", "", "totalSeconds", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String formatSeconds(long totalSeconds) {
            return null;
        }
    }
}