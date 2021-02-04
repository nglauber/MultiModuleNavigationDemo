package br.com.nglauber.feature_profile

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.run {
            findViewById<Button>(R.id.btnDetails).setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_definePasswordFragment)
            }
        }
    }
}