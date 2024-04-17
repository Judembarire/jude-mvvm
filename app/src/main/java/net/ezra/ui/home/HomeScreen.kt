package net.ezra.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_DASHBOARD
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME

@Composable
fun HomeScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .padding(top = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

    ){
Text(text = "THIS IS THE HOME PAGE")
        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_ABOUT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "About",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_EVENING) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "Evening",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )
        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_DASHBOARD) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "Evening",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

