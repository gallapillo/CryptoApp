package com.gallapillo.crytpoapp.presentation.detail_coins

import com.gallapillo.crytpoapp.domain.model.Coin
import com.gallapillo.crytpoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
