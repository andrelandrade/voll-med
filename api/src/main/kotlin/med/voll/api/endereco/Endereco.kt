package med.voll.api.endereco

import jakarta.persistence.Embeddable


@Embeddable
data class Endereco (
    val logradouro: String,
    val bairro: String,
    val cep: String,
    val numero: String,
    val complemento: String,
    val cidade: String,
    val uf: String,
)