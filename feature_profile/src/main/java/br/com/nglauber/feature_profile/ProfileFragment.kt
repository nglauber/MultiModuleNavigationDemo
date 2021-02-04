package br.com.nglauber.feature_profile

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import br.com.nglauber.common.User

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.run {
            val user = arguments?.getParcelable<User>("user")
            findViewById<TextView>(R.id.txtName).text = "Hi ${user?.let { it.name + " - " + it.id } ?: "anonymous"}"
            findViewById<Button>(R.id.btnDetails).setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_definePasswordFragment)
            }
        }
    }
}