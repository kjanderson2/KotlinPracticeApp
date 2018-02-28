package android.kaitlynanderson.com.kotlinpracticeapp

import android.util.Log
import java.net.URL

/**
 * Created by kaitlynanderson on 2/27/18.
 */
class Request(private val url: String) {
    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}