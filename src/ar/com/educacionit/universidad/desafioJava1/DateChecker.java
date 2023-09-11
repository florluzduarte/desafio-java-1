package ar.com.educacionit.universidad.desafioJava1;

import java.util.Scanner;

public class DateChecker {
    public static void main(String[] args) {
        // Ingreso de datos por consola
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el día: (formato dd)");
        int day = teclado.nextInt();
        System.out.println("Ingrese el mes: (formato mm)");
        int month = teclado.nextInt();
        System.out.println("Ingrese el año: (formato yyyy)");
        int year = teclado.nextInt();

        teclado.close();

        // Variables para Validaciones
        boolean monthCheckCondition = month >= 1 && month <= 12;
        boolean yearCheckCondition = year >= 1900 && year <= 2099;
        int firstLeapYear = 1904;
        boolean isLeapYear = (year - firstLeapYear) % 4 == 0;
        boolean isMonthLength31 = ((month <= 7) && (month % 2 == 1) || (month >= 8) && month % 2 == 0);
        boolean isFebruaryLeap = month == 2 && isLeapYear;

        // Revisión de la fecha ingresada
        if (!monthCheckCondition) {
            System.out.println("La fecha es incorrecta. Ingrese un mes del 01 al 12");
        } else if (!yearCheckCondition) {
            System.out.println("La fecha es incorrecta. Ingrese un año entre 1900 y 2099");
        } else if (!isMonthLength31 && day == 31) {
            System.out.println("La fecha es incorrecta. El mes " + month + " no tiene 31 días");
        } else if (!isFebruaryLeap && day == 29) {
            System.out.println("La fecha es incorrecta. No es año bisiesto, por lo tanto, Febrero tiene sólo 28 días");
        } else {
            String date = day + "/" + month + "/" + year;
            System.out.println("La fecha: " + date + " es correcta");
        }

    }
}
