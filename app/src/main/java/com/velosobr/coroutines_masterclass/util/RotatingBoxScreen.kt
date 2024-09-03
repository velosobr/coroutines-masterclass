package com.velosobr.coroutines_masterclass.util

import android.util.Log
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@Composable
fun RotatingBoxScreen(modifier: Modifier = Modifier) {
    val infiniteTransaction = rememberInfiniteTransition(label = "")
    val angleRatio by infiniteTransaction.animateFloat(
        initialValue = 0f, targetValue = 1f, animationSpec = infiniteRepeatable(
            animation = tween(1000)
        ), label = ""
    )
Log.d("RotatingBoxScreen", "passing here")
    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Box(modifier = Modifier
            .size(100.dp)
            .graphicsLayer {
                rotationZ = 360f * angleRatio
            }
            .background(MaterialTheme.colorScheme.primary))

        Log.d("RotatingBoxScreen", "passing here 2")
    }

}