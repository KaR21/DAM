
import java.io.File;
import java.io.FileWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
public class idatziFileWriter {
      public static void main(String []args)
    {
        //Un texto cualquiera guardado en una variable
        String saludo="Hola mundo";

        try
        {
        //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
        File archivo=new File("texto.txt");

        //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
        FileWriter escribir=new FileWriter(archivo,true);

        //Escribimos en el archivo con el metodo write
        escribir.write(saludo);

        //Cerramos la conexion
        escribir.close();
        }

        //Si existe un problema al escribir cae aqui
        catch(Exception e)
        {
        System.out.println("Error al escribir");
        }
    }
}
