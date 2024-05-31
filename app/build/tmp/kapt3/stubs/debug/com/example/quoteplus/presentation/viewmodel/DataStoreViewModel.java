package com.example.quoteplus.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/quoteplus/presentation/viewmodel/DataStoreViewModel;", "Landroidx/lifecycle/ViewModel;", "preferenceStorage", "Lcom/example/quoteplus/domain/PreferenceStorage;", "(Lcom/example/quoteplus/domain/PreferenceStorage;)V", "getToken", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveToken", "", "token", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class DataStoreViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.quoteplus.domain.PreferenceStorage preferenceStorage = null;
    
    @javax.inject.Inject
    public DataStoreViewModel(@org.jetbrains.annotations.NotNull
    com.example.quoteplus.domain.PreferenceStorage preferenceStorage) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getToken(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    public final void saveToken(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
    }
}