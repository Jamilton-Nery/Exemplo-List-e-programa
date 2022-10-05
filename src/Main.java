import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Responda sim ou não");

        ArrayList<String> perguntas = new ArrayList<String>();
        perguntas.add("Telefonou para a vítima ?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        System.out.println(perguntas.get(0));

        String resposta = "sim";
        String resposta2 = "não";

        Scanner scanner = new Scanner(System.in);
        String feedback = scanner.nextLine();

        if (resposta.equals(feedback)){
            System.out.println(perguntas.get(1));
        } else {
            System.out.println("Resposta inválida!");
        }

        Scanner scanner1 = new Scanner(System.in);
        String feedback1 = scanner.nextLine();

        if (resposta.equals(feedback1)){
            System.out.println("Suspeito!");
        } else {
            System.out.println(perguntas.get(2));
        }

        Scanner scanner2 = new Scanner(System.in);
        String feedback2 = scanner.nextLine();

        if (resposta.equals(feedback2)){
            System.out.println("Cúmplice!");
        } else {
            System.out.println(perguntas.get(3));
        }

        Scanner scanner3 = new Scanner(System.in);
        String feedback3 = scanner.nextLine();

        if (resposta.equals(feedback3)){
            System.out.println("Cúmplice!");
        } else {
            System.out.println(perguntas.get(4));
        }

        Scanner scanner4 = new Scanner(System.in);
        String feedback4 = scanner.nextLine();

        if (resposta.equals(feedback4)){
            System.out.println("Inocente!");
        } else {
            System.out.println("Assasina!");
        }
    }

    }

