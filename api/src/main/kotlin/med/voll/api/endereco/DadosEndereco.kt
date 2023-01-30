package med.voll.api.endereco

data class DadosEndereco (
    val logradouro: String,
    val bairro: String,
    val cep: String,
    val cidade: String,
    val uf: String,
    val complemento: String?,
    val numero: String?,
)