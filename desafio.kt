import dominio.ConteudoEducacional
import dominio.Formacao
import dominio.Nivel
import dominio.Usuario

fun main() {
    val user1 = Usuario(name = "Edson Alencar", description = "Desenvolvedor Front End")
    val user2 = Usuario(name = "Pedro Alencar", description = "Desenvolvedor Back End")

    val curso1 = ConteudoEducacional(title = "Introdução a Kotlin")
    val curso2 = ConteudoEducacional(title = "Java avançado")

    val conteudos = mutableListOf<ConteudoEducacional>()
    conteudos.add(curso1)
    conteudos.add(curso2)

    val formacao = Formacao(name = "Spring Kotlin", nivel = Nivel.INTERMEDIARIO, conteudos = conteudos)
    println(formacao)
    println(formacao.getInscritos())

    formacao.matricular(user1)
    formacao.matricular(user2)
    println(formacao.getInscritos())
}
