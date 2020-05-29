package com.frank.mipymes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.lastchance.R
import com.example.lastchance.databinding.FragmentCreateUserBinding

/**
 * A simple [Fragment] subclass.
 */
class fragment_create_user : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.setTitle("miPymes")

        var binding = DataBindingUtil.inflate<FragmentCreateUserBinding>(inflater, R.layout.fragment_create_user,
            container, false)

        binding.createFinishButton.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_fragment_create_user_to_fragment_inicio)
        }
        return binding.root
    }

}
