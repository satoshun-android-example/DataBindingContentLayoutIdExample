package com.github.satoshun.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.github.satoshun.example.databinding.MainActBinding

class MainActivity : AppCompatActivity(R.layout.main_act) {
  //  private lateinit var binding: MainActBinding
  private val binding by bindLazyView<MainActBinding>()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
//    binding = bindView()

    if (savedInstanceState == null) {
      supportFragmentManager.commit {
        add(R.id.container, MainFragment())
      }
    }
  }
}
