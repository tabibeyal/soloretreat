package com.homeretreat.planner.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0086@\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u0013J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u00132\u0006\u0010\u0015\u001a\u00020\u0016J \u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001cJ \u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010\u001e\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010 \u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010!\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/homeretreat/planner/data/repository/ScheduleRepository;", "", "scheduleBlockDao", "Lcom/homeretreat/planner/data/local/dao/ScheduleBlockDao;", "(Lcom/homeretreat/planner/data/local/dao/ScheduleBlockDao;)V", "addBlock", "", "block", "Lcom/homeretreat/planner/data/local/entity/ScheduleBlock;", "(Lcom/homeretreat/planner/data/local/entity/ScheduleBlock;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addBlocks", "", "blocks", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllBlocks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlock", "getAllBlocks", "Lkotlinx/coroutines/flow/Flow;", "getBlocksForDay", "dayOffset", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlocksForDayFlow", "getCurrentBlock", "currentTime", "Ljava/time/LocalTime;", "(ILjava/time/LocalTime;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNextBlock", "hasBlocks", "updateBlock", "validateBlock", "validateSchedule", "Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult;", "ScheduleValidationResult", "app_debug"})
public final class ScheduleRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.ScheduleBlockDao scheduleBlockDao = null;
    
    @javax.inject.Inject()
    public ScheduleRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.ScheduleBlockDao scheduleBlockDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.ScheduleBlock>> getAllBlocks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBlocksForDay(int dayOffset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.homeretreat.planner.data.local.entity.ScheduleBlock>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.ScheduleBlock>> getBlocksForDayFlow(int dayOffset) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addBlock(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.ScheduleBlock block, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addBlocks(@org.jetbrains.annotations.NotNull()
    java.util.List<com.homeretreat.planner.data.local.entity.ScheduleBlock> blocks, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateBlock(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.ScheduleBlock block, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteBlock(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.ScheduleBlock block, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllBlocks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object hasBlocks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrentBlock(int dayOffset, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime currentTime, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.ScheduleBlock> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNextBlock(int dayOffset, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime currentTime, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.ScheduleBlock> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object validateSchedule(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.repository.ScheduleRepository.ScheduleValidationResult> $completion) {
        return null;
    }
    
    private final java.lang.Object validateBlock(com.homeretreat.planner.data.local.entity.ScheduleBlock block, kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult;", "", "()V", "MealTooLate", "NoBlocks", "Overlap", "Valid", "Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult$MealTooLate;", "Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult$NoBlocks;", "Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult$Overlap;", "Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult$Valid;", "app_debug"})
    public static abstract class ScheduleValidationResult {
        
        private ScheduleValidationResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult$MealTooLate;", "Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult;", "dayOffset", "", "endTime", "Ljava/time/LocalTime;", "(ILjava/time/LocalTime;)V", "getDayOffset", "()I", "getEndTime", "()Ljava/time/LocalTime;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class MealTooLate extends com.homeretreat.planner.data.repository.ScheduleRepository.ScheduleValidationResult {
            private final int dayOffset = 0;
            @org.jetbrains.annotations.NotNull()
            private final java.time.LocalTime endTime = null;
            
            public MealTooLate(int dayOffset, @org.jetbrains.annotations.NotNull()
            java.time.LocalTime endTime) {
            }
            
            public final int getDayOffset() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalTime getEndTime() {
                return null;
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalTime component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.homeretreat.planner.data.repository.ScheduleRepository.ScheduleValidationResult.MealTooLate copy(int dayOffset, @org.jetbrains.annotations.NotNull()
            java.time.LocalTime endTime) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult$NoBlocks;", "Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class NoBlocks extends com.homeretreat.planner.data.repository.ScheduleRepository.ScheduleValidationResult {
            @org.jetbrains.annotations.NotNull()
            public static final com.homeretreat.planner.data.repository.ScheduleRepository.ScheduleValidationResult.NoBlocks INSTANCE = null;
            
            private NoBlocks() {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult$Overlap;", "Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult;", "dayOffset", "", "block1", "", "block2", "(ILjava/lang/String;Ljava/lang/String;)V", "getBlock1", "()Ljava/lang/String;", "getBlock2", "getDayOffset", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
        public static final class Overlap extends com.homeretreat.planner.data.repository.ScheduleRepository.ScheduleValidationResult {
            private final int dayOffset = 0;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String block1 = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String block2 = null;
            
            public Overlap(int dayOffset, @org.jetbrains.annotations.NotNull()
            java.lang.String block1, @org.jetbrains.annotations.NotNull()
            java.lang.String block2) {
            }
            
            public final int getDayOffset() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getBlock1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getBlock2() {
                return null;
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.homeretreat.planner.data.repository.ScheduleRepository.ScheduleValidationResult.Overlap copy(int dayOffset, @org.jetbrains.annotations.NotNull()
            java.lang.String block1, @org.jetbrains.annotations.NotNull()
            java.lang.String block2) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult$Valid;", "Lcom/homeretreat/planner/data/repository/ScheduleRepository$ScheduleValidationResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Valid extends com.homeretreat.planner.data.repository.ScheduleRepository.ScheduleValidationResult {
            @org.jetbrains.annotations.NotNull()
            public static final com.homeretreat.planner.data.repository.ScheduleRepository.ScheduleValidationResult.Valid INSTANCE = null;
            
            private Valid() {
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