package org.example;

public class FilmManager {
    int resultLength;
    Film[] films = new Film[resultLength];

    public FilmManager() {
        this.resultLength = 5;
    }

    public FilmManager(int resultLength) {
        this.resultLength = resultLength;

    }

    public void addFilm(Film film) {
        Film[] temporary = new Film[films.length + 1];
        for (int index = 0; index < films.length; index++) {
            temporary[index] = films[index];
        }
        temporary[temporary.length - 1] = film;
        films = temporary;
    }

    public Film[] getAllFilms() {
        return films;
    }

    public Film[] getAddedFilms() {
        Film[] addition = new Film[Math.min(resultLength, films.length)];
        for (int index = 0; index < resultLength && index + 1 <= films.length; index++) {
            addition[index] = films[films.length - 1 - index];
        }
        return addition;
    }
}


