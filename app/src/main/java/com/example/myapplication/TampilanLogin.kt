package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TampilanLogin(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF16343B))
            .padding(
                horizontal = 30.dp,
                vertical = 25.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Teks pertama
        Text(
            text = "Login",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF67D9FF)
        )

        // Teks kedua
        Text(
            text = "Ini adalah halaman login",
            fontSize = 14.sp,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(35.dp))

        // Gambar pertama
        Image(
            painter = painterResource(id = R.drawable.logo_umy),
            contentDescription = "Logo UMY",
            modifier = Modifier
                .size(110.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(22.dp))

        // Teks ketiga
        Text(
            text = "Nama",
            fontSize = 15.sp,
            color = Color(0xFF67D9FF)
        )

        // Teks keempat
        Text(
            text = "Muhammad Daffa Marlan",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center
        )

        // Teks kelima
        Text(
            text = "20240240078",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(28.dp))

        // Gambar kedua
        Image(
            painter = painterResource(id = R.drawable.kampus_umy),
            contentDescription = "Kampus UMY",
            modifier = Modifier
                .size(230.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
    }
}