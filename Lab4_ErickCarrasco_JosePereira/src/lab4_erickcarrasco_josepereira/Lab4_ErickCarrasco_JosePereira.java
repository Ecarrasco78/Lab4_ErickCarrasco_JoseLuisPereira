package lab4_erickcarrasco_josepereira;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_ErickCarrasco_JosePereira {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int opw = 0, ops = 0, aux = 2;
        ArrayList lista = new ArrayList();
        try {
            while (opw != 5) {
                System.out.println("***************MENU***************");
                System.out.println("1) Agregar Jugadores");
                System.out.println("2) Listar Jugadores");
                System.out.println("3) Eliminar Jugadores");
                System.out.println("4) Comenzar Juego");
                System.out.println("5) Salir");
                System.out.println("Ingrese su desicion");
                int des = lea.nextInt();
                switch (des) {
                    case 1:
                        // cada jugador posee un nombre, nombre de usuario, puntos
                        //actuales (al inicio será 0), Lugar de nacimiento, edad, sexo.
                        System.out.println("***************AGREGAR_JUGADORES***************");
                        //     lea.next();
                        System.out.println("Ingrese el nombre del jugador 1");
                        String nom = lea.next();
                        System.out.println("Ingrese el nombre de usuario del jugador 1");
                        String user = lea.next();
                        System.out.println("Ingrese el lugar de nacimiento del jugador 1");
                        String lugar = lea.next();
                        System.out.println("Ingrese la edad del jugador 1");
                        int edad = lea.nextInt();
                        System.out.println("Ingrese el sexo del jugador 1");
                        String sex = lea.next();
                        System.out.println("Ingrese el nombre del jugador 2");
                        String nom2 = lea.next();
                        System.out.println("Ingrese el nombre de usuario del jugador 2");
                        String user2 = lea.next();
                        System.out.println("Ingrese el lugar de nacimiento del jugador 2");
                        String lugar2 = lea.next();
                        System.out.println("Ingrese la edad del jugador 2");
                        int edad2 = lea.nextInt();
                        System.out.println("Ingrese el sexo del jugador 2");
                        String sex2 = lea.next();
                        lista.add(new Jugador(nom, user, 0, lugar, edad, sex));
                        lista.add(new Jugador(nom2, user2, 0, lugar2, edad2, sex2));
                        break;
                    case 2:
                        System.out.println("***************LISTAR_JUGADORES***************");
                        for (Object t : lista) {
                            if (t instanceof Jugador) {
                                System.out.println(lista.indexOf(t) + " " + t);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("***************ELIMINAR_JUGADORES***************");
                        for (Object t : lista) {
                            if (t instanceof Jugador) {
                                System.out.println(lista.indexOf(t) + " " + t);
                            }
                        }
                        System.out.println("Ingrese la posicion del jugador que desea eliminar");
                        int po=lea.nextInt();
                        lista.remove(po);
                        break;
                    case 4:
                        int lives1 =16;
                        int lives2 = 16;
                        int turn = 0;
                        Tablero t = new Tablero();
                        Partida p = new Partida();
                        do{
                            if (turn == 0) {
                                System.out.println(t.M);
                                int x;
                                int y;
                                
                                System.out.println("Ingrese ");
                            }
                            
                        }while(lives1 == 0 ||lives2 ==0);

                        break;
                    case 5:
                        opw = 5;
                        break;

                }
            }
        } catch (Exception e) {
            System.out.println("El dato que ingreso no es valido");

        }
    }
}
