package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CPFTest {

    @Test
    public void naoDeveriaCriarCPFsInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("cpfInvalido"));
    }

    @Test
    public void deveriaCriarCPFValido() {
        String numero = "123.456.789-93";
        CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());
    }
}