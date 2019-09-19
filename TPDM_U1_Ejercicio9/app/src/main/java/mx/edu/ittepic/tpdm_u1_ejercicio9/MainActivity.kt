package mx.edu.ittepic.tpdm_u1_ejercicio9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var num : EditText ?= null
    var hasta : EditText ?= null
    var btn : Button ?= null
    var etq : TextView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num = findViewById(R.id.numero)
        hasta = findViewById(R.id.hasta)
        btn = findViewById(R.id.btn)
        etq = findViewById(R.id.tabla)

        btn?.setOnClickListener {

            var n = num?.text.toString().toInt()
            var h = hasta?.text.toString().toInt()
            var t = ""

            (1..h).forEach {
                var r = n*it
                t = t+n+"X"+it+"="+r+"\n"
            }
            etq?.setText(t)
        }
    }
}
