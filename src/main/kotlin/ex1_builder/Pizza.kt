package ex1_builder

class Pizza(
    val numeroPedacos: Int?,
    val tamanho: String?,
    val temBordaCatupiry: Boolean?,
    val sabores: List<String>?
 // val observacao: String?
) {

    class Builder(
        var numeroPedacos: Int? = null,
        var tamanho: String? = null,
        var temBordaCatupiry: Boolean? = null,
        var sabores: List<String>? = null) {

        fun buildNumeroPedacos(numeroPedacos: Int) = apply { this.numeroPedacos = numeroPedacos }
     //   fun buildTamanho(tamanho: String) = apply { this.tamanho = tamanho }
        fun buildTemBordaCatupiry(temBordaCatupiry: Boolean) = apply { this.temBordaCatupiry = temBordaCatupiry }
        fun buildSabores(sabores: List<String>) = apply { this.sabores = sabores }

        fun build() = Pizza(numeroPedacos, tamanho, temBordaCatupiry, sabores)
    }

    override fun toString(): String {


        return "\n*** Pedido da Pizza ***" +
                "\nTamanho: ${retornaTamanhoPizza()}" +
                "\nSabores: $sabores" +
                "\nBorda Catupiry: ${definirBordaPizza()}"

    }

    private fun retornaTamanhoPizza(): String {

        return when(numeroPedacos){
            6 -> "Pizza Média ($numeroPedacos pedaços)"
            8 -> "Pizza Grande ($numeroPedacos pedaços)"
            10 -> "Pizza Gigante ($numeroPedacos pedaços)"
            else -> "Não fabricamos esse tamanho. Favor fazer novo pedido."
        }
    }


    private fun definirBordaPizza(): String {
        return when (temBordaCatupiry) {
            true -> "SIM"
            false -> "NÃO"
            else -> "NÂO"
        }
    }

}