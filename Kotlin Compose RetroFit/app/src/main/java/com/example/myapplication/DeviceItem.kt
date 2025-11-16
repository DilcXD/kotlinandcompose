package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.Typography

@Composable
fun DeviceItemView(device: Device){

    Row( Modifier.background(Color.Cyan).padding(top = 8.dp, bottom = 8.dp),verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.Default.Phone,
            contentDescription = null,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Column(Modifier.background(Color.Cyan).padding(horizontal = 16.dp,)) {
            Text(text = device.name, style = Typography.headlineMedium)

            if(device.data?.color != null){
                Text(text = device.data.color ,style = Typography.bodyMedium)

            }

            if(device.data?.capacity != null){
                Text(text = device.data.capacity ,style = Typography.bodyMedium)

            }

            HorizontalDivider()

        }
    }

}

@Preview(showBackground = true)
@Composable
fun DeviceItemPreview() {
    MyApplicationTheme {
        DeviceItemView(device = Device(id = 1, name = "Samsung", data = Specs(color = "Black", capacity = "64 GB")))
    }
}