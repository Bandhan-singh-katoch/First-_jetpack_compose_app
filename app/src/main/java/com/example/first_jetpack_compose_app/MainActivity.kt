package com.example.first_jetpack_compose_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.first_jetpack_compose_app.ui.theme.First_Jetpack_compose_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    MyApp{
                        MyScreenContent()
                    }
        }
    }
}


@Composable
fun MyApp(content: @Composable () -> Unit ){
    First_Jetpack_compose_appTheme {
        Surface(color = Color.Green){
            content()
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",modifier = Modifier.padding(22.dp))
}

@Composable
fun MyScreenContent(){
    Column{
        Greeting(name = "Android")
        Divider(color = Color.Black)
        Greeting(name = "There")
    }
}

@Preview("MyScreenContent preview")
@Composable
fun DefaultPreview() {
    MyApp{
        MyScreenContent()
    }
}