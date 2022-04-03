package com.gallapillo.crytpoapp.di

import com.gallapillo.crytpoapp.common.Constant
import com.gallapillo.crytpoapp.data.remote.CoinAPI
import com.gallapillo.crytpoapp.data.repository.CoinRepositoryImpl
import com.gallapillo.crytpoapp.domain.repository.CoinRepository
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAPI(): CoinAPI {
        return Retrofit.Builder()
            .baseUrl(Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinAPI): CoinRepository {
        return CoinRepositoryImpl(api)
    }
}