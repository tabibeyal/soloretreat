package com.homeretreat.planner.service;

import android.content.Context;
import com.homeretreat.planner.data.repository.ScheduleRepository;
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
public final class RetreatAlarmScheduler_Factory implements Factory<RetreatAlarmScheduler> {
  private final Provider<Context> contextProvider;

  private final Provider<ScheduleRepository> scheduleRepositoryProvider;

  public RetreatAlarmScheduler_Factory(Provider<Context> contextProvider,
      Provider<ScheduleRepository> scheduleRepositoryProvider) {
    this.contextProvider = contextProvider;
    this.scheduleRepositoryProvider = scheduleRepositoryProvider;
  }

  @Override
  public RetreatAlarmScheduler get() {
    return newInstance(contextProvider.get(), scheduleRepositoryProvider.get());
  }

  public static RetreatAlarmScheduler_Factory create(Provider<Context> contextProvider,
      Provider<ScheduleRepository> scheduleRepositoryProvider) {
    return new RetreatAlarmScheduler_Factory(contextProvider, scheduleRepositoryProvider);
  }

  public static RetreatAlarmScheduler newInstance(Context context,
      ScheduleRepository scheduleRepository) {
    return new RetreatAlarmScheduler(context, scheduleRepository);
  }
}
