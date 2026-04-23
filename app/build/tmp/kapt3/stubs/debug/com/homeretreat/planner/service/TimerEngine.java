package com.homeretreat.planner.service;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0017J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0002J\u0006\u0010#\u001a\u00020\u0017R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/homeretreat/planner/service/TimerEngine;", "", "context", "Landroid/content/Context;", "bellManager", "Lcom/homeretreat/planner/service/BellManager;", "(Landroid/content/Context;Lcom/homeretreat/planner/service/BellManager;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/homeretreat/planner/service/TimerEngine$TimerState;", "accumulatedMs", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "segmentStartRealtime", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "tickJob", "Lkotlinx/coroutines/Job;", "totalMs", "abandon", "", "complete", "selectDuration", "minutes", "", "setActivityLabel", "label", "", "start", "startService", "startTicking", "stopService", "togglePause", "TimerState", "app_debug"})
public final class TimerEngine {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.service.BellManager bellManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.homeretreat.planner.service.TimerEngine.TimerState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.service.TimerEngine.TimerState> state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job tickJob;
    private long totalMs = 0L;
    private long accumulatedMs = 0L;
    private long segmentStartRealtime = 0L;
    
    @javax.inject.Inject()
    public TimerEngine(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.service.BellManager bellManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.homeretreat.planner.service.TimerEngine.TimerState> getState() {
        return null;
    }
    
    public final void setActivityLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String label) {
    }
    
    public final void selectDuration(int minutes) {
    }
    
    public final void start() {
    }
    
    public final void togglePause() {
    }
    
    public final void abandon() {
    }
    
    private final void startTicking() {
    }
    
    private final void complete() {
    }
    
    private final void startService() {
    }
    
    private final void stopService() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u00c6\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/homeretreat/planner/service/TimerEngine$TimerState;", "", "activityLabel", "", "selectedMinutes", "", "elapsedSeconds", "", "remainingSeconds", "isRunning", "", "isPaused", "isComplete", "(Ljava/lang/String;IJJZZZ)V", "getActivityLabel", "()Ljava/lang/String;", "getElapsedSeconds", "()J", "formattedTime", "getFormattedTime", "()Z", "getRemainingSeconds", "getSelectedMinutes", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
    public static final class TimerState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String activityLabel = null;
        private final int selectedMinutes = 0;
        private final long elapsedSeconds = 0L;
        private final long remainingSeconds = 0L;
        private final boolean isRunning = false;
        private final boolean isPaused = false;
        private final boolean isComplete = false;
        
        public TimerState(@org.jetbrains.annotations.NotNull()
        java.lang.String activityLabel, int selectedMinutes, long elapsedSeconds, long remainingSeconds, boolean isRunning, boolean isPaused, boolean isComplete) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getActivityLabel() {
            return null;
        }
        
        public final int getSelectedMinutes() {
            return 0;
        }
        
        public final long getElapsedSeconds() {
            return 0L;
        }
        
        public final long getRemainingSeconds() {
            return 0L;
        }
        
        public final boolean isRunning() {
            return false;
        }
        
        public final boolean isPaused() {
            return false;
        }
        
        public final boolean isComplete() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFormattedTime() {
            return null;
        }
        
        public TimerState() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long component4() {
            return 0L;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean component7() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.homeretreat.planner.service.TimerEngine.TimerState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String activityLabel, int selectedMinutes, long elapsedSeconds, long remainingSeconds, boolean isRunning, boolean isPaused, boolean isComplete) {
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