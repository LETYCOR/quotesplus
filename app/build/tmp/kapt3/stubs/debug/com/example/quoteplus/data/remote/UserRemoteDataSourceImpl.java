package com.example.quoteplus.data.remote;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/quoteplus/data/remote/UserRemoteDataSourceImpl;", "Lcom/example/quoteplus/data/remote/UserRemoteDataSource;", "userService", "Lcom/example/quoteplus/data/remote/UserService;", "(Lcom/example/quoteplus/data/remote/UserService;)V", "login", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/quoteplus/data/remote/UserLoginResponse;", "loginRequest", "Lcom/example/quoteplus/data/model/LoginRequest;", "(Lcom/example/quoteplus/data/model/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRemoteDataSourceImpl implements com.example.quoteplus.data.remote.UserRemoteDataSource {
    @org.jetbrains.annotations.NotNull
    private final com.example.quoteplus.data.remote.UserService userService = null;
    
    @javax.inject.Inject
    public UserRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull
    com.example.quoteplus.data.remote.UserService userService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object login(@org.jetbrains.annotations.NotNull
    com.example.quoteplus.data.model.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.example.quoteplus.data.remote.UserLoginResponse>> $completion) {
        return null;
    }
}