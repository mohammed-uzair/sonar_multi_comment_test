package com.oviva.sonarmulticommenttest.view_model

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow

sealed interface ViewModelMainNavigation {
    data object NavigateBack : ViewModelMainNavigation
}

class ViewModelMain() : ViewModel() {

    private val navigation = MutableSharedFlow<ViewModelMainNavigation>(
        0,
        3,
        BufferOverflow.DROP_OLDEST
    )

    fun navigation(): SharedFlow<ViewModelMainNavigation> = navigation

    fun onBackPressed() {
        navigation.tryEmit(ViewModelMainNavigation.NavigateBack)
    }
}
