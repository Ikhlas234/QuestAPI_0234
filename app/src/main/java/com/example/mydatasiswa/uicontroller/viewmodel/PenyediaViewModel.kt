package com.example.mydatasiswa.uicontroller.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.mydatasiswa.repositori.AplikasiDataSiswa

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            EntryViewModel(aplikasiDataSiswa().container.repositoryDataSiswa)
        }
        initializer {
            HomeViewModel(aplikasiDataSiswa().container.repositoryDataSiswa)
        }
    }
}

fun CreationExtras.aplikasiDataSiswa(): AplikasiDataSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDataSiswa)
