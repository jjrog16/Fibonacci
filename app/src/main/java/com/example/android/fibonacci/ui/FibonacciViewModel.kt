package com.example.android.fibonacci.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber
import java.math.BigInteger

class FibonacciViewModel : ViewModel() {

    // Maximum size of the requested input
    private val maxSizeOfInput = 1000

    // Size of the Memo array
    private val memoSize = maxSizeOfInput + 1

    // Used to increase performance and eliminate StackOverFlow error
    // from running out of Stack space due to recursion
    private val memo= Array(memoSize){0.toBigInteger()}

    // Result of Fibonacci sequence that will be shown to the user
    val fibonacciResult = Array(maxSizeOfInput){0.toBigInteger()}

    // Calculate Fibonacci sequence
    private fun fibonacciSequence(number: BigInteger, memo: Array<BigInteger>) : BigInteger{
        when {
            number <= 0.toBigInteger() -> return 0.toBigInteger()
            number == 1.toBigInteger() -> return 1.toBigInteger()
            memo[number.toInt()] > 0.toBigInteger() -> return memo[number.toInt()]
        }
        memo[number.toInt()] = (fibonacciSequence(number-1.toBigInteger(), memo) + fibonacciSequence(number-2.toBigInteger(),memo))
        return memo[number.toInt()]
    }

    // Create the list of the Fibonacci sequence
    fun produceFibonacciSequence(){
        for (i in 0 until maxSizeOfInput){
            fibonacciResult[i] = fibonacciSequence(i.toBigInteger(), memo)
        }
    }

    init {
        produceFibonacciSequence()
    }

}