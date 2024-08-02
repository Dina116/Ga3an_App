 package com.training.ga3an

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener{
private lateinit var text:TextView
private lateinit var image:ImageView
private lateinit var ga3an:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
      ga3an=findViewById(R.id.b1)
        text=findViewById(R.id.iv_ga3an)
        image=findViewById(R.id.iv_ga3an)



    }

    override fun onClick(p0: View?) {
       text.setText("I am Shab3an")
       ga3an.setText("Dinner is not ready")
        image.setImageResource(R.drawable.shab3an)




    }
}