package com.homeretreat.planner.ui.integration;

import com.homeretreat.planner.data.repository.JournalRepository;
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
public final class JournalViewModel_Factory implements Factory<JournalViewModel> {
  private final Provider<JournalRepository> journalRepositoryProvider;

  public JournalViewModel_Factory(Provider<JournalRepository> journalRepositoryProvider) {
    this.journalRepositoryProvider = journalRepositoryProvider;
  }

  @Override
  public JournalViewModel get() {
    return newInstance(journalRepositoryProvider.get());
  }

  public static JournalViewModel_Factory create(
      Provider<JournalRepository> journalRepositoryProvider) {
    return new JournalViewModel_Factory(journalRepositoryProvider);
  }

  public static JournalViewModel newInstance(JournalRepository journalRepository) {
    return new JournalViewModel(journalRepository);
  }
}
