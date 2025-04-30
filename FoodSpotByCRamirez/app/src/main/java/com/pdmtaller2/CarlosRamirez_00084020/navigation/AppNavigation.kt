package com.pdmtaller2.CarlosRamirez_00084020.navigation





import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.navArgument
import com.pdmtaller2.CarlosRamirez_00084020.data.restaurantDishMap
import com.pdmtaller2.CarlosRamirez_00084020.data.restaurants
import com.pdmtaller2.CarlosRamirez_00084020.screens.OrdersScreen
import com.pdmtaller2.CarlosRamirez_00084020.screens.RestaurantMenuScreen
import com.pdmtaller2.CarlosRamirez_00084020.screens.RestaurantsScreen
import com.pdmtaller2.CarlosRamirez_00084020.screens.SearchScreen


sealed class Screen(val route: String) {
    object Restaurants : Screen("restaurants")
    object Search : Screen("search")
    object Orders : Screen("orders")
    object Menu : Screen("menu/{restaurantId}") {
        fun createRoute(id: Int) = "menu/$id"
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screen.Restaurants.route) {
        composable(Screen.Restaurants.route) {
            RestaurantsScreen(navController, restaurants)
        }
        composable(Screen.Search.route) {
            SearchScreen()
        }
        composable(Screen.Orders.route) {
            OrdersScreen()
        }
        composable(Screen.Menu.route,
            arguments = listOf(navArgument("restaurantId") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("restaurantId") ?: return@composable
            val restaurant = restaurants.find { it.id == id } ?: return@composable
            val dishes = restaurantDishMap[id] ?: emptyList()
            RestaurantMenuScreen(navController, restaurant, dishes)
        }
    }
}
