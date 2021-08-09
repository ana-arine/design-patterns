package ex3_decorator

fun main(args: Array<String>) {

    val lancheSimples = LancheSimples()
  //  println(lancheSimples.adicionarIngredientes())

    val lancheFrangoSemMolho = Vegetais(LancheFrango(lancheSimples))
    val lancheFrangoComMolho = Vegetais(LancheFrango(Molhos(lancheSimples)))

    val lancheCarneSemMolho = Vegetais(LancheCarne(lancheSimples))
    val lancheCarneComMolho = Molhos(Vegetais(LancheCarne(lancheSimples)))

    print("Lanche de Frango SEM MOLHO: ")
    println(lancheFrangoSemMolho.adicionarIngredientes())


    print("Lanche de Carne COM MOLHO: ")
    println(lancheCarneComMolho.adicionarIngredientes())

}
