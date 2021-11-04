package org.fooshtech.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is contained in my Second Commit")
        println("Local Changed sims sim sim line of code has been")
    }

}
class Student(val id:Int,val name:String)