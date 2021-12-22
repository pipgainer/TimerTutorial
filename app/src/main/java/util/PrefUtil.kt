package util

import android.content.Context

class PrefUtil {
    companion object {
        fun getTImerLength(context: Context): Int {
            return 1
        }
        private const val PREVIOUS_TIMER_LENGTH_SECONDS_ID ="com.resocoder.timer.prvious_timer_length"


    }
}