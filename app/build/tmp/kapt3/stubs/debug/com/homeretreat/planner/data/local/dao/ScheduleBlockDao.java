package com.homeretreat.planner.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\fH\'J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0003H\'J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\u0013\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u00a7@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/homeretreat/planner/data/local/dao/ScheduleBlockDao;", "", "count", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "block", "Lcom/homeretreat/planner/data/local/entity/ScheduleBlock;", "(Lcom/homeretreat/planner/data/local/entity/ScheduleBlock;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "getAllBlocks", "Lkotlinx/coroutines/flow/Flow;", "", "getBlocksForDay", "dayOffset", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlocksForDayFlow", "insert", "insertAll", "blocks", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
@androidx.room.Dao()
public abstract interface ScheduleBlockDao {
    
    @androidx.room.Query(value = "SELECT * FROM schedule_blocks WHERE retreatId = 1 ORDER BY dayOffset, startTime")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.ScheduleBlock>> getAllBlocks();
    
    @androidx.room.Query(value = "SELECT * FROM schedule_blocks WHERE retreatId = 1 AND dayOffset = :dayOffset ORDER BY startTime")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBlocksForDay(int dayOffset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.homeretreat.planner.data.local.entity.ScheduleBlock>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM schedule_blocks WHERE retreatId = 1 AND dayOffset = :dayOffset ORDER BY startTime")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.ScheduleBlock>> getBlocksForDayFlow(int dayOffset);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.ScheduleBlock block, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.homeretreat.planner.data.local.entity.ScheduleBlock> blocks, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.ScheduleBlock block, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.ScheduleBlock block, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM schedule_blocks WHERE retreatId = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM schedule_blocks WHERE retreatId = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object count(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}