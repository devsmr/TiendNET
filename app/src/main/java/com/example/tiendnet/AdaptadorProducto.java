package com.example.personasmeterial;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tiendnet.Producto;
import com.example.tiendnet.R;

import java.util.ArrayList;

public class AdaptadorProducto extends RecyclerView.Adapter<AdaptadorProducto.ProductoViewHolder> {

    private ArrayList<Producto> productos;

    public AdaptadorPersona(ArrayList<Producto> productos){
        this.productos=productos;
    }

    @Override
    public ProductoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //vas a usar el layout que ya se creó.
        //falta crear el item_prodcuto del loyout
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.support_simple_spinner_dropdown_item  ,viewGroup,false);
        return new ProductoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder productoViewHolder, int i) {
        Producto p = productos.get(i);
        productoViewHolder.foto.setImageResource(p.getFoto());
        productoViewHolder.nombre.setText(p.getNombre());
        productoViewHolder.apellido.setText(p.getApellido());
    }

    @Override
    //cuantos elementos va a listar en el recycler view
    public int getItemCount() {
        return personas.size();
    }

    public static class ProductoViewHolder extends RecyclerView.ViewHolder{
        private ImageView foto;
        private TextView nombre;
        private TextView cantidad;
        private TextView precio;
        private View v;

        public ProductoViewHolder(View itemView){
            super(itemView);
            v = itemView;
            foto = v.findViewById(R.id.foto);
            nombre = v.findViewById(R.id.txtNombre);
            cantidad= v.findViewById(R.id.editCantidad);
            precio = v.findViewById(R.id.editPrecio);
        }


    }
}
