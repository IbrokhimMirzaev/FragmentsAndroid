package com.example.fragmenthomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmenthomework.databinding.FragmentPinCodeBinding
import com.example.fragmenthomework.databinding.FragmentSplashBinding

class PinCodeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentPinCodeBinding.inflate(inflater, container, false)

        binding.okBtn.setOnClickListener {
            if (binding.editText.text.toString() == "1234") {
                parentFragmentManager.beginTransaction()
                    .addToBackStack("PinCodeFragment")
                    .add(R.id.main, AfterPinCodeFragment())
                    .commit()
            }
        }

        return binding.root
    }
}