package com.github.satoshun.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import com.github.satoshun.example.databinding.MainActBinding

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act)

    val binding: MainActBinding = DataBindingUtil.setContentView(
      this,
      R.layout.main_act
    )
    supportFragmentManager.commit {
      add(R.id.container, MainFragment())
    }
  }
}
