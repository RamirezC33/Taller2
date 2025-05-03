package com.pdmtaller2.CarlosRamirez_00084020.data

data class Dish(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String
)

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
)

val restaurants = listOf(
    Restaurant(
        id = 1,
        name = "Burger King",
        description = "El rey de las hamburguesas",
        imageUrl = "https://blog.gottabepublic.com/blog-details/wordpress/wp-content/uploads/2023/08/logotipo-burger-king-2021.png",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(1, "Genius Whopper", "Tu hamburguesa favorita con tu complemento en su interior", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxwj-j7P7Dxqc6o7KYbkCkmMAuLc0gbs3Shw&s"),
            Dish(2, "Big King", "Deliciosa carne, cebolla, lechuga y tomate", "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/BK_Web_Big-King_500X540px.png"),
            Dish(3, "Cheeseburger Deluxe", "Hamburguesa con doble queso, tomate y lechuga", "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.com.py/files/deluxe.png")
        )
    ),
    Restaurant(
        id = 2,
        name = "Taco Loco",
        description = "Tacos, sopas, burritos y más",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnqbm8O3fEPC6RIJx_g6RMXWF0c2GjIX2Uaw&s",
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            Dish(4, "Taco al pastor", "Carne de cerdo, piña, cilantro", "https://comedera.com/wp-content/uploads/sites/9/2017/08/tacos-al-pastor-receta.jpg"),
            Dish(5, "Taco de carnitas", "Carne de cerdo deliciosa", "https://okdiario.com/img/2022/04/30/tacos.jpg"),
            Dish(6, "Burrito de pollo", "Pollo sazonado, frijoles, arroz y queso", "https://www.hola.com/horizon/landscape/ba894522dd5f-burrito-pollo-t.jpg")
        )
    ),
    Restaurant(
        id = 3,
        name = "Sushi King",
        description = "Sushi, sopas y más",
        imageUrl = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/25/7b/c7/6c/ricos-rolls-recien-hechos.jpg?w=900&h=500&s=1",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(7, "Sushi Sumo", "Sushi de salmón, con camarones tempurizados", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCEhCcSOS4cmDJ2sTiIonzhzB0Z2CFjVdJOA&s"),
            Dish(8, "California Roll", "Salmón, queso crema y aguacate", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEzmOy71SL1b1rs6at2Dz0G9HHqzShB97MdA&s"),
            Dish(9, "Ramen clásico", "Sopa de fideos con cerdo, huevo y cebollín", "https://s1.elespanol.com/2016/11/15/cocinillas/cocinillas_170994703_116270247_1706x1280.jpg")
        )
    ),
    Restaurant(
        id = 4,
        name = "Pizzería Italia",
        description = "La mejor pizza artesanal al horno",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTXI37sAlkxGGmKOvrfSf9WQMkJFlIe6sNzTA&s",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(10, "Pizza Margarita", "Tomate, mozzarella y albahaca fresca", "https://www.clarin.com/img/2023/08/01/SL3EslnOA_1200x630__1.jpg"),
            Dish(11, "Pizza Pepperoni", "Clásica de pepperoni con extra queso", "https://eu.ooni.com/cdn/shop/articles/pepperoni-pizza_6ac5fa40-65b7-4e3b-a8b9-7ca5ccc05dfd.jpg?crop=center&height=800&v=1737105987&width=800"),
            Dish(12, "Pizza Cuatro Quesos", "Mozzarella, parmesano, azul y gouda", "https://www.hola.com/horizon/landscape/e8bb41b65869-pizzacuatroquesos-adob-t.jpg")
        )
    ),
    Restaurant(
        id = 5,
        name = "Wok Express",
        description = "Sabores asiáticos en minutos",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToctPU3UBLI_QUz-t6eQN8abARU5UhK4-8hA&s",
        categories = listOf("Comida Asiática", "Comida Saludable"),
        menu = listOf(
            Dish(13, "Pollo Kung Pao", "Pollo salteado con cacahuates y vegetales", "https://comedera.com/wp-content/uploads/sites/9/2022/04/pollo-kung-pao.jpg?w=500&h=500&crop=1"),
            Dish(14, "Fideos Yakisoba", "Fideos asiáticos con carne y verduras", "https://i.blogs.es/be8ee2/yakisoba/1366_2000.jpg"),
            Dish(15, "Arroz frito estilo oriental", "Arroz con huevo, verduras y soya", "https://i.pinimg.com/736x/7c/1d/3c/7c1d3c3de04d774587b8065dad993be7.jpg")
        )
    ),
    Restaurant(
        id = 6,
        name = "La Parrilla",
        description = "Cortes premium al carbón",
        imageUrl = "https://searchlogovector.com/wp-content/uploads/2019/03/la-parrilla-logo-vector.png",
        categories = listOf("Comida Internacional"),
        menu = listOf(
            Dish(16, "Parrillada mixta", "Res, pollo, chorizo y costillas", "https://www.okrecetas.com/recetas-de-carnes/img600/parrillada-mixta.jpg"),
            Dish(17, "Costilla BBQ", "Costilla de cerdo en salsa barbacoa", "https://www.spanish-food.org/images/costillas.jpg"),
            Dish(18, "Churrasco", "Filete de res con papas y ensalada", "https://cdn-ilddihb.nitrocdn.com/MgqZCGPEMHvMRLsisMUCAIMWvgGMxqaj/assets/images/optimized/rev-6b9d936/www.goya.com/wp-content/uploads/2023/10/churrasco-con-chimichurri-grilled-skirt-steak-900x900.jpg")
        )
    ),
    Restaurant(
        id = 7,
        name = "Green Monkey",
        description = "Comida saludable y natural",
        imageUrl = "https://www.tapasmagazine.es/wp-content/uploads/2020/03/DSC_0116-3.jpg",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(19, "Ensalada detox", "Kale, aguacate, quinoa y limón", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0NOBUQNMgoVQzBkAwVC-NZI-u4UZ3zEpKmA&s"),
            Dish(20, "Bowl vegano", "Tofu, arroz integral, brócoli y zanahoria", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTe3tafiX0W_1r_Fpkv55lCIBbE9pJlAjYkmQ&s"),
            Dish(21, "Wrap integral de pollo", "Pollo, vegetales y hummus en tortilla integral", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRT2G1xnRo6nb56Jd-vNh73Fpy_8GomvvcUlg&s")
        )
    ),
    Restaurant(
        id = 8,
        name = "Pastaria",
        description = "Especialistas en pasta fresca artesanal",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZHxkxECPSQ-tOJ7XwyJbsNBebVrzNsl2BaA&s",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(22, "Spaghetti Carbonara", "Pasta con salsa cremosa, panceta y parmesano", "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480_1_5x/img/recipe/ras/Assets/0346a29a89ef229b1a0ff9697184f944/Derivates/cb5051204f4a4525c8b013c16418ae2904e737b7.jpg"),
            Dish(23, "Lasagna", "Capas de pasta con carne molida, tomate y queso", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRjCnEj8ga3_zb4XhCuNyXm9oke8Q2ZDSGQA&s"),
            Dish(24, "Fettuccine Alfredo", "Pasta con crema, mantequilla y queso", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDC0Xdxknn5YCLz0BIbDEtWBDEBkBA29vZcw&s")
        )
    ),
    Restaurant(
        id = 9,
        name = "Super Marino",
        description = "Mariscos frescos y sabores costeros",
        imageUrl = "https://www.paulinacocina.net/wp-content/uploads/2024/05/receta-de-camarones-empanizados-paulina-cocina-recetas-1722444280-1200x900.jpg",
        categories = listOf("Mariscos", "Comida Internacional"),
        menu = listOf(
            Dish(25, "Camarones al ajillo", "Camarones salteados en mantequilla y ajo", "https://www.recetasnestlecam.com/sites/default/files/styles/recipe_detail_desktop_new/public/srh_recipes/a3edc0910e9c2e3c8a7670600542088a.jpg?itok=FNfc2KtE"),
            Dish(26, "Ceviche mixto", "Mariscos cocidos en limón con vegetales", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNRqcoCX5bo7CGBp9_UV5ZaK0qrO8gUJtPRQ&s"),
            Dish(27, "Pescado empanizado", "Filete de pescado con papas fritas", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-UYr7eMEWvRQmv0sOyc9laGNBC6wNtCGHUw&s")
        )
    ),
    Restaurant(
        id = 10,
        name = "El Sombrero",
        description = "Auténtica comida mexicana con sabor casero",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZ0KKlOU4KPZlofWVFXDKnnEtV4OumPs43GA&s",
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            Dish(28, "Quesadilla de chorizo", "Tortilla rellena de queso fundido y chorizo", "https://lh5.googleusercontent.com/proxy/sPgUdkczDNBygiqi1OfH7e8OoMkp2X138ESFWXYxJqYuNNkkQ_Edgi-jcrVYAmK0EJ37jj_Y4Dt_0Or_MNuzAXDiXz1olv0tk68LtVmnLiBuXlD5RoetCO4-PEtxM9S_x2pIi7oU1Sfx5CM"),
            Dish(29, "Sopa azteca", "Caldo con tortilla frita, chile pasilla y crema", "https://peopleenespanol.com/thmb/zz0Zy7ZsEEs6_4iioxOUpW__h8o=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/sopa-azteca-de-tortilla-2000-5589000dfa924e3fa1295e58b40e043e.jpg"),
            Dish(30, "Chilaquiles verdes", "Tortillas fritas en salsa verde con queso y crema", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS11NsBbcfRMS968DO1qZ2ENnOZ2wyRVpHtrA&s")
        )
    ),
    Restaurant(
        id = 11,
        name = "Bistró Central",
        description = "Fusión internacional en un ambiente elegante",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjFKXkq-6NZsZooinBazH2MMDOWwQ-VintOw&s",
        categories = listOf("Comida Internacional"),
        menu = listOf(
            Dish(31, "Salmón al limón", "Filete de salmón en salsa cítrica", "https://i.ytimg.com/vi/bHepJyPSPoI/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLB1Hu1GkeetF0pZ4nMIueNC81V6aQ"),
            Dish(32, "Pollo a la mostaza", "Pechuga en salsa cremosa de mostaza dijon", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQdKEkMUmTU5bWm9z_t3KqyP7k5uFcGYRlN9w&s"),
            Dish(33, "Crema de champiñones", "Sopa cremosa con champiñones frescos", "https://images.aws.nestle.recipes/original/2024_10_18T12_15_31_badun_images.badun.es_709dc898c68a_crema_de_champinones_ideal.jpg")
        )
    ),
    Restaurant(
        id = 12,
        name = "Vida Verde",
        description = "Ensaladas, bowls y smoothies saludables",
        imageUrl = "https://comedera.com/wp-content/uploads/sites/9/2021/01/vegetable-skewer-3317060_1280.jpg?resize=1200,675&quality=80",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(34, "Bowl de quinoa", "Quinoa, garbanzos, espinaca y hummus", "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480_1_5x/img/recipe/ras/Assets/bdc253a0-ea6c-43a8-9483-e18cd48fdcc4/Derivates/01c80035-05c6-48ca-83d0-50171f065260.jpg"),
            Dish(35, "Smoothie de frutos rojos", "Bebida refrescante de fresa, mora y plátano", "https://s3.amazonaws.com/static.realcaliforniamilk.com/media/foodservice/Super_Berry_Smoothie.jpg"),
            Dish(36, "Tofu grillado", "Tofu con vegetales salteados en aceite de oliva", "https://danzadefogones.com/wp-content/uploads/2021/09/tofu-marinado-1.jpg")
        )
    ),
    Restaurant(
        id = 13,
        name = "Olas del Pacífico",
        description = "Delicias del mar con recetas tropicales",
        imageUrl = "https://www.recetasnestlecam.com/sites/default/files/2023-02/plato-receta-cazuela-de-mariscos.jpg",
        categories = listOf("Mariscos"),
        menu = listOf(
            Dish(37, "Tostadas de atún", "Atún fresco marinado sobre tostadas crujientes", "https://i0.wp.com/mesasanamx.com/wp-content/uploads/2022/07/tostadas-de-atun-estilo-contramar.jpg?resize=500%2C500&ssl=1"),
            Dish(38, "Coctel de camarón", "Camarones con salsa roja, aguacate y galletas", "https://www.muydelish.com/wp-content/uploads/2024/08/mexican-shrimp-cocktail.jpg"),
            Dish(39, "Pescado a la talla", "Filete de pescado a la parrilla con salsa de chiles", "https://mesasanamx.com/wp-content/uploads/2022/08/pescado-a-la-talla.jpg")
        )
    ),
    Restaurant(
        id = 14,
        name = "Chicken Spot",
        description = "Especialistas en pollo frito crujiente",
        imageUrl = "https://static01.nyt.com/images/2024/11/24/multimedia/Buttermilk-Fried-Chickenrex-vtlk/Buttermilk-Fried-Chickenrex-vtlk-articleLarge.jpg",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(40, "Bucket Clásico", "Porción familiar de pollo frito con papas", "https://www.preparedfoodphotos.com/wp-content/uploads/FriedChicken004_ADL-2.jpg"),
            Dish(41, "Chicken Tenders", "Tiritas de pollo empanizado con salsas", "https://www.tasteofhome.com/wp-content/uploads/2018/01/Fried-Chicken-Strips_EXPS_FT24_25184_JR_0301_1.jpg"),
            Dish(42, "Hamburguesa de pollo spicy", "Filete empanizado con mayonesa picante", "https://comedera.com/wp-content/uploads/sites/9/2023/07/Hamburguesa-de-pollo-picante.jpg")
        )
    )

)
