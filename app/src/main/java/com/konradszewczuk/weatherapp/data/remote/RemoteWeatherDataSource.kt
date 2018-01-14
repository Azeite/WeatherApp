package com.konradszewczuk.weatherapp.data.remote

import javax.inject.Inject


class RemoteWeatherDataSource  @Inject constructor(private val remoteWeatherService: RemoteWeatherService) {

    fun requestWeatherForCity(latitude: String, longitude: String) =
            remoteWeatherService.requestWeatherForCity(latitude, longitude)
}