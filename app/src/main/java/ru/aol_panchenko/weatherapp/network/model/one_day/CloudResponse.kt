package ru.aol_panchenko.weatherapp.network.model.one_day

import com.google.gson.annotations.SerializedName

/**
 * Created by Panchenko.AO on 18.09.2017.
 */
class CloudResponse(@SerializedName("all") val cloudiness: Int)