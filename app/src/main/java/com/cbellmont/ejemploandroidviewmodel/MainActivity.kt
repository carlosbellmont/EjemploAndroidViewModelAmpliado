package com.cbellmont.ejemploandroidviewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.cbellmont.ejemploandroidviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Log.d(MainActivity::class.java.simpleName, "Iniciando ViewModel")
        val model = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        //Log.d(MainActivity::class.java.simpleName, "ViewModel iniciado")

        model.downloadFilms()

        model.films.forEach {
            binding.tvFilms.append("${it.name}\n")
        }

        binding.button1.setOnClickListener {
            binding.tvFilms.text =""

            model.download1to3().forEach {
                binding.tvFilms.append("${it.name}\n")
            }
        }

        binding.button2.setOnClickListener {
            binding.tvFilms.text =""

            model.download4to6().forEach {
                binding.tvFilms.append("${it.name}\n")
            }
        }

        binding.button3.setOnClickListener {
            binding.tvFilms.text =""

            model.download7to9().forEach {
                binding.tvFilms.append("${it.name}\n")
            }
        }
    }

}