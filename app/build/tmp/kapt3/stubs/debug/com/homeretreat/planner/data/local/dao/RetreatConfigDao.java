package com.homeretreat.planner.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\'J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u00a7@\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/homeretreat/planner/data/local/dao/RetreatConfigDao;", "", "delete", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConfig", "Lkotlinx/coroutines/flow/Flow;", "Lcom/homeretreat/planner/data/local/entity/RetreatConfig;", "getConfigSync", "insert", "config", "(Lcom/homeretreat/planner/data/local/entity/RetreatConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "updatePhase", "phase", "Lcom/homeretreat/planner/data/model/Phase;", "(Lcom/homeretreat/planner/data/model/Phase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTalksDownloaded", "downloaded", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface RetreatConfigDao {
    
    @androidx.room.Query(value = "SELECT * FROM retreat_config WHERE id = 1")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.homeretreat.planner.data.local.entity.RetreatConfig> getConfig();
    
    @androidx.room.Query(value = "SELECT * FROM retreat_config WHERE id = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getConfigSync(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.RetreatConfig> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.RetreatConfig config, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.RetreatConfig config, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE retreat_config SET phase = :phase WHERE id = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updatePhase(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.Phase phase, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE retreat_config SET allTalksDownloaded = :downloaded WHERE id = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateTalksDownloaded(boolean downloaded, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM retreat_config WHERE id = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}