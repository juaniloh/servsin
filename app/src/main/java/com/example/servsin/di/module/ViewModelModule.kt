package com.example.servsin.di.module

import androidx.lifecycle.ViewModel
import com.example.servsin.di.viewModel.ViewModelKey
import com.example.servsin.ui.mainMenu.MainMenuViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainMenuViewModel::class)
    abstract fun provideMainMenuViewModel(viewModel: MainMenuViewModel): ViewModel
}
