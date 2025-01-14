// Generated by Dagger (https://dagger.dev).
package com.example.quoteplus.domain.usecase;

import com.example.quoteplus.domain.UserRepository;
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
public final class LoginUserUseCase_Factory implements Factory<LoginUserUseCase> {
  private final Provider<UserRepository> userRepositoryProvider;

  public LoginUserUseCase_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public LoginUserUseCase get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static LoginUserUseCase_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new LoginUserUseCase_Factory(userRepositoryProvider);
  }

  public static LoginUserUseCase newInstance(UserRepository userRepository) {
    return new LoginUserUseCase(userRepository);
  }
}
