package com.pdmtaller2.CarlosRamirez_00084020.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.pdmtaller2.CarlosRamirez_00084020.data.Restaurant
import com.pdmtaller2.CarlosRamirez_00084020.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantsScreen(navController: NavHostController, restaurants: List<Restaurant>) {
    val categories = restaurants.groupBy { it.categories.firstOrNull() ?: "Sin categoría" }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Text(
                            text = "FoodSpot",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = MaterialTheme.typography.titleLarge.fontSize * 2
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        },
        bottomBar = {
            BottomNavBar(navController)
        },
        containerColor = Color.White
    )
    { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            categories.forEach { (category, list) ->
                item {
                    Text(
                        text = category,
                        style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                        color = Color.Black,
                        modifier = Modifier.padding(16.dp)
                    )
                }
                item {
                    LazyRow {
                        items(list) { restaurant ->
                            Column(
                                modifier = Modifier
                                    .padding(8.dp)
                                    .width(200.dp)
                                    .clickable {
                                        navController.navigate(Screen.Menu.createRoute(restaurant.id))
                                    }
                            ) {
                                Image(
                                    painter = rememberAsyncImagePainter(restaurant.imageUrl),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(120.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                        .fillMaxWidth(),
                                contentScale = ContentScale.Crop
                                )
                                Text(restaurant.name, style = MaterialTheme.typography.bodyMedium)
                            }
                        }
                    }
                }
            }
        }
    }
}
