package com.gallapillo.crytpoapp.domain.repository

import com.gallapillo.crytpoapp.data.remote.dto.CoinDetailDto
import com.gallapillo.crytpoapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}