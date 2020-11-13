package id.ac.politeknikharber.uts_mobile_programing_afi.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import id.ac.politeknikharber.uts_mobile_programing_afi.R
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        supportActionBar?.title = "Calculator"
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btn_kali.setOnClickListener(this)
        btn_bagi.setOnClickListener(this)
        btn_tambah.setOnClickListener(this)
        btn_kurang.setOnClickListener(this)
        btn_hapus.setOnClickListener(this)


    }

    override fun onClick(button: View) {
        when(button.id){
            R.id.btn_kurang ->{
               val edt1 = edt_angka1.text.toString()
                val edt2 = edt_angka2.text.toString()
               val kali = edt1.toInt() - edt2.toInt()

                val intent = Intent(this, HasilKalkuator::class.java)
                intent.putExtra("hasil", kali.toString())
                startActivity(intent)
            }

            R.id.btn_tambah ->{
                val edt1 = edt_angka1.text.toString()
                val edt2 = edt_angka2.text.toString()
                val kali = edt1.toInt() + edt2.toInt()

                val intent = Intent(this, HasilKalkuator::class.java)
                intent.putExtra("hasil", kali.toString())
                startActivity(intent)
            }

            R.id.btn_bagi ->{
                val edt1 = edt_angka1.text.toString()
                val edt2 = edt_angka2.text.toString()
                val kali = edt1.toInt() / edt2.toInt()

                val intent = Intent(this, HasilKalkuator::class.java)
                intent.putExtra("hasil", kali.toString())
                startActivity(intent)
            }

            R.id.btn_kali->{
                val edt1 = edt_angka1.text.toString()
                val edt2 = edt_angka2.text.toString()
                val kali = edt1.toInt() * edt2.toInt()

                val intent = Intent(this, HasilKalkuator::class.java)
                intent.putExtra("hasil", kali.toString())
                startActivity(intent)
            }
            R.id.btn_hapus->{
                val editableText= edt_angka1.getEditableText()
                val editableText2= edt_angka2.getEditableText()
                val length = editableText.length
                val length2 = editableText.length
                if (length > 0 && length2 > 0) {
                    editableText.delete(length - 1, length)
                    editableText2.delete(length - 1, length)
                }
            }
        }
    }
}