package com.example.tiendnet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class agregarProducto extends AppCompatActivity {
    private EditText id,nombre,cantidad,precio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_producto);

        id = findViewById(R.id.txtId);
        nombre=findViewById(R.id.txtNombre);
        cantidad = findViewById(R.id.editCantidad);
        precio = findViewById(R.id.editPrecio);
    }



    public void cancelar(){
        id.setText("");
        nombre.setText("");
        cantidad.setText("");
        precio.setText("");
        id.requestFocus();
    }

    public void onBackPressed(){
        finish();
        Intent i = new Intent(agregarProducto.this,MainActivity.class);
        startActivity(i);

    }
}
