package com.juncompany.countmvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel(): ViewModel() {
    private val _respository: CounterRepository = CounterRepository()
    private val _count = mutableStateOf(_respository.getCounter().count)

    val count: MutableState<Int> = _count

    fun increment(){
        _respository.incrementCounter()
        _count.value = _respository.getCounter().count
    }

    fun decrement(){
        _respository.decrementCounter()
        _count.value = _respository.getCounter().count
    }
}