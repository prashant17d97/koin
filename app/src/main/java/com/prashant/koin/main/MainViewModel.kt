package com.prashant.koin.main

import androidx.lifecycle.ViewModel
import com.prashant.koin.domain.repo.Repository

class MainViewModel(
    private val repository: Repository
) : ViewModel() {


    fun test() {
        repository.test()
    }
}