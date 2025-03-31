// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL, HARDCORE }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao( val nome: String, val conteudos: List<ConteudoEducacional>, val niveis: List<Nivel>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} adicionado a lista!")
    }
    fun apresentar(usuario: Usuario){

        println("Usuario cadastrado: ${usuario.nome}")
        println(nome)
        println("Conteudos: $conteudos")
        println("Niveis $niveis")

    }
}

fun main() {
    val usuario1 = Usuario("Aline")
    val usuario2 = Usuario("Chris")

    val conteudo1 = ConteudoEducacional("Programação Basica", 60, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Programação Intermediaria", 60, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Programação Avançada", 60, Nivel.DIFICIL)
    val conteudo4 = ConteudoEducacional("Androido Hardicore Avançado com Kotlin", 120, Nivel.HARDCORE)

    val formacao1 = Formacao("Formação em Kotlin: basica e intermediaria", listOf(conteudo1, conteudo2), listOf( Nivel.BASICO, Nivel.INTERMEDIARIO))
    val formacao2 = Formacao("Formação Kotlin: Intermediario e avançado", listOf(conteudo2, conteudo3), listOf(Nivel.INTERMEDIARIO, Nivel.DIFICIL))
    val formacao3 = Formacao("Formação Android com Kotlin Avançado", listOf(conteudo3, conteudo4), listOf(Nivel.DIFICIL, Nivel.HARDCORE))

    formacao1.matricular(usuario1)
    formacao3.matricular(usuario2)

    formacao1.apresentar(usuario2)
    
}