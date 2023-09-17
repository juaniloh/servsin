package com.example.servsin.ui.siteLogs

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.servsin.R

class SiteLogsFragment : Fragment() {

    companion object {
        fun newInstance() = SiteLogsFragment()
    }

    private lateinit var viewModel: SiteLogsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_site_logs, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SiteLogsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}