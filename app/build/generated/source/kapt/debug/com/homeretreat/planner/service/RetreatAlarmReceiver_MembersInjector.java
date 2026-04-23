package com.homeretreat.planner.service;

import com.homeretreat.planner.data.repository.RetreatRepository;
import com.homeretreat.planner.data.repository.ScheduleRepository;
import com.homeretreat.planner.util.NotificationHelper;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@QualifierMetadata
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
public final class RetreatAlarmReceiver_MembersInjector implements MembersInjector<RetreatAlarmReceiver> {
  private final Provider<RetreatRepository> retreatRepositoryProvider;

  private final Provider<ScheduleRepository> scheduleRepositoryProvider;

  private final Provider<NotificationHelper> notificationHelperProvider;

  private final Provider<RetreatAlarmScheduler> schedulerProvider;

  public RetreatAlarmReceiver_MembersInjector(Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<ScheduleRepository> scheduleRepositoryProvider,
      Provider<NotificationHelper> notificationHelperProvider,
      Provider<RetreatAlarmScheduler> schedulerProvider) {
    this.retreatRepositoryProvider = retreatRepositoryProvider;
    this.scheduleRepositoryProvider = scheduleRepositoryProvider;
    this.notificationHelperProvider = notificationHelperProvider;
    this.schedulerProvider = schedulerProvider;
  }

  public static MembersInjector<RetreatAlarmReceiver> create(
      Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<ScheduleRepository> scheduleRepositoryProvider,
      Provider<NotificationHelper> notificationHelperProvider,
      Provider<RetreatAlarmScheduler> schedulerProvider) {
    return new RetreatAlarmReceiver_MembersInjector(retreatRepositoryProvider, scheduleRepositoryProvider, notificationHelperProvider, schedulerProvider);
  }

  @Override
  public void injectMembers(RetreatAlarmReceiver instance) {
    injectRetreatRepository(instance, retreatRepositoryProvider.get());
    injectScheduleRepository(instance, scheduleRepositoryProvider.get());
    injectNotificationHelper(instance, notificationHelperProvider.get());
    injectScheduler(instance, schedulerProvider.get());
  }

  @InjectedFieldSignature("com.homeretreat.planner.service.RetreatAlarmReceiver.retreatRepository")
  public static void injectRetreatRepository(RetreatAlarmReceiver instance,
      RetreatRepository retreatRepository) {
    instance.retreatRepository = retreatRepository;
  }

  @InjectedFieldSignature("com.homeretreat.planner.service.RetreatAlarmReceiver.scheduleRepository")
  public static void injectScheduleRepository(RetreatAlarmReceiver instance,
      ScheduleRepository scheduleRepository) {
    instance.scheduleRepository = scheduleRepository;
  }

  @InjectedFieldSignature("com.homeretreat.planner.service.RetreatAlarmReceiver.notificationHelper")
  public static void injectNotificationHelper(RetreatAlarmReceiver instance,
      NotificationHelper notificationHelper) {
    instance.notificationHelper = notificationHelper;
  }

  @InjectedFieldSignature("com.homeretreat.planner.service.RetreatAlarmReceiver.scheduler")
  public static void injectScheduler(RetreatAlarmReceiver instance,
      RetreatAlarmScheduler scheduler) {
    instance.scheduler = scheduler;
  }
}
