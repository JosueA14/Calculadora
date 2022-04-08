package cr.ac.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    var operacion : TextView ?= null
    var valor : String = ""
    var result : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        operacion = findViewById(R.id.textoInicio)

        //val expression = Expression("2+2")
        //println("*********" + expression.calculate())
        val buttonClear : Button = findViewById(R.id.buttonClear)
        buttonClear.setOnClickListener{ buttonClear() }
        val buttonSigno : Button = findViewById(R.id.buttonSigno)
        buttonSigno.setOnClickListener{ buttonSigno() }
        val buttonPorcentaje : Button = findViewById(R.id.buttonPorcentaje)
        buttonPorcentaje.setOnClickListener{ buttonPorcentaje() }
        val buttonDivision : Button = findViewById(R.id.buttonDivision)
        buttonDivision.setOnClickListener{ buttonDivision() }
        val buttonMultiplicacion : Button = findViewById(R.id.buttonMultiplicacion)
        buttonMultiplicacion.setOnClickListener{ buttonMultiplicacion() }
        val buttonResta : Button = findViewById(R.id.buttonResta)
        buttonResta.setOnClickListener{ buttonResta() }
        val buttonSuma : Button = findViewById(R.id.buttonSuma)
        buttonSuma.setOnClickListener{ buttonSuma() }
        val button9 : Button = findViewById(R.id.button9)
        button9.setOnClickListener{ button9() }
        val button8 : Button = findViewById(R.id.button8)
        button8.setOnClickListener{ button8() }
        val button7 : Button = findViewById(R.id.button7)
        button7.setOnClickListener{ button7() }
        val button6 : Button = findViewById(R.id.button6)
        button6.setOnClickListener{ button6() }
        val button5 : Button = findViewById(R.id.button5)
        button5.setOnClickListener{ button5() }
        val button4 : Button = findViewById(R.id.button4)
        button4.setOnClickListener{ button4() }
        val button3 : Button = findViewById(R.id.button3)
        button3.setOnClickListener{ button3() }
        val button2 : Button = findViewById(R.id.button2)
        button2.setOnClickListener{ button2() }
        val button1 : Button = findViewById(R.id.button1)
        button1.setOnClickListener{ button1() }
        val button0 : Button = findViewById(R.id.button0)
        button0.setOnClickListener{ button0() }
        val buttonComa : Button = findViewById(R.id.buttonComa)
        buttonComa.setOnClickListener{ buttonComa() }
        val buttonResultado : Button = findViewById(R.id.buttonResultado)
        buttonResultado.setOnClickListener{ buttonResultado() }
    }
    private fun buttonClear() {
        this.operacion?.setText("0")
    }
    private fun buttonSigno() {
        operacion?.text = operacion?.text
    }
    private fun buttonPorcentaje() {
        valor = operacion?.text as String
        if (operacion?.text != "0"){
            valor += "%"
            operacion?.text = valor
            result = false
        }
    }
    private fun buttonDivision() {
        valor = operacion?.text as String
        if (operacion?.text != "0"){
            valor += "/"
            operacion?.text = valor
            result = false
        }
    }
    private fun buttonMultiplicacion() {
        valor = operacion?.text as String
        if (operacion?.text != "0"){
            valor += "*"
            operacion?.text = valor
            result = false
        }
    }
    private fun buttonResta() {
        valor = operacion?.text as String
        if (operacion?.text != "0"){
            valor += "-"
            operacion?.text = valor
            result = false
        }
    }
    private fun buttonSuma() {
        valor = operacion?.text as String
        if (operacion?.text != "0"){
            valor += "+"
            operacion?.text = valor
            result = false
        }
    }
    private fun button9() {
        valor = operacion?.text as String
        if (operacion?.text == "0" || result == true){
            operacion?.text = "9"
            result = false
        }else if (operacion?.text != "0"){
            valor += "9"
            operacion?.text = valor
        }
    }
    private fun button8() {
        valor = operacion?.text as String
        if (operacion?.text == "0" || result == true){
            operacion?.text = "8"
            result = false
        }else if (operacion?.text != "0"){
            valor += "8"
            operacion?.text = valor
        }
    }
    private fun button7() {
        valor = operacion?.text as String
        if (operacion?.text == "0" || result == true){
            operacion?.text = "7"
            result = false
        }else if (operacion?.text != "0"){
            valor += "7"
            operacion?.text = valor
        }
    }
    private fun button6() {
        valor = operacion?.text as String
        if (operacion?.text == "0" || result == true){
            operacion?.text = "6"
            result = false
        }else if (operacion?.text != "0"){
            valor += "6"
            operacion?.text = valor
        }
    }
    private fun button5() {
        valor = operacion?.text as String
        if (operacion?.text == "0" || result == true){
            operacion?.text = "5"
            result = false
        }else if (operacion?.text != "0"){
            valor += "5"
            operacion?.text = valor
        }
    }
    private fun button4() {
        valor = operacion?.text as String
        if (operacion?.text == "0" || result == true){
            operacion?.text = "4"
            result = false
        }else if (operacion?.text != "0"){
            valor += "4"
            operacion?.text = valor
        }
    }
    private fun button3() {
        valor = operacion?.text as String
        if (operacion?.text == "0" || result == true){
            operacion?.text = "3"
            result = false
        }else if (operacion?.text != "0"){
            valor += "3"
            operacion?.text = valor
        }
    }
    private fun button2() {
        valor = operacion?.text as String
        if (operacion?.text == "0" || result == true){
            operacion?.text = "2"
            result = false
        }else if (operacion?.text != "0"){
            valor += "2"
            operacion?.text = valor
        }
    }
    private fun button1() {
        valor = operacion?.text as String
        if (operacion?.text == "0" || result == true){
            operacion?.text = "1"
            result = false
        }else if (operacion?.text != "0"){
            valor += "1"
            operacion?.text = valor
        }
    }
    private fun button0() {
        valor = operacion?.text as String
        if (operacion?.text == "0" || result == true){
            operacion?.text = "0"
            result = false
        }else if (operacion?.text != "0"){
            valor += "0"
            operacion?.text = valor
        }
    }
    private fun buttonComa() {
        valor = operacion?.text as String
        if (operacion?.text == "0" || result == true){
            operacion?.text = "0."
            result = false
        }else if (operacion?.text != "0"){
            valor += "."
            operacion?.text = valor
        }
    }
    private fun buttonResultado() {
        valor = operacion?.text as String
        var expression = Expression(valor)
        operacion?.text = expression.calculate().toString()
        result = true
    }
}