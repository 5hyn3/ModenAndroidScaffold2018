package com.examle.modenandroidscaffold2018.ui.main

import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.examle.modenandroidscaffold2018.R
import com.examle.modenandroidscaffold2018.databinding.MainFragmentBinding

interface NavigationCallBack {
    fun transitionToSub()
}

class MainFragment : androidx.fragment.app.Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val navigationCallBack = object : NavigationCallBack {
        override fun transitionToSub() {
            val view = this@MainFragment.view ?: return
            Navigation.findNavController(view).navigate(R.id.action_main_to_sub)
        }
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        this.binding =
                DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false) as MainFragmentBinding
        this.binding.setLifecycleOwner(this)
        return this.binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        this.viewModel = ViewModelProviders.of(this, MainViewModelFactory(this.navigationCallBack))
            .get(MainViewModel::class.java)
        this.binding.viewModel = this.viewModel
    }
}
