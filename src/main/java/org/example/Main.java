package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();


        // DEFINIENDO COSTOS DE LA FIESTA

        System.out.println("*******GRAN FIESTA  GRUPO URIBE*******");
        System.out.println("***************************************");

        System.out.println("1 Dgita el costo de la comida");
        double costosAlimentos= entradaPorTeclado.nextDouble();
        if(costosAlimentos>0) {
            objetoFiesta.costosAlimentos=costosAlimentos;

        }else {
            System.out.println("ingresa un valor valido");
        }



        System.out.println("2 Digita el costo de las bebidas");
        double costosBebidas= entradaPorTeclado.nextDouble();
        if(costosBebidas>0) {
            objetoFiesta.costosBebidas=costosBebidas;

        }else {
            System.out.println("ingresa un valor valido");
        }


        System.out.println("3 Digita el costo del lugar");
        double costoslugar= entradaPorTeclado.nextDouble();
        if(costoslugar>0) {
            objetoFiesta.costosLugar=costoslugar;

        }else {
            System.out.println("ingresa un valor valido");
        }




        System.out.println("4 Digita el costo del Equipo");
        double costosEquipos= entradaPorTeclado.nextDouble();
        if(costosEquipos>0) {
            objetoFiesta.costosEquipos=costosEquipos;

        }else {
            System.out.println("ingresa un valor valido");
        }





        System.out.println("el costo del alimento fue :" + objetoFiesta.costosAlimentos);
        System.out.println("el costo de las bebidas fue :" + objetoFiesta.costosBebidas);
        System.out.println("el costo del Lugar fue :" + objetoFiesta.costosLugar);
        System.out.println("el costo de los Equipos fue :" + objetoFiesta.costosEquipos);






    }
}
