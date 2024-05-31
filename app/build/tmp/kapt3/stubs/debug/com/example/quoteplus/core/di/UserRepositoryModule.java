package com.example.quoteplus.core.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/quoteplus/core/di/UserRepositoryModule;", "", "()V", "bindUserRemoteDataSource", "Lcom/example/quoteplus/data/remote/UserRemoteDataSource;", "userRemoteDataSourceImpl", "Lcom/example/quoteplus/data/remote/UserRemoteDataSourceImpl;", "bindUserRepository", "Lcom/example/quoteplus/domain/UserRepository;", "userRepositoryImpl", "Lcom/example/quoteplus/data/UserRepositoryImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class UserRepositoryModule {
    
    public UserRepositoryModule() {
        super();
    }
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.example.quoteplus.domain.UserRepository bindUserRepository(@org.jetbrains.annotations.NotNull
    com.example.quoteplus.data.UserRepositoryImpl userRepositoryImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.example.quoteplus.data.remote.UserRemoteDataSource bindUserRemoteDataSource(@org.jetbrains.annotations.NotNull
    com.example.quoteplus.data.remote.UserRemoteDataSourceImpl userRemoteDataSourceImpl);
}