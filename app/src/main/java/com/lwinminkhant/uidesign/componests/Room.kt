package com.lwinminkhant.uidesign.componests

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lwinminkhant.uidesign.LifestyleData
import com.lwinminkhant.uidesign.R

@Composable
fun RoomItem() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(350.dp)
            .padding(16.dp)
    ) {
        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent)
        ) {
            val dashedPathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)
            drawRoundRect(
                color = Color.Black,
                style = Stroke(width = 2.dp.toPx(), pathEffect = dashedPathEffect),
                topLeft = Offset(0f, 0f),
                size = Size(size.width - 2f, size.height - 2f),
                cornerRadius = CornerRadius(8.dp.toPx())
            )
        }
        Column(Modifier.padding(8.dp)) {
            Row {
                Column(Modifier.weight(1f)) {
                    Text(text = "YOUR E-VOUCHER RATE", style = MaterialTheme.typography.labelMedium)
                    Text(
                        text = "Mobile App Special Vocher",
                        style = MaterialTheme.typography.headlineSmall
                    )
                }
                Image(painter = painterResource(id = R.drawable.nextred), contentDescription = "")
            }
            Row(Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                IconText(
                    icon = LifestyleData.InclusiveBreakfast.icon,
                    text = LifestyleData.InclusiveBreakfast.label
                )
                IconText(icon = LifestyleData.Discount.icon, text = LifestyleData.Discount.label)

                OutlinedButton(
                    onClick = { /*TODO*/ },
                    contentPadding = PaddingValues(),
                    modifier = Modifier.weight(1f),
                    shape = MaterialTheme.shapes.extraSmall
                ) {
                    Text(
                        text = "View Rates",
                        maxLines = 1,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                }
            }
            Spacer(
                modifier = Modifier
                    .height(1.dp)
                    .background(Color.Black)
                    .fillMaxWidth()
            )

            Row(Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                Column(Modifier.weight(1f)) {
                    Text(
                        text = "Avg. Nightly / Room From",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Subject to GST & Service charge",
                        style = MaterialTheme.typography.bodySmall
                    )
                }

                Row {
                    Text(
                        text = "SGD",
                        style = MaterialTheme.typography.titleSmall,
                        modifier = Modifier.align(Alignment.Bottom)
                    )
                    Text(
                        text = "161.42",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.align(Alignment.Bottom)
                    )

                }
            }
            Button(
                onClick = { },
                shape = MaterialTheme.shapes.extraSmall,
                colors = ButtonDefaults.buttonColors(Color(android.graphics.Color.parseColor("#FFDF77"))),
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    //.background(Color(android.graphics.Color.parseColor("#FFDF77")))
            ) {
                Text(text = "MEMBERS DEALS", color = Color.Black)
            }
        }


    }
}