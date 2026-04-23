package com.homeretreat.planner.di;

import com.homeretreat.planner.data.local.HomeRetreatDatabase;
import com.homeretreat.planner.data.local.dao.PreceptLogDao;
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
public final class AppModule_ProvidePreceptLogDaoFactory implements Factory<PreceptLogDao> {
  private final Provider<HomeRetreatDatabase> dbProvider;

  public AppModule_ProvidePreceptLogDaoFactory(Provider<HomeRetreatDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public PreceptLogDao get() {
    return providePreceptLogDao(dbProvider.get());
  }

  public static AppModule_ProvidePreceptLogDaoFactory create(
      Provider<HomeRetreatDatabase> dbProvider) {
    return new AppModule_ProvidePreceptLogDaoFactory(dbProvider);
  }

  public static PreceptLogDao providePreceptLogDao(HomeRetreatDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePreceptLogDao(db));
  }
}
