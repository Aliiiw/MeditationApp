package com.alirahimi.meditationapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.alirahimi.meditationapp.utilities.FILTER_CONTENT_LIST
import com.alirahimi.meditationapp.utilities.FilterContent

@Composable
fun FilterOptions() {

    val filterContentList = FILTER_CONTENT_LIST

    LazyRow(
        modifier = Modifier
            .padding(top = 16.dp, start = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(filterContentList.size) {

            ChipComponent(filter = filterContentList[it])

        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ChipComponent(filter: FilterContent) {

    val contentColor = filter.contentColor
    val chipBackground = filter.backgroundColor
    val filterText = filter.filterText

    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            contentColor = contentColor,
            backgroundColor = chipBackground,
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(
            text = filterText,
            fontFamily = FontFamily(Font(R.font.nunito_medium, weight = FontWeight.Medium))
        )
    }
}
