package evaluacion.smoya.evaluacion_android_20;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorContenido extends RecyclerView.Adapter<AdaptadorContenido.ViewHolderContenido> {

    ArrayList<Contenido> listaContenido;

    public AdaptadorContenido(ArrayList<Contenido> listaContenido) {
        this.listaContenido = listaContenido;
    }

    @NonNull
    @Override
    public ViewHolderContenido onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_view, parent, false);
        return new ViewHolderContenido(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderContenido holder, int position) {
        holder.txtTitulo.setText(listaContenido.get(position).getNombre());
        holder.txtDescripcion.setText(listaContenido.get(position).getInfo());
        holder.foto.setImageResource(listaContenido.get(position).getFoto());
        holder.ratingBar.setRating(listaContenido.get(position).getRating());

    }

    @Override
    public int getItemCount() {
        return listaContenido.size();
    }

    public class ViewHolderContenido extends RecyclerView.ViewHolder {
        // Variables
        TextView txtTitulo, txtDescripcion;
        ImageView foto;
        RatingBar ratingBar;

        public ViewHolderContenido(@NonNull View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.imgItem);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtDescripcion = itemView.findViewById(R.id.txtComentario);
            ratingBar = itemView.findViewById(R.id.ratingBar);
        }
    }
}
