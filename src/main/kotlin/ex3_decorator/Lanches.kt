package ex3_decorator

interface Lanche {
    fun adicionarIngredientes(): String
}

open class LancheDecorator(protected var lanche: Lanche): Lanche {
    override fun adicionarIngredientes(): String {
        return lanche.adicionarIngredientes()
    }
}

class LancheSimples: Lanche {
    override fun adicionarIngredientes(): String {
        return "Pão com Maionese"
        }
}
class LancheFrango(lanche: Lanche): LancheDecorator(lanche) {
    override fun adicionarIngredientes(): String {
        return lanche.adicionarIngredientes() + ", Filé de Frango grelhado"
    }
}

class LancheCarne(lanche: Lanche): LancheDecorator(lanche) {
    override fun adicionarIngredientes(): String {
        return lanche.adicionarIngredientes() + ", Bife, Cebola Roxa"
    }
}

class Vegetais(lanche: Lanche): LancheDecorator(lanche) {
    override fun adicionarIngredientes(): String {
        return lanche.adicionarIngredientes() + ", Tomate, Alface"
    }
}

class Molhos(lanche: Lanche): LancheDecorator(lanche) {
    override fun adicionarIngredientes(): String {
        return lanche.adicionarIngredientes() + ", Mostarda e Ketchup"
    }
}


