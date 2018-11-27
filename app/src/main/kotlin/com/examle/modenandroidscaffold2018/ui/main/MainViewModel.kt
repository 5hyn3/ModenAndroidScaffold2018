package com.examle.modenandroidscaffold2018.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val navigationCallBack: NavigationCallBack) : ViewModel() {
    var text: MutableLiveData<String> = MutableLiveData()
    private var count = 0

    fun onClick() {
        count++
        text.value = "count: $count"
    }

    fun transition() {
        this.navigationCallBack.transitionToSub()
    }
}
