package pkm.andro.pkmapplication.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Login(
    @SerializedName("id")
    @Expose
    val id:String,
    @SerializedName("nama")
    @Expose
    val nama: String
)