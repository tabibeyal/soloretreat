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
public final class BootCompletedReceiver_MembersInjector implements MembersInjector<BootCompletedReceiver> {
  private final Provider<RetreatRepository> retreatRepositoryProvider;

  private final Provider<RetreatAlarmScheduler> schedulerProvider;

  public BootCompletedReceiver_MembersInjector(
      Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<RetreatAlarmScheduler> schedulerProvider) {
    this.retreatRepositoryProvider = retreatRepositoryProvider;
    this.schedulerProvider = schedulerProvider;
  }

  public static MembersInjector<BootCompletedReceiver> create(
      Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<RetreatAlarmScheduler> schedulerProvider) {
    return new BootCompletedReceiver_MembersInjector(retreatRepositoryProvider, schedulerProvider);
  }

  @Override
  public void injectMembers(BootCompletedReceiver instance) {
    injectRetreatRepository(instance, retreatRepositoryProvider.get());
    injectScheduler(instance, schedulerProvider.get());
  }

  @InjectedFieldSignature("com.homeretreat.planner.service.BootCompletedReceiver.retreatRepository")
  public static void injectRetreatRepository(BootCompletedReceiver instance,
      RetreatRepository retreatRepository) {
    instance.retreatRepository = retreatRepository;
  }

  @InjectedFieldSignature("com.homeretreat.planner.service.BootCompletedReceiver.scheduler")
  public static void injectScheduler(BootCompletedReceiver instance,
      RetreatAlarmScheduler scheduler) {
    instance.scheduler = scheduler;
  }
}
