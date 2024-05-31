package com.example.quoteplus.core.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/quoteplus/core/di/QuoteRepositoryModule;", "", "()V", "bindQuoteRemoteDataSource", "Lcom/example/quoteplus/data/remote/QuoteRemoteDataSource;", "quoteRemoteDataSourceImpl", "Lcom/example/quoteplus/data/remote/QuoteRemoteDataSourceImpl;", "bindQuoteRepository", "Lcom/example/quoteplus/domain/QuoteRepository;", "quoteRepositoryImpl", "Lcom/example/quoteplus/data/remote/QuoteRepositoryImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class QuoteRepositoryModule {
    
    public QuoteRepositoryModule() {
        super();
    }
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.example.quoteplus.domain.QuoteRepository bindQuoteRepository(@org.jetbrains.annotations.NotNull
    com.example.quoteplus.data.remote.QuoteRepositoryImpl quoteRepositoryImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.example.quoteplus.data.remote.QuoteRemoteDataSource bindQuoteRemoteDataSource(@org.jetbrains.annotations.NotNull
    com.example.quoteplus.data.remote.QuoteRemoteDataSourceImpl quoteRemoteDataSourceImpl);
}