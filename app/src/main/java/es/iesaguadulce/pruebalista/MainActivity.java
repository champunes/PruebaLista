package es.iesaguadulce.pruebalista;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import es.iesaguadulce.pruebalista.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private PeliculasRepositorio repositorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        PeliculasAdapter adapter = new PeliculasAdapter();
        binding.rvPeliculas.setHasFixedSize(true);
        binding.rvPeliculas.setAdapter(adapter);
        repositorio = new PeliculasRepositorio();
        adapter.setPeliculas(repositorio.getPeliculas());
    }
}
