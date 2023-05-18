package com.example.extown.home.home2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.extown.R

class HomeTwoFragment : Fragment() {

    private var nextFragmentButton: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_two, container, false)

        nextFragmentButton = view.findViewById(R.id.buttonNextFragmentTwo)

        nextFragmentButton?.setOnClickListener {
            onNextFragmentButtonClicked()
        }

        return view
    }

    private fun onNextFragmentButtonClicked() {
        findNavController().navigate(R.id.action_homeTwo_to_homeThree)
    }
}