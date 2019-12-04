package br.com.frachid.sandbox.model.models.applicationmodels.houses

import com.google.gson.annotations.SerializedName

data class HouseAppModel(@SerializedName("_id") var id: String? = "",
                         @SerializedName("name") var name: String? = "",
                         @SerializedName("mascot") var mascot: String? = "",
                         @SerializedName("headOfHouse") var headOfHouse: String? = "",
                         @SerializedName("houseGhost") var houseGhost: String? = "",
                         @SerializedName("founder") var founder: String? = "",
                         @SerializedName("school") var school: String? = "",
                         @SerializedName("members") var members: List<String>? = listOf(),
                         @SerializedName("values") var values: List<String>? = listOf(),
                         @SerializedName("colors") var colors: List<String>? = listOf())