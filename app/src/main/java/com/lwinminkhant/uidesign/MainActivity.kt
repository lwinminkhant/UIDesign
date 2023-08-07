package com.lwinminkhant.uidesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.AppTheme
import com.lwinminkhant.uidesign.componests.RoomItem
import com.lwinminkhant.uidesign.componests.ImagePager
import com.lwinminkhant.uidesign.componests.Lifestyle
import com.lwinminkhant.uidesign.componests.LocationSection
import com.lwinminkhant.uidesign.componests.RoomRate
import com.lwinminkhant.uidesign.componests.ToolbarSection


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreen() {
    val scrollState = rememberScrollState()
    Column(modifier = Modifier.verticalScroll(scrollState)) {
        ToolbarSection()
        LocationSection()
        ImagePager()
        Lifestyle()
        RoomRate()
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    AppTheme {
        MainScreen()
    }
}