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
import com.example.lastchance.databinding.FragmentInicioBinding

/**
 * A simple [Fragment] subclass.
 */
class fragment_inicio : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.setTitle("miPymes")

        var binding = DataBindingUtil.inflate<FragmentInicioBinding>(inflater, R.layout.fragment_inicio,
            container, false)

        binding.toolbar.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_fragment_inicio_to_fragment_perfil2)
        }
        binding.toolbar2.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_fragment_inicio_to_fragment_inventario)
        }
        binding.toolbar4.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_fragment_inicio_to_fragment_opciones)
        }
        binding.toolbar5.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_fragment_inicio_to_fragment_ventas)
        }

        return binding.root
    }

}
