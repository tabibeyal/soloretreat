package com.homeretreat.planner.ui.preparation;

import android.content.Context;
import com.homeretreat.planner.data.repository.TalkRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class TalkCatalogViewModel_Factory implements Factory<TalkCatalogViewModel> {
  private final Provider<TalkRepository> talkRepositoryProvider;

  private final Provider<Context> contextProvider;

  public TalkCatalogViewModel_Factory(Provider<TalkRepository> talkRepositoryProvider,
      Provider<Context> contextProvider) {
    this.talkRepositoryProvider = talkRepositoryProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public TalkCatalogViewModel get() {
    return newInstance(talkRepositoryProvider.get(), contextProvider.get());
  }

  public static TalkCatalogViewModel_Factory create(Provider<TalkRepository> talkRepositoryProvider,
      Provider<Context> contextProvider) {
    return new TalkCatalogViewModel_Factory(talkRepositoryProvider, contextProvider);
  }

  public static TalkCatalogViewModel newInstance(TalkRepository talkRepository, Context context) {
    return new TalkCatalogViewModel(talkRepository, context);
  }
}
