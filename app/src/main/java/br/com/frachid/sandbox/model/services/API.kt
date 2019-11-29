package br.com.frachid.sandbox.model.services

import br.com.frachid.sandbox.model.datasources.UserDataSource
import br.com.frachid.sandbox.model.models.UserModel
import br.com.frachid.sandbox.model.models.apimodels.characters.CharacterApiModel
import io.reactivex.Single
import retrofit2.http.GET

interface API {

    @GET("sortingHat")
    fun getSortingHatHouse(): Single<String>

    @GET("characters")
    fun getCharacters(): Single<List<CharacterApiModel>>


}