// Generated by Dagger (https://dagger.dev).
package com.example.quoteplus.data.remote;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class QuoteRemoteDataSourceImpl_Factory implements Factory<QuoteRemoteDataSourceImpl> {
  private final Provider<QuoteService> quoteServiceProvider;

  public QuoteRemoteDataSourceImpl_Factory(Provider<QuoteService> quoteServiceProvider) {
    this.quoteServiceProvider = quoteServiceProvider;
  }

  @Override
  public QuoteRemoteDataSourceImpl get() {
    return newInstance(quoteServiceProvider.get());
  }

  public static QuoteRemoteDataSourceImpl_Factory create(
      Provider<QuoteService> quoteServiceProvider) {
    return new QuoteRemoteDataSourceImpl_Factory(quoteServiceProvider);
  }

  public static QuoteRemoteDataSourceImpl newInstance(QuoteService quoteService) {
    return new QuoteRemoteDataSourceImpl(quoteService);
  }
}
