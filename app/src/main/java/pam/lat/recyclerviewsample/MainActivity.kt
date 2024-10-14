package pam.lat.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pam.lat.samplerecyclerview.ItemsViewModel
import pam.lat.recyclerviewsample.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()

        for (i in 1..20) {
            data.add(ItemsViewModel("Item $i"))
        }

        val adapter = CustomAdapter(data)
        Log.d("test string","Jumlah data: "+data.size)

        recyclerview.adapter = adapter
    }
}
