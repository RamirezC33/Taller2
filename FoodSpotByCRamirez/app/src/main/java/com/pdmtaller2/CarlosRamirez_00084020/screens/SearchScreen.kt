package com.pdmtaller2.CarlosRamirez_00084020.screens




import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Pantalla de búsqueda") }) },
    ) { padding ->
        Text("Pantalla busqueda", modifier = Modifier.padding(padding).padding(16.dp))
    }
}
