package br.com.frachid.sandbox.model.models.applicationmodels.spells

import com.google.gson.annotations.SerializedName

data class SpellAppModel(@SerializedName("_id") var id: String? = "",
                         @SerializedName("spell") var spell: String? = "",
                         @SerializedName("type") var type: String? = "",
                         @SerializedName("effect") var effect: String? = "")