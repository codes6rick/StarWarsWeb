package com.souvikbiswas.flutterfire_samples

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
}
@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
  
        // we used the postDelayed(Runnable, time) method 
        // to send a message with a delayed time.
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.
    }
}
