package com.homeretreat.planner.di;

import com.homeretreat.planner.data.local.HomeRetreatDatabase;
import com.homeretreat.planner.data.local.dao.JournalEntryDao;
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
public final class AppModule_ProvideJournalEntryDaoFactory implements Factory<JournalEntryDao> {
  private final Provider<HomeRetreatDatabase> dbProvider;

  public AppModule_ProvideJournalEntryDaoFactory(Provider<HomeRetreatDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public JournalEntryDao get() {
    return provideJournalEntryDao(dbProvider.get());
  }

  public static AppModule_ProvideJournalEntryDaoFactory create(
      Provider<HomeRetreatDatabase> dbProvider) {
    return new AppModule_ProvideJournalEntryDaoFactory(dbProvider);
  }

  public static JournalEntryDao provideJournalEntryDao(HomeRetreatDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideJournalEntryDao(db));
  }
}
