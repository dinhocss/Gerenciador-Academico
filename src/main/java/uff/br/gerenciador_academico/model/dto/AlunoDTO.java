package uff.br.gerenciador_academico.model.dto;

import uff.br.gerenciador_academico.model.Aluno;

public record AlunoDTO (
        Long id,
        String nome,
        String matricula,
        String cpf
) {
    public static AlunoDTO fromEntity(Aluno aluno){
        return new AlunoDTO(
                aluno.getId(),
                aluno.getNome(),
                aluno.getMatricula(),
                aluno.getCpf()
        );
    }

    public Aluno toEntity(){
        Aluno aluno = new Aluno();
        aluno.setId(this.id);
        aluno.setNome(this.nome);
        aluno.setMatricula(this.matricula);
        aluno.setCpf(this.cpf);
        return aluno;
    }
}
