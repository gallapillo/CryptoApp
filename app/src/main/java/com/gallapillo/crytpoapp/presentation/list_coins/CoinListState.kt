package com.gallapillo.crytpoapp.presentation.list_coins

import com.gallapillo.crytpoapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
