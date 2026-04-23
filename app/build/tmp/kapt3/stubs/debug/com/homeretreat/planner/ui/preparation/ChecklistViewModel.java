package com.homeretreat.planner.ui.preparation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/homeretreat/planner/ui/preparation/ChecklistViewModel;", "Landroidx/lifecycle/ViewModel;", "retreatRepository", "Lcom/homeretreat/planner/data/repository/RetreatRepository;", "(Lcom/homeretreat/planner/data/repository/RetreatRepository;)V", "items", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/homeretreat/planner/data/local/entity/ChecklistItem;", "getItems", "()Lkotlinx/coroutines/flow/StateFlow;", "toggleItem", "", "id", "", "completed", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ChecklistViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.homeretreat.planner.data.repository.RetreatRepository retreatRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.homeretreat.planner.data.local.entity.ChecklistItem>> items = null;
    
    @javax.inject.Inject()
    public ChecklistViewModel(@org.jetbrains.annotations.NotNull()
    com.homeretreat.planner.data.repository.RetreatRepository retreatRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.homeretreat.planner.data.local.entity.ChecklistItem>> getItems() {
        return null;
    }
    
    public final void toggleItem(@org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean completed) {
    }
}