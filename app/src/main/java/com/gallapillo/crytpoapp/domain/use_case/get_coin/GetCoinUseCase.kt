package com.gallapillo.crytpoapp.domain.use_case.get_coin

import com.gallapillo.crytpoapp.common.Resource
import com.gallapillo.crytpoapp.data.remote.dto.toCoin
import com.gallapillo.crytpoapp.data.remote.dto.toCoinDetail
import com.gallapillo.crytpoapp.domain.model.Coin
import com.gallapillo.crytpoapp.domain.model.CoinDetail
import com.gallapillo.crytpoapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "Un excepted error message."))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach the server, check your internet connection!"))
        }
    }

}