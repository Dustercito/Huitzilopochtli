package mx.uacj.recordatoriosapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import mx.uacj.recordatoriosapp.pantallas.PantallaCuestionario  // Asegúrate de importar correctamente la actividad

class MainActivity : AppCompatActivity() {
    lateinit var botonCambiarATest: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Manejo de bordes y márgenes del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        inicializarBotonATest()

        // Referencia al botón y configuración del clic
        val botonContinuar = findViewById<Button>(R.id.botonContinuarTest)
        botonContinuar.setOnClickListener {
            // Navegar a la nueva actividad del cuestionario
            val intent = Intent(this, PantallaCuestionario::class.java) // Aquí usas PantallaCuestionario::class.java
            startActivity(intent)
        }
    }
    fun inicializarBotonATest(){
        botonCambiarATest = findViewById(R.id.botonContinuarTest)
    }
}
