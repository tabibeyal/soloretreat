package com.homeretreat.planner.ui;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<RetreatRepository> retreatRepositoryProvider;

  public MainActivity_MembersInjector(Provider<RetreatRepository> retreatRepositoryProvider) {
    this.retreatRepositoryProvider = retreatRepositoryProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<RetreatRepository> retreatRepositoryProvider) {
    return new MainActivity_MembersInjector(retreatRepositoryProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectRetreatRepository(instance, retreatRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.homeretreat.planner.ui.MainActivity.retreatRepository")
  public static void injectRetreatRepository(MainActivity instance,
      RetreatRepository retreatRepository) {
    instance.retreatRepository = retreatRepository;
  }
}
