package com.homeretreat.planner.di;

import com.homeretreat.planner.data.local.dao.ChecklistItemDao;
import com.homeretreat.planner.data.local.dao.DhammaTalkDao;
import com.homeretreat.planner.data.local.dao.JournalEntryDao;
import com.homeretreat.planner.data.local.dao.MealLogDao;
import com.homeretreat.planner.data.local.dao.MeditationSessionDao;
import com.homeretreat.planner.data.local.dao.PreceptLogDao;
import com.homeretreat.planner.data.local.dao.RetreatConfigDao;
import com.homeretreat.planner.data.local.dao.ScheduleBlockDao;
import com.homeretreat.planner.data.repository.RetreatRepository;
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
public final class AppModule_ProvideRetreatRepositoryFactory implements Factory<RetreatRepository> {
  private final Provider<RetreatConfigDao> retreatConfigDaoProvider;

  private final Provider<ChecklistItemDao> checklistItemDaoProvider;

  private final Provider<ScheduleBlockDao> scheduleBlockDaoProvider;

  private final Provider<MeditationSessionDao> meditationSessionDaoProvider;

  private final Provider<JournalEntryDao> journalEntryDaoProvider;

  private final Provider<MealLogDao> mealLogDaoProvider;

  private final Provider<PreceptLogDao> preceptLogDaoProvider;

  private final Provider<DhammaTalkDao> dhammaTalkDaoProvider;

  public AppModule_ProvideRetreatRepositoryFactory(
      Provider<RetreatConfigDao> retreatConfigDaoProvider,
      Provider<ChecklistItemDao> checklistItemDaoProvider,
      Provider<ScheduleBlockDao> scheduleBlockDaoProvider,
      Provider<MeditationSessionDao> meditationSessionDaoProvider,
      Provider<JournalEntryDao> journalEntryDaoProvider, Provider<MealLogDao> mealLogDaoProvider,
      Provider<PreceptLogDao> preceptLogDaoProvider,
      Provider<DhammaTalkDao> dhammaTalkDaoProvider) {
    this.retreatConfigDaoProvider = retreatConfigDaoProvider;
    this.checklistItemDaoProvider = checklistItemDaoProvider;
    this.scheduleBlockDaoProvider = scheduleBlockDaoProvider;
    this.meditationSessionDaoProvider = meditationSessionDaoProvider;
    this.journalEntryDaoProvider = journalEntryDaoProvider;
    this.mealLogDaoProvider = mealLogDaoProvider;
    this.preceptLogDaoProvider = preceptLogDaoProvider;
    this.dhammaTalkDaoProvider = dhammaTalkDaoProvider;
  }

  @Override
  public RetreatRepository get() {
    return provideRetreatRepository(retreatConfigDaoProvider.get(), checklistItemDaoProvider.get(), scheduleBlockDaoProvider.get(), meditationSessionDaoProvider.get(), journalEntryDaoProvider.get(), mealLogDaoProvider.get(), preceptLogDaoProvider.get(), dhammaTalkDaoProvider.get());
  }

  public static AppModule_ProvideRetreatRepositoryFactory create(
      Provider<RetreatConfigDao> retreatConfigDaoProvider,
      Provider<ChecklistItemDao> checklistItemDaoProvider,
      Provider<ScheduleBlockDao> scheduleBlockDaoProvider,
      Provider<MeditationSessionDao> meditationSessionDaoProvider,
      Provider<JournalEntryDao> journalEntryDaoProvider, Provider<MealLogDao> mealLogDaoProvider,
      Provider<PreceptLogDao> preceptLogDaoProvider,
      Provider<DhammaTalkDao> dhammaTalkDaoProvider) {
    return new AppModule_ProvideRetreatRepositoryFactory(retreatConfigDaoProvider, checklistItemDaoProvider, scheduleBlockDaoProvider, meditationSessionDaoProvider, journalEntryDaoProvider, mealLogDaoProvider, preceptLogDaoProvider, dhammaTalkDaoProvider);
  }

  public static RetreatRepository provideRetreatRepository(RetreatConfigDao retreatConfigDao,
      ChecklistItemDao checklistItemDao, ScheduleBlockDao scheduleBlockDao,
      MeditationSessionDao meditationSessionDao, JournalEntryDao journalEntryDao,
      MealLogDao mealLogDao, PreceptLogDao preceptLogDao, DhammaTalkDao dhammaTalkDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRetreatRepository(retreatConfigDao, checklistItemDao, scheduleBlockDao, meditationSessionDao, journalEntryDao, mealLogDao, preceptLogDao, dhammaTalkDao));
  }
}
