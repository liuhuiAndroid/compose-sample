package com.example.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/**
 * 自定义Composable
 * 什么是Composable？——带@Composable注解的函数
 * 使用场景：能用就用
 */
@Composable
fun CustomComposable(name: String) {
    val calculatedName = name + if (name.length > 5) {
        ">5"
    } else {
        "<=5"
    }
    Column(Modifier.background(Color.Red)) {
        Text(text = "Hello $calculatedName!")
    }
}