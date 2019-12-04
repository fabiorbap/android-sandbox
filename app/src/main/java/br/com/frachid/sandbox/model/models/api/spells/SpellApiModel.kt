package br.com.frachid.sandbox.model.models.api.spells

import com.google.gson.annotations.SerializedName

data class SpellApiModel(@SerializedName("_id") var id: String? = "",
                         @SerializedName("spell") var spell: String? = "",
                         @SerializedName("type") var type: String? = "",
                         @SerializedName("effect") var effect: String? = "")
