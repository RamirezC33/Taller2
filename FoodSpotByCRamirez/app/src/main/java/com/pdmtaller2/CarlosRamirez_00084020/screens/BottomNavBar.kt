package com.pdmtaller2.CarlosRamirez_00084020.screens



import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.pdmtaller2.CarlosRamirez_00084020.navigation.Screen

@Composable
fun BottomNavBar(navController: NavHostController) {
    NavigationBar {
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate(Screen.Restaurants.route) },
            label = { Text("Restaurantes") },
            icon = { Icon(Icons.Default.Home, contentDescription = null) }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate(Screen.Search.route) },
            label = { Text("Buscar") },
            icon = { Icon(Icons.Default.Search, contentDescription = null) }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate(Screen.Orders.route) },
            label = { Text("Órdenes") },
            icon = { Icon(Icons.Default.ShoppingCart, contentDescription = null) }
        )
    }
}
