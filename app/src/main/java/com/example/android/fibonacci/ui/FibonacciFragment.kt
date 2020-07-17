package com.example.android.fibonacci.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.fibonacci.FibNumAdapter
import com.example.android.fibonacci.R
import kotlinx.android.synthetic.main.fibonacci_fragment.*
import timber.log.Timber
import java.math.BigInteger

class FibonacciFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var viewModel: FibonacciViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fibonacci_fragment, container, false)

        viewModel = ViewModelProvider(this).get(FibonacciViewModel::class.java)

        recyclerView = view.findViewById(R.id.fib_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = FibNumAdapter(viewModel.fibonacciResult)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel
        // Check to see results are showing as expected

        //TODO: Create Adapter that handles RecyclerView

    }

}