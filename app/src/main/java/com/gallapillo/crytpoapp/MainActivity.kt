package com.gallapillo.crytpoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.gallapillo.crytpoapp.presentation.ui.theme.CrytpoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CrytpoAppTheme {

            }
        }
    }
}

