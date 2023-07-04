package Servicio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import Entidad.Pelicula;

public class PeliculaServicio {
  // Pelicula[] listadoPelicula;

  private ArrayList<Pelicula>listadoPeliculas;

  public PeliculaServicio() {
    listadoPeliculas = new ArrayList<>();
  }

  Scanner scan = new Scanner(System.in);
  
  public void crearPeli() {
    Pelicula pelicula = new Pelicula();
    System.out.println("Ingresar titulo: ");
    pelicula.setTitulo(scan.nextLine());
    System.out.println("Genero: ");
    pelicula.setGenero(scan.nextLine());
    System.out.println("Año: ");
    pelicula.setAnio(scan.nextInt());
    System.out.println("Duracion: ");
    pelicula.setDuracion(scan.nextInt());

    listadoPeliculas.add(pelicula);
  }

  public Pelicula damePeli() {
    System.out.println("Seleccionar numero de pelicula: ");
    mostrarListado();
    int pos = Integer.parseInt(scan.next());
    return listadoPeliculas.get(pos-1);
  }
  
  public void mostrarListado() {
    for (int i = 0; i < listadoPeliculas.size(); i++) {
      System.out.println("Pelicula " + (i+1));
      System.out.println(listadoPeliculas.get(i));
    }
  }

  public void buscarPeli() {
    System.out.println("Buscar por \n1.Titulo. \2.Genero.");
  
  }

  public void buscarTitulo() {
    System.out.println("Ingresar titulo: ");
    String tituloIngresado = scan.next();

    for (Pelicula peli : listadoPeliculas) {
      if(peli.getTitulo().contains(tituloIngresado)) {
        System.out.println(peli);
        break;
      }
    }
  }

}
