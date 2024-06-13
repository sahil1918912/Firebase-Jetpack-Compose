package com.example.firebasejetpackcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firebasejetpackcompose.FirebaseRealtimeDB.ui.RealtimeScreen
import com.example.firebasejetpackcompose.ui.theme.FirebaseJetpackComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirebaseJetpackComposeTheme {
                val isInsert = remember{ mutableStateOf(false) }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        floatingActionButton = {
                            FloatingActionButton(onClick = {
                                isInsert.value = true
                            }) {
                                Icon(Icons.Default.Add, contentDescription = "")
                            }
                        }
                    ) {
                        RealtimeScreen(isInsert)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun preview(){
    FirebaseJetpackComposeTheme {

    }
}
