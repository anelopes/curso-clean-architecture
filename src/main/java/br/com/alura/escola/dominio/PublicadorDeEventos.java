package br.com.alura.escola.dominio;

import java.util.ArrayList;
import java.util.List;

public class PublicadorDeEventos {

    public List<Ouvinte> ouvintes = new ArrayList<>();

    public void adicionar(Ouvinte ouvinte) {
        this.ouvintes.add(ouvinte);
    }

    public void publicar(Evento evento) {
        this.ouvintes.forEach(o -> o.processa(evento));
    }

}
