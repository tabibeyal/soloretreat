package com.homeretreat.planner.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u00a7@\u00a2\u0006\u0002\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/homeretreat/planner/data/local/dao/ChecklistItemDao;", "", "countIncompleteRequired", "", "phase", "Lcom/homeretreat/planner/data/model/Phase;", "(Lcom/homeretreat/planner/data/model/Phase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItemsForPhase", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/homeretreat/planner/data/local/entity/ChecklistItem;", "getItemsForPhaseSync", "insertAll", "items", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "item", "(Lcom/homeretreat/planner/data/local/entity/ChecklistItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCompleted", "id", "", "completed", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface ChecklistItemDao {
    
    @androidx.room.Query(value = "SELECT * FROM checklist_items WHERE phase = :phase ORDER BY sortOrder")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.homeretreat.planner.data.local.entity.ChecklistItem>> getItemsForPhase(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.Phase phase);
    
    @androidx.room.Query(value = "SELECT * FROM checklist_items WHERE phase = :phase ORDER BY sortOrder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getItemsForPhaseSync(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.Phase phase, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.homeretreat.planner.data.local.entity.ChecklistItem>> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM checklist_items WHERE phase = :phase AND required = 1 AND completed = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object countIncompleteRequired(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.model.Phase phase, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "UPDATE checklist_items SET completed = :completed WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateCompleted(@org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean completed, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.homeretreat.planner.data.local.entity.ChecklistItem> items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.local.entity.ChecklistItem item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM checklist_items")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}