package com.globant.di

import com.globant.data.repositories.MarvelCharacterRepository
import com.globant.domain.repositories.MarvelCharacterRepositoryContract
import com.globant.mvvm.viewModels.CharacterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCasesModule = module {
    single<MarvelCharacterRepositoryContract> { MarvelCharacterRepository() }
}

val viewModelsModule= module {
    viewModel { CharacterViewModel() }
}


