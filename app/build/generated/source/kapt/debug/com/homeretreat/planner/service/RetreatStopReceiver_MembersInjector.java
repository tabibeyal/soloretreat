package com.homeretreat.planner.service;

import com.homeretreat.planner.data.repository.RetreatRepository;
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
public final class RetreatStopReceiver_MembersInjector implements MembersInjector<RetreatStopReceiver> {
  private final Provider<RetreatRepository> retreatRepositoryProvider;

  private final Provider<RetreatAlarmScheduler> schedulerProvider;

  public RetreatStopReceiver_MembersInjector(Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<RetreatAlarmScheduler> schedulerProvider) {
    this.retreatRepositoryProvider = retreatRepositoryProvider;
    this.schedulerProvider = schedulerProvider;
  }

  public static MembersInjector<RetreatStopReceiver> create(
      Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<RetreatAlarmScheduler> schedulerProvider) {
    return new RetreatStopReceiver_MembersInjector(retreatRepositoryProvider, schedulerProvider);
  }

  @Override
  public void injectMembers(RetreatStopReceiver instance) {
    injectRetreatRepository(instance, retreatRepositoryProvider.get());
    injectScheduler(instance, schedulerProvider.get());
  }

  @InjectedFieldSignature("com.homeretreat.planner.service.RetreatStopReceiver.retreatRepository")
  public static void injectRetreatRepository(RetreatStopReceiver instance,
      RetreatRepository retreatRepository) {
    instance.retreatRepository = retreatRepository;
  }

  @InjectedFieldSignature("com.homeretreat.planner.service.RetreatStopReceiver.scheduler")
  public static void injectScheduler(RetreatStopReceiver instance,
      RetreatAlarmScheduler scheduler) {
    instance.scheduler = scheduler;
  }
}
