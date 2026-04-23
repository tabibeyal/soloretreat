package com.homeretreat.planner.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\'J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u0016J(\u0010\u0018\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0097@\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/homeretreat/planner/data/local/dao/DhammaTalkDao;", "", "countPendingDownloads", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "", "getAllTalks", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/homeretreat/planner/data/local/entity/DhammaTalk;", "getDownloadedTalks", "getTalkById", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "talks", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertIgnore", "", "talk", "(Lcom/homeretreat/planner/data/local/entity/DhammaTalk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "updateDownloadStatus", "status", "Lcom/homeretreat/planner/data/model/DownloadStatus;", "path", "(Ljava/lang/String;Lcom/homeretreat/planner/data/model/DownloadStatus;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertPreservingStatus", "app_debug"})
@androidx.room.Dao()
public abstract interface DhammaTalkDao {
    
    @androidx.room.Query(value = "SELECT * FROM dhamma_talks ORDER BY category, title")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.DhammaTalk>> getAllTalks();
    
    @androidx.room.Query(value = "SELECT * FROM dhamma_talks WHERE downloadStatus = \'COMPLETE\'")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDownloadedTalks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.homeretreat.planner.data.local.entity.DhammaTalk>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM dhamma_talks WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTalkById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.DhammaTalk> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM dhamma_talks WHERE downloadStatus != \'COMPLETE\'")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object countPendingDownloads(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.homeretreat.planner.data.local.entity.DhammaTalk> talks, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 5)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertIgnore(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.DhammaTalk talk, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object upsertPreservingStatus(@org.jetbrains.annotations.NotNull()
    java.util.List<com.homeretreat.planner.data.local.entity.DhammaTalk> talks, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.DhammaTalk talk, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE dhamma_talks SET downloadStatus = :status, localPath = :path WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateDownloadStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.DownloadStatus status, @org.jetbrains.annotations.Nullable()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM dhamma_talks")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @androidx.room.Transaction()
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object upsertPreservingStatus(@org.jetbrains.annotations.NotNull()
        com.homeretreat.planner.data.local.dao.DhammaTalkDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<com.homeretreat.planner.data.local.entity.DhammaTalk> talks, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
    }
}