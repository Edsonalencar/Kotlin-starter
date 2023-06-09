package dominio

import java.lang.IllegalArgumentException

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Formacao(val name: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {
    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        if(inscritos.contains(usuario)) throw IllegalArgumentException("Usuario já cadastrado")
        inscritos.add(usuario)
    }

    fun cancelMatricula(usuario: Usuario) {
        inscritos.remove(usuario)
    }

    fun getInscritos(): List<Usuario> {
        return inscritos
    }
}