package com.example.tiendnet;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorProducto extends RecyclerView.Adapter<AdaptadorProducto.ProductoViewHolder> {

    private ArrayList<Producto> productos;

    public AdaptadorProducto(ArrayList<Producto> productos){
        this.productos=productos;

    }

    @Override
    public ProductoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //vas a usar el layout que ya se creó.
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_producto,viewGroup,false);
        return new ProductoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder productoViewHolder, int i) {
        Producto p = productos.get(i);
        productoViewHolder.foto.setImageResource(p.getFoto());
        productoViewHolder.idF.setText(p.getId());
        productoViewHolder.nombre.setText(p.getNombre());
        productoViewHolder.cantidad.setText(p.getCantidad());
        productoViewHolder.precio.setText(p.getPrecio());
    }

    @Override
    //cuantos elementos va a listar en el recycler view
    public int getItemCount() {
        return productos.size();
    }

    public static class ProductoViewHolder extends RecyclerView.ViewHolder{
        private ImageView foto;
        private TextView idF;
        private TextView nombre;
        private TextView cantidad;
        private TextView precio;
        private View v;

        public ProductoViewHolder(View itemView){
            super(itemView);
            v = itemView;
            foto = v.findViewById(R.id.foto);
            idF = v.findViewById(R.id.lblId);
            nombre = v.findViewById(R.id.lblNombre);
            cantidad = v.findViewById(R.id.lblCantidad);
            precio= v.findViewById(R.id.lblPrecio);

        }


    }
}
