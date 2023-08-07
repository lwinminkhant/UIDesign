package com.lwinminkhant.uidesign.componests

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun RateItem() {
    Column(Modifier.padding(16.dp)) {
        AsyncImage(
            model = "https://images.unsplash.com/photo-1572180465667-ba3585049240?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1074&q=80",
            contentDescription = ""
        )
        Row(Modifier.padding(8.dp)) {
            Column (Modifier.weight(1f).align(Alignment.CenterVertically)){
                Text(text = "Deluxe Twin", style = MaterialTheme.typography.headlineSmall)
                Text(
                    text = "Twin Single Beds, Cable TV, Free Wifi",
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            OutlinedButton(
                onClick = {},
                modifier = Modifier.padding(0.dp),
                shape = MaterialTheme.shapes.extraSmall
            ) {
                Text(text = "View Rates", fontWeight = FontWeight.Bold, fontSize = 14.sp)
            }
        }
    }

}

@Preview
@Composable
fun RateItemPreview() {
    RateItem()
}