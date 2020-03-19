package com.example.android.dessertclicker

import android.os.Handler
import timber.log.Timber

class DessertTimer {

    // The number of seconds counted since the timer started
    var secondsCount = 0

    private var handler = Handler()
    private lateinit var runnable: Runnable


    fun startTimer() {

        runnable = Runnable {
            secondsCount++
            Timber.i("Timer is at : $secondsCount")

            handler.postDelayed(runnable, 1000)
        }

        // This is what initially starts the timer
        handler.postDelayed(runnable, 1000)


    }

    fun stopTimer() {

        handler.removeCallbacks(runnable)
    }
}