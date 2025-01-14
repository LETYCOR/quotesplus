// Generated by Dagger (https://dagger.dev).
package com.example.quoteplus.domain.usecase;

import com.example.quoteplus.domain.QuoteRepository;
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
public final class GetQuotesUseCase_Factory implements Factory<GetQuotesUseCase> {
  private final Provider<QuoteRepository> quoteRepositoryProvider;

  public GetQuotesUseCase_Factory(Provider<QuoteRepository> quoteRepositoryProvider) {
    this.quoteRepositoryProvider = quoteRepositoryProvider;
  }

  @Override
  public GetQuotesUseCase get() {
    return newInstance(quoteRepositoryProvider.get());
  }

  public static GetQuotesUseCase_Factory create(Provider<QuoteRepository> quoteRepositoryProvider) {
    return new GetQuotesUseCase_Factory(quoteRepositoryProvider);
  }

  public static GetQuotesUseCase newInstance(QuoteRepository quoteRepository) {
    return new GetQuotesUseCase(quoteRepository);
  }
}
