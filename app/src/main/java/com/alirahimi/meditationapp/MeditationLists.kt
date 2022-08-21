package com.alirahimi.meditationapp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alirahimi.meditationapp.ui.theme.Black
import com.alirahimi.meditationapp.utilities.MEDITATION_TYPE_LIST
import com.alirahimi.meditationapp.utilities.MeditationType

@Composable
fun MeditationTypes() {

    val meditationOptions = MEDITATION_TYPE_LIST

    LazyColumn(
        modifier = Modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(meditationOptions.size) {
            MeditationOption(meditationType = meditationOptions[it])

        }
    }
}

@Composable
fun MeditationOption(meditationType: MeditationType) {

    Card(
        shape = RoundedCornerShape(14.dp),
        modifier = Modifier
            .fillMaxSize(),
        backgroundColor = meditationType.backgroundColor
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(20.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Black,
                        backgroundColor = meditationType.timeBackgroundColor,
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = meditationType.duration,
                        fontFamily = FontFamily(
                            Font(
                                R.font.nunito_medium,
                                weight = FontWeight.Medium
                            )
                        )
                    )
                }

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Black,
                        backgroundColor = Color.White,
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = meditationType.teacher,
                        fontFamily = FontFamily(
                            Font(
                                R.font.nunito_medium,
                                weight = FontWeight.Medium
                            )
                        )
                    )
                }

            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = meditationType.title,
                fontFamily = FontFamily(Font(R.font.nunito_medium, weight = FontWeight.Bold)),
                fontSize = 18.sp,
                color = meditationType.contentColor,
                textAlign = TextAlign.Start
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = meditationType.description,
                fontFamily = FontFamily(Font(R.font.nunito_medium, weight = FontWeight.Medium)),
                fontSize = 16.sp,
                color = meditationType.contentColor,
                textAlign = TextAlign.Start
            )
        }

    }

}