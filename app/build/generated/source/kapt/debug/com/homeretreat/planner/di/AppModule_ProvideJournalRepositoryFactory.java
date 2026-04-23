package com.homeretreat.planner.di;

import com.homeretreat.planner.data.local.dao.JournalEntryDao;
import com.homeretreat.planner.data.repository.JournalRepository;
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
public final class AppModule_ProvideJournalRepositoryFactory implements Factory<JournalRepository> {
  private final Provider<JournalEntryDao> journalEntryDaoProvider;

  public AppModule_ProvideJournalRepositoryFactory(
      Provider<JournalEntryDao> journalEntryDaoProvider) {
    this.journalEntryDaoProvider = journalEntryDaoProvider;
  }

  @Override
  public JournalRepository get() {
    return provideJournalRepository(journalEntryDaoProvider.get());
  }

  public static AppModule_ProvideJournalRepositoryFactory create(
      Provider<JournalEntryDao> journalEntryDaoProvider) {
    return new AppModule_ProvideJournalRepositoryFactory(journalEntryDaoProvider);
  }

  public static JournalRepository provideJournalRepository(JournalEntryDao journalEntryDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideJournalRepository(journalEntryDao));
  }
}
