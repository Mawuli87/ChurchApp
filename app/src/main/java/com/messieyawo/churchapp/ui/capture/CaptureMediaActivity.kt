package com.messieyawo.churchapp.ui.capture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.messieyawo.churchapp.R
import com.messieyawo.churchapp.databinding.ActivityCaptureMediaBinding

class CaptureMediaActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityCaptureMediaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityCaptureMediaBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setupActionBar()

    }

    private fun setupActionBar() {
        setSupportActionBar(mBinding.toolbarAddDishActivity)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_arrow_back)

        mBinding.toolbarAddDishActivity.setNavigationOnClickListener { onBackPressed() }
    }
}