package com.frank.mipymes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lastchance.R
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val button = view.findViewById<Button>(R.id.navigate_destination_button)
    button?.setOnClickListener {
        findNavController().navigate(R.id.flow_step_one_dest, null)
    }

    val options = navOptions {
        anim {
            enter = R.anim.slide_in_right
            exit = R.anim.slide_out_left
            popEnter = R.anim.slide_in_left
            popExit = R.anim.slide_out_right

        } }


    view.findViewById<Button>(R.id.navigate_destination_button)?.setOnClickListener {
        findNavController().navigate(R.id.flow_step_one_dest, null, options)
    }

    view.findViewById<Button>(R.id.navigate_action_button)?.setOnClickListener(
    Navigation.createNavigateOnClickListener(R.id.next_action, null)
    )



}
