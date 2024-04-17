package net.ezra.ui.about

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.theme.AppTheme



@Composable
fun AboutScreen(navController: NavHostController) {




    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .padding(top = 10.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
Text(text = "this is the about page")

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_ABOUT) { inclusive = true }
                    }
                },
            text = "Home",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )
    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())
}

