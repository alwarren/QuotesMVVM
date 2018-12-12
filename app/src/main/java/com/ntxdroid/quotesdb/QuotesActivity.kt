package com.ntxdroid.quotesdb

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ntxdroid.quotesdb.databinding.ActivityQuotesBinding

class QuotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)

        val viewModel = ViewModelProviders.of(this)
            .get(QuotesViewModel::class.java)

        DataBindingUtil.setContentView<ActivityQuotesBinding>(
            this, R.layout.activity_quotes
        ).apply {
            setLifecycleOwner(this@QuotesActivity)
            viewmodel = viewModel
        }
    }
}
