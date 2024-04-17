package net.ezra.ui.dashboard


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_DASHBOARD
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME

@Composable
fun DashboardScreen(navController: NavHostController) {

LazyColumn(
    modifier =  Modifier
        .fillMaxSize()
   ) {

     item {

          Column(
              modifier = Modifier
                  .fillMaxWidth()
                  .height(100.dp)
                  .background(Color(0xFFFFB140))
          ) {
             Text( "DASHBOARD",
                 fontSize = 21.sp ,
                 fontWeight = FontWeight.Bold,
                 textAlign = TextAlign.Start

                 )

        }

         Spacer(modifier = Modifier.height(30.dp))

         Column(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(200.dp)
         ) {
             Row(
                 modifier = Modifier
                     .fillMaxWidth()
             ) {
                 Column {
                    Card(
                        modifier = Modifier
                            .width(180.dp)
                            .height(150.dp)
                            .padding(10.dp),
                        colors = CardDefaults.cardColors(Color(0xFF3F51B5))
                    ) {

                    }
                 }
                 Spacer(modifier = Modifier.width(30.dp))
                 Column {
                     Card(
                         modifier = Modifier
                             .width(180.dp)
                             .height(150.dp)
                             .padding(10.dp),
                         colors = CardDefaults.cardColors(Color(0xFFFFB140))

                     ) {

                     }
                 }
             }
       }
         Spacer(modifier = Modifier.height(40.dp))

         Column(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(350.dp)
         ) {
           Row {
               Card(
                   modifier = Modifier
                       .width(900.dp)
                       .height(120.dp)
                       .padding(10.dp),
                   colors = CardDefaults.cardColors(Color(0x773F51B5))

               ) {

               }
           }
               Spacer(modifier = Modifier.height(6.dp))

              Row {
                  Card(
                      modifier = Modifier
                          .width(900.dp)
                          .height(120.dp)
                          .padding(10.dp),
                      colors = CardDefaults.cardColors(Color(0xFFFFB140))

                  ) {

                  }
              }

             Spacer(modifier = Modifier.height(50.dp))

            Row (
                modifier = Modifier
                    .width(900.dp)
                    .height(100.dp),
                horizontalArrangement = Arrangement.Center,
            ){
              Button(onClick = {
                  navController.navigate(ROUTE_HOME) {
                      popUpTo(ROUTE_DASHBOARD) { inclusive = true }
                  }
              },

              ) {
                  Text( "Add stock",
                      fontSize = 21.sp ,
                      )
              }
         }

      }
         Spacer(modifier = Modifier.height(10.dp))
         Column(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(115.dp)
                 .background(Color(0xFFFFB140))

         ) {

       }
     }
}



































}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    DashboardScreen(rememberNavController())
}

