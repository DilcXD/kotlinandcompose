package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.Typography

@Composable
fun MainView(modifier: Modifier, devices: List<Device> ) {

    Column(modifier) {
        Text(
            text = "Comprar",
            modifier= modifier.background(Color.White).fillMaxWidth().padding(all = 24.dp),
            style = Typography.displayMedium,
            textAlign = TextAlign.Center
        )

        HorizontalDivider()

        LazyColumn() {
            items(devices.size){index ->
                DeviceItemView(device = devices[index])
            }

        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainPreview() {
    MyApplicationTheme {
        MainView(Modifier.padding(top = 24.dp),listOf(
            Device(id = 1, name = "Samsung", data = Specs(color = "Black", capacity = "64 GB")),
            Device(id = 1, name = "Samsung", data = Specs(color = "Black", capacity = "64 GB")),
        )

        )
    }
}