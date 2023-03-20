package com.mycompany.cadastraradvogados;

/**
 *
 * @author Vinicius
 */
public class CadastrarAdvogados {

    public static void main(String[] args) {
        Advogado adv1 = new Advogado("Ademir Veiga", 50);
        adv1.setInfoAdv(123678910, 88554, "(45)991232323", "veiga@gmail.com", "Civil");

        Advogado adv2 = new Advogado("Rogerio", 42);
        adv2.setInfoAdv(1236534510, 8859, "(45)991232323", "rogerio@gmail.com", "Civil");

        Advogado adv3 = new Advogado("Juce", 54);
        adv3.setInfoAdv(1236712910, 8454, "(45)991232323", "juce@gmail.com", "Civil");

        Advogado adv4 = new Advogado("Maria", 23);
        adv4.setInfoAdv(12128910, 8004, "(45)991232323", "maria@gmail.com", "Crime");

        Advogado adv5 = new Advogado("Jonas", 43);
        adv5.setInfoAdv(1236123910, 0054, "(45)991232323", "Jonas@gmail.com", "Crime");

        Advogado adv6 = new Advogado("Patrick", 23);
        adv6.setInfoAdv(1236425910, 88894, "(45)991232323", "Patrick@gmail.com", "Crime");

        Advogado adv7 = new Advogado("Carlos", 34);
        adv7.setInfoAdv(123453910, 84214, "(45)991232323", "carlos@gmail.com", "Acidentes");

        Advogado adv8 = new Advogado("Vinicius", 89);
        adv8.setInfoAdv(1245238910, 7754, "(45)991232323", "vinicius@gmail.com", "Acidentes");

        System.out.println("Nome advogado: " + adv6.nome + "Idade: " + adv6.idade + adv6.getInfoAdv());
        System.out.println("Nome advogado: " + adv7.nome + "Idade: " + adv7.idade + adv7.getInfoAdv());
        System.out.println("Nome advogado: " + adv8.nome + "Idade: " + adv8.idade + adv8.getInfoAdv());

    }
}
