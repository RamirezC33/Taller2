package com.pdmtaller2.CarlosRamirez_00084020




import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.pdmtaller2.CarlosRamirez_00084020.navigation.AppNavigation
import com.pdmtaller2.CarlosRamirez_00084020.ui.theme.FoodSpotByCRamirezTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodSpotByCRamirezTheme {
                AppNavigation()
            }
        }
    }
}
