package es.iesaguadulce.pruebalista;

import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import es.iesaguadulce.pruebalista.databinding.ViewholderPeliculaBinding;

public class PeliculaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ViewholderPeliculaBinding binding;

    public PeliculaViewHolder (ViewholderPeliculaBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
        this.binding.ivCaratula.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), v.getTag().toString(), Toast.LENGTH_LONG).show();
    }
}
