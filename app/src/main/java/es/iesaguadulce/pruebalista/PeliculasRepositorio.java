package es.iesaguadulce.pruebalista;

import java.util.ArrayList;
import java.util.List;

public class PeliculasRepositorio {
    private ArrayList<Pelicula> peliculas;

    public PeliculasRepositorio() {
        peliculas = new ArrayList<>();
        peliculas.add(new Pelicula(0, "Terminator 2", "https://pics.filmaffinity.com/t2_terminator_2_judgment_day-825143697-msmall.jpg"));
        peliculas.add(new Pelicula(1, "Regreso al futuro", "https://pics.filmaffinity.com/back_to_the_future-100822308-msmall.jpg"));
        peliculas.add(new Pelicula(2, "Alien, el octavo pasajero", "https://pics.filmaffinity.com/alien-657278575-msmall.jpg"));
        peliculas.add(new Pelicula(3, "Matrix", "https://pics.filmaffinity.com/the_matrix-155050517-msmall.jpg"));
        peliculas.add(new Pelicula(4, "Interstellar", "https://pics.filmaffinity.com/interstellar-366875261-msmall.jpg"));
        peliculas.add(new Pelicula(5, "Akira", "https://pics.filmaffinity.com/akira-262742931-mmed.jpg"));
        peliculas.add(new Pelicula(6, "Pacific Rim", "https://pics.filmaffinity.com/pacific_rim-524748435-msmall.jpg"));
        peliculas.add(new Pelicula(7, "Avatar", "https://pics.filmaffinity.com/avatar-208925608-msmall.jpg"));
        peliculas.add(new Pelicula(8, "Blade Runner", "https://pics.filmaffinity.com/blade_runner-351607743-msmall.jpg"));
        peliculas.add(new Pelicula(9, "The Thing", "https://pics.filmaffinity.com/the_thing-823700381-msmall.jpg"));
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }
}
