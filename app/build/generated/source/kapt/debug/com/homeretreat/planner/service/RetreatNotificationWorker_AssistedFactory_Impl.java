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
public final class RetreatNotificationWorker_AssistedFactory_Impl implements RetreatNotificationWorker_AssistedFactory {
  private final RetreatNotificationWorker_Factory delegateFactory;

  RetreatNotificationWorker_AssistedFactory_Impl(
      RetreatNotificationWorker_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public RetreatNotificationWorker create(Context arg0, WorkerParameters arg1) {
    return delegateFactory.get(arg0, arg1);
  }

  public static Provider<RetreatNotificationWorker_AssistedFactory> create(
      RetreatNotificationWorker_Factory delegateFactory) {
    return InstanceFactory.create(new RetreatNotificationWorker_AssistedFactory_Impl(delegateFactory));
  }

  public static dagger.internal.Provider<RetreatNotificationWorker_AssistedFactory> createFactoryProvider(
      RetreatNotificationWorker_Factory delegateFactory) {
    return InstanceFactory.create(new RetreatNotificationWorker_AssistedFactory_Impl(delegateFactory));
  }
}
