package com.example.daggerexercise

import android.util.Log

class Kargo {
    var adres = Adres("Osmangazi")

    fun gonder(){
        Log.e("Sonuç","Kargo ${adres.adresBilgisi} adresine gitti..")
    }
}