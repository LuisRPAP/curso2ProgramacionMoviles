package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//

                    //evaluarNota(7)
                    //diaSemana(6)
                    //bucle()
                    //bucle2()
                    //bucle3()
                    //bucle4()
                    //while1()
                    ejemploBox("Mi primera cajita")



                }
            }
        }
    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}

@Composable
fun evaluarNota (nota : Int, modifier:Modifier =Modifier){
    var resultado=""
    if(nota <= 5){
        resultado="Suspenso"
    }
    else {
        resultado ="Aprobado"
    }
    Text (
        text= "Tu nota es $nota: ¡$resultado!",
        modifier = modifier

    )
}
@Composable
fun diaSemana(dia :Int, modifier: Modifier= Modifier) {
    var diaSem: String
    when (dia) {
        1 -> diaSem = "Lunes"
        2 -> diaSem = "Martes"
        3 -> diaSem = "Miercoles"
        4 -> diaSem = "Jueves"
        5 -> diaSem = "Viernes"
        6 -> diaSem = "Sabado"
        7 -> diaSem = "Domingo"
        else -> diaSem = "La semana solo tiene 7 dias"
    }

    Text(
        text = "El dia de la semana es $diaSem",
        modifier = modifier

    )
}
    @Composable
    fun bucle(modifier: Modifier= Modifier){
        var resultado : String=""
        for (i in 1..5)
        {
         resultado=resultado+i +" - "
        }
        Text(
            text = "$resultado",
            modifier = modifier
        )
    }
@Composable
fun bucle2(modifier: Modifier= Modifier){
    var resultado : String=""
    for (i in 1 until 5)
    {
        resultado=resultado+i +" - "
    }
    Text(
        text = "$resultado",
        modifier = modifier
    )
}
@Composable
fun bucle3(modifier: Modifier= Modifier){
    var resultado : String=""
    for (i in 1 .. 20)
    {
        resultado=resultado+i +" - "
    }
    Text(
        text = "$resultado",
        modifier = modifier
    )
}
@Composable
fun bucle4(modifier: Modifier= Modifier){
    var resultado : String=""
    for (i in 1 .. 20)
    {
        if(i%2==0) {
            resultado=resultado+i +" - "
        }
        else{

        }

    }
    Text(
        text = "$resultado",
        modifier = modifier
    )
}
@Composable
fun while1(modifier: Modifier= Modifier){
    var contador : Int=0
    var resultado : String=""
    while (contador <=5)     {
            resultado=resultado + "-" +contador
        contador++

    }
    Text(
        text = "$resultado",
        modifier = modifier
    )
}
@Composable
fun ejemploBox(    name: String,    modifier: Modifier = Modifier){
    Box (
        modifier= Modifier
            .size(150.dp)
            .background(Color.LightGray, RoundedCornerShape(12.dp))
            .border(width=2.dp,Color.Black)
            .padding(all=16.dp)
            .clickable { }
    ) {
        Text(
            text = name,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}