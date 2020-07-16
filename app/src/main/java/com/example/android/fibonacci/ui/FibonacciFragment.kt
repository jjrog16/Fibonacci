package com.example.android.fibonacci.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.android.fibonacci.R
import timber.log.Timber

class FibonacciFragment : Fragment() {

    private lateinit var viewModel: FibonacciViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fibonacci_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FibonacciViewModel::class.java)
        // TODO: Use the ViewModel
        // Check to see results are showing as expected
        for (i in 0 until 1000){
            Timber.i("$i: ${viewModel.fibonacciResult[i]}")
        }

        //TODO: Create Adapter that handles RecyclerView

    }

}