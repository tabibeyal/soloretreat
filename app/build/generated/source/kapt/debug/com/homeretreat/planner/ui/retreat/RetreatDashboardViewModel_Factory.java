package com.homeretreat.planner.ui.retreat;

import android.content.Context;
import com.homeretreat.planner.data.repository.RetreatRepository;
import com.homeretreat.planner.data.repository.ScheduleRepository;
import com.homeretreat.planner.service.RetreatAlarmScheduler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class RetreatDashboardViewModel_Factory implements Factory<RetreatDashboardViewModel> {
  private final Provider<RetreatRepository> retreatRepositoryProvider;

  private final Provider<ScheduleRepository> scheduleRepositoryProvider;

  private final Provider<RetreatAlarmScheduler> alarmSchedulerProvider;

  private final Provider<Context> contextProvider;

  public RetreatDashboardViewModel_Factory(Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<ScheduleRepository> scheduleRepositoryProvider,
      Provider<RetreatAlarmScheduler> alarmSchedulerProvider, Provider<Context> contextProvider) {
    this.retreatRepositoryProvider = retreatRepositoryProvider;
    this.scheduleRepositoryProvider = scheduleRepositoryProvider;
    this.alarmSchedulerProvider = alarmSchedulerProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public RetreatDashboardViewModel get() {
    return newInstance(retreatRepositoryProvider.get(), scheduleRepositoryProvider.get(), alarmSchedulerProvider.get(), contextProvider.get());
  }

  public static RetreatDashboardViewModel_Factory create(
      Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<ScheduleRepository> scheduleRepositoryProvider,
      Provider<RetreatAlarmScheduler> alarmSchedulerProvider, Provider<Context> contextProvider) {
    return new RetreatDashboardViewModel_Factory(retreatRepositoryProvider, scheduleRepositoryProvider, alarmSchedulerProvider, contextProvider);
  }

  public static RetreatDashboardViewModel newInstance(RetreatRepository retreatRepository,
      ScheduleRepository scheduleRepository, RetreatAlarmScheduler alarmScheduler,
      Context context) {
    return new RetreatDashboardViewModel(retreatRepository, scheduleRepository, alarmScheduler, context);
  }
}
