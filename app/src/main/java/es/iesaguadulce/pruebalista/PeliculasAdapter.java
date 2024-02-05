package es.iesaguadulce.pruebalista;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import es.iesaguadulce.pruebalista.databinding.ViewholderPeliculaBinding;
import com.squareup.picasso.Picasso;
import java.util.List;

public class PeliculasAdapter extends RecyclerView.Adapter<PeliculaViewHolder> {

    private List<Pelicula> peliculas;

    @NonNull
    @Override
    public PeliculaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new PeliculaViewHolder(
                ViewholderPeliculaBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PeliculaViewHolder holder, int i) {
        Picasso.get().load(peliculas.get(i).getCaratula()).into(holder.binding.ivCaratula);
        holder.binding.ivCaratula.setTag(peliculas.get(i).getNombre());
    }

    @Override
    public int getItemCount() {
        return peliculas != null ? peliculas.size() : 0;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
        notifyDataSetChanged();
    }
}
