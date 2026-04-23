package com.homeretreat.planner.ui.preparation;

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
public final class ChecklistViewModel_Factory implements Factory<ChecklistViewModel> {
  private final Provider<RetreatRepository> retreatRepositoryProvider;

  public ChecklistViewModel_Factory(Provider<RetreatRepository> retreatRepositoryProvider) {
    this.retreatRepositoryProvider = retreatRepositoryProvider;
  }

  @Override
  public ChecklistViewModel get() {
    return newInstance(retreatRepositoryProvider.get());
  }

  public static ChecklistViewModel_Factory create(
      Provider<RetreatRepository> retreatRepositoryProvider) {
    return new ChecklistViewModel_Factory(retreatRepositoryProvider);
  }

  public static ChecklistViewModel newInstance(RetreatRepository retreatRepository) {
    return new ChecklistViewModel(retreatRepository);
  }
}
