package com.chibufirst.ibook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chibufirst.ibook.databinding.FragmentProceedBinding
import com.google.android.material.snackbar.Snackbar

class ProceedFragment : Fragment() {

    private lateinit var binding: FragmentProceedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentProceedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.proceedButton.setOnClickListener {
            Snackbar.make(binding.root, "Welcome!", Snackbar.LENGTH_SHORT).show()
        }
    }

}