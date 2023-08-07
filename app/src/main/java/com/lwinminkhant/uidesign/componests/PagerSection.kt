package com.lwinminkhant.uidesign.componests

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.lwinminkhant.uidesign.utils.MyTab
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RoomRate() {
    val tabData = listOf(
        "By Room",
        "By Rates"
    )
    val pagerState = rememberPagerState(
        initialPage = 0,
    )
    val tabIndex = pagerState.currentPage
    val coroutineScope = rememberCoroutineScope()

    // TAB
    TabRow(
        selectedTabIndex = tabIndex,
        modifier = Modifier.padding(top = 20.dp)
    ) {
        tabData.forEachIndexed { index, text ->
            MyTab(
                tabIndex = tabIndex,
                index = index,
                color = Color(android.graphics.Color.parseColor("#97C0D4")),
                selected = tabIndex == index,
                text = text,
                inclineEnd = index != 1,
                onClick = {
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                })
        }
    }

    // PAGER
    HorizontalPager(pageCount = tabData.size, state = pagerState) { index ->
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (tabData[index] == "By Room") {
                repeat(10) {
                    RateItem()
                }
            } else {
                repeat(10) {
                    RoomItem()
                }

            }
        }
    }
}