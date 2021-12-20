package kg.test.individual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }
    val imageView = findViewById<ImageView>(R.id.imageView8)

    .setOnClickListener {
        startActivity(Intent(this, MainActivityRegister::class.java))
    }
}
