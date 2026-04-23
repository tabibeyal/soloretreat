package com.homeretreat.planner.data.repository;

import com.homeretreat.planner.data.local.dao.ChecklistItemDao;
import com.homeretreat.planner.data.local.dao.DhammaTalkDao;
import com.homeretreat.planner.data.local.dao.JournalEntryDao;
import com.homeretreat.planner.data.local.dao.MealLogDao;
import com.homeretreat.planner.data.local.dao.MeditationSessionDao;
import com.homeretreat.planner.data.local.dao.PreceptLogDao;
import com.homeretreat.planner.data.local.dao.RetreatConfigDao;
import com.homeretreat.planner.data.local.dao.ScheduleBlockDao;
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
public final class RetreatRepository_Factory implements Factory<RetreatRepository> {
  private final Provider<RetreatConfigDao> configDaoProvider;

  private final Provider<ChecklistItemDao> checklistDaoProvider;

  private final Provider<ScheduleBlockDao> scheduleBlockDaoProvider;

  private final Provider<MeditationSessionDao> meditationSessionDaoProvider;

  private final Provider<JournalEntryDao> journalEntryDaoProvider;

  private final Provider<MealLogDao> mealLogDaoProvider;

  private final Provider<PreceptLogDao> preceptLogDaoProvider;

  private final Provider<DhammaTalkDao> dhammaTalkDaoProvider;

  public RetreatRepository_Factory(Provider<RetreatConfigDao> configDaoProvider,
      Provider<ChecklistItemDao> checklistDaoProvider,
      Provider<ScheduleBlockDao> scheduleBlockDaoProvider,
      Provider<MeditationSessionDao> meditationSessionDaoProvider,
      Provider<JournalEntryDao> journalEntryDaoProvider, Provider<MealLogDao> mealLogDaoProvider,
      Provider<PreceptLogDao> preceptLogDaoProvider,
      Provider<DhammaTalkDao> dhammaTalkDaoProvider) {
    this.configDaoProvider = configDaoProvider;
    this.checklistDaoProvider = checklistDaoProvider;
    this.scheduleBlockDaoProvider = scheduleBlockDaoProvider;
    this.meditationSessionDaoProvider = meditationSessionDaoProvider;
    this.journalEntryDaoProvider = journalEntryDaoProvider;
    this.mealLogDaoProvider = mealLogDaoProvider;
    this.preceptLogDaoProvider = preceptLogDaoProvider;
    this.dhammaTalkDaoProvider = dhammaTalkDaoProvider;
  }

  @Override
  public RetreatRepository get() {
    return newInstance(configDaoProvider.get(), checklistDaoProvider.get(), scheduleBlockDaoProvider.get(), meditationSessionDaoProvider.get(), journalEntryDaoProvider.get(), mealLogDaoProvider.get(), preceptLogDaoProvider.get(), dhammaTalkDaoProvider.get());
  }

  public static RetreatRepository_Factory create(Provider<RetreatConfigDao> configDaoProvider,
      Provider<ChecklistItemDao> checklistDaoProvider,
      Provider<ScheduleBlockDao> scheduleBlockDaoProvider,
      Provider<MeditationSessionDao> meditationSessionDaoProvider,
      Provider<JournalEntryDao> journalEntryDaoProvider, Provider<MealLogDao> mealLogDaoProvider,
      Provider<PreceptLogDao> preceptLogDaoProvider,
      Provider<DhammaTalkDao> dhammaTalkDaoProvider) {
    return new RetreatRepository_Factory(configDaoProvider, checklistDaoProvider, scheduleBlockDaoProvider, meditationSessionDaoProvider, journalEntryDaoProvider, mealLogDaoProvider, preceptLogDaoProvider, dhammaTalkDaoProvider);
  }

  public static RetreatRepository newInstance(RetreatConfigDao configDao,
      ChecklistItemDao checklistDao, ScheduleBlockDao scheduleBlockDao,
      MeditationSessionDao meditationSessionDao, JournalEntryDao journalEntryDao,
      MealLogDao mealLogDao, PreceptLogDao preceptLogDao, DhammaTalkDao dhammaTalkDao) {
    return new RetreatRepository(configDao, checklistDao, scheduleBlockDao, meditationSessionDao, journalEntryDao, mealLogDao, preceptLogDao, dhammaTalkDao);
  }
}
