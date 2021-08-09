package ex1_builder

fun main(args: Array<String>) {

    val pedido1 = Pizza.Builder()

        .buildNumeroPedacos(10)
        .buildSabores(listOf("Portuguesa", "Siciliana"))
        .buildTemBordaCatupiry(true)
        .build()
    println(pedido1.toString())


    val pedido2 = Pizza.Builder()

        .buildNumeroPedacos(6)
        .buildSabores(listOf("Vegetariana", "Berinjela"))
        .buildTemBordaCatupiry(false)
        .build()
    println(pedido2.toString())

}

