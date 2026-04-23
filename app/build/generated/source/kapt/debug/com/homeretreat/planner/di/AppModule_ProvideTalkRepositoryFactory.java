package com.homeretreat.planner.di;

import android.content.Context;
import com.homeretreat.planner.data.local.dao.DhammaTalkDao;
import com.homeretreat.planner.data.repository.TalkRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppModule_ProvideTalkRepositoryFactory implements Factory<TalkRepository> {
  private final Provider<DhammaTalkDao> dhammaTalkDaoProvider;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideTalkRepositoryFactory(Provider<DhammaTalkDao> dhammaTalkDaoProvider,
      Provider<Context> contextProvider) {
    this.dhammaTalkDaoProvider = dhammaTalkDaoProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public TalkRepository get() {
    return provideTalkRepository(dhammaTalkDaoProvider.get(), contextProvider.get());
  }

  public static AppModule_ProvideTalkRepositoryFactory create(
      Provider<DhammaTalkDao> dhammaTalkDaoProvider, Provider<Context> contextProvider) {
    return new AppModule_ProvideTalkRepositoryFactory(dhammaTalkDaoProvider, contextProvider);
  }

  public static TalkRepository provideTalkRepository(DhammaTalkDao dhammaTalkDao, Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideTalkRepository(dhammaTalkDao, context));
  }
}
