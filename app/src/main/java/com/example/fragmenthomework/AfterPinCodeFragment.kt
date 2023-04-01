package com.example.fragmenthomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmenthomework.databinding.FragmentAfterPinCodeBinding

class AfterPinCodeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentAfterPinCodeBinding.inflate(inflater, container, false)

        binding.first.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.colorFieldForFragment, FirstFragment())
                .commit()
        }

        binding.second.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.colorFieldForFragment, SecondFragment())
                .commit()
        }

        binding.third.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.colorFieldForFragment, ThirdFragment())
                .commit()
        }

        binding.fourth.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.colorFieldForFragment, FourthFragment())
                .commit()
        }

        return binding.root
    }

}