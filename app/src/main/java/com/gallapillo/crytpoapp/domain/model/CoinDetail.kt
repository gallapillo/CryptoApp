package com.gallapillo.crytpoapp.domain.model

import com.gallapillo.crytpoapp.data.remote.dto.Team

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val is_active: Boolean,
    val tags: List<String>,
    val team: List<Team>
)
