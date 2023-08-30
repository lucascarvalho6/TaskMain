package com.example.aulasab.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MainScreen(){
    Column {
        Text(text = "asdfasdf")
        Text( "TextoMainScreen")
        Row {
            Button(onClick = {
                Log.i("### MainScreen(){..., ","Botao1 Clicado!!")
            }) {
                Text("Btn1")
            }
            Button(onClick = { /*TODO*/ }) {
                Text("Navegar para TaskScreen")
            }
        }
    }
}