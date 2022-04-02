package com.gallapillo.crytpoapp.data.repository

import com.gallapillo.crytpoapp.data.remote.CoinAPI
import com.gallapillo.crytpoapp.data.remote.dto.CoinDetailDto
import com.gallapillo.crytpoapp.data.remote.dto.CoinDto
import com.gallapillo.crytpoapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinAPI
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}