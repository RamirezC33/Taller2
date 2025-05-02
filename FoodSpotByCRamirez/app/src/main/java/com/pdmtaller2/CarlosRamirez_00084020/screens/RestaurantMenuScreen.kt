package com.pdmtaller2.CarlosRamirez_00084020.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.pdmtaller2.CarlosRamirez_00084020.data.Restaurant

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantMenuScreen(navController: NavHostController, restaurant: Restaurant) {
    var search by remember { mutableStateOf("") }
    val filtered = restaurant.menu.filter { it.name.contains(search, ignoreCase = true) }
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(restaurant.name) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = null)
                    }
                }
            )
        },
        bottomBar = {
            BottomNavBar(navController)
        }
    ) { padding ->
        Column(
            Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            Text(text = restaurant.description, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = search,
                onValueChange = { search = it },
                label = { Text("Buscar platillo") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            LazyColumn {
                items(filtered) { dish ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Row(Modifier.padding(8.dp)) {
                            Image(
                                painter = rememberAsyncImagePainter(dish.imageUrl),
                                contentDescription = null,
                                modifier = Modifier.size(80.dp),
                            )
                            Spacer(Modifier.width(8.dp))
                            Column {
                                Text(dish.name, style = MaterialTheme.typography.titleMedium)
                                Text(dish.description)
                                Button(onClick = {
                                    Toast.makeText(context, "${dish.name} agregado al carrito", Toast.LENGTH_SHORT).show()
                                }) {
                                    Text("Agregar al carrito")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
