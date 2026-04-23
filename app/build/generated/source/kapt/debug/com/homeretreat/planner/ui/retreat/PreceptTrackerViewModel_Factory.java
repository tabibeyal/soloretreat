package com.homeretreat.planner.ui.retreat;

import com.homeretreat.planner.data.repository.PreceptRepository;
import com.homeretreat.planner.data.repository.RetreatRepository;
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
public final class PreceptTrackerViewModel_Factory implements Factory<PreceptTrackerViewModel> {
  private final Provider<PreceptRepository> preceptRepositoryProvider;

  private final Provider<RetreatRepository> retreatRepositoryProvider;

  public PreceptTrackerViewModel_Factory(Provider<PreceptRepository> preceptRepositoryProvider,
      Provider<RetreatRepository> retreatRepositoryProvider) {
    this.preceptRepositoryProvider = preceptRepositoryProvider;
    this.retreatRepositoryProvider = retreatRepositoryProvider;
  }

  @Override
  public PreceptTrackerViewModel get() {
    return newInstance(preceptRepositoryProvider.get(), retreatRepositoryProvider.get());
  }

  public static PreceptTrackerViewModel_Factory create(
      Provider<PreceptRepository> preceptRepositoryProvider,
      Provider<RetreatRepository> retreatRepositoryProvider) {
    return new PreceptTrackerViewModel_Factory(preceptRepositoryProvider, retreatRepositoryProvider);
  }

  public static PreceptTrackerViewModel newInstance(PreceptRepository preceptRepository,
      RetreatRepository retreatRepository) {
    return new PreceptTrackerViewModel(preceptRepository, retreatRepository);
  }
}
