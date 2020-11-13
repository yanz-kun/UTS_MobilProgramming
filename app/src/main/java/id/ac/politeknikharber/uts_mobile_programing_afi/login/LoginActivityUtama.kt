package id.ac.politeknikharber.uts_mobile_programing_afi.login

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.ac.politeknikharber.uts_mobile_programing_afi.MainActivity
import id.ac.politeknikharber.uts_mobile_programing_afi.R
import kotlinx.android.synthetic.main.activity_login.*

//class LoginActivityUtama :AppCompatActivity(){
//    val PREFS_NAME = "BelajarSharedPreference"
//    val KEY_EMAIL = "key.email"
//    val KEY_PASSWORD = "key.password"

//    lateinit var sharedPref:SharedPreferences

//    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
//        sharedPref = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
//    }

//    fun onLogin(view: View){
//        val email = input_email.text.toString()
//        saveEmail(email)
//        val password = input_password.text.toString()
//        savePassword(password)
//        msg()
//    }
//
//    private fun saveEmail(email:String){
//        val editor:SharedPreferences.Editor = sharedPref.edit()
//        editor.putString(KEY_PASSWORD, password)
//        editor.apply()
//    }
//
//    private fun savePassword(email:String){
//        val editor:SharedPreferences.Editor = sharedPref.edit()
//        editor.putString(KEY_PASSWORD, password)
//        editor.apply()
//    }
//
//    private fun msg(){
//        val email:String = input_email.text.toString()
//        val password:String = input_password.text.toString()
//
//        when{
//            email == " "->{
//                val msg = Toast.makeText(applicationContext, "masukan email", Toast.LENGTH_SHORT)
//                msg.setGravity(Gravity.TOP, 0, 140)
//                msg.show()
//            }
//            password == " "->{
//                val msg = Toast.makeText(applicationContext, "masukan email", Toast.LENGTH_SHORT)
//                msg.setGravity(Gravity.TOP, 0, 140)
//                msg.show()
//            }
//
//            else -> {
//                val msg = Toast.makeText(applicationContext, "Berhasi lLogin", Toast.LENGTH_SHORT)
//                msg.setGravity(Gravity.TOP, 0, 140)
//                msg.show()
//
//                startActivity(intent(this, MainActivity::class.java))
//            }
//
//        }
//    }
//}