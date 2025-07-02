package com.example.mangamania.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import com.example.mangamania.data.model.Manga

@Composable
fun MangaCard(
    title: String,
    coverImageUrl: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Column(
        modifier = modifier
            .width(140.dp)
            .padding(8.dp)
            .clickable { onClick() }
    ) {
//        AsyncImage(
//            model = coverImageUrl,
//            contentDescription = null,
//            modifier = Modifier
//                .height(200.dp)
//                .clip(RoundedCornerShape(16.dp))
//                .background(MaterialTheme.colorScheme.surface),
//            contentScale = ContentScale.Crop
//        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = title,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onBackground,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}
