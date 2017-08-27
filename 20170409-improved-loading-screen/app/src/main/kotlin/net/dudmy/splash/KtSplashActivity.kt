package net.dudmy.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class KtSplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, KtMainActivity::class.java)
        startActivity(intent)

        finish()
    }
}
