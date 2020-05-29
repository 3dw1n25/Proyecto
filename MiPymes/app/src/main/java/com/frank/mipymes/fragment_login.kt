package com.frank.mipymes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
class fragment_login : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment



        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
                inflater, R.layout.fragment_game, container, false)


                binding.login_button.setOnClickListener { view: View ->
            view.findNavController().
            navigate(fragment_loginDirections.action_fragment_login_to_fragment_inicio)

        }


        binding.create_button.setOnClickListener { view: View ->
            view.findNavController().
            navigate(fragment_loginDirections.action_fragment_login_to_fragment_create_user)

        }




                return binding.root
}
