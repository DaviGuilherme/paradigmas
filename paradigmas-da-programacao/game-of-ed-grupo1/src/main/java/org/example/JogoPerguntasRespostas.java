package org.example;

import java.util.Scanner;

public class JogoPerguntasRespostas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] perguntasERespostas = {
                {"Qual é a capital do Brasil?", "brasília"},
                {"Quantos planetas há em nosso sistema solar?", "oito"},
                {"Quem pintou a Mona Lisa?", "leonardo da vinci"},
                {"Qual é o maior mamífero terrestre?", "elefante africano"},
                {"Qual é o maior oceano do mundo?", "oceano pacífico"},
                {"Quem escreveu a peça de teatro \"Romeu e Julieta\"?", "william shakespeare"},
                {"Qual é o símbolo químico do ouro?", "au"},
                {"Qual é o nome da famosa pintura de Edvard Munch que representa um rosto gritando?", "o grito"},
        };

        System.out.println("Bem-vindo ao Jogo de Perguntas e Respostas!");
        System.out.println("Digite 'sair' a qualquer momento para encerrar o jogo.\n");

        int pontos = 0;

        for (String[] perguntaEResposta : perguntasERespostas) {
            String pergunta = perguntaEResposta[0];
            String respostaCorreta = perguntaEResposta[1];

            System.out.println(pergunta);
            String respostaJogador = scanner.nextLine().toLowerCase();

            if (respostaJogador.equalsIgnoreCase("sair")) {
                break;
            }

            if (respostaJogador.equalsIgnoreCase(respostaCorreta)) {
                System.out.println("Resposta correta!\n");
                pontos++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta era: " + respostaCorreta + "\n");
            }
        }

        System.out.println("Fim do jogo!");
        System.out.println("Você marcou " + pontos + " ponto(s).");
    }
}

