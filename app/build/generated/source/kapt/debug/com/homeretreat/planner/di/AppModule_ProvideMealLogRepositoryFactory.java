package com.homeretreat.planner.di;

import com.homeretreat.planner.data.local.dao.MealLogDao;
import com.homeretreat.planner.data.repository.MealLogRepository;
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
public final class AppModule_ProvideMealLogRepositoryFactory implements Factory<MealLogRepository> {
  private final Provider<MealLogDao> mealLogDaoProvider;

  public AppModule_ProvideMealLogRepositoryFactory(Provider<MealLogDao> mealLogDaoProvider) {
    this.mealLogDaoProvider = mealLogDaoProvider;
  }

  @Override
  public MealLogRepository get() {
    return provideMealLogRepository(mealLogDaoProvider.get());
  }

  public static AppModule_ProvideMealLogRepositoryFactory create(
      Provider<MealLogDao> mealLogDaoProvider) {
    return new AppModule_ProvideMealLogRepositoryFactory(mealLogDaoProvider);
  }

  public static MealLogRepository provideMealLogRepository(MealLogDao mealLogDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideMealLogRepository(mealLogDao));
  }
}
