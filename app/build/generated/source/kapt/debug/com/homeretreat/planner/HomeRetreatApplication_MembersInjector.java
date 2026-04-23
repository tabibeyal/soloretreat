package com.homeretreat.planner;

import androidx.hilt.work.HiltWorkerFactory;
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
public final class HomeRetreatApplication_MembersInjector implements MembersInjector<HomeRetreatApplication> {
  private final Provider<HiltWorkerFactory> workerFactoryProvider;

  public HomeRetreatApplication_MembersInjector(Provider<HiltWorkerFactory> workerFactoryProvider) {
    this.workerFactoryProvider = workerFactoryProvider;
  }

  public static MembersInjector<HomeRetreatApplication> create(
      Provider<HiltWorkerFactory> workerFactoryProvider) {
    return new HomeRetreatApplication_MembersInjector(workerFactoryProvider);
  }

  @Override
  public void injectMembers(HomeRetreatApplication instance) {
    injectWorkerFactory(instance, workerFactoryProvider.get());
  }

  @InjectedFieldSignature("com.homeretreat.planner.HomeRetreatApplication.workerFactory")
  public static void injectWorkerFactory(HomeRetreatApplication instance,
      HiltWorkerFactory workerFactory) {
    instance.workerFactory = workerFactory;
  }
}
