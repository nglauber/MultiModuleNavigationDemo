package br.com.nglauber.feature_onboarding

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import br.com.nglauber.common.NavigationLinks

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.run {
            findViewById<Button>(R.id.btnProfile).setOnClickListener {
                findNavController().navigate(R.id.action_profile, bundleOf("user" to br.com.nglauber.common.User(1, "Nelson")))
            }
            findViewById<Button>(R.id.btnPassword).setOnClickListener {
                findNavController().navigate(NavigationLinks.LINK_PASSWORD_CHANGE)
            }
        }
    }
}