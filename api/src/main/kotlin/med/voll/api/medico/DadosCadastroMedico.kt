package med.voll.api.medico

import med.voll.api.endereco.DadosEndereco

data class DadosCadastroMedico(
    val nome: String,
    val email: String,
    val crm: String,
    val especilidade: Especilidade,
    val endereco: DadosEndereco,
)
