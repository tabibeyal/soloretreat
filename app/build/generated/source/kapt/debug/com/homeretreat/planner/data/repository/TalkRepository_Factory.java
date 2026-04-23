package com.homeretreat.planner.data.repository;

import android.content.Context;
import com.homeretreat.planner.data.local.dao.DhammaTalkDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class TalkRepository_Factory implements Factory<TalkRepository> {
  private final Provider<DhammaTalkDao> talkDaoProvider;

  private final Provider<Context> contextProvider;

  public TalkRepository_Factory(Provider<DhammaTalkDao> talkDaoProvider,
      Provider<Context> contextProvider) {
    this.talkDaoProvider = talkDaoProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public TalkRepository get() {
    return newInstance(talkDaoProvider.get(), contextProvider.get());
  }

  public static TalkRepository_Factory create(Provider<DhammaTalkDao> talkDaoProvider,
      Provider<Context> contextProvider) {
    return new TalkRepository_Factory(talkDaoProvider, contextProvider);
  }

  public static TalkRepository newInstance(DhammaTalkDao talkDao, Context context) {
    return new TalkRepository(talkDao, context);
  }
}
