package com.homeretreat.planner.ui.retreat;

import com.homeretreat.planner.data.repository.MealLogRepository;
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
public final class MealLogViewModel_Factory implements Factory<MealLogViewModel> {
  private final Provider<MealLogRepository> mealLogRepositoryProvider;

  public MealLogViewModel_Factory(Provider<MealLogRepository> mealLogRepositoryProvider) {
    this.mealLogRepositoryProvider = mealLogRepositoryProvider;
  }

  @Override
  public MealLogViewModel get() {
    return newInstance(mealLogRepositoryProvider.get());
  }

  public static MealLogViewModel_Factory create(
      Provider<MealLogRepository> mealLogRepositoryProvider) {
    return new MealLogViewModel_Factory(mealLogRepositoryProvider);
  }

  public static MealLogViewModel newInstance(MealLogRepository mealLogRepository) {
    return new MealLogViewModel(mealLogRepository);
  }
}
