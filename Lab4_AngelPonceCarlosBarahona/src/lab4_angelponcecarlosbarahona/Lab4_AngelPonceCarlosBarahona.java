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

                    + "5• Salir\n");
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
                        System.out.println("Nombre");
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
                            jug.add(new Pateadores(HP, F, HR, nombree, apodo, numCam, equiFFav, equiBFav, jugFav, mayor, nacimiento, estrellas));
                            pateadores++;
                        }
                        int tiradores = 1;
                        if (tiradores != 4) {
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
                            jug.add(new Tiradores(TT, TD, MB, nombree, apodo, numCam, equiFFav, equiBFav, jugFav, mayor, nacimiento, estrellas));
                            tiradores++;
                        }
                        equipos.add(new Equipos(nombre, estadio, pais, entrenador, dueño, mascota, fecha, color, jug ));

                    }

                    if (op == 2) {

                        System.out.println("seleccion numero de lista");
                        int op2 = lectura.nextInt();
                        System.out.println("seleccione variable a cambiar\n"
                                + "   0. nombre;\n"
                                + "   1.  sede\n"
                                + "   2.  año\n"
                                + "   3.  presidente\n"
                                + "   4.  empleados\n"
                                + "   5.  autos\n"
                                + "   6.  marcas ");
                        int variable = lectura.nextInt();
                        if (corp.get(op) instanceof CorpAuto) {
                            if (variable == 2) {
                                System.out.println("camibio de año");
                                System.out.println("año");
                                int años = lectura.nextInt();
                                System.out.println("mes");
                                int mes = lectura.nextInt();
                                System.out.println("dia");
                                int dia = lectura.nextInt();
                                Date año = new Date(años, mes, dia);
                                ((CorpAuto) corp.get(op)).setAño(año);
                            }
                            if (variable == 0) {
                                System.out.println("cambio de nombre");
                                ((CorpAuto) corp.get(op)).setNombre(lectura.next());
                            }
                            if (variable == 1) {
                                System.out.println("cambio de sede");
                                ((CorpAuto) corp.get(op)).setSede(lectura.next());

                            }
                            if (variable == 3) {
                                System.out.println("cambio precidente");
                                ((CorpAuto) corp.get(op)).setPresidente(lectura.next());
                            }
                            if (variable == 4) {
                                System.out.println("cambio empleados");
                                ((CorpAuto) corp.get(op)).setEmpleados(lectura.nextInt());
                            }
                            if (variable == 5) {
                                System.out.println("cambion de aoutos");
                                ((CorpAuto) corp.get(op)).setAutos(lectura.nextInt());
                            }
                            if (variable == 6) {
                                ArrayList marca = new ArrayList();
                                System.out.println("cambio de marca");
                                char resp = 's';
                                while (resp == 's' || resp == 'S') {
                                    System.out.println("agrege marca");
                                    String mark = lectura.next();
                                    marca.add(mark);
                                    System.out.println("continua...");
                                    resp = lectura.next().charAt(0);
                                }
                                ((CorpAuto) corp.get(op)).setMarcas(marca);
                            }

                        }
                    }
                    if (opcioncorp == 3) {//borrar
                        System.out.println(" numero de lista a borrar");
                        int numlista = lectura.nextInt();
                        corp.remove(numlista);
                    }
                    if (opcioncorp == 4) {//mostrar
                        for (int i = 0; i < corp.size(); i++) {
                            System.out.println(corp.get(i));
                        }

                    }

                    break;
                }
                case 2: {
                    if (marca2 == true) {

                        String marca_tipo = "";
                        System.out.println("tipo de marca,\n"
                                + "1.premiun \n"
                                + " a.sedán\n"
                                + " b.hatchback\n "
                                + " c.SUV\n"
                                + "2.generalist\n"
                                + " a.low cost\n"
                                + " b.semi-primun\n");
                        int cont = lectura.nextInt();
                        if (cont == 1) {
                            System.out.println("premiun\n"
                                    + " a.sedán\n"
                                    + " b.hatchback\n "
                                    + " c.SUV");
                            String letra = lectura.next();
                            if (letra == "a") {
                                System.out.println("nombre");
                                String nombre = lectura.next();
                                System.out.println("lema o slogan de la compñia");
                                String slogan = lectura.next();
                                System.out.println("Año integrado");
                                System.out.println("año");
                                int años = lectura.nextInt();
                                System.out.println("mes");
                                int mes = lectura.nextInt();
                                System.out.println("dia");
                                int dia = lectura.nextInt();
                                Date año = new Date(años, mes, dia);//date

                                System.out.println("Año integrado");
                                System.out.println("año");
                                int años1 = lectura.nextInt();
                                System.out.println("mes");
                                int mes1 = lectura.nextInt();
                                System.out.println("dia");
                                int dia1 = lectura.nextInt();
                                Date integro = new Date(años1, mes1, dia1);//date

                                System.out.println("Nombre del fundador");
                                String fundador = lectura.next();
                                System.out.println("ventas anuales");
                                int ventas = lectura.nextInt();
                                System.out.println("precidente del compañia");
                                String presidente = lectura.next();
                                System.out.println("numero de Modelo");
                                int modelos = lectura.nextInt();
                                System.out.println("nombre de su división deportiva");
                                String divdeportiva = lectura.next();
                                System.out.println("nombre de su división de lujo");
                                String divlujo = lectura.next();
                                System.out.println("tipo de carrocería másfabricada");
                                String carrMasfabricada = lectura.next();
                                marka.add(new Marcas(nombre, slogan, año, integro, fundador, ventas, presidente, modelos) + divdeportiva + divlujo + carrMasfabricada);

                            }
                            if (letra == "b") {
                                System.out.println("nombre");
                                String nombre = lectura.next();
                                System.out.println("lema o slogan de la compñia");
                                String slogan = lectura.next();
                                System.out.println("Año integrado");
                                System.out.println("año");
                                int años = lectura.nextInt();
                                System.out.println("mes");
                                int mes = lectura.nextInt();
                                System.out.println("dia");
                                int dia = lectura.nextInt();
                                Date año = new Date(años, mes, dia);//date

                                System.out.println("Año integrado");
                                System.out.println("año");
                                int años1 = lectura.nextInt();
                                System.out.println("mes");
                                int mes1 = lectura.nextInt();
                                System.out.println("dia");
                                int dia1 = lectura.nextInt();
                                Date integro = new Date(años1, mes1, dia1);//date

                                System.out.println("Nombre del fundador");
                                String fundador = lectura.next();
                                System.out.println("ventas anuales");
                                int ventas = lectura.nextInt();
                                System.out.println("precidente del compañia");
                                String presidente = lectura.next();
                                System.out.println("numero de Modelo");
                                int modelos = lectura.nextInt();

                                System.out.println("nombre de su división deportiva");
                                String divdeportiva = lectura.next();
                                System.out.println("nombre de su división de lujo");
                                String divlujo = lectura.next();
                                System.out.println("tipo de carrocería másfabricada");
                                String carrMasfabricada = lectura.next();
                                marka.add(new Marcas(nombre, slogan, año, integro, fundador, ventas, presidente, modelos) + divdeportiva + divlujo + carrMasfabricada);

                            }
                            if (letra == "c") {
                                System.out.println("nombre");
                                String nombre = lectura.next();
                                System.out.println("lema o slogan de la compñia");
                                String slogan = lectura.next();
                                System.out.println("Año integrado");
                                System.out.println("año");
                                int años = lectura.nextInt();
                                System.out.println("mes");
                                int mes = lectura.nextInt();
                                System.out.println("dia");
                                int dia = lectura.nextInt();
                                Date año = new Date(años, mes, dia);//date

                                System.out.println("Año integrado");
                                System.out.println("año");
                                int años1 = lectura.nextInt();
                                System.out.println("mes");
                                int mes1 = lectura.nextInt();
                                System.out.println("dia");
                                int dia1 = lectura.nextInt();
                                Date integro = new Date(años1, mes1, dia1);//date

                                System.out.println("Nombre del fundador");
                                String fundador = lectura.next();
                                System.out.println("ventas anuales");
                                int ventas = lectura.nextInt();
                                System.out.println("precidente del compañia");
                                String presidente = lectura.next();
                                System.out.println("numero de Modelo");
                                int modelos = lectura.nextInt();

                                System.out.println("nombre de su división deportiva");
                                String divdeportiva = lectura.next();
                                System.out.println("nombre de su división de lujo");
                                String divlujo = lectura.next();
                                System.out.println("tipo de carrocería másfabricada");
                                String carrMasfabricada = lectura.next();
                                marka.add(new Marcas(nombre, slogan, año, integro, fundador, ventas, presidente, modelos) + divdeportiva + divlujo + carrMasfabricada);

                            }
                        }
                        if (cont == 2) {
                            System.out.println(""
                                    + "2.generalist\n"
                                    + " a.low cost\n"
                                    + " b.semi-primun\n");
                            String letra = lectura.next();
                            if (letra == "a") {
                                System.out.println("nombre");
                                String nombre = lectura.next();
                                System.out.println("lema o slogan de la compñia");
                                String slogan = lectura.next();
                                System.out.println("Año integrado");
                                System.out.println("año");
                                int años = lectura.nextInt();
                                System.out.println("mes");
                                int mes = lectura.nextInt();
                                System.out.println("dia");
                                int dia = lectura.nextInt();
                                Date año = new Date(años, mes, dia);//date

                                System.out.println("Año integrado");
                                System.out.println("año");
                                int años1 = lectura.nextInt();
                                System.out.println("mes");
                                int mes1 = lectura.nextInt();
                                System.out.println("dia");
                                int dia1 = lectura.nextInt();
                                Date integro = new Date(años1, mes1, dia1);//date

                                System.out.println("Nombre del fundador");
                                String fundador = lectura.next();
                                System.out.println("ventas anuales");
                                int ventas = lectura.nextInt();
                                System.out.println("precidente del compañia");
                                String presidente = lectura.next();
                                System.out.println("numero de Modelo");
                                int modelos = lectura.nextInt();

                                if (letra == "b") {
                                    marca_tipo = "semi-premium";
                                }
                                marka.add(new Marcas(nombre, slogan, año, integro, fundador, ventas, presidente, modelos) + marca_tipo);

                            }
                            if (letra == "b") {
                                System.out.println("nombre");
                                String nombre = lectura.next();
                                System.out.println("lema o slogan de la compñia");
                                String slogan = lectura.next();
                                System.out.println("Año integrado");
                                System.out.println("año");
                                int años = lectura.nextInt();
                                System.out.println("mes");
                                int mes = lectura.nextInt();
                                System.out.println("dia");
                                int dia = lectura.nextInt();
                                Date año = new Date(años, mes, dia);//date

                                System.out.println("Año integrado");
                                System.out.println("año");
                                int años1 = lectura.nextInt();
                                System.out.println("mes");
                                int mes1 = lectura.nextInt();
                                System.out.println("dia");
                                int dia1 = lectura.nextInt();
                                Date integro = new Date(años1, mes1, dia1);//date

                                System.out.println("Nombre del fundador");
                                String fundador = lectura.next();
                                System.out.println("ventas anuales");
                                int ventas = lectura.nextInt();
                                System.out.println("precidente del compañia");
                                String presidente = lectura.next();
                                System.out.println("numero de Modelo");
                                int modelos = lectura.nextInt();
                                ;
                                if (letra == "a") {
                                    marca_tipo = "low cost";
                                }
                                marka.add(new Marcas(nombre, slogan, año, integro, fundador, ventas, presidente, modelos) + marca_tipo);

                            }

                        }

                        break;
                    }
                }
                case 3: {
                    System.out.println("menu \n"
                            + "1. agregar\n"
                            + "2. editar\n"
                            + "3. eliminar\n"
                            + "4. listar");
                    int menulist = lectura.nextInt();
                    System.out.println("nombre nombre de la modelo");
                    String nombreMod = lectura.next();
                    if (menulist == 1) {

                        System.out.println("Año fabricado");
                        System.out.println("año");
                        int año = lectura.nextInt();
                        System.out.println("mes");
                        int mes = lectura.nextInt();
                        System.out.println("dia");
                        int dia = lectura.nextInt();
                        Date gc = new Date(año, mes, dia);// date
                        System.out.println("tipo de cilindraje");
                        int clindrada = lectura.nextInt();
                        System.out.println("Precio de modelo");
                        int precio = lectura.nextInt();
                        System.out.println("tegnologia a usar");
                        String tecnologia = lectura.next();
                        System.out.println("Carroceria");
                        String carroceria = lectura.next();

                        Model.add(new Modelo(nombreMod, gc, tecnologia, clindrada, precio, tecnologia, carroceria));
                    }
                    if (menulist == 2) {
                        System.out.println("selecione lista");
                        int menulis = lectura.nextInt();
                        System.out.println("seleccione variable\n"
                                + "private String nombreMod;\n"
                                + "   1. año\n"
                                + "   2. tipo\n"
                                + "   3. clindrada\n"
                                + "   4. precio\n"
                                + "   5. tecnologia\n"
                                + "   6. carroceria");
                        int con = lectura.nextInt();
                        if (con == 1) {
                            System.out.println("ingrese nuevo año");
                            System.out.println("año");
                            int año = lectura.nextInt();
                            System.out.println("mes");
                            int mes = lectura.nextInt();
                            System.out.println("dia");
                            int dia = lectura.nextInt();
                            Date gc = new Date(año, mes, dia);
                            ((Modelo) Model.get(menulis)).setAño(gc);
                        }
                        if (con == 2) {
                            System.out.println("ingrese nuevo tipo de modelo");
                            ((Modelo) Model.get(menulis)).setTipo(lectura.next());
                        }
                        if (con == 3) {

                            System.out.println("ingrese nuevo cilindraje");
                            ((Modelo) Model.get(menulis)).setClindrada(lectura.nextInt());
                        }
                        if (con == 4) {
                            System.out.println("ingrese nuevo precio");
                            ((Modelo) Model.get(menulis)).setPrecio(lectura.nextInt());
                        }
                        if (con == 5) {
                            System.out.println(" ingrese tipo de tegnologia");
                            ((Modelo) Model.get(menulis)).setTecnologia(lectura.next());
                        }
                        if (con == 6) {
                            System.out.println("ingrese ");
                        }
                    }

                }
                break;
                case 4: {
                    while (opcion != 5) {
                        opcion = Integer.parseInt(
                                JOptionPane.showInputDialog("1-	Crear\n"
                                        + "2-	Listar\n"
                                        + "3-	Modificar\n"
                                        + "4-	Eliminar\n"
                                )
                        );

                        if (opcion == 1) {

                            System.out.println("Nombre de la fabrica: ");
                            String nombre = lectura.next();
                            System.out.println("Ubicacion de la fabrica: ");
                            String ubicacion = lectura.nextLine();
                            System.out.println("Cantidad maxima de modelos que se pueden fabricar: ");
                            int maxModelos = lectura.nextInt();
                            System.out.println("Tipo de carroceria mas fabricada\n" + "1) Hatchback\n" + "2) Sedan\n" + "3) SUV\n");
                            String carroceria = lectura.next();
                            System.out.println("Cantidad de empleados: ");
                            int empleados = lectura.nextInt();
                            int resp = 0;
                            ArrayList<String> marcas = new ArrayList();
                            String marca = "";
                            while (resp != 1) {
                                System.out.println("Nombre de la marca: ");
                                marca = lectura.next();
                                marcas.add(marca);
                                System.out.println("¿Desea ingresar otra marca? (1 = SI // 2 = NO): ");
                                resp = lectura.nextInt();

                            }
                            System.out.println("Cantidad de autos que se fabrican actualmente: ");
                            int autos = lectura.nextInt();
                            fabrica.add(new Fabricas(nombre, ubicacion, maxModelos, carroceria, empleados, marcas, autos));
                        }

                        if (opcion == 2) {
                            String salida = "";
                            for (Object t : fabrica) {
                                if (t instanceof Fabricas) {
                                    salida += fabrica.indexOf(t) + "- " + t + "\n";
                                }
                            }
                            System.out.println(salida);
                        }

                        if (opcion == 3) {
                            System.out.println("Seleccione numero de lista");
                            int op = lectura.nextInt();
                            System.out.println("Seleccione variable a cambiar\n"
                                    + "   0. Nombre\n"
                                    + "   1. Ubicacion\n"
                                    + "   2. Cantidad maxima de modelos que se fabrican\n"
                                    + "   3. Tipo de carroceria mas fabricada\n"
                                    + "   4. Cantidad de empleados\n"
                                    + "   5. Nombre de marcas\n  "
                                    + "   6. Cantidad de autos fabricados hasta el momento\n");
                            int variable = lectura.nextInt();
                            if (fabrica.get(op) instanceof Fabricas) {
                                if (variable == 2) {
                                    System.out.println("Ingrese la cantidad maxima de modelos que se fabrican");
                                    ((Fabricas) fabrica.get(op)).setFabricado(lectura.nextInt());
                                }

                            }
                            if (variable == 0) {
                                System.out.println("Cambio de nombre");
                                ((Fabricas) fabrica.get(op)).setNombre(lectura.next());
                            }
                            if (variable == 1) {
                                System.out.println("Ubicacion");
                                ((Fabricas) fabrica.get(op)).setUbicacion(lectura.next());

                            }
                            if (variable == 3) {
                                System.out.println("Tipo de carroceria mas fabricada");
                                ((Fabricas) fabrica.get(op)).setMasFabricada(lectura.next());
                            }
                            if (variable == 4) {
                                System.out.println("Cantidad de empleados");
                                ((Fabricas) fabrica.get(op)).setEmpleados(lectura.nextInt());
                            }
                            if (variable == 5) {

                            }
                            if (variable == 6) {
                                System.out.println("Cantidad de autos fabricados hasta el momento");
                                ((Fabricas) fabrica.get(op)).setAutFabricado(lectura.nextInt());
                            }

                        }
                        if (opcion == 4) {
                            System.out.println("Ingrese la posicion de la fabrica a elimnar: ");
                            int p = lectura.nextInt();

                            if (fabrica.get(p) instanceof Fabricas) {
                                fabrica.remove(p);
                            } else {
                                System.out.println("La posicion es incorrecta");
                            }

                        }

                    }

                }
                break;
                case 5: {
                    if (marca2 == true) {
                        while (opcion != 5) {
                            opcion = Integer.parseInt(
                                    JOptionPane.showInputDialog("1-	Crear\n"
                                            + "2-	Listar\n"
                                            + "3-	Modificar\n"
                                            + "4-	Eliminar\n"
                                    )
                            );

                            if (opcion == 1) {

                                System.out.println("Nombre de la division tecnologica: ");
                                String nombre = lectura.next();
                                System.out.println("Año de creacion");
                                System.out.println("año");
                                int año = lectura.nextInt();
                                System.out.println("mes");
                                int mes = lectura.nextInt();
                                System.out.println("dia");
                                int dia = lectura.nextInt();
                                Date gc = new Date(dia, mes, año);
                                System.out.println("Campo al que se dedican: ");
                                String campo = lectura.nextLine();
                                int resp = 0;
                                ArrayList<String> Tecnologias = new ArrayList();
                                while (resp != 1) {
                                    System.out.println("Ingrese 1 de las tecnologias desarrolladas: ");
                                    String tecDesarrollada = lectura.nextLine();
                                    Tecnologias.add(tecDesarrollada);
                                    System.out.println("¿Desea ingresar otra tecnologia desarrollada? (1 = SI // 2 = NO): ");
                                    resp = lectura.nextInt();

                                }
                                divTec.add(new DivisionTec(nombre, gc, campo, Tecnologias));
                            }

                            if (opcion == 2) {
                                String salida = "";
                                for (Object t : divTec) {
                                    if (t instanceof DivisionTec) {
                                        salida += divTec.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida);
                            }

                            if (opcion == 3) {
                                System.out.println("Seleccione numero de lista");
                                int op = lectura.nextInt();
                                System.out.println("Seleccione variable a cambiar\n"
                                        + "   0. Nombre;\n"
                                        + "   1. Año de creacion\n"
                                        + "   2. Campo al que se dedican\n"
                                        + "   3. Tecnologia desarrollada\n");
                                int variable = lectura.nextInt();
                                if (divTec.get(op) instanceof DivisionTec) {
                                    if (variable == 2) {
                                        System.out.println("Campo al que se dedican");
                                        ((DivisionTec) divTec.get(op)).setCampo(lectura.next());
                                    }

                                }
                                if (variable == 0) {
                                    System.out.println("Cambio de nombre");
                                    ((DivisionTec) divTec.get(op)).setNombre(lectura.next());
                                }
                                if (variable == 1) {
                                    System.out.println("Cambio de año");
                                    System.out.println("Año");
                                    int años = lectura.nextInt();
                                    System.out.println("Mes");
                                    int mes = lectura.nextInt();
                                    System.out.println("Dia");
                                    int dia = lectura.nextInt();
                                    Date año = new Date(años, mes, dia);
                                    ((DivisionTec) divTec.get(op)).setDate(año);

                                }
                                if (variable == 3) {
                                    System.out.println("cambio empleados");
                                }

                            }
                            if (opcion == 4) {
                                System.out.println("Ingrese la posicion de la division tecnologica a elimnar: ");
                                int p = lectura.nextInt();

                                if (divTec.get(p) instanceof DivisionTec) {
                                    divTec.remove(p);
                                } else {
                                    System.out.println("La posicion es incorrecta");
                                }

                            }
                        }
                    }
                }
                break;
                case 6: {
                    System.out.println("");
                    System.out.println("Corporaciones\n");
                    for (Object i : corp) {
                        System.out.print(i);
                    }
                    System.out.println("");
                    System.out.println("Marcas\n");
                    for (Object j : marka) {
                        System.out.print(j);
                    }
                    System.out.println("");
                    System.out.println("Modelos\n");
                    for (Object f : Model) {
                        System.out.print(f);
                    }
                    System.out.println("");
                    System.out.println("Fabricas\n");
                    for (Object g : fabrica) {
                        System.out.print(g);
                    }
                    System.out.println("");
                    System.out.println("Division Tecnologica\n");
                    for (Object d : divTec) {
                        System.out.print(d);
                    }

                }
            }
        }
    }
    
}
