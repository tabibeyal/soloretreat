package com.homeretreat.planner.service;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class TalkDownloadWorker_AssistedFactory_Impl implements TalkDownloadWorker_AssistedFactory {
  private final TalkDownloadWorker_Factory delegateFactory;

  TalkDownloadWorker_AssistedFactory_Impl(TalkDownloadWorker_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public TalkDownloadWorker create(Context arg0, WorkerParameters arg1) {
    return delegateFactory.get(arg0, arg1);
  }

  public static Provider<TalkDownloadWorker_AssistedFactory> create(
      TalkDownloadWorker_Factory delegateFactory) {
    return InstanceFactory.create(new TalkDownloadWorker_AssistedFactory_Impl(delegateFactory));
  }

  public static dagger.internal.Provider<TalkDownloadWorker_AssistedFactory> createFactoryProvider(
      TalkDownloadWorker_Factory delegateFactory) {
    return InstanceFactory.create(new TalkDownloadWorker_AssistedFactory_Impl(delegateFactory));
  }
}
