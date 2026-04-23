package com.homeretreat.planner.service;

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
public final class MeditationTimerService_MembersInjector implements MembersInjector<MeditationTimerService> {
  private final Provider<TimerEngine> timerEngineProvider;

  private final Provider<NotificationHelper> notificationHelperProvider;

  public MeditationTimerService_MembersInjector(Provider<TimerEngine> timerEngineProvider,
      Provider<NotificationHelper> notificationHelperProvider) {
    this.timerEngineProvider = timerEngineProvider;
    this.notificationHelperProvider = notificationHelperProvider;
  }

  public static MembersInjector<MeditationTimerService> create(
      Provider<TimerEngine> timerEngineProvider,
      Provider<NotificationHelper> notificationHelperProvider) {
    return new MeditationTimerService_MembersInjector(timerEngineProvider, notificationHelperProvider);
  }

  @Override
  public void injectMembers(MeditationTimerService instance) {
    injectTimerEngine(instance, timerEngineProvider.get());
    injectNotificationHelper(instance, notificationHelperProvider.get());
  }

  @InjectedFieldSignature("com.homeretreat.planner.service.MeditationTimerService.timerEngine")
  public static void injectTimerEngine(MeditationTimerService instance, TimerEngine timerEngine) {
    instance.timerEngine = timerEngine;
  }

  @InjectedFieldSignature("com.homeretreat.planner.service.MeditationTimerService.notificationHelper")
  public static void injectNotificationHelper(MeditationTimerService instance,
      NotificationHelper notificationHelper) {
    instance.notificationHelper = notificationHelper;
  }
}
