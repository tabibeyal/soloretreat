package com.homeretreat.planner.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0017\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0018\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0002\u0010\tJ(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0086@\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/homeretreat/planner/data/repository/TalkRepository;", "", "talkDao", "Lcom/homeretreat/planner/data/local/dao/DhammaTalkDao;", "context", "Landroid/content/Context;", "(Lcom/homeretreat/planner/data/local/dao/DhammaTalkDao;Landroid/content/Context;)V", "areAllTalksDownloaded", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTalks", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/homeretreat/planner/data/local/entity/DhammaTalk;", "getDownloadedTalks", "getTalkById", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTalksDirectory", "Ljava/io/File;", "importCatalogFromAssets", "", "insertDefaultCatalog", "refreshCatalog", "updateDownloadStatus", "status", "Lcom/homeretreat/planner/data/model/DownloadStatus;", "localPath", "(Ljava/lang/String;Lcom/homeretreat/planner/data/model/DownloadStatus;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TalkRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.DhammaTalkDao talkDao = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public TalkRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.DhammaTalkDao talkDao, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.DhammaTalk>> getAllTalks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDownloadedTalks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.homeretreat.planner.data.local.entity.DhammaTalk>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTalkById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.DhammaTalk> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object areAllTalksDownloaded(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshCatalog(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object importCatalogFromAssets(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateDownloadStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.DownloadStatus status, @org.jetbrains.annotations.Nullable()
    java.lang.String localPath, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getTalksDirectory() {
        return null;
    }
    
    private final java.lang.Object insertDefaultCatalog(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}