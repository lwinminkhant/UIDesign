package com.lwinminkhant.uidesign.utils

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import kotlin.math.tan

class SlopeShape(private val angle: Float, private val inclineEnd: Boolean) : Shape {
    override fun createOutline(
        size: androidx.compose.ui.geometry.Size,
        layoutDirection: androidx.compose.ui.unit.LayoutDirection,
        density: Density
    ): Outline = Outline.Generic(
        Path().apply {
            val width = size.width - size.height / tan(angle)
            moveTo(size.width - width, 0f)
            lineTo(size.width, 0f)
            lineTo(if (inclineEnd) width else size.width, size.height)
            lineTo(0f, size.height)
            lineTo(size.width - width, 0f)
        }
    )
}

@Composable
fun MyTextButton(color: Color, inclineEnd: Boolean,
                 selected: Boolean, modifier: Modifier,
                text: String) {
    val border = BorderStroke(1.dp, color)
    val shape = SlopeShape(17f, inclineEnd)
    val background = if (!selected) modifier else modifier.background(color = color, shape)
    TextButton(
        onClick = {},
        shape = shape,
        border = border,
        modifier = background
            .height(45.dp)
    ) {
        Text(text)
    }
}

@Composable
fun MyTab(
    tabIndex: Int,
    index: Int,
    color: Color,
    inclineEnd: Boolean,
    selected: Boolean,
    text: String,
    onClick: () -> Unit
) {
    val border = BorderStroke(2.dp, color)
    val shape = SlopeShape(17f, inclineEnd)
    val background = if (!selected) Modifier.background(
        color = Color.Transparent,
        shape = shape
    ) else Modifier.background(color = color, shape)

    Box {
        Tab(
            selected = tabIndex == index,
            onClick = onClick,
            modifier = background
                .height(45.dp)
                .padding(8.dp),
            text = {
                Text(text = text)
            }
        )
    }

}


@Preview
@Composable
fun MyButtonPreview() {
    Column {
        MyTextButton(color = Color.Cyan, false, selected = false, Modifier,"See All 1/6")
        MyTextButton(color = Color.Cyan, false, selected = true, Modifier,"See All 1/6")
        MyTextButton(color = Color.Cyan, true, selected = false, Modifier,"See All 1/6")
        MyTextButton(color = Color.Cyan, true, selected = true, Modifier,"See All 1/6")
    }

}

@Preview
@Composable
fun MyTanPreview() {
    Column {
        MyTab(
            tabIndex = 1,
            index = 1,
            color = Color.Cyan,
            selected = true,
            text = "My Tab",
            inclineEnd = true,
            onClick = {
            })
        MyTab(
            tabIndex = 1,
            index = 1,
            color = Color.Cyan,
            selected = false,
            text = "My Tab",
            inclineEnd = true,
            onClick = {
            })
    }


}