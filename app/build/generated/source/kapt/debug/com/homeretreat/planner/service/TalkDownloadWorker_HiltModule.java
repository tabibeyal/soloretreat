package com.homeretreat.planner.service;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.processing.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(SingletonComponent.class)
@OriginatingElement(
    topLevelClass = TalkDownloadWorker.class
)
public interface TalkDownloadWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.homeretreat.planner.service.TalkDownloadWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(
      TalkDownloadWorker_AssistedFactory factory);
}
