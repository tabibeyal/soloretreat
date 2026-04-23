package com.homeretreat.planner.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u0010J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010\u0016J\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/homeretreat/planner/data/repository/JournalRepository;", "", "journalEntryDao", "Lcom/homeretreat/planner/data/local/dao/JournalEntryDao;", "(Lcom/homeretreat/planner/data/local/dao/JournalEntryDao;)V", "createEntry", "Lcom/homeretreat/planner/data/local/entity/JournalEntry;", "text", "", "tags", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEntry", "", "entry", "(Lcom/homeretreat/planner/data/local/entity/JournalEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllEntries", "Lkotlinx/coroutines/flow/Flow;", "", "getEntriesForRange", "start", "Ljava/time/Instant;", "end", "(Ljava/time/Instant;Ljava/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEntriesForRangeFlow", "getEntryById", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateEntry", "app_debug"})
public final class JournalRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.local.dao.JournalEntryDao journalEntryDao = null;
    
    @javax.inject.Inject()
    public JournalRepository(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.dao.JournalEntryDao journalEntryDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.JournalEntry>> getAllEntries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEntryById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.JournalEntry> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.homeretreat.planner.data.local.entity.JournalEntry> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateEntry(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.JournalEntry entry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteEntry(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.JournalEntry entry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.JournalEntry>> getEntriesForRangeFlow(@org.jetbrains.annotations.NotNull()
    java.time.Instant start, @org.jetbrains.annotations.NotNull()
    java.time.Instant end) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEntriesForRange(@org.jetbrains.annotations.NotNull()
    java.time.Instant start, @org.jetbrains.annotations.NotNull()
    java.time.Instant end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.homeretreat.planner.data.local.entity.JournalEntry>> $completion) {
        return null;
    }
}