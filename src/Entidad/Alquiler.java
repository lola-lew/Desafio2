package Entidad;

import java.util.Date;

public class Alquiler {
  
  private Date fechaInicio;
  private Date fechaFin;
  private double precio;
  // private String[] listadoAlquiler;
  private Pelicula pelicula;


  public Alquiler() {
  }


  public Alquiler(Date fechaInicio, Date fechaFin, double precio, Pelicula pelicula) {
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.precio = precio;
    this.pelicula = pelicula;
  }


  public Date getFechaInicio() {
    return fechaInicio;
  }


  public void setFechaInicio(Date fechaInicio) {
    this.fechaInicio = fechaInicio;
  }


  public Date getFechaFin() {
    return fechaFin;
  }


  public void setFechaFin(Date fechaFin) {
    this.fechaFin = fechaFin;
  }


  public double getPrecio() {
    return precio;
  }


  public void setPrecio(double precio) {
    this.precio = precio;
  }


  public Pelicula getPelicula() {
    return pelicula;
  }


  public void setPelicula(Pelicula pelicula) {
    this.pelicula = pelicula;
  }

  

  

}
