package ar.edu.unlam.viewmodels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

    val vm: MainViewModel by viewModels { MainViewModel.Factory(0) }
    lateinit var texto: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.texto)
        texto.text = vm.cantidadClicks.toString()

        findViewById<Button>(R.id.btnContar).setOnClickListener {
            vm.cantidadClicks++
            texto.text = vm.cantidadClicks.toString()
        }
    }

    override fun onStart() {
        super.onStart()

    }

}