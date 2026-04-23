package com.homeretreat.planner.di;

import com.homeretreat.planner.data.local.HomeRetreatDatabase;
import com.homeretreat.planner.data.local.dao.ScheduleBlockDao;
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
public final class AppModule_ProvideScheduleBlockDaoFactory implements Factory<ScheduleBlockDao> {
  private final Provider<HomeRetreatDatabase> dbProvider;

  public AppModule_ProvideScheduleBlockDaoFactory(Provider<HomeRetreatDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public ScheduleBlockDao get() {
    return provideScheduleBlockDao(dbProvider.get());
  }

  public static AppModule_ProvideScheduleBlockDaoFactory create(
      Provider<HomeRetreatDatabase> dbProvider) {
    return new AppModule_ProvideScheduleBlockDaoFactory(dbProvider);
  }

  public static ScheduleBlockDao provideScheduleBlockDao(HomeRetreatDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideScheduleBlockDao(db));
  }
}
