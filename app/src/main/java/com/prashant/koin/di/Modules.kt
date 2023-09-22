package com.prashant.koin.di

import com.prashant.koin.domain.repo.Repository
import com.prashant.koin.domain.repo.RepositoryImpl
import com.prashant.koin.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object Modules {

    val appModule = module {
        single<Repository> { RepositoryImpl() }
        viewModel {
            MainViewModel(
                repository = get()
            )
        }
    }
}