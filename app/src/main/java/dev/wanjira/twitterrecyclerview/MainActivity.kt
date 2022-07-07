package dev.wanjira.twitterrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.wanjira.twitterrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayThread()

    }
    fun displayThread(){
        var thread  = Thread()
        var thread1 = Thread()
        var thread2 = Thread()
        var thread3 = Thread()
        var thread4 = Thread()
        var thread5 = Thread()

        var threadList = listOf(thread,thread1,thread2,thread3,thread4,thread5)
        var tweetAdapter = TweetRvAdapter(threadList)
        binding.rvThread.layoutManager = LinearLayoutManager(this)
        binding.rvThread.adapter = tweetAdapter
    }
}