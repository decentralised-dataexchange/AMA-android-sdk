package io.igrant.data_wallet.models.connectionRequest

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Transport {
    @SerializedName("return_route")
    @Expose
    var returnRoute: String? = null
}