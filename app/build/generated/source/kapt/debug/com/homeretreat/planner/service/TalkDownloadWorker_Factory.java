package com.homeretreat.planner.service;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.homeretreat.planner.data.repository.TalkRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class TalkDownloadWorker_Factory {
  private final Provider<TalkRepository> talkRepositoryProvider;

  public TalkDownloadWorker_Factory(Provider<TalkRepository> talkRepositoryProvider) {
    this.talkRepositoryProvider = talkRepositoryProvider;
  }

  public TalkDownloadWorker get(Context context, WorkerParameters params) {
    return newInstance(context, params, talkRepositoryProvider.get());
  }

  public static TalkDownloadWorker_Factory create(Provider<TalkRepository> talkRepositoryProvider) {
    return new TalkDownloadWorker_Factory(talkRepositoryProvider);
  }

  public static TalkDownloadWorker newInstance(Context context, WorkerParameters params,
      TalkRepository talkRepository) {
    return new TalkDownloadWorker(context, params, talkRepository);
  }
}
