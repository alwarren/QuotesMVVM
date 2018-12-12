package com.ntxdroid.quotesdb

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData

/**
 * Created by Al Warren on 12/11/2018.
 */

object QuotesRepository {
    private val quotes = listOf(
        "\"Home is where we tie one end of the thread of life.\" - Martin Buxbaum",
        "\"Good thoughts bear good fruit, bad thoughts bear bad fruit.\" - James Allen",
        "\"You need to claim the events in your life to make yourself yours.\" - Florida Scott-Maxwell",
        "\"Better keep yourself clean and bright; you are the window through which you must see the world.\" - George Bernard Shaw",
        "\"Never wrestle with a pig. You get dirty, and besides, the pig likes it.\" - George Bernard Shaw",
        "\"Success is sweet and sweeter if long delayed and gotten through many struggles and defeats.\" - Amos Bronson Alcott",
        "\"You can't crush ideas by suppressing them. You can only crush them by ignoring them.\" - Ursula K. Le Guin",
        "\"Of all the things you wear, your expression is the most important.\" - Janet Lane",
        "\"Show me a man with both feet on the ground, and I'll show you a man who can't put his pants on.\" - Arthur K. Watson",
        "\"Learn your language well and command it well, and you will have the first component to life.\" - Edward R. Murrow "
    )

    private val sCurrentRandomQuote = MutableLiveData<String>()
    val currentRandomQuote: LiveData<String>
        get() = sCurrentRandomQuote

    init {
        sCurrentRandomQuote.value = randomQuote()
    }

    private fun randomQuote() = quotes.shuffled().first()

    fun changeRandomQuote() {
        sCurrentRandomQuote.value = randomQuote()
    }
}