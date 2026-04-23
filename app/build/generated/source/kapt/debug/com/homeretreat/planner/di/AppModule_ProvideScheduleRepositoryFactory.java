package com.homeretreat.planner.di;

import com.homeretreat.planner.data.local.dao.ScheduleBlockDao;
import com.homeretreat.planner.data.repository.ScheduleRepository;
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
public final class AppModule_ProvideScheduleRepositoryFactory implements Factory<ScheduleRepository> {
  private final Provider<ScheduleBlockDao> scheduleBlockDaoProvider;

  public AppModule_ProvideScheduleRepositoryFactory(
      Provider<ScheduleBlockDao> scheduleBlockDaoProvider) {
    this.scheduleBlockDaoProvider = scheduleBlockDaoProvider;
  }

  @Override
  public ScheduleRepository get() {
    return provideScheduleRepository(scheduleBlockDaoProvider.get());
  }

  public static AppModule_ProvideScheduleRepositoryFactory create(
      Provider<ScheduleBlockDao> scheduleBlockDaoProvider) {
    return new AppModule_ProvideScheduleRepositoryFactory(scheduleBlockDaoProvider);
  }

  public static ScheduleRepository provideScheduleRepository(ScheduleBlockDao scheduleBlockDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideScheduleRepository(scheduleBlockDao));
  }
}
