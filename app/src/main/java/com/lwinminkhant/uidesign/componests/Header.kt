package com.lwinminkhant.uidesign.componests

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.lwinminkhant.uidesign.R
import com.lwinminkhant.uidesign.utils.MyTextButton

@Composable
fun ToolbarSection() {
    Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(id = R.drawable.ic_arrow_back), contentDescription = "")
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(id = R.drawable.currency),
            contentDescription = "",
            Modifier.padding(8.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.chatactive),
            contentDescription = "",
            Modifier.padding(8.dp)
        )
    }

}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImagePager() {
    val images =
        remember {
            listOf(
                "https://images.unsplash.com/photo-1537640685236-a9df2496e232?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80",
                "https://images.unsplash.com/photo-1572180465667-ba3585049240?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1074&q=80",
                "https://images.unsplash.com/photo-1586611292717-f828b167408c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1074&q=80",
                "https://images.unsplash.com/photo-1540541338287-41700207dee6?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80",
                "https://images.unsplash.com/photo-1502208327471-d5dde4d78995?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80",
                "https://images.unsplash.com/photo-1527142879-95b61a0b8226?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1148&q=80"
            )
        }
    Box {
        HorizontalPager(pageCount = images.size, state = rememberPagerState()) { pageIndex ->
            Box(
                modifier = Modifier
                    .height(200.dp)
                    .background(Color.Gray)
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                AsyncImage(
                    model = images[pageIndex],
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                )
            }
            MyTextButton(
                color = Color.Gray, inclineEnd = false, selected = true, Modifier.align(
                    Alignment.BottomEnd
                ), "See All ${pageIndex+1}/${images.size}"
            )
        }

    }

}

@Composable
fun LocationSection() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Furama Riverfront, Singapore",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )
            Image(painter = painterResource(id = R.drawable.nextred), contentDescription = "")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "405 Havelock Road, Singapore 169633",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.weight(1f)
            )
            Image(
                painter = painterResource(id = R.drawable.currentlocation),
                contentDescription = "",
                Modifier.align(Alignment.CenterVertically)
            )
        }
    }

}


@Preview
@Composable
fun LocationSectionPreview() {
    LocationSection()
}


@Preview
@Composable
fun ToolbarSectionPreview() {
    //ToolbarSection()
    RoomItem()
}