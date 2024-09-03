package com.velosobr.coroutines_masterclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.velosobr.coroutines_masterclass.ui.theme.CoroutinesmasterclassTheme
import com.velosobr.coroutines_masterclass.util.RotatingBoxScreen
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        GlobalScope.launch(Dispatchers.IO) {
            delay(3000L)

            Thread.sleep(3000L)
        }

        setContent {
            CoroutinesmasterclassTheme {
                RotatingBoxScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoroutinesmasterclassTheme {

    }
}