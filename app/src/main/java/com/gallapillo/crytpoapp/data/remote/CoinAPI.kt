package com.gallapillo.crytpoapp.data.remote

import com.gallapillo.crytpoapp.data.remote.dto.CoinDetailDto
import com.gallapillo.crytpoapp.data.remote.dto.CoinDto
import com.gallapillo.crytpoapp.domain.model.Coin
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinAPI {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/vi/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto

}