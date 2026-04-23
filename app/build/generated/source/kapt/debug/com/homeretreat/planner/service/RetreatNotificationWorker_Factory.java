package com.homeretreat.planner.service;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.homeretreat.planner.data.repository.RetreatRepository;
import com.homeretreat.planner.data.repository.ScheduleRepository;
import com.homeretreat.planner.util.NotificationHelper;
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
public final class RetreatNotificationWorker_Factory {
  private final Provider<RetreatRepository> retreatRepositoryProvider;

  private final Provider<ScheduleRepository> scheduleRepositoryProvider;

  private final Provider<NotificationHelper> notificationHelperProvider;

  public RetreatNotificationWorker_Factory(Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<ScheduleRepository> scheduleRepositoryProvider,
      Provider<NotificationHelper> notificationHelperProvider) {
    this.retreatRepositoryProvider = retreatRepositoryProvider;
    this.scheduleRepositoryProvider = scheduleRepositoryProvider;
    this.notificationHelperProvider = notificationHelperProvider;
  }

  public RetreatNotificationWorker get(Context context, WorkerParameters params) {
    return newInstance(context, params, retreatRepositoryProvider.get(), scheduleRepositoryProvider.get(), notificationHelperProvider.get());
  }

  public static RetreatNotificationWorker_Factory create(
      Provider<RetreatRepository> retreatRepositoryProvider,
      Provider<ScheduleRepository> scheduleRepositoryProvider,
      Provider<NotificationHelper> notificationHelperProvider) {
    return new RetreatNotificationWorker_Factory(retreatRepositoryProvider, scheduleRepositoryProvider, notificationHelperProvider);
  }

  public static RetreatNotificationWorker newInstance(Context context, WorkerParameters params,
      RetreatRepository retreatRepository, ScheduleRepository scheduleRepository,
      NotificationHelper notificationHelper) {
    return new RetreatNotificationWorker(context, params, retreatRepository, scheduleRepository, notificationHelper);
  }
}
