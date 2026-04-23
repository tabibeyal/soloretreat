package com.homeretreat.planner.data.model;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\b"}, d2 = {"Lcom/homeretreat/planner/data/model/DownloadStatus;", "", "(Ljava/lang/String;I)V", "NOT_STARTED", "IN_PROGRESS", "COMPLETE", "FAILED", "Companion", "app_debug"})
public enum DownloadStatus {
    /*public static final*/ NOT_STARTED /* = new NOT_STARTED() */,
    /*public static final*/ IN_PROGRESS /* = new IN_PROGRESS() */,
    /*public static final*/ COMPLETE /* = new COMPLETE() */,
    /*public static final*/ FAILED /* = new FAILED() */;
    @org.jetbrains.annotations.NotNull()
    public static final com.homeretreat.planner.data.model.DownloadStatus.Companion Companion = null;
    
    DownloadStatus() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.homeretreat.planner.data.model.DownloadStatus> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/homeretreat/planner/data/model/DownloadStatus$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/homeretreat/planner/data/model/DownloadStatus;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.homeretreat.planner.data.model.DownloadStatus> serializer() {
            return null;
        }
    }
}