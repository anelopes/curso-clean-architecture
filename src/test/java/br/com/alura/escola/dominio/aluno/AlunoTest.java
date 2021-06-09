package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    public void setUp() {
        this.aluno = new FabricaDeAluno()
                .comNomeCPFEmail("Fulano", "123.456.789-00", "fulano@email.com")
                .criar();
    }

    @Test
    public void deveriaPermitirAdicionar1Telefone() {
        this.aluno.adicionarTelefone("11", "11111111");
        assertEquals(1, this.aluno.getTelefones().size());
    }

    @Test
    public void deveriaPermitirAdicionar2Telefone() {
        this.aluno.adicionarTelefone("11", "11111111");
        this.aluno.adicionarTelefone("11", "22222222");
        assertEquals(2, this.aluno.getTelefones().size());
    }

    @Test
    public void naoDeveriaPermitirAdicionar3Telefone() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.aluno.adicionarTelefone("11", "11111111");
            this.aluno.adicionarTelefone("11", "22222222");
            this.aluno.adicionarTelefone("11", "33333333");
        });
    }
}