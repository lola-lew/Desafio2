package Servicio;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Entidad.Alquiler;
import Entidad.Pelicula;

public class AlquilerServicio {
  
  ArrayList<Alquiler>listadoAlquileres;
  Scanner scan = new Scanner(System.in);
  
  public void crearAlquiler() {
    Alquiler alquiler = new Alquiler();
    // SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Fecha de inicio: ");
    System.out.println("Dia: ");
    int dia = scan.nextInt();
    System.out.println("Mes: ");
    int mes = scan.nextInt();
    System.out.println("Año: ");
    int anio = scan.nextInt();
    System.out.println("Fecha de fin: ");
    int diaFin = scan.nextInt();
    System.out.println("Mes: ");
    int mesFin = scan.nextInt();
    System.out.println("Año: ");
    int anioFin = scan.nextInt();

    Date fechaInicio = new Date(anio, mes, dia) ;
    Date fechaFin = new Date(anioFin, mesFin, diaFin);

    alquiler.setFechaInicio(fechaInicio);
    alquiler.setFechaFin(fechaFin);

    listadoAlquileres.add(alquiler);
  }

  // CAMBIAR A LOCALDATE
  // public double calcularPrecio(Alquiler alquiler) {
  //   double precio = 10;

  //   int cantDias = Period.between(alquiler.getFechaInicio(), alquiler.getFechaFin()).getDays();
  // }

    




}
