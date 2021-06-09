package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {

    @Test
    public void naoDeveriaCriarTelefonesComDDDInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("dddInvalido", null));
    }

    @Test
    public void naoDeveriaCriarTelefonesComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "numeroInvalido"));
    }

    @Test
    public void deveriaCriarTelefoneComDDDENumeroValidos() {
        String ddd = "11";
        String numero = "12345678";
        Telefone telefone = new Telefone(ddd, numero);
        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }
}