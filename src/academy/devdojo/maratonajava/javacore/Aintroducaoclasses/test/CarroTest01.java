package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

import java.sql.SQLOutput;

public class CarroTest01 {
    public static void main(String[] args) {


        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Honda";
        carro1.modelo = "New Civic";
        carro1.ano = 2022;

        carro2.nome = "Toyota";
        carro2.modelo = "Corolla";
        carro2.ano = 2022;

        carro1 = carro2;

        System.out.println("Carro 1");
        System.out.println("Carro: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano de Fabricação: " + carro1.ano);

        System.out.println("---------------");

        System.out.println("Carro 2");  // \n Serve para pular uma linha
        System.out.println("Carro: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano de Fabricação: " + carro2.ano);
    }
}