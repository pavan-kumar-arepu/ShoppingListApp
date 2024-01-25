package com.ppam.shoppinglistapp

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.maps.model.LatLng
import kotlinx.coroutines.launch

class LocationViewModel: ViewModel() {
    private  val _location= mutableStateOf<LocationData?>(null)
    val location : State<LocationData?> = _location

    private val _address = mutableStateOf(listOf<GeocodingResult>())
    val address: State<List<GeocodingResult>> = _address


    fun updateLocation(newLocation: LocationData){
        _location.value = newLocation
    }

    fun fetchAddress(latlng: String){
        try{
            viewModelScope.launch {
                val result = RetrofitClient.create().getAddressFromCoordinates(
                    latlng,
                    "AIzaSyCmy49CxkayNY8mfUOXJvU5LoiM-IIj-aM"
                )
                _address.value = result.results
            }
        }catch(e:Exception) {
            Log.d("PAVAN", "${e.cause} ${e.message}")
        }
    }
}