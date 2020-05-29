package com.frank.mipymes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lastchance.R

/**
 * A simple [Fragment] subclass.
 */
class fragment_inventario : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
                inflater, R.layout.fragment_game, container, false

                binding.playButton.setOnClickListener { view: View ->
            view.findNavController().
            navigate(TitleFragmentDirections.actionTitleFragmentToGameFragment())

        }
                return binding.root
}
