package com.blannon_network.loginscreenui

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

@Composable
fun screenHeigth():Boolean{
    val conf = LocalConfiguration.current
    return conf.screenHeightDp <= 786
}