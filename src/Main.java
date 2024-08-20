package jogo;

import java.util.Random;

public class Floresta {
    private Elemento[][] terreno;
    private int dimensao;

    public Floresta(int dimensao) {
        this.dimensao = dimensao;
        this.terreno = new Elemento[dimensao][dimensao];
        inicializarTerreno();
    }

    private void inicializarTerreno() {
        Random rand = new Random();
        // Lógica para preencher o terreno com elementos
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                // Exemplo: adicionar grama em todas as posições
                terreno[i][j] = new Grama(i, j);
            }
        }
        // Adicionar pedras e árvores
    }

    public void exibirEstado() {
        // Lógica para exibir o estado atual da floresta
    }
}