/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_angelponcecarlosbarahona;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Lab4_AngelPonceCarlosBarahona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        ArrayList<Equipos> equipos = new ArrayList();
        ArrayList<Jugadores> jugadores = new ArrayList();
        while (opcion != 5) {
            System.out.println("    Seleccione una opcion\n"
                    + "1• Equipos\n"
                    + "2• Jugadores\n"
                    + "3• Juego\n"
                    + "3• Salir");
            opcion = lectura.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Seleccione una opcion\n"
                            + "1. Agregar\n"
                            + "2. Modificar\n"
                            + "3. Eliminar\n"
                            + "4. Listar");
                    int op = lectura.nextInt();
                    if (op == 1) {
                        System.out.println("Nombre del equipo");
                        String nombre = lectura.nextLine();
                        System.out.println("Estadio del equipo: ");
                        String estadio = lectura.nextLine();
                        System.out.println("Pais: ");
                        String pais = lectura.next();
                        System.out.println("Nombre del entrenador: ");
                        String entrenador = lectura.nextLine();
                        System.out.println("Nombre del dueño: ");
                        String dueño = lectura.nextLine();
                        System.out.println("Nombre de la mascota: ");
                        String mascota = lectura.nextLine();
                        System.out.println("Fecha de creacion: ");
                        String fecha = lectura.nextLine();
                        System.out.println("Color principal: ");
                        String color = lectura.nextLine();
                        System.out.println("Jugadores");
                        int pateadores = 1;
                        ArrayList<Jugadores> jug = new ArrayList();
                        if (pateadores != 4) {
                            System.out.println("Nombre");
                            String nombree = lectura.nextLine();
                            System.out.println("Apodo");
                            String apodo = lectura.nextLine();
                            System.out.println("Numero de camiseta: ");
                            String numCam = lectura.nextLine();
                            System.out.println("Equipo de futbol favorito: ");
                            String equiFFav = lectura.nextLine();
                            System.out.println("Equipo de baloncesto favorito: ");
                            String equiBFav = lectura.nextLine();
                            System.out.println("Jugador favorito: ");
                            String jugFav = lectura.nextLine();
                            System.out.println("Mayor de edad (Si/no): ");
                            String mayor = lectura.nextLine();
                            System.out.println("Año de nacimiento: ");
                            String nacimiento = lectura.nextLine();
                            System.out.println("Numero de estrellas (1-5): ");
                            int estrellas = lectura.nextInt();
                            System.out.println("Habilidad pateadora (1-100): ");
                            int HP = lectura.nextInt();
                            System.out.println("Fuerza (1-100): ");
                            int F = lectura.nextInt();
                            System.out.println("Habilidad regateadora (1-100): ");
                            int HR = lectura.nextInt();
                            jugadores.add(new Pateadores(HP, F, HR, nombree, apodo, numCam, equiFFav, equiBFav, jugFav, mayor, nacimiento, estrellas));
                            jug.add(new Pateadores(HP, F, HR, nombree, apodo, numCam, equiFFav, equiBFav, jugFav, mayor, nacimiento, estrellas));
                            pateadores++;
                        }
                        int tiradores = 1;
                        if (tiradores != 3) {
                            System.out.println("Nombre");
                            String nombree = lectura.nextLine();
                            System.out.println("Apodo");
                            String apodo = lectura.nextLine();
                            System.out.println("Numero de camiseta: ");
                            String numCam = lectura.nextLine();
                            System.out.println("Equipo de futbol favorito: ");
                            String equiFFav = lectura.nextLine();
                            System.out.println("Equipo de baloncesto favorito: ");
                            String equiBFav = lectura.nextLine();
                            System.out.println("Jugador favorito: ");
                            String jugFav = lectura.nextLine();
                            System.out.println("Mayor de edad (Si/no): ");
                            String mayor = lectura.nextLine();
                            System.out.println("Año de nacimiento: ");
                            String nacimiento = lectura.nextLine();
                            System.out.println("Numero de estrellas (1-5): ");
                            int estrellas = lectura.nextInt();
                            System.out.println("Tiro de tres (1-100): ");
                            int TT = lectura.nextInt();
                            System.out.println("Tiro de 2 puntos (1-100): ");
                            int TD = lectura.nextInt();
                            System.out.println("Manejo de balon (1-100): ");
                            int MB = lectura.nextInt();
                            jugadores.add(new Tiradores(TT, TD, MB, nombree, apodo, numCam, equiFFav, equiBFav, jugFav, mayor, nacimiento, estrellas));
                            jug.add(new Tiradores(TT, TD, MB, nombree, apodo, numCam, equiFFav, equiBFav, jugFav, mayor, nacimiento, estrellas));
                            tiradores++;
                        }
                        equipos.add(new Equipos(nombre, estadio, pais, entrenador, dueño, mascota, fecha, color, jug));

                    }

                    if (op == 2) {

                        System.out.println("Seleccione el equipo que desea modificar de la lista");
                        int N = lectura.nextInt();
                        System.out.println("seleccione variable a cambiar\n"
                                + "   1.  Nombre del equipo\n"
                                + "   2.  Estadio del equipo\n"
                                + "   3.  Pais\n"
                                + "   4.  Nombre del entrenador\n"
                                + "   5.  Nombre del dueño\n"
                                + "   6.  Nombre de la mascota\n"
                                + "   7.  Fecha de creacion\n"
                                + "   8.  Color principal");
                        int variable = lectura.nextInt();
                        if (equipos.get(N) instanceof Equipos) {
                            if (variable == 1) {
                                System.out.println("Nombre del equipo");
                                String nombre = lectura.nextLine();
                                ((Equipos) equipos.get(N)).setNombre(nombre);
                            }
                            if (variable == 2) {
                                System.out.println("Estadio del equipo: ");
                                String estadio = lectura.nextLine();
                                ((Equipos) equipos.get(N)).setEstadio(estadio);
                            }
                            if (variable == 3) {
                                System.out.println("Pais: ");
                                String pais = lectura.next();
                                ((Equipos) equipos.get(N)).setPais(pais);

                            }
                            if (variable == 4) {
                                System.out.println("Nombre del entrenador: ");
                                String entrenador = lectura.nextLine();
                                ((Equipos) equipos.get(N)).setNombreEntrenador(entrenador);
                            }
                            if (variable == 5) {
                                System.out.println("Nombre del dueño: ");
                                String dueño = lectura.nextLine();
                                ((Equipos) equipos.get(N)).setNombreDuen(dueño);
                            }
                            if (variable == 6) {
                                System.out.println("Nombre de la mascota: ");
                                String mascota = lectura.nextLine();
                                ((Equipos) equipos.get(N)).setNombreMascota(mascota);
                            }
                            if (variable == 7) {
                                System.out.println("Fecha de creacion: ");
                                String fecha = lectura.nextLine();
                                ((Equipos) equipos.get(N)).setFechaCreacion(fecha);
                            }
                            if (variable == 8) {
                                System.out.println("Color principal: ");
                                String color = lectura.nextLine();
                                ((Equipos) equipos.get(N)).setColor(color);
                            }

                        }
                    }
                    if (op == 3) {
                        System.out.println("Escriba el numero de equipo en la lista a eliminar: ");
                        int numlista = lectura.nextInt();
                        equipos.remove(numlista);
                    }
                    if (op == 4) {
                        for (int i = 0; i < equipos.size(); i++) {
                            System.out.println(equipos.get(i));

                        }

                    }

                    break;
                }
                case 2: {
                    System.out.println("Seleccione una opcion\n"
                            + "2. Modificar\n"
                            + "3. Eliminar\n"
                            + "4. Listar");
                    int op = lectura.nextInt();
                    if (op == 2) {
                        System.out.println("Seleccione el jugador que desea modificar de la lista");
                        int N = lectura.nextInt();
                        System.out.println("¿El jugador es tirador o pateador?");
                        String jugador = lectura.nextLine();
                        if (jugador == "Pateador" || jugador == "pateador") {

                            System.out.println("Seleccione variable a cambiar\n"
                                    + "   1.  Nombre\n"
                                    + "   2.  Apodo\n"
                                    + "   3.  Numero de camiseta\n"
                                    + "   4.  Equipo de futbol favorito\n"
                                    + "   5.  Equipo de baloncesto favorito\n"
                                    + "   6.  Jugador favorito\n"
                                    + "   7.  Mayor de edad (Si/no)\n"
                                    + "   8.  Año de nacimiento\n"
                                    + "   9.  Numero de estrellas (1-5)\n"
                                    + "   10.  Habilidad pateadora (1-100)\n"
                                    + "   11.  Fuerza (1-100)\n"
                                    + "   12.  Habilidad regateadora (1-100)"
                            );
                            int variable = lectura.nextInt();
                            if (equipos.get(N) instanceof Equipos) {
                                if (variable == 1) {
                                    System.out.println("Nombre");
                                    String nombre = lectura.nextLine();
                                    ((Tiradores) jugadores.get(N)).setNombre(nombre);
                                }
                                if (variable == 2) {
                                    System.out.println("Apodo");
                                    String apodo = lectura.nextLine();
                                    ((Tiradores) jugadores.get(N)).setApodo(apodo);
                                }
                                if (variable == 3) {
                                    System.out.println("Numero de camiseta: ");
                                    String numCam = lectura.nextLine();
                                    ((Tiradores) jugadores.get(N)).setNumcamiseta(numCam);

                                }
                                if (variable == 4) {
                                    System.out.println("Equipo de futbol favorito: ");
                                    String equiFFav = lectura.nextLine();
                                    ((Tiradores) jugadores.get(N)).setEquipofutfav(equiFFav);
                                }
                                if (variable == 5) {
                                    System.out.println("Equipo de baloncesto favorito: ");
                                    String equiBFav = lectura.nextLine();
                                    ((Tiradores) jugadores.get(N)).setEquipobalfav(equiBFav);
                                }
                                if (variable == 6) {
                                    System.out.println("Jugador favorito: ");
                                    String jugFav = lectura.nextLine();
                                    ((Tiradores) jugadores.get(N)).setJugfav(jugFav);
                                }
                                if (variable == 7) {
                                    System.out.println("Mayor de edad (Si/no): ");
                                    String mayor = lectura.nextLine();
                                    ((Tiradores) jugadores.get(N)).setMayorEdad(mayor);
                                }
                                if (variable == 8) {
                                    System.out.println("Año de nacimiento: ");
                                    String nacimiento = lectura.nextLine();
                                    ((Tiradores) jugadores.get(N)).setNacimiento(nacimiento);
                                }
                                if (variable == 9) {
                                    System.out.println("Numero de estrellas (1-5): ");
                                    int estrellas = lectura.nextInt();
                                    ((Tiradores) jugadores.get(N)).setNumeroEstrellas(estrellas);
                                }
                                if (variable == 10) {
                                    System.out.println("Tiro de tres (1-100): ");
                                    int TT = lectura.nextInt();
                                    ((Tiradores) jugadores.get(N)).setTirodetres(TT);
                                }
                                if (variable == 11) {
                                    System.out.println("Tiro de 2 puntos (1-100): ");
                                    int TD = lectura.nextInt();
                                    ((Tiradores) jugadores.get(N)).setTirodedos(TD);
                                }
                                if (variable == 12) {
                                    System.out.println("Manejo de balon (1-100): ");
                                    int MB = lectura.nextInt();
                                    ((Tiradores) jugadores.get(N)).setManejodebalon(MB);
                                }

                            }
                        } else if (jugador == "Tirador" || jugador == "tirador") {

                            System.out.println("Seleccione variable a cambiar\n"
                                    + "   1.  Nombre\n"
                                    + "   2.  Apodo\n"
                                    + "   3.  Numero de camiseta\n"
                                    + "   4.  Equipo de futbol favorito\n"
                                    + "   5.  Equipo de baloncesto favorito\n"
                                    + "   6.  Jugador favorito\n"
                                    + "   7.  Mayor de edad (Si/no)\n"
                                    + "   8.  Año de nacimiento\n"
                                    + "   9.  Numero de estrellas (1-5)\n"
                                    + "   10.  Tiro de tres (1-100)\n"
                                    + "   11.  Tiro de 2 puntos (1-100)\n"
                                    + "   12.  Manejo de balon (1-100)");
                            int variable = lectura.nextInt();
                            if (equipos.get(N) instanceof Equipos) {
                                if (variable == 1) {
                                    System.out.println("Nombre");
                                    String nombre = lectura.nextLine();
                                    ((Pateadores) jugadores.get(N)).setNombre(nombre);
                                }
                                if (variable == 2) {
                                    System.out.println("Apodo");
                                    String apodo = lectura.nextLine();
                                    ((Pateadores) jugadores.get(N)).setApodo(apodo);
                                }
                                if (variable == 3) {
                                    System.out.println("Numero de camiseta: ");
                                    String numCam = lectura.nextLine();
                                    ((Pateadores) jugadores.get(N)).setNumcamiseta(numCam);

                                }
                                if (variable == 4) {
                                    System.out.println("Equipo de futbol favorito: ");
                                    String equiFFav = lectura.nextLine();
                                    ((Pateadores) jugadores.get(N)).setEquipofutfav(equiFFav);
                                }
                                if (variable == 5) {
                                    System.out.println("Equipo de baloncesto favorito: ");
                                    String equiBFav = lectura.nextLine();
                                    ((Pateadores) jugadores.get(N)).setEquipobalfav(equiBFav);
                                }
                                if (variable == 6) {
                                    System.out.println("Jugador favorito: ");
                                    String jugFav = lectura.nextLine();
                                    ((Pateadores) jugadores.get(N)).setJugfav(jugFav);
                                }
                                if (variable == 7) {
                                    System.out.println("Mayor de edad (Si/no): ");
                                    String mayor = lectura.nextLine();
                                    ((Pateadores) jugadores.get(N)).setMayorEdad(mayor);
                                }
                                if (variable == 8) {
                                    System.out.println("Año de nacimiento: ");
                                    String nacimiento = lectura.nextLine();
                                    ((Pateadores) jugadores.get(N)).setNacimiento(nacimiento);
                                }
                                if (variable == 9) {
                                    System.out.println("Numero de estrellas (1-5): ");
                                    int estrellas = lectura.nextInt();
                                    ((Pateadores) jugadores.get(N)).setNumeroEstrellas(estrellas);
                                }
                                if (variable == 10) {
                                    System.out.println("Habilidad pateadora (1-100): ");
                                    int HP = lectura.nextInt();
                                    ((Pateadores) jugadores.get(N)).setHabilidadPateadora(HP);
                                }
                                if (variable == 11) {
                                    System.out.println("Fuerza (1-100): ");
                                    int F = lectura.nextInt();
                                    ((Pateadores) jugadores.get(N)).setFuerza(F);
                                }
                                if (variable == 12) {
                                    System.out.println("Habilidad regateadora (1-100): ");
                                    int HR = lectura.nextInt();
                                    ((Pateadores) jugadores.get(N)).setHabilidadRegate(HR);
                                }
                            } else {
                                System.out.println("No existe ese tipo de jugador");
                            }

                        }

                    }
                    if (op == 3) {
                        System.out.println("Escriba el numero de jugador en la lista a eliminar: ");
                        int numlista = lectura.nextInt();
                        jugadores.remove(numlista);
                    }
                    if (op == 4) {
                        for (int i = 0; i < jugadores.size(); i++) {
                            System.out.println(jugadores.get(i));

                        }

                    }

                }
                break;
                case 3: {

                    System.out.println("JUEGO");
                    int ptsequipo1 = 0;
                    int ptsequipo2 = 0;
                    System.out.println("Que jugador tendra la pelota inicialmente?: ");
                    System.out.println("1. Jugador 1");
                    System.out.println("2. Jugador 2");
                    System.out.print("Escoja: ");
                    int opc = lectura.nextInt();
                    while (opc != 1 && opc != 2) {
                        System.out.println("Por favor, ingrese una opcion valida: ");
                        System.out.println("1. Jugador 1");
                        System.out.println("2. Jugador 2");
                        System.out.print("Escoja: ");
                        opc = lectura.nextInt();
                    }
                    System.out.println("J1 Ingrese posicion del equipo que quiere usar");
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(equipos.get(i).getNombre());
                    }
                    System.out.println("Escoja: ");
                    int pos1 = lectura.nextInt();
                    System.out.println("J2 Ingrese posicion del equipo que quiere usar");
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(equipos.get(i).getNombre());
                    }
                    System.out.println("Escoja: ");
                    int pos2 = lectura.nextInt();
                    while (pos2 == pos1) {
                        System.out.println("Jugador 1 ya tiene ese equipo, elija otro: ");
                        pos2 = lectura.nextInt();
                    }
                    //Empezando juego
                    while (ptsequipo1 < 11 && ptsequipo2 < 11) {
                        if (opc == 1) {
                            System.out.println("Jugador 1 ");
                            System.out.println("1. Atacar");
                            System.out.println("2. Dar pase");
                            System.out.println("Ingrese (1 ó 2): ");
                            int op1 = lectura.nextInt();
                            while (op1 != 1 && op1 != 2) {
                                System.out.println("Por favor, ingrese una opcion valida: ");
                                System.out.println("1. Atacar");
                                System.out.println("2. Dar pase");
                                System.out.println("Ingrese (1 ó 2): ");
                                op1 = lectura.nextInt();
                            }
                            switch (op1) {
                                case 1:
                                    System.out.println("Con que jugador desea atacar? Ingrese posicion");
                                    for (int i = 0; i < equipos.get(pos1).getJugadores().size(); i++) {
                                        System.out.println(equipos.get(pos1).getJugadores().get(i).getNombre());
                                    }
                                    System.out.println("Ingrese: ");
                                    int posjug = lectura.nextInt();

                                    break;
                                case 2:

                                    break;

                            }
                        }
                    }//Fin del juego

                }
            }
            break;

        }
    }

    public void FindelJuego(int ptsequipo1, int ptsequipo2) {
        System.out.println("Puntos anotado por equipo 1: " + ptsequipo1);

        System.out.println("Puntos anotados por equipo 2: " + ptsequipo2);

    }

}
