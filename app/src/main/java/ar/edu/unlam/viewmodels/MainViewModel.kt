package ar.edu.unlam.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModel(cantidadInicial: Int) : ViewModel() {
    var cantidadClicks = cantidadInicial

    class Factory(private val cantidadInicial: Int) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return MainViewModel(cantidadInicial) as T
        }
    }
}