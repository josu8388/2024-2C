package Libreria;

import java.util.Scanner;
import java.time.LocalDate;


public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int aniodepublicacion;
    private int numerosdecopias;

    //constructor, inicializo los atomicos para la clase libro
    public Libro(){
        this.titulo= null;
        this.autor = null;
        this.editorial = null;
        this.aniodepublicacion = 0;
        this.numerosdecopias = 0;
    }
    //son datos que debo conocer del objeto, no puedo no saberlos para el tda
    public Libro(String titulo, String autor, String editorial, int aniodepublicacion, int numerosdecopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.aniodepublicacion = aniodepublicacion;
        this.numerosdecopias = numerosdecopias;
    }
    //si ncesito saber del titulo, eso el get, posterior si necesito modificarlo uso el set
    public String getTitulo() {
        return titulo;
    }

    //asigno otra variable a titulo si requiero
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAniodepublicacion() {
        return aniodepublicacion;
    }

    public void setAniodepublicacion(int aniodepublicacion) {
        this.aniodepublicacion = aniodepublicacion;
    }

    public int getNumerosdecopias() {
        return numerosdecopias;
    }
    public void setNumerosdecopias(int numerosdecopias) {
        this.numerosdecopias = numerosdecopias;
    }


}