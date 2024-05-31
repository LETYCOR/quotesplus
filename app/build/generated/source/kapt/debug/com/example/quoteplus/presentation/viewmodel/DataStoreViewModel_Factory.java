// Generated by Dagger (https://dagger.dev).
package com.example.quoteplus.presentation.viewmodel;

import com.example.quoteplus.domain.PreferenceStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class DataStoreViewModel_Factory implements Factory<DataStoreViewModel> {
  private final Provider<PreferenceStorage> preferenceStorageProvider;

  public DataStoreViewModel_Factory(Provider<PreferenceStorage> preferenceStorageProvider) {
    this.preferenceStorageProvider = preferenceStorageProvider;
  }

  @Override
  public DataStoreViewModel get() {
    return newInstance(preferenceStorageProvider.get());
  }

  public static DataStoreViewModel_Factory create(
      Provider<PreferenceStorage> preferenceStorageProvider) {
    return new DataStoreViewModel_Factory(preferenceStorageProvider);
  }

  public static DataStoreViewModel newInstance(PreferenceStorage preferenceStorage) {
    return new DataStoreViewModel(preferenceStorage);
  }
}