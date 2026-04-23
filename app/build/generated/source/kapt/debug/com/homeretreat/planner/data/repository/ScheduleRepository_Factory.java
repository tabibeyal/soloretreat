package com.homeretreat.planner.data.repository;

import com.homeretreat.planner.data.local.dao.ScheduleBlockDao;
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
public final class ScheduleRepository_Factory implements Factory<ScheduleRepository> {
  private final Provider<ScheduleBlockDao> scheduleBlockDaoProvider;

  public ScheduleRepository_Factory(Provider<ScheduleBlockDao> scheduleBlockDaoProvider) {
    this.scheduleBlockDaoProvider = scheduleBlockDaoProvider;
  }

  @Override
  public ScheduleRepository get() {
    return newInstance(scheduleBlockDaoProvider.get());
  }

  public static ScheduleRepository_Factory create(
      Provider<ScheduleBlockDao> scheduleBlockDaoProvider) {
    return new ScheduleRepository_Factory(scheduleBlockDaoProvider);
  }

  public static ScheduleRepository newInstance(ScheduleBlockDao scheduleBlockDao) {
    return new ScheduleRepository(scheduleBlockDao);
  }
}
