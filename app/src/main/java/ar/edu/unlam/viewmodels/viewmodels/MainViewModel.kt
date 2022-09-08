package ar.edu.unlam.viewmodels.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModel(initialQuantity: Int) : ViewModel() {
    var clicksAmount: MutableLiveData<Int> = MutableLiveData(initialQuantity)

    class Factory(private val initialQuantity: Int) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return MainViewModel(initialQuantity) as T
        }
    }

    fun increaseClicks() {
        val current = clicksAmount.value
        if (current != null) {
            clicksAmount.value = current + 1
        }
    }

}