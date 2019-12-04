package br.com.frachid.sandbox.model.models.api.characters

import com.google.gson.annotations.SerializedName

data class CharacterApiModel(@SerializedName("_id") var id: String? = "",
                             @SerializedName("name") var name: String? = "",
                             @SerializedName("role") var role: String? = "",
                             @SerializedName("house") var house: String? = "",
                             @SerializedName("school") var school: String? = "",
                             @SerializedName("ministryOfMagic") var ministryOfMagic: Boolean? = false,
                             @SerializedName("orderOfThePhoenix") var orderOfThePhoenix: Boolean? = false,
                             @SerializedName("dumbledoresArmy") var dumbledoresArmy: Boolean? = false,
                             @SerializedName("deathEater") var deathEater: Boolean? = false,
                             @SerializedName("bloodStatus") var bloodStatus: String? = "",
                             @SerializedName("species") var species: String? = "")

