package kg.test.individual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivityRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
    val imageView = findViewById<ImageView>(R.id.profile)

        .setOnClickListener {
            startActivity(Intent(this, MainActivityPage::class.java))
        }
}