package com.example.lyricsflowapp.ui.fragments.tutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lyricsflowapp.R
import com.example.lyricsflowapp.databinding.FragmentTutorialFifthBinding
import com.example.lyricsflowapp.databinding.FragmentTutorialFourthBinding

class TutorialFifthFragment : Fragment() {

    private lateinit var binding: FragmentTutorialFifthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTutorialFifthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Go back to previous tutorial
        binding.previousButton.setOnClickListener {
            findNavController().navigate(R.id.action_tutorialFifthFragment_to_tutorialFourthFragment)
        }

        // Finish whole tutorial
        binding.finishTutorialButton.setOnClickListener {
            findNavController().navigate(R.id.action_tutorialFifthFragment_to_homeFragment)
        }
    }
}