package com.example.formulario;

public class Formulario {
    private String Nombre;
    private String Apellido;
    private int Cedula;
    private int Telefono;
    private String Direccion;

    Formulario(String bmw){
        this.Nombre="";
        this.Apellido= "";
        this.Cedula= 0;
        this.Telefono=Telefono= 0;
        this.Direccion=Direccion= "";
    }
    Formulario(String Nombre, String Apellido, int Cedula, int Telefono, String Direccion){
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.Cedula=Cedula;
        this.Telefono=Telefono;
        this.Direccion=Direccion;
    }
    public String getNombre(){return Nombre;}
    public void setNombre(String Nombre){this.Nombre=Nombre;}

    public String getApellido(){return Apellido;}
    public void setApellido(String Apellido){this.Apellido=Apellido;}

    public int getCedula(){return Cedula;}
    public void setCedula(int Cedula){this.Cedula=Cedula;}

    public int getTelefono(){return Telefono;}
    public void setTelefono(String Telefono){int.Telefono=Telefono;}

    public int getDireccion(){return Direccion;}
    public void setDireccion(String Direccion){this.Direccion=Direccion;}

}