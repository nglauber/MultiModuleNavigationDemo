package br.com.nglauber.feature_onboarding

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.run {
            findViewById<Button>(R.id.btnProfile).setOnClickListener {
                // from onboarding module...
                findNavController().navigate(R.id.action_profile)
            }
            findViewById<Button>(R.id.btnPassword).setOnClickListener {
                findNavController().navigate(Uri.parse("ngvl://passwordupdate"))
            }
        }
    }
}