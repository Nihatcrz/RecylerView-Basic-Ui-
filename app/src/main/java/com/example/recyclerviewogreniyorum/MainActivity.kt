package com.example.recyclerviewogreniyorum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewogreniyorum.databinding.ActivityMainBinding
import com.example.recyclerviewogreniyorum.databinding.ItemBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var adapter: Adapterolustur
        lateinit var list: ArrayList<Takimolustur>
        lateinit var binding: ActivityMainBinding

        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.setHasFixedSize(true)
        list = ArrayList()
        val gs = Takimolustur("Galatasaray",R.drawable.gs)
        val fb = Takimolustur("Fenerbahçe",R.drawable.fb)
        val bjk = Takimolustur("Beşiktaş",R.drawable.bjk)
        val ts = Takimolustur("Trabzonspor",R.drawable.ts)

        list.add(gs)
        list.add(fb)
        list.add(bjk)
        list.add(ts)
        list.add(gs)
        list.add(fb)
        list.add(bjk)
        list.add(ts)
        list.add(gs)
        list.add(fb)
        list.add(bjk)
        list.add(ts)
        adapter = Adapterolustur(list)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}