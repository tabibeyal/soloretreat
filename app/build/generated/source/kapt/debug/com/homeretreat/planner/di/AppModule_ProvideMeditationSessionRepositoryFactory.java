package com.homeretreat.planner.di;

import com.homeretreat.planner.data.local.dao.MeditationSessionDao;
import com.homeretreat.planner.data.repository.MeditationSessionRepository;
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
public final class AppModule_ProvideMeditationSessionRepositoryFactory implements Factory<MeditationSessionRepository> {
  private final Provider<MeditationSessionDao> meditationSessionDaoProvider;

  public AppModule_ProvideMeditationSessionRepositoryFactory(
      Provider<MeditationSessionDao> meditationSessionDaoProvider) {
    this.meditationSessionDaoProvider = meditationSessionDaoProvider;
  }

  @Override
  public MeditationSessionRepository get() {
    return provideMeditationSessionRepository(meditationSessionDaoProvider.get());
  }

  public static AppModule_ProvideMeditationSessionRepositoryFactory create(
      Provider<MeditationSessionDao> meditationSessionDaoProvider) {
    return new AppModule_ProvideMeditationSessionRepositoryFactory(meditationSessionDaoProvider);
  }

  public static MeditationSessionRepository provideMeditationSessionRepository(
      MeditationSessionDao meditationSessionDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideMeditationSessionRepository(meditationSessionDao));
  }
}
