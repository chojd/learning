package cn.com.ofashion.cleanarchitecture.di;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

@Module
class OkHttpModule {

    @Provides
    OkHttpClient provideOkHttpClient() {
        return new OkHttpClient();
    }
}
