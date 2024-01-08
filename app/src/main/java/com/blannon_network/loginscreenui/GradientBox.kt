package com.blannon_network.loginscreenui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color


val Red = Color.Red
val Black = Color.Black
@Composable
fun GradientBox(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
){

    Box(modifier = modifier
        .background(
            brush = Brush.linearGradient(
                listOf(
                    Red, Black
                )
            ))
    ){
        content()
    }

}
