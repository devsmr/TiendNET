package com.example.tiendnet;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Random;

public class agregarProducto extends AppCompatActivity {

    private ArrayList<Integer> fotos;
    private EditText id,nombre,cantidad,precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_producto);

        fotos= new ArrayList<>();
        fotos.add(R.drawable.image);
        fotos.add(R.drawable.image2);
        fotos.add(R.drawable.image3);
        id = findViewById(R.id.txtId);
        nombre=findViewById(R.id.txtNombre);
        cantidad = findViewById(R.id.editCantidad);
        precio = findViewById(R.id.editPrecio);
    }

public void guardar(View v){
 if(validar()){
    String idAgreg;
    String nom;
    String canti;
    String prec;
    int foto;
    idAgreg = Datos.getId();
    nom = nombre.getText().toString();
    canti= cantidad.getText().toString();
    prec = precio.getText().toString();
    foto = this.fotoAleatoria();
    Producto p = new Producto(idAgreg,foto,nom,canti,prec);
    p.guardar();
    //p.eliminar();

    //Snackbar.make(v,"Persona Guardada Exitosamente",Snackbar.LENGTH_SHORT).show();
    Snackbar.make(v,getString(R.string.mensaje),Snackbar.LENGTH_SHORT).show();}
}

    public boolean validar(){

        if(id.getText().toString().isEmpty()){
           id.setError(getResources().getString(R.string.msjID));
            id.requestFocus();
            return false;
        }else if(nombre.getText().toString().isEmpty()){
            nombre.setError(getResources().getString(R.string.msjNombre));
            nombre.requestFocus();
            return false;
        }else if(cantidad.getText().toString().isEmpty()) {
            cantidad.setError(getResources().getString(R.string.msjCantidad));
            cantidad.requestFocus();
            return false;
        }else if(precio.getText().toString().isEmpty()) {
            precio.setError(getResources().getString(R.string.msjPrecio));
            precio.requestFocus();
            return false;
        }
        return  true;
    }


    public void limpiar(View v){
        limpiar();
    }

    public void limpiar(){

        id.setText("");
        nombre.setText("");
        cantidad.setText("");
        precio.setText("");
        nombre.requestFocus();
    }

    //para las fotos
    public int fotoAleatoria(){
        int fotoSeleccionada;
        Random r = new Random();
        fotoSeleccionada = r.nextInt(this.fotos.size());
        return fotos.get(fotoSeleccionada);
    }


    public void onBackPressed(){
        finish();
        Intent i = new Intent(agregarProducto.this,MainActivity.class);
        startActivity(i);

    }
}
