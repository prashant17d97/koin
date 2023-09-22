package com.prashant.koin.domain.repo

import android.util.Log

class RepositoryImpl : Repository {
    override fun test() {
        Log.e("Repository", "test: Test")
    }
}