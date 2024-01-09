package com.blannon_network.loginscreenui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(){
    val isImeVisible by RememberImeState()
    GradientBox(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            val animateUpperSectionRatio by animateFloatAsState(
                targetValue = if (isImeVisible) 0f else 0.35f,
                label = "")

                AnimatedVisibility(
                    visible = !isImeVisible,
                    enter = fadeIn(),
                    exit = fadeOut()
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(animateUpperSectionRatio),
                        contentAlignment = Alignment.Center
                    ){
                    Text(
                        text ="Welcome To Blannon Network",
                        style = MaterialTheme.typography.headlineMedium,
                        color = Color.White
                    )
                }

            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                if (screenHeight()){
                    Spacer(
                        modifier =Modifier
                            .fillMaxSize(0.05f)
                    )
                } else{
                    Spacer(
                        modifier =Modifier
                            .fillMaxSize(0.1f)
                    )
                }

                Text(
                    text ="Login",
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.Black

                )
                if (screenHeight()){
                    Spacer(
                        modifier =Modifier
                            .fillMaxSize(0.05f)
                    )
                } else{
                    Spacer(
                        modifier =Modifier
                            .fillMaxSize(0.1f)
                    )
                }

                MTextField(
                    modifier = Modifier
                        .padding(horizontal = 18.dp),
                    label = "Username",
                    keyboardOptions = KeyboardOptions(),
                    keyboardActions = KeyboardActions(),
                    trailingIcon = Icons.Default.Person
                )

                Spacer(modifier = Modifier
                    .height(20.dp))
                MTextField(
                    modifier = Modifier
                        .padding(horizontal = 18.dp),
                    label = "Password",
                    keyboardOptions = KeyboardOptions(),
                    keyboardActions = KeyboardActions(),
                    trailingIcon = Icons.Default.Lock
                )
                if (isImeVisible){
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .width(350.dp)
                            .height(54.dp)
                            .padding(top =  9.dp )
                            .padding(horizontal = 18.dp),
                        colors = ButtonDefaults
                            .buttonColors(containerColor = Color.Red, contentColor = Color.Black),
                        shape = RoundedCornerShape(28.dp)
                    ){
                        Text(
                            text ="Login",
                            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight(500))
                        )

                    }
                }else{
                    Box(
                        modifier =Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ){

                        Button(
                            onClick = {},
                            modifier = Modifier
                                .width(350.dp)
                                .height(54.dp)
                                .padding(horizontal = 18.dp),
                            colors = ButtonDefaults
                                .buttonColors(containerColor = Color.Red, contentColor = Color.Black),
                            shape = RoundedCornerShape(28.dp)
                        ){
                            Text(
                                text ="Login",
                                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight(500))
                            )

                        }
                    }
                }


            }

        }
    }
}