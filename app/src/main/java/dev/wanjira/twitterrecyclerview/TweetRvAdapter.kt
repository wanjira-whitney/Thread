package dev.wanjira.twitterrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.Thread
import kotlin.concurrent.thread

class TweetRvAdapter(var tweetList: List<Tweets>):
    RecyclerView.Adapter<ThreadViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThreadViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.thread_list_item, parent, false)
        return ThreadViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ThreadViewHolder, position: Int) {
        var currentThread = tweetList.get(position)
        holder.tvName.text = currentThread.name
        holder.tvAt.text = currentThread.handle
        holder.tvTime.text=currentThread.time
        holder.tvTweet.text=currentThread.tweet
    }
    override fun getItemCount(): Int {
        return tweetList.size
    }
}
class ThreadViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvAt = itemView.findViewById<TextView>(R.id.tvAt)
    var tvTime = itemView.findViewById<TextView>(R.id.tvTime)
    var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)

}
