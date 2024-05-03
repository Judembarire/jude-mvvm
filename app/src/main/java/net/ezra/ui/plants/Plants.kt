package net.ezra.ui.plants

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.ui.myplant.PlantScreen

@Composable
fun Plant(){
LazyColumn(
    modifier = Modifier
        .fillMaxSize()
        .background(Color(0x2C08F511))
) {
    item {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(shape = RoundedCornerShape(bottomEnd = 15.dp , bottomStart = 15.dp))

            ) {
                Image(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Transparent),

                    contentScale = ContentScale.Crop,

                    painter = painterResource(id = R.drawable.spider1),
                    contentDescription = ""
                )
            }




        }
    }
}


}






@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    Plant()
}