
import org.example.FilmManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.example.Film;


public class FilmManagerTest {
    Film film1 = new Film(1, "Бладшот");
    Film film2 = new Film(2, "Вперёд");
    Film film3 = new Film(3, "Отель Белград");
    Film film4 = new Film(4, "Джентльмены");
    Film film5 = new Film(5, "Человек-невидимка");
    Film film6 = new Film(6, "Тролли. Мировой тур");
    Film film7 = new Film(7, "Номер один");

    @Test
    public void test_addFilm() {
        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        Film[] expected = {film1};
        Film[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test_getFilms() {
        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        Film[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Film[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test_getAddedFilms() {
        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        Film[] expected = {film4, film3, film2, film1};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_constructor_AboveMax() {
        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        Film[] expected = {film6, film5, film4, film3, film2};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void test_constructor_InAllowedRange() {
        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        Film[] expected = {film1, film2, film3, film4};
        Film[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}

