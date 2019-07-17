package com.ict.mito.mvvm_sample_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ict.mito.mvvm_sample_kotlin.databinding.ActivityMainBinding

// View
class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // bindingの用意・レイアウトセット
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        // ViewModelをバインド
        binding?.viewmodel = MainViewModel()
    }
}
