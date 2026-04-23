package com.homeretreat.planner.di;

import com.homeretreat.planner.data.local.HomeRetreatDatabase;
import com.homeretreat.planner.data.local.dao.MeditationSessionDao;
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
public final class AppModule_ProvideMeditationSessionDaoFactory implements Factory<MeditationSessionDao> {
  private final Provider<HomeRetreatDatabase> dbProvider;

  public AppModule_ProvideMeditationSessionDaoFactory(Provider<HomeRetreatDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public MeditationSessionDao get() {
    return provideMeditationSessionDao(dbProvider.get());
  }

  public static AppModule_ProvideMeditationSessionDaoFactory create(
      Provider<HomeRetreatDatabase> dbProvider) {
    return new AppModule_ProvideMeditationSessionDaoFactory(dbProvider);
  }

  public static MeditationSessionDao provideMeditationSessionDao(HomeRetreatDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideMeditationSessionDao(db));
  }
}
