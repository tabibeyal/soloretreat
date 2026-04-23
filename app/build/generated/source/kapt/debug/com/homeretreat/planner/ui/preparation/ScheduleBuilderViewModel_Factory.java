package com.homeretreat.planner.ui.preparation;

import com.homeretreat.planner.data.repository.RetreatRepository;
import com.homeretreat.planner.data.repository.ScheduleRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class ScheduleBuilderViewModel_Factory implements Factory<ScheduleBuilderViewModel> {
  private final Provider<ScheduleRepository> scheduleRepositoryProvider;

  private final Provider<RetreatRepository> retreatRepositoryProvider;

  public ScheduleBuilderViewModel_Factory(Provider<ScheduleRepository> scheduleRepositoryProvider,
      Provider<RetreatRepository> retreatRepositoryProvider) {
    this.scheduleRepositoryProvider = scheduleRepositoryProvider;
    this.retreatRepositoryProvider = retreatRepositoryProvider;
  }

  @Override
  public ScheduleBuilderViewModel get() {
    return newInstance(scheduleRepositoryProvider.get(), retreatRepositoryProvider.get());
  }

  public static ScheduleBuilderViewModel_Factory create(
      Provider<ScheduleRepository> scheduleRepositoryProvider,
      Provider<RetreatRepository> retreatRepositoryProvider) {
    return new ScheduleBuilderViewModel_Factory(scheduleRepositoryProvider, retreatRepositoryProvider);
  }

  public static ScheduleBuilderViewModel newInstance(ScheduleRepository scheduleRepository,
      RetreatRepository retreatRepository) {
    return new ScheduleBuilderViewModel(scheduleRepository, retreatRepository);
  }
}
