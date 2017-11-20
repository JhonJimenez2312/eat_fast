package com.example.admin.eat_fast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * Created by Admin on 19/11/2017.
 */

public class Datos {

    private static DatabaseReference databaseReference = FirebaseDatabase.
            getInstance().getReference();
    private static String bd ="eatfast";
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void guardarPersona(Usuario p){

        databaseReference.child(bd).child(p.getId()).setValue(p);
    }

    public static ArrayList<Usuario> obtenerPersonas(){
        return usuarios;
    }

    public static void setPersonas(ArrayList<Usuario> per){
        usuarios=per;
    }

    public static String getId(){
        return databaseReference.push().getKey();
    }

    public static void actualizar(Usuario p ){
        databaseReference.child(bd).child(p.getId()).setValue(p);
    }
    public static void eliminar(Usuario p){
        databaseReference.child(bd).child(p.getId()).removeValue();
    }
}
