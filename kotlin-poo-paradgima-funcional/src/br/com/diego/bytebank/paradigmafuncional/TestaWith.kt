package br.com.diego.bytebank.paradigmafuncional

import br.com.diego.bytebank.modelo.Endereco

fun testaWith() {
    with(Endereco()) {
        complemento = "Rua"
        estado = "Sp"
        cidade = "SAnto Andre"
        numero = 122
        completo()

    }
}