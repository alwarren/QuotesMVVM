package com.ntxdroid.quotesdb

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by Al Warren on 12/11/2018.
 */

class QuotesViewModel : ViewModel() {

    val currentRandomQuote:LiveData<String>
        get() = QuotesRepository.currentRandomQuote

    fun onChangeRandomQuote() = QuotesRepository.changeRandomQuote()

}