package com.homeretreat.planner.di;

import com.homeretreat.planner.data.local.dao.PreceptLogDao;
import com.homeretreat.planner.data.repository.PreceptRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvidePreceptRepositoryFactory implements Factory<PreceptRepository> {
  private final Provider<PreceptLogDao> preceptLogDaoProvider;

  public AppModule_ProvidePreceptRepositoryFactory(Provider<PreceptLogDao> preceptLogDaoProvider) {
    this.preceptLogDaoProvider = preceptLogDaoProvider;
  }

  @Override
  public PreceptRepository get() {
    return providePreceptRepository(preceptLogDaoProvider.get());
  }

  public static AppModule_ProvidePreceptRepositoryFactory create(
      Provider<PreceptLogDao> preceptLogDaoProvider) {
    return new AppModule_ProvidePreceptRepositoryFactory(preceptLogDaoProvider);
  }

  public static PreceptRepository providePreceptRepository(PreceptLogDao preceptLogDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePreceptRepository(preceptLogDao));
  }
}
