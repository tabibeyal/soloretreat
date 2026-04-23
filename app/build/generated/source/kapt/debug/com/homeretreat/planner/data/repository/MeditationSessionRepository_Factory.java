package com.homeretreat.planner.data.repository;

import com.homeretreat.planner.data.local.dao.MeditationSessionDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class MeditationSessionRepository_Factory implements Factory<MeditationSessionRepository> {
  private final Provider<MeditationSessionDao> meditationSessionDaoProvider;

  public MeditationSessionRepository_Factory(
      Provider<MeditationSessionDao> meditationSessionDaoProvider) {
    this.meditationSessionDaoProvider = meditationSessionDaoProvider;
  }

  @Override
  public MeditationSessionRepository get() {
    return newInstance(meditationSessionDaoProvider.get());
  }

  public static MeditationSessionRepository_Factory create(
      Provider<MeditationSessionDao> meditationSessionDaoProvider) {
    return new MeditationSessionRepository_Factory(meditationSessionDaoProvider);
  }

  public static MeditationSessionRepository newInstance(MeditationSessionDao meditationSessionDao) {
    return new MeditationSessionRepository(meditationSessionDao);
  }
}
