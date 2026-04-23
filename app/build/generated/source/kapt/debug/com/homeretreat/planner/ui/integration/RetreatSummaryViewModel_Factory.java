package com.homeretreat.planner.ui.integration;

import com.homeretreat.planner.data.repository.MealLogRepository;
import com.homeretreat.planner.data.repository.MeditationSessionRepository;
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
public final class RetreatSummaryViewModel_Factory implements Factory<RetreatSummaryViewModel> {
  private final Provider<RetreatRepository> retreatRepositoryProvider;

  private final Provider<MeditationSessionRepository> meditationSessionRepositoryProvider;

  private final Provider<PreceptRepository> preceptRepositoryProvider;

  private final Provider<MealLogRepository> mealLogRepositoryProvider;

  public RetreatSummaryViewModel_Factory(Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<MeditationSessionRepository> meditationSessionRepositoryProvider,
      Provider<PreceptRepository> preceptRepositoryProvider,
      Provider<MealLogRepository> mealLogRepositoryProvider) {
    this.retreatRepositoryProvider = retreatRepositoryProvider;
    this.meditationSessionRepositoryProvider = meditationSessionRepositoryProvider;
    this.preceptRepositoryProvider = preceptRepositoryProvider;
    this.mealLogRepositoryProvider = mealLogRepositoryProvider;
  }

  @Override
  public RetreatSummaryViewModel get() {
    return newInstance(retreatRepositoryProvider.get(), meditationSessionRepositoryProvider.get(), preceptRepositoryProvider.get(), mealLogRepositoryProvider.get());
  }

  public static RetreatSummaryViewModel_Factory create(
      Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<MeditationSessionRepository> meditationSessionRepositoryProvider,
      Provider<PreceptRepository> preceptRepositoryProvider,
      Provider<MealLogRepository> mealLogRepositoryProvider) {
    return new RetreatSummaryViewModel_Factory(retreatRepositoryProvider, meditationSessionRepositoryProvider, preceptRepositoryProvider, mealLogRepositoryProvider);
  }

  public static RetreatSummaryViewModel newInstance(RetreatRepository retreatRepository,
      MeditationSessionRepository meditationSessionRepository, PreceptRepository preceptRepository,
      MealLogRepository mealLogRepository) {
    return new RetreatSummaryViewModel(retreatRepository, meditationSessionRepository, preceptRepository, mealLogRepository);
  }
}
