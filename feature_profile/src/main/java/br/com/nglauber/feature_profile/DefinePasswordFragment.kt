package br.com.nglauber.feature_profile

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DefinePasswordFragment : Fragment(R.layout.fragment_define_password) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.run {
            findViewById<Button>(R.id.btnOk).setOnClickListener {
                findNavController().popBackStack()
            }
            findViewById<Button>(R.id.btnHome).setOnClickListener {
                findNavController().popBackStack(R.id.homeFragment, false)
            }
        }
    }
}