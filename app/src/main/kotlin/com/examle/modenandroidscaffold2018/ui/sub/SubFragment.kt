package com.examle.modenandroidscaffold2018.ui.sub

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.examle.modenandroidscaffold2018.R


class SubFragment : Fragment() {

    companion object {
        fun newInstance() = SubFragment()
    }

    private lateinit var viewModel: SubViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sub_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SubViewModel::class.java)
        // TODO: Use the ViewModel
    }
}
