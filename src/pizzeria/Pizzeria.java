/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int basespizza = 0;
        int champiñones = 0;
        int queso = 0;
        int jamon = 0;
        int tomate = 0;
        int precio = 0;
        int cantidad;
        int iteracion = 0;
        int jamonpedido = 0;
        int quesopedido = 0;
        int tomatepedido = 0;
        int pizzapedido = 0;
        int champiñonpedido = 0;
        int pizzasvendidas = 0;
        int ventastotales = 0;
        int pizzatipo1 = 0;
        int pizzatipo2 = 0;
        int pizzatipo3 = 0;
        int montopizza1 = 0;
        int montopizza2 = 0;
        int montopizza3 = 0;
        int costo = 0;
        int costofinal = 0;
        int iteracion2 = 0;
        int opcion;
        int tomategramos = 0;
        int quesogramos = 0;
        int champiñonesgramos = 0;
        int jamongramos = 0;

        while (iteracion2 != 4) {
            do {
                System.out.println("Seleccione lo que desea hacer\n"
                        + "1- Reabastecer stock de ingredientes\n"
                        + "2- Realizar venta\n"
                        + "3- Ver resumen de ventas\n"
                        + "4- Terminar programa\n");
                opcion = intro.nextInt();
                if (opcion < 1 || opcion > 4) {
                    System.out.println("Opción ingresada no valida, porfavor ingresa una opción valida");
                }
            } while (opcion < 1 || opcion > 4);
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Ingrese cantidad de bases de pizzas compradas");
                        basespizza = intro.nextInt();
                        if (basespizza >= 10 && basespizza <= 50) {
                            costo = 500 * basespizza;
                            costofinal = costo + costofinal;
                        }
                        if (basespizza < 10 || basespizza > 50) {
                            System.out.println("Demaciados ingredientes porfavor ingrese una cantidad entre 10 y 50.");
                        }
                    } while (basespizza < 10 || basespizza > 50);
                    do {
                        System.out.println("Ingrese cantidad de Kg. de queso comprado");
                        queso = intro.nextInt();
                        if (queso >= 10 && queso <= 20);
                        {
                            quesogramos = queso * 1000;
                            costo = 5000 * queso;
                            costofinal = costo + costofinal;
                        }
                        if (queso < 10 || queso > 20) {
                            System.out.println("Cantidad demaciado alta, porfavor ingrese una cantidad entre 10 y 20 Kg.");
                        }
                    } while (queso < 10 || queso > 20);
                    do {
                        System.out.println("Ingrese cantidad de Kg. jamón comprado-");
                        jamon = intro.nextInt();
                        if (jamon >= 5 && jamon <= 10) {
                            jamongramos = jamon * 1000;
                            costo = 2500 * jamon;
                            costofinal = costo + costofinal;
                        }
                        if (jamon < 5 || jamon > 10) {
                            System.out.println("Cantidad de jamon demaciado alta o demaciado baja, por favor ingrese una cantidad entre 5 y 10 Kg.");
                        }
                    } while (jamon < 5 || jamon > 10);
                    do {
                        System.out.println("Ingrese cantidad de Kg. tomate comprado");
                        tomate = intro.nextInt();
                        if (tomate >= 10 && tomate <= 15) {
                            tomategramos = tomate * 1000;
                            costo = tomate * 900;
                            costofinal = costo + costofinal;
                        }
                        if (tomate < 10 || tomate > 15) {
                            System.out.println("Cantidad de tomates demaciado alta o demaciado baja, por favor ingrese una cantidad entre 10 y 15 kg.");
                        }
                    } while (tomate < 10 || tomate > 15);
                    do {
                        System.out.println("Ingrese cantidad de Kg- champiñones comprados");
                        champiñones = intro.nextInt();
                        if (champiñones >= 5 && champiñones <= 10) {
                            champiñonesgramos = champiñones * 1000;
                            costo = champiñones * 3500;
                            costofinal = costo + costofinal;
                        }
                        if (champiñones < 5 || champiñones > 10) {
                            System.out.println("cantidad de champiñones demaciado alta o demaciado baja, porfavor ingrese una cantidad entre 5 y 10 Kg.");
                        }
                    } while (champiñones < 5 || champiñones > 10);
                    break;
                case 2:
                    while (iteracion != 4) {

                        try {
                            System.out.println("Seleccione el tipo de pizza \n"
                                    + "1- Pizza 1: $2500\n"
                                    + "2- Pizza 2: $3000\n"
                                    + "3- Pizza 3: $3500\n"
                                    + "4- Terminar pedido");
                            int tipo = intro.nextInt();

                            switch (tipo) {
                                case 1:
                                    System.out.println("Escriba la cantidad de pizza de este tipo que desea");
                                    cantidad = intro.nextInt();

                                    pizzapedido = cantidad;
                                    quesopedido = 100 * cantidad;
                                    tomatepedido = 200 * cantidad;
                                    jamonpedido = 100 * cantidad;

                                    if (jamongramos > jamonpedido && quesogramos > quesopedido && tomategramos > tomatepedido && basespizza > pizzapedido) {
                                        precio = precio + (2500 * cantidad);
                                        basespizza = basespizza - (cantidad);
                                        quesogramos = quesogramos - (100 * cantidad);
                                        tomategramos = tomategramos - (200 * cantidad);
                                        jamongramos = jamongramos - (100 * cantidad);
                                        pizzasvendidas = pizzasvendidas + cantidad;
                                        pizzatipo1 = pizzatipo1 + cantidad;
                                        ventastotales = precio + ventastotales;
                                        montopizza1 = montopizza1 + precio;

                                    } else {
                                        System.out.println("No hay suficientes ingredientes");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Escriba la cantidad de pizza de este tipo que quiere");
                                    cantidad = intro.nextInt();

                                    pizzapedido = cantidad;
                                    quesopedido = 200 * cantidad;
                                    tomatepedido = 200 * cantidad;
                                    champiñonpedido = 100 * cantidad;

                                    if (champiñonesgramos > champiñonpedido && quesogramos > quesopedido && tomategramos > tomatepedido && basespizza > pizzapedido) {
                                        precio = precio + (2500 * cantidad);
                                        basespizza = basespizza - (cantidad);
                                        quesogramos = quesogramos - (200 * cantidad);
                                        tomategramos = tomategramos - (200 * cantidad);
                                        champiñonesgramos = champiñonesgramos - (100 * cantidad);
                                        pizzasvendidas = pizzasvendidas + cantidad;
                                        pizzatipo2 = pizzatipo2 + cantidad;
                                        ventastotales = precio + ventastotales;
                                        montopizza2 = montopizza2 + precio;
                                    } else {
                                        System.out.println("No hay suficientes ingredientes");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Escriba la cantidad de pizza de este tipo que quiere");
                                    cantidad = intro.nextInt();

                                    pizzapedido = cantidad;
                                    quesopedido = 200 * cantidad;
                                    jamonpedido = 200 * cantidad;
                                    champiñonpedido = 200 * cantidad;

                                    if (jamongramos > jamonpedido && quesogramos > quesopedido && champiñonesgramos > champiñonpedido && basespizza > pizzapedido) {

                                        precio = precio + (2500 * cantidad);
                                        basespizza = basespizza - (cantidad);
                                        quesogramos = quesogramos - (200 * cantidad);
                                        champiñonesgramos = champiñonesgramos - (200 * cantidad);
                                        jamongramos = jamongramos - (200 * cantidad);
                                        pizzasvendidas = pizzasvendidas + cantidad;
                                        pizzatipo1 = pizzatipo1 + cantidad;
                                        ventastotales = precio + ventastotales;
                                        montopizza3 = montopizza3 + precio;
                                    } else {
                                        System.out.println("ºNo hay suficientes ingredientes");
                                    }
                                    break;
                                case 4:
                                    iteracion = 4;
                                    break;

                            }
                        } catch (NumberFormatException e) {
                            System.out.println("A ocurrido un error, por favor empieze de nuevo");
                        }
                        System.out.println("El monto a pagar por su compra hasta el momento es de " + precio);
                    }
                    break;
                case 3:
                    System.out.println("El monto total de dinero vendido hoy es de " + ventastotales + " y la cantidad de pizzas vendidas es de " + pizzasvendidas + "\n"
                            + "pizza 1 =  " + pizzatipo1 + " y el monto total vendido en este tipo de pizza fue " + montopizza1 + "\n"
                            + "pizza 2 =  " + pizzatipo2 + " y el monto total vendido en este tipo de pizza fue " + montopizza2 + "\n"
                            + "pizza 3 =  " + pizzatipo3 + " y el monto total vendido en este tipo de pizza fue " + montopizza3);
                    champiñones=champiñonesgramos/1000;
                    jamon=jamongramos/1000;
                    tomate=tomategramos/1000;
                    queso=quesogramos/1000;
                    
                    System.out.println("El stock de productos actual es de \n"
                            + "Champiñones =  " + champiñones + " Kgs. \n"
                            + "Queso =  " + queso + " Kgs. \n"
                            + "Jamon =  " + jamon + " Kgs. \n"
                            + "Bases de pizza =  " + basespizza + "\n"
                            + "Tomate =  " + tomate+" Kgs.");

                    int utilidades = ventastotales - costofinal;

                    System.out.println("Las utilidade del dia de hoy han sido " + utilidades);
                    break;
                case 4:
                    iteracion2 = 4;
                    break;
            }

        }
    }
}
