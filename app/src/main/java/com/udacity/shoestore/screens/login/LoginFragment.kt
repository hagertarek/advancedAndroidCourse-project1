package com.udacity.shoestore.screens.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private lateinit var viewModel: LoginViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val navController = findNavController()
        binding = FragmentLoginBinding.inflate(
            inflater,
            container,
            false
        )
        viewModel = ViewModelProvider(requireActivity()).get(LoginViewModel::class.java)

        with(binding) {
            btnCreate.setOnClickListener {
                viewModel.login(etEmail.text.toString(), etPassword.text.toString())
                navController.navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())

            }
            btnLogin.setOnClickListener {
                viewModel.login(etEmail.text.toString(), etPassword.text.toString())
                navController.navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
            }
        }

        return binding.root
    }

}