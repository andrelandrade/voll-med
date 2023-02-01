package med.voll.api.medico

import jakarta.persistence.*
import med.voll.api.endereco.Endereco

@Table(name = "medicos")
@Entity(name = "Medico")
data class Medico (

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    val nome: String,
    val email: String,
    val crm: String,

    @Enumerated(EnumType.STRING)
    val especilidade: Especilidade,

    @Embedded
    var endereco: Endereco,
)