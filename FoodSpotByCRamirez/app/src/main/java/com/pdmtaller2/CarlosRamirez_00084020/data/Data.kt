package com.pdmtaller2.CarlosRamirez_00084020.data




data class Restaurant(val id: Int, val name: String, val description: String, val imageUrl: String, val category: String)
data class Dish(val id: Int, val name: String, val description: String, val imageUrl: String)

val restaurants = listOf(
    Restaurant(1, "Burger King", "El rey de las hamburguesas", "https://...", "Comida Rápida"),
    Restaurant(2, "Taco Loco", "Tacos, sopas, burritos y más", "https://...", "Comida Mexicana"),
    Restaurant(3, "Sushi King", "Sushi, sopas y más ", "https://...", "Comida Asiática"),
)

val restaurantDishMap = mapOf(
    1 to listOf(
        Dish(1, "Genius Whopper", "Tu hamburguesa favorita con tu complemento en su interior", "https://..."),
        Dish(2, "Big King", "Deliciosa carne, cebolla, lechuga y tomate", "https://..."),
    ),
    2 to listOf(
        Dish(4, "Taco al pastor", "Carne de cerdo, piña, cilantro", "https://..."),
        Dish(5, "Taco de carnitas", "Carne de cerdo deliciosa", "https://...")
    ),
    3 to listOf(
        Dish(6, "Sushi Sumo", "Sushi de salmón, con camarones tempurizados", "https://..."),
        Dish(7, "California Roll", "Salmón, queso crema y aguacate", "https://...")

    )
)
