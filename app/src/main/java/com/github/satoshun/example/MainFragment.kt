package com.github.satoshun.example

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.github.satoshun.example.databinding.MainFragBinding

class MainFragment : Fragment(R.layout.main_frag) {
  private lateinit var binding: MainFragBinding

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    binding = bindView()
  }
}

