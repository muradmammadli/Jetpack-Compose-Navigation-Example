package com.example.jetpackcomposenavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController

@Composable
fun SecondScreen(
    navController: NavController,
    backStackEntry: NavBackStackEntry
) {

    val url = remember {
        backStackEntry.arguments?.getString("url")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Second screen",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(Screens.Third.route)
        }) {
            Text(text = "Go to third screen")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = url!!)

    }
}