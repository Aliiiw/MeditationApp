package com.alirahimi.meditationapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HeaderProfile() {

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.profilepicture),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )

            Column(
                modifier = Modifier
                    .padding(start = 12.dp)
            ) {
                Text(
                    text = "Welcome back",
                    fontFamily = FontFamily(Font(R.font.nunito_light)),
                    fontSize = 14.sp,
                    textAlign = TextAlign.Start
                )

                Text(
                    text = "Miranda Larsen",
                    fontFamily = FontFamily(Font(R.font.nunito_medium, weight = FontWeight.Medium)),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start
                )
            }
        }

        Box(
            modifier = Modifier
                .size(50.dp)
                .padding(top = 8.dp)
        ) {
            Icon(Icons.Default.Notifications, contentDescription = "")
        }
    }
}