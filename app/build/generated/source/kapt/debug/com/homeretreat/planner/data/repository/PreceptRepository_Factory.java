package com.homeretreat.planner.data.repository;

import com.homeretreat.planner.data.local.dao.PreceptLogDao;
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
public final class PreceptRepository_Factory implements Factory<PreceptRepository> {
  private final Provider<PreceptLogDao> preceptLogDaoProvider;

  public PreceptRepository_Factory(Provider<PreceptLogDao> preceptLogDaoProvider) {
    this.preceptLogDaoProvider = preceptLogDaoProvider;
  }

  @Override
  public PreceptRepository get() {
    return newInstance(preceptLogDaoProvider.get());
  }

  public static PreceptRepository_Factory create(Provider<PreceptLogDao> preceptLogDaoProvider) {
    return new PreceptRepository_Factory(preceptLogDaoProvider);
  }

  public static PreceptRepository newInstance(PreceptLogDao preceptLogDao) {
    return new PreceptRepository(preceptLogDao);
  }
}
