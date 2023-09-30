package com.example.modifier

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Column(
//                modifier = Modifier
//                    .background(color = Color.Green)
//                    .padding(20.dp).fillMaxWidth(1f)
//            ) {
//                Text(text = "Hello")
//                Text(text = "World")
//            }

        Column {
            Button(onClick = {
                Toast.makeText(this@MainActivity,"Hello Monu",Toast.LENGTH_LONG).show()


            }) {
                Text(text = "Hello")


            }
        }
        }

    }


}