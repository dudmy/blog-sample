package net.dudmy.splash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class KtMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kt)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(baseContext, "I'm kotlin activity!", Toast.LENGTH_SHORT).show()
        }
    }
}
