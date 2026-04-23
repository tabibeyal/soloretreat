package com.homeretreat.planner.data.repository;

import com.homeretreat.planner.data.local.dao.JournalEntryDao;
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
public final class JournalRepository_Factory implements Factory<JournalRepository> {
  private final Provider<JournalEntryDao> journalEntryDaoProvider;

  public JournalRepository_Factory(Provider<JournalEntryDao> journalEntryDaoProvider) {
    this.journalEntryDaoProvider = journalEntryDaoProvider;
  }

  @Override
  public JournalRepository get() {
    return newInstance(journalEntryDaoProvider.get());
  }

  public static JournalRepository_Factory create(
      Provider<JournalEntryDao> journalEntryDaoProvider) {
    return new JournalRepository_Factory(journalEntryDaoProvider);
  }

  public static JournalRepository newInstance(JournalEntryDao journalEntryDao) {
    return new JournalRepository(journalEntryDao);
  }
}
