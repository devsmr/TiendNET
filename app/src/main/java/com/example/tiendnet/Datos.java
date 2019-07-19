package com.example.tiendnet;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Datos {
 private static String db = "Productos";

    //conectar con la base de datos remota con la base de datos producto que está en el firebase
    private static DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();



    public static ArrayList<Producto> productos = new ArrayList<>();

    //crear el agregar

    public static void agregar(Producto p){

        databaseReference.child(db).child(p.getId()).setValue(p);
    }

    //editar
    public static void editar (Producto p){

        databaseReference.child(db).child(p.getId()).setValue(p);
    }

    //eliminar
    public static void eliminar (Producto p){

        databaseReference.child(db).child(p.getId()).removeValue();
    }

    //obtener la llave del servidor
    public static String getId(){
        return databaseReference.push().getKey();
    }

    //set
    public static void setPersonas(ArrayList<Producto> personas){

        Datos.productos= productos;
    }

    //get
    public static ArrayList<Producto> obtener(){

        return Datos.productos;
    }


}