package com.homeretreat.planner.ui.retreat;

import androidx.lifecycle.SavedStateHandle;
import com.homeretreat.planner.service.TimerEngine;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class TimerViewModel_Factory implements Factory<TimerViewModel> {
  private final Provider<TimerEngine> engineProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public TimerViewModel_Factory(Provider<TimerEngine> engineProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.engineProvider = engineProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public TimerViewModel get() {
    return newInstance(engineProvider.get(), savedStateHandleProvider.get());
  }

  public static TimerViewModel_Factory create(Provider<TimerEngine> engineProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new TimerViewModel_Factory(engineProvider, savedStateHandleProvider);
  }

  public static TimerViewModel newInstance(TimerEngine engine, SavedStateHandle savedStateHandle) {
    return new TimerViewModel(engine, savedStateHandle);
  }
}
