package com.homeretreat.planner.data.repository;

import com.homeretreat.planner.data.local.dao.MealLogDao;
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
public final class MealLogRepository_Factory implements Factory<MealLogRepository> {
  private final Provider<MealLogDao> mealLogDaoProvider;

  public MealLogRepository_Factory(Provider<MealLogDao> mealLogDaoProvider) {
    this.mealLogDaoProvider = mealLogDaoProvider;
  }

  @Override
  public MealLogRepository get() {
    return newInstance(mealLogDaoProvider.get());
  }

  public static MealLogRepository_Factory create(Provider<MealLogDao> mealLogDaoProvider) {
    return new MealLogRepository_Factory(mealLogDaoProvider);
  }

  public static MealLogRepository newInstance(MealLogDao mealLogDao) {
    return new MealLogRepository(mealLogDao);
  }
}
