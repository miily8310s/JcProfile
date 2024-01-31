package com.example.jcprofile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DetailSection() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(10.dp))
        .background(color = Color.LightGray.copy(alpha = 0.3f))
        .padding(horizontal = 8.dp, vertical = 24.dp)
    ) {
        Label(icon = Icons.Default.Favorite, text = "ねこ", color = Color.Gray)
        Spacer(modifier = Modifier.height(8.dp))
        Label(icon = Icons.Default.LocationOn, text = "大阪府堺市", color = Color.Gray)
    }
}