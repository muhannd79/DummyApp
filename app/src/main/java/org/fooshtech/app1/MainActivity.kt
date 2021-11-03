package org.fooshtech.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is contained in my Second Commit")
        println("Local Changed")
    }

    sealed class CarTypeSealed{
        class BMW : CarTypeSealed()
        class Toyota : CarTypeSealed()

    }
}