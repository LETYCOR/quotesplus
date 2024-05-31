package com.example.quoteplus.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/quoteplus/presentation/viewmodel/ListQuoteViewModel;", "Landroidx/lifecycle/ViewModel;", "getQuotesUseCase", "Lcom/example/quoteplus/domain/usecase/GetQuotesUseCase;", "(Lcom/example/quoteplus/domain/usecase/GetQuotesUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/quoteplus/domain/model/QuoteUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getQuotes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyDataState", "data", "", "Lcom/example/quoteplus/domain/model/QuoteModel;", "notifyErrorState", "error", "", "notifyInitState", "notifyLoadingState", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ListQuoteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.quoteplus.domain.usecase.GetQuotesUseCase getQuotesUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.quoteplus.domain.model.QuoteUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.quoteplus.domain.model.QuoteUiState> uiState = null;
    
    @javax.inject.Inject
    public ListQuoteViewModel(@org.jetbrains.annotations.NotNull
    com.example.quoteplus.domain.usecase.GetQuotesUseCase getQuotesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.quoteplus.domain.model.QuoteUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getQuotes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void notifyInitState() {
    }
    
    private final void notifyLoadingState() {
    }
    
    private final void notifyDataState(java.util.List<com.example.quoteplus.domain.model.QuoteModel> data) {
    }
    
    private final void notifyErrorState(java.lang.Throwable error) {
    }
}