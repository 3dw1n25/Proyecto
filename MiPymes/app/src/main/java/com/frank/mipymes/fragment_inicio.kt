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
class fragment_inicio : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inicio, container, false)


        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
                inflater, R.layout.fragment_game, container, false)

                binding.Perfil.setOnClickListener { view: View ->
            view.findNavController().
            navigate(fragment_inicioDirections.action_fragment_inicio_to_fragment_perfil2)

        }

        binding.Ventas.setOnClickListener { view: View ->
            view.findNavController().
            navigate(fragment_inicioDirections.action_fragment_inicio_to_fragment_ventas)

        }


        binding.Inventario.setOnClickListener { view: View ->
            view.findNavController().
            navigate(fragment_inicioDirections.action_fragment_inicio_to_fragment_inventario)

        }

        binding.Opciones.setOnClickListener { view: View ->
            view.findNavController().
            navigate(fragment_inicioDirections.action_fragment_inicio_to_fragment_opciones)

        }


                return binding.root
}
