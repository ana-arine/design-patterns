package ex2_factory

interface IBread {
    fun nomePao(): String
    fun qtddCalorias(): Double
    fun valor(): String
}

class Baguete : IBread {
    override fun nomePao(): String {
        return "Baguete"
    }

    override fun qtddCalorias(): Double {
        return 588.50
    }

    override fun valor(): String {
        return "12.40"
    }

    override fun toString(): String {
        return "\nFabrincando o pão do tipo ${Baguete().nomePao()} contendo ${Baguete().qtddCalorias()} kcal no valor de R$ ${Baguete().valor()} o Kg."
    }
}

class PaoDeForma : IBread {

    override fun nomePao(): String {
        return "Pão de Forma"
    }

    override fun qtddCalorias(): Double {
        return 866.88
    }

    override fun valor(): String {
        return "R$ 10.80"
    }

    override fun toString(): String {
        return "\nFabrincando o pão do tipo ${PaoDeForma().nomePao()} contendo ${PaoDeForma().qtddCalorias()} kcal no valor de R$ ${PaoDeForma().valor()} o Kg."
    }
}

class PaoSovado : IBread {

    override fun nomePao(): String {
        return "Pão Sovado"
    }

    override fun qtddCalorias(): Double {
        return 700.55
    }

    override fun valor(): String {
        return "R$ 16.60"
    }
    override fun toString(): String {
        return "\nFabrincando o pão do tipo ${PaoSovado().nomePao()} contendo ${PaoSovado().qtddCalorias()} kcal no valor de R$ ${PaoSovado().valor()} o Kg."
    }
}


enum class TipoPao {
    Baguete, PaoDeForma, PaoSovado
}

fun paozinho(pao: TipoPao): IBread? {
    return when (pao){
        TipoPao.Baguete -> Baguete()
        TipoPao.PaoDeForma -> PaoDeForma()
        TipoPao.PaoSovado -> PaoSovado()
        else -> null
    }
}

fun main(args: Array<String>) {
    println(paozinho(TipoPao.PaoSovado).toString())
    println(paozinho(TipoPao.Baguete).toString())
    println(paozinho(TipoPao.PaoDeForma).toString())
}

