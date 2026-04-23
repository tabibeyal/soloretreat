package com.homeretreat.planner.di;

import com.homeretreat.planner.data.local.HomeRetreatDatabase;
import com.homeretreat.planner.data.local.dao.ChecklistItemDao;
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
public final class AppModule_ProvideChecklistItemDaoFactory implements Factory<ChecklistItemDao> {
  private final Provider<HomeRetreatDatabase> dbProvider;

  public AppModule_ProvideChecklistItemDaoFactory(Provider<HomeRetreatDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public ChecklistItemDao get() {
    return provideChecklistItemDao(dbProvider.get());
  }

  public static AppModule_ProvideChecklistItemDaoFactory create(
      Provider<HomeRetreatDatabase> dbProvider) {
    return new AppModule_ProvideChecklistItemDaoFactory(dbProvider);
  }

  public static ChecklistItemDao provideChecklistItemDao(HomeRetreatDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideChecklistItemDao(db));
  }
}
