package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.Evento;

import java.time.LocalDateTime;

public class AlunoMatriculado implements Evento {

    private final CPF cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }

    @Override
    public LocalDateTime momento() {
        return this.momento;
    }
}
