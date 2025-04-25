/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject0;

import java.util.Scanner;

/**
 *
 * @author Manue
 */
public class Mavenproject0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        crud objInstancia = new crud();
        Mavenproject0 obj = new Mavenproject0();
        dbConnection.getConnection();

        System.out.println("MENU");
        System.out.println("1 CREAR");
        System.out.println("2 LISTAR ALL");
        System.out.println("3 UPDATE DATA");
        System.out.println("4 ELIMINAR BY ID");
        System.out.println("ELIJA LA OPCION DEL 1 - 4");
        int eleccion = scanner.nextInt();
        scanner.nextLine();
        switch (eleccion) {
            case 1:
                System.out.println("ESCRIBE NOMBRE:");
                String name = scanner.nextLine();

                System.out.println("ESCRIBE TELEFONO:");
                String cellphone = scanner.nextLine();
                
                objInstancia.Create(name, cellphone);
                break;
            case 2:
                objInstancia.Read();
                break;
            case 3:
                System.out.println("Eliga AL USUARIO A ACTUALIZAR BY ID:");
                objInstancia.Read();
                System.out.println("Eliga LA OPCION 1-10...");
                Integer IDd = scanner.nextInt();
                scanner.nextLine();// entrada de datos 1 en 13
         
                System.out.println("ESCRIBE nuevo NOMBRE:");
                String nameO = scanner.nextLine();
                System.out.println("ESCRIBE nuevo TELEFONO:");
                String cellphoneO = scanner.nextLine();
                objInstancia.Update(IDd, nameO, cellphoneO);
                break;
            case 4:
                System.out.println("TECLE EL ID A BORRAR:");
                Integer ID = scanner.nextInt();
                objInstancia.Delete(ID);
                break;
            default:
                scanner.close();
                break;
        }
        scanner.close();
    }
}
