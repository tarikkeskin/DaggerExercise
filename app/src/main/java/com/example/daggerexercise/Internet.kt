package com.example.daggerexercise

import android.util.Log

class Internet {


    var adres = Adres("Osmangazi")

    fun basvuruYap(){
        Log.e("Sonuç","Internet başvurusu ${adres.adresBilgisi} yapıldı..")
    }
}