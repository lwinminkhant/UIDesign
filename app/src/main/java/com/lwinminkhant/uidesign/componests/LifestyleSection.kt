package com.lwinminkhant.uidesign.componests

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lwinminkhant.uidesign.LifestyleData

@Composable
fun Lifestyle() {

    Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
        IconText(LifestyleData.Amenities.icon, LifestyleData.Amenities.label)
        IconText(LifestyleData.Facilities.icon, LifestyleData.Facilities.label)
        IconText(LifestyleData.FnB.icon, LifestyleData.FnB.label)
        IconText(LifestyleData.KidFamily.icon, LifestyleData.KidFamily.label)
        IconText(LifestyleData.Wellness.icon, LifestyleData.Wellness.label)
    }

}

@Composable
fun IconText(icon: Int, text: String) {
    Column(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = "",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(text = text, textAlign = TextAlign.Center, style = MaterialTheme.typography.labelSmall)
    }

}

@Preview
@Composable
fun LifestylePreview() {
    Lifestyle()
}