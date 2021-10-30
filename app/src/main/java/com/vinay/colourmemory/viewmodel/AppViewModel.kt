package com.vinay.colourmemory.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vinay.colourmemory.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by VINAY'S on 31/10/21.
 */
@HiltViewModel
class AppViewModel @Inject constructor(
    private val repository: Repository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel()  {

}