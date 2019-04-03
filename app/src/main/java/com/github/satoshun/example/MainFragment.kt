package com.github.satoshun.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.satoshun.example.databinding.MainFragBinding

class MainFragment : Fragment() {
  private lateinit var binding: MainFragBinding

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = MainFragBinding.inflate(inflater, container, false)
    return binding.root
  }
}
