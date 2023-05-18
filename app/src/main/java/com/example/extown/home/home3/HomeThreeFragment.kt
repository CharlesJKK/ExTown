package com.example.extown.home.home3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.extown.R

class HomeThreeFragment : Fragment() {

    private var closeButton: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_three, container, false)

        closeButton = view.findViewById(R.id.buttonCloseActivity)

        closeButton?.setOnClickListener {
            onNextFragmentButtonClicked()
        }

        return view
    }

    private fun onNextFragmentButtonClicked() {
        activity?.finish()
    }
}