package com.example.tess24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener{
            var cre1 = editTextNumber.text.toString()
            var cre2 = editTextNumber2.text.toString()
            var cre3 = editTextNumber3.text.toString()
            var cre4 = editTextNumber4.text.toString()
            var cre5 = editTextNumber5.text.toString()
            var no1 = editTextNumberDecimal.text.toString()
            var no2 = editTextNumberDecimal2.text.toString()
            var no3 = editTextNumberDecimal3.text.toString()
            var no4 = editTextNumberDecimal4.text.toString()
            var no5 = editTextNumberDecimal5.text.toString()

            if (cre1.isEmpty() || cre2.isEmpty() || cre3.isEmpty() || cre4.isEmpty() || cre5.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            if (no1.isEmpty() || no2.isEmpty() || no3.isEmpty() || no4.isEmpty() || no5.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            if (editTextTextPersonName.text.isEmpty() || editTextTextPersonName2.text.isEmpty() || editTextTextPersonName3.text.isEmpty() || editTextTextPersonName4.text.isEmpty() || editTextTextPersonName5.text.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            var total = cre1.toInt() + cre2.toInt() + cre3.toInt() + cre4.toInt() + cre5.toInt()
            sum1.text = total.toString()

            var sum = 0.0
            sum += (cre1.toDouble() * no1.toDouble())
            sum += (cre2.toDouble() * no2.toDouble())
            sum += (cre3.toDouble() * no3.toDouble())
            sum += (cre4.toDouble() * no4.toDouble())
            sum += (cre5.toDouble() * no5.toDouble())
            sum2.text = String.format("%.2f", sum / total)
        }
        b2.setOnClickListener {
            editTextNumberDecimal.text.clear()
            editTextNumberDecimal2.text.clear()
            editTextNumberDecimal3.text.clear()
            editTextNumberDecimal4.text.clear()
            editTextNumberDecimal5.text.clear()
            editTextTextPersonName.text.clear()
            editTextTextPersonName2.text.clear()
            editTextTextPersonName3.text.clear()
            editTextTextPersonName4.text.clear()
            editTextTextPersonName5.text.clear()
            sum1.text = ""
            sum2.text = ""
            editTextNumber.text.clear()
            editTextNumber2.text.clear()
            editTextNumber3.text.clear()
            editTextNumber4.text.clear()
            editTextNumber5.text.clear()
        }
    }


}