package com.example.daggerexercise

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideAdres() : Adres{
        return  Adres("Osmangazi")
    }
}