package com.homeretreat.planner.ui.preparation;

import android.content.Context;
import com.homeretreat.planner.data.repository.RetreatRepository;
import com.homeretreat.planner.data.repository.ScheduleRepository;
import com.homeretreat.planner.data.repository.TalkRepository;
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
public final class PreparationViewModel_Factory implements Factory<PreparationViewModel> {
  private final Provider<RetreatRepository> retreatRepositoryProvider;

  private final Provider<ScheduleRepository> scheduleRepositoryProvider;

  private final Provider<TalkRepository> talkRepositoryProvider;

  private final Provider<RetreatAlarmScheduler> alarmSchedulerProvider;

  private final Provider<Context> contextProvider;

  public PreparationViewModel_Factory(Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<ScheduleRepository> scheduleRepositoryProvider,
      Provider<TalkRepository> talkRepositoryProvider,
      Provider<RetreatAlarmScheduler> alarmSchedulerProvider, Provider<Context> contextProvider) {
    this.retreatRepositoryProvider = retreatRepositoryProvider;
    this.scheduleRepositoryProvider = scheduleRepositoryProvider;
    this.talkRepositoryProvider = talkRepositoryProvider;
    this.alarmSchedulerProvider = alarmSchedulerProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public PreparationViewModel get() {
    return newInstance(retreatRepositoryProvider.get(), scheduleRepositoryProvider.get(), talkRepositoryProvider.get(), alarmSchedulerProvider.get(), contextProvider.get());
  }

  public static PreparationViewModel_Factory create(
      Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<ScheduleRepository> scheduleRepositoryProvider,
      Provider<TalkRepository> talkRepositoryProvider,
      Provider<RetreatAlarmScheduler> alarmSchedulerProvider, Provider<Context> contextProvider) {
    return new PreparationViewModel_Factory(retreatRepositoryProvider, scheduleRepositoryProvider, talkRepositoryProvider, alarmSchedulerProvider, contextProvider);
  }

  public static PreparationViewModel newInstance(RetreatRepository retreatRepository,
      ScheduleRepository scheduleRepository, TalkRepository talkRepository,
      RetreatAlarmScheduler alarmScheduler, Context context) {
    return new PreparationViewModel(retreatRepository, scheduleRepository, talkRepository, alarmScheduler, context);
  }
}
