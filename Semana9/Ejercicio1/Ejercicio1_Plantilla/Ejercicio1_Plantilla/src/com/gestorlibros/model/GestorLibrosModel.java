package com.gestorlibros.model;

import java.nio.file.Path;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import es.usal.progiii.tools.Rutas;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GestorLibrosModel {

    ArrayList<Libro> libros;

    // Path to export and import data
    Path pathToXML = Rutas.pathToFileOnDesktop("libros.xml");
    Path pathToJSON = Rutas.pathToFileOnDesktop("libros.json");
    Path pathToCSV = Rutas.pathToFileOnDesktop("libros.csv");
    Path pathToBinary = Rutas.pathToFileOnDesktop("libros.bin");

    public GestorLibrosModel() {
        libros = new ArrayList<Libro>();
    }

    // CRUD OPERATIONS
    public void addLibro(Libro l) {
        libros.add(l);
    }

    public void removeLibro(Libro l) {
        libros.remove(l);
    }

    public void updateLibro(Libro l) {
        libros.set(libros.indexOf(l), l);
    }

    public ArrayList<Libro> getLibros() {
        // Devolvemos copia para no modificar el original desde la vista.
        return new ArrayList<Libro>(this.libros);
    }

    // Export and Import data ------------------------------------------
    public int exportBooksToCSV() {

        List<String>lineas=new ArrayList<>();

        for(Libro l: libros){

            lineas.add(l.asDelimitedString(","));

        }

        try{
            
            Files.write(pathToCSV,lineas,StandardCharsets.UTF_8);
            
            return 1;
        }catch(IOException e){

            return -1;

        }

    }

    public int importBooksFromCSV() {

        

        try{

        List<String>lineas=Files.readAllLines(pathToCSV,StandardCharsets.UTF_8);
            
        for(String l: lineas){

            libros.add(Libro.fromDelimitedString(l,","));
            
            }
        
        
            return 1;
        }catch(IOException e){

            return -1;
        }


    }

    public int exportBooksToJSON() {


        Gson gson=new Gson();

        String json =gson.toJson(libros);

        try{

        Files.write(pathToJSON,json.getBytes(StandardCharsets.UTF_8));
        return 1;

        }catch(IOException e){

                return -1;

            }
    }

    public int importBooksFromJSON() {

        Gson gson=new Gson();



        try{

        String l=Files.readString(pathToJSON,StandardCharsets.UTF_8);
        
        Type tipoLista=new TypeToken<List<Libro>>(){}.getType();

        List<Libro>librosJson=gson.fromJson(l,tipoLista);

            for(Libro libro:librosJson){

                if(!this.libros.contains(libro)){

                    this.libros.add(libro);

                }

            }

        return 1;

        }catch(IOException e){

            return -1;

        }


    }

    public int importBooksFromXML() {
        throw new UnsupportedOperationException("Unimplemented method 'importBooksFromCSV'");  
    }

    public int exportBooksToXML() {
        throw new UnsupportedOperationException("Unimplemented method 'importBooksFromCSV'");
    }

    // Serialization and Deserialization ------------------------------------------
    public int saveStateOfTheApp(){
        throw new UnsupportedOperationException("Unimplemented method 'importBooksFromCSV'");
    }

    public int loadStateOfTheApp(){
        throw new UnsupportedOperationException("Unimplemented method 'importBooksFromCSV'");
    }



}
