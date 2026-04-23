package com.homeretreat.planner.service;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class TimerEngine_Factory implements Factory<TimerEngine> {
  private final Provider<Context> contextProvider;

  private final Provider<BellManager> bellManagerProvider;

  public TimerEngine_Factory(Provider<Context> contextProvider,
      Provider<BellManager> bellManagerProvider) {
    this.contextProvider = contextProvider;
    this.bellManagerProvider = bellManagerProvider;
  }

  @Override
  public TimerEngine get() {
    return newInstance(contextProvider.get(), bellManagerProvider.get());
  }

  public static TimerEngine_Factory create(Provider<Context> contextProvider,
      Provider<BellManager> bellManagerProvider) {
    return new TimerEngine_Factory(contextProvider, bellManagerProvider);
  }

  public static TimerEngine newInstance(Context context, BellManager bellManager) {
    return new TimerEngine(context, bellManager);
  }
}
