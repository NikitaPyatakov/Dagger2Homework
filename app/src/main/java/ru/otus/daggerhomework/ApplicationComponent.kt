package ru.otus.daggerhomework

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component
interface ApplicationComponent {

    fun provideApplication(): Context

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context): ApplicationComponent
    }
}