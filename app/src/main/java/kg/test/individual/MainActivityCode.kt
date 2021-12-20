package kg.test.individual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivityCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)
    }
    val imageView = findViewById<ImageView>(R.id.imageView)

        .setOnClickListener {
            startActivity(Intent(this, MainActivityPage::class.java))
        }
}