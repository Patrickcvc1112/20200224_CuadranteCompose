package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CuatroCuadrantes()
                }
            }
        }
    }
}

@Composable
fun CuatroCuadrantes() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Cuadrante(Color(0xFFEADDFF), stringResource(R.string.Titulo1), stringResource(R.string.Descripcion1),modifier = Modifier.weight(1f))
            Cuadrante(Color(0xFFD0BCFF), stringResource(R.string.Titulo2), stringResource(R.string.Descripcion2),modifier = Modifier.weight(1f))
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Cuadrante(Color(0xFFB69DF8), stringResource(R.string.Titulo3), stringResource(R.string.Descripcion3),modifier = Modifier.weight(1f))
            Cuadrante(Color(0xFFF6EDFF), stringResource(R.string.Titulo4), stringResource(R.string.Descripcion4),modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun Cuadrante(backgroundColor: Color, title: String, description: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FourQuadrantsLayoutPreview() {
    CuadranteComposeTheme {
        CuatroCuadrantes()
    }
}