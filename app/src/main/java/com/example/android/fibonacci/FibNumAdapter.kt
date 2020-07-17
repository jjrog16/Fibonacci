package com.example.android.fibonacci

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import timber.log.Timber
import java.math.BigInteger

class FibNumAdapter(private val fibonacciResult: Array<BigInteger>):
        RecyclerView.Adapter<FibNumAdapter.FibNumViewHolder>(){

    class FibNumViewHolder(val textView: TextView):RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FibNumViewHolder {
        val textView = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false) as TextView
        return FibNumViewHolder(textView)
    }

    override fun getItemCount() = fibonacciResult.size

    override fun onBindViewHolder(holder: FibNumViewHolder, position: Int) {
        //Timber.i("Fibonacci position: $position -> ${fibonacciResult[position]}")
        holder.textView.text = fibonacciResult[position].toString()
    }
}