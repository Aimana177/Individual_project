package kg.test.individual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivityHits : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hits)
    }
    val imageView = findViewById<ImageView>(R.id.imageView7)

        .setOnClickListener {
            startActivity(Intent(this, MainActivityProfile::class.java))
        }
}