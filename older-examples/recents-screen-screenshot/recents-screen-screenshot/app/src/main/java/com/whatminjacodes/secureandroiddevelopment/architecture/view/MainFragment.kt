package com.whatminjacodes.secureandroiddevelopment.architecture.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.whatminjacodes.secureandroiddevelopment.InsecureActivity
import com.whatminjacodes.secureandroiddevelopment.databinding.FragmentMainBinding
import com.whatminjacodes.secureandroiddevelopment.SecureActivity


/*
 *      MainFragment
 *      - has buttons to secure and insecure activity examples
 */
class MainFragment: Fragment() {

    // View Binding
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // This is needed for view binding
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupClickListeners()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // Setup the button in our fragment to call getUpdatedText method in viewModel
    private fun setupClickListeners() {
        binding.openInSecureActivityButton.setOnClickListener { openInsecureActivity() }
        binding.openSecureActivityButton.setOnClickListener { openSecureActivity() }
    }

    private fun openInsecureActivity() {
        val intent = Intent(activity, InsecureActivity::class.java)
        startActivity(intent)
    }

    private fun openSecureActivity() {
        val intent = Intent(activity, SecureActivity::class.java)
        startActivity(intent)
    }
}