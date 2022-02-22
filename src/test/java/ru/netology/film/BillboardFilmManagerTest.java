package ru.netology.film;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillboardFilmManagerTest {

    @Test
    void addSaveFilm() {
        BillboardFilm film1 = new BillboardFilm(011, " БЛАДШОТ ", "- боевик", 1);
        BillboardFilm film2 = new BillboardFilm(022, " ВПЕРЕД ", "- мультфильм", 2);
        BillboardFilm film3 = new BillboardFilm(033, " ОТЕЛЬ БЕЛГРАД ", "- комедия", 3);
        BillboardFilm film4 = new BillboardFilm(044, " ДЖЕНТЕЛЬМЕНЫ ", "- боевик", 4);
        BillboardFilm film5 = new BillboardFilm(055, " ЧЕЛОВЕК-НЕВИДИМКА ", "- ужасы", 5);
        BillboardFilm film6 = new BillboardFilm(066, " ТРОЛИЮ МИРОВОЙ ТУР ", "- мультфильм", 6);
        BillboardFilm film7 = new BillboardFilm(077, " НОМЕР ОДИН ", "- комедия", 7);
        BillboardFilm film8 = new BillboardFilm(88, " И ГАСНЕТ СВЕТ ", "- ужасы", 8);
        BillboardFilm film9 = new BillboardFilm(99, " ЗЕРКАЛА ", "- ужасы", 9);
        BillboardFilm film10 = new BillboardFilm(1010, " ПОБЕГ ", "- триллер", 10);
        BillboardFilm film11 = new BillboardFilm(1111, " ПОЧЕМУ ОН? ", "- комедия", 11);
        BillboardFilm film12 = new BillboardFilm(1212, " КРЕСТНЫЙ ОТЕЦ ГАРЛЕМА ", "- триллер", 12);

        BillboardFilmManager manager = new BillboardFilmManager();

        manager.addSave(film1);
        manager.addSave(film2);
        manager.addSave(film3);
        manager.addSave(film4);
        manager.addSave(film5);
        manager.addSave(film6);
        manager.addSave(film7);
        manager.addSave(film8);
        manager.addSave(film9);
        manager.addSave(film10);
        manager.addSave(film11);
        manager.addSave(film12);


        BillboardFilm[] expected = {film1, film2, film3, film4, film5, film6,
                film7, film8, film9, film10, film11, film12};

        BillboardFilm[] actual = manager.getAddFilm();
        assertArrayEquals(expected, actual);

    }

    @Test
    void findAll() {

        BillboardFilm film1 = new BillboardFilm(011, " БЛАДШОТ ", "- боевик", 1);
        BillboardFilm film2 = new BillboardFilm(022, " ВПЕРЕД ", "- мультфильм", 2);
        BillboardFilm film3 = new BillboardFilm(033, " ОТЕЛЬ БЕЛГРАД ", "- комедия", 3);
        BillboardFilm film4 = new BillboardFilm(044, " ДЖЕНТЕЛЬМЕНЫ ", "- боевик", 4);
        BillboardFilm film5 = new BillboardFilm(055, " ЧЕЛОВЕК-НЕВИДИМКА ", "- ужасы", 5);
        BillboardFilm film6 = new BillboardFilm(066, " ТРОЛИЮ МИРОВОЙ ТУР ", "- мультфильм", 6);
        BillboardFilm film7 = new BillboardFilm(077, " НОМЕР ОДИН ", "- комедия", 7);
        BillboardFilm film8 = new BillboardFilm(88, " И ГАСНЕТ СВЕТ ", "- ужасы", 8);
        BillboardFilm film9 = new BillboardFilm(99, " ЗЕРКАЛА ", "- ужасы", 9);
        BillboardFilm film10 = new BillboardFilm(1010, " ПОБЕГ ", "- триллер", 10);
        BillboardFilm film11 = new BillboardFilm(1111, " ПОЧЕМУ ОН? ", "- комедия", 11);
        BillboardFilm film12 = new BillboardFilm(1212, " КРЕСТНЫЙ ОТЕЦ ГАРЛЕМА ", "- триллер", 12);

        BillboardFilmManager manager = new BillboardFilmManager();

        manager.addSave(film1);
        manager.addSave(film2);
        manager.addSave(film3);
        manager.addSave(film4);
        manager.addSave(film5);
        manager.addSave(film6);
        manager.addSave(film7);
        manager.addSave(film8);
        manager.addSave(film9);
        manager.addSave(film10);
        manager.addSave(film11);
        manager.addSave(film12);

        BillboardFilm[] expected = {film1, film2, film3, film4, film5, film6,
                film7, film8, film9, film10, film11, film12};


        BillboardFilm[] actual = manager.findAll();
        assertArrayEquals(expected, actual);


    }

    @Test
    void getAllFilmLimitDefault() {

        BillboardFilm film1 = new BillboardFilm(011, " БЛАДШОТ ", "- боевик", 1);
        BillboardFilm film2 = new BillboardFilm(022, " ВПЕРЕД ", "- мультфильм", 2);
        BillboardFilm film3 = new BillboardFilm(033, " ОТЕЛЬ БЕЛГРАД ", "- комедия", 3);
        BillboardFilm film4 = new BillboardFilm(044, " ДЖЕНТЕЛЬМЕНЫ ", "- боевик", 4);
        BillboardFilm film5 = new BillboardFilm(055, " ЧЕЛОВЕК-НЕВИДИМКА ", "- ужасы", 5);
        BillboardFilm film6 = new BillboardFilm(066, " ТРОЛИЮ МИРОВОЙ ТУР ", "- мультфильм", 6);
        BillboardFilm film7 = new BillboardFilm(077, " НОМЕР ОДИН ", "- комедия", 7);
        BillboardFilm film8 = new BillboardFilm(88, " И ГАСНЕТ СВЕТ ", "- ужасы", 8);
        BillboardFilm film9 = new BillboardFilm(99, " ЗЕРКАЛА ", "- ужасы", 9);
        BillboardFilm film10 = new BillboardFilm(1010, " ПОБЕГ ", "- триллер", 10);
        BillboardFilm film11 = new BillboardFilm(1111, " ПОЧЕМУ ОН? ", "- комедия", 11);
        BillboardFilm film12 = new BillboardFilm(1212, " КРЕСТНЫЙ ОТЕЦ ГАРЛЕМА ", "- триллер", 12);

        BillboardFilmManager manager = new BillboardFilmManager();

        manager.addSave(film1);
        manager.addSave(film2);
        manager.addSave(film3);
        manager.addSave(film4);
        manager.addSave(film5);
        manager.addSave(film6);
        manager.addSave(film7);
        manager.addSave(film8);
        manager.addSave(film9);
        manager.addSave(film10);
        manager.addSave(film11);
        manager.addSave(film12);

        BillboardFilm[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3};


        BillboardFilm[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllFilmLimit2() {

        BillboardFilm film1 = new BillboardFilm(011, " БЛАДШОТ ", "- боевик", 1);
        BillboardFilm film2 = new BillboardFilm(022, " ВПЕРЕД ", "- мультфильм", 2);
        BillboardFilm film3 = new BillboardFilm(033, " ОТЕЛЬ БЕЛГРАД ", "- комедия", 3);
        BillboardFilm film4 = new BillboardFilm(044, " ДЖЕНТЕЛЬМЕНЫ ", "- боевик", 4);
        BillboardFilm film5 = new BillboardFilm(055, " ЧЕЛОВЕК-НЕВИДИМКА ", "- ужасы", 5);
        BillboardFilm film6 = new BillboardFilm(066, " ТРОЛИЮ МИРОВОЙ ТУР ", "- мультфильм", 6);
        BillboardFilm film7 = new BillboardFilm(077, " НОМЕР ОДИН ", "- комедия", 7);
        BillboardFilm film8 = new BillboardFilm(88, " И ГАСНЕТ СВЕТ ", "- ужасы", 8);
        BillboardFilm film9 = new BillboardFilm(99, " ЗЕРКАЛА ", "- ужасы", 9);
        BillboardFilm film10 = new BillboardFilm(1010, " ПОБЕГ ", "- триллер", 10);
        BillboardFilm film11 = new BillboardFilm(1111, " ПОЧЕМУ ОН? ", "- комедия", 11);
        BillboardFilm film12 = new BillboardFilm(1212, " КРЕСТНЫЙ ОТЕЦ ГАРЛЕМА ", "- триллер", 12);

        BillboardFilmManager manager = new BillboardFilmManager(11);

        manager.addSave(film1);
        manager.addSave(film2);
        manager.addSave(film3);
        manager.addSave(film4);
        manager.addSave(film5);
        manager.addSave(film6);
        manager.addSave(film7);
        manager.addSave(film8);
        manager.addSave(film9);
        manager.addSave(film10);
        manager.addSave(film11);
        manager.addSave(film12);

        BillboardFilm[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        BillboardFilm[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllFilmLimit3() {

        BillboardFilm film1 = new BillboardFilm(011, " БЛАДШОТ ", "- боевик", 1);
        BillboardFilm film2 = new BillboardFilm(022, " ВПЕРЕД ", "- мультфильм", 2);
        BillboardFilm film3 = new BillboardFilm(033, " ОТЕЛЬ БЕЛГРАД ", "- комедия", 3);
        BillboardFilm film4 = new BillboardFilm(044, " ДЖЕНТЕЛЬМЕНЫ ", "- боевик", 4);
        BillboardFilm film5 = new BillboardFilm(055, " ЧЕЛОВЕК-НЕВИДИМКА ", "- ужасы", 5);
        BillboardFilm film6 = new BillboardFilm(066, " ТРОЛИЮ МИРОВОЙ ТУР ", "- мультфильм", 6);
        BillboardFilm film7 = new BillboardFilm(077, " НОМЕР ОДИН ", "- комедия", 7);
        BillboardFilm film8 = new BillboardFilm(88, " И ГАСНЕТ СВЕТ ", "- ужасы", 8);
        BillboardFilm film9 = new BillboardFilm(99, " ЗЕРКАЛА ", "- ужасы", 9);
        BillboardFilm film10 = new BillboardFilm(1010, " ПОБЕГ ", "- триллер", 10);
        BillboardFilm film11 = new BillboardFilm(1111, " ПОЧЕМУ ОН? ", "- комедия", 11);
        BillboardFilm film12 = new BillboardFilm(1212, " КРЕСТНЫЙ ОТЕЦ ГАРЛЕМА ", "- триллер", 12);

        BillboardFilmManager manager = new BillboardFilmManager(12);

        manager.addSave(film1);
        manager.addSave(film2);
        manager.addSave(film3);
        manager.addSave(film4);
        manager.addSave(film5);
        manager.addSave(film6);
        manager.addSave(film7);
        manager.addSave(film8);
        manager.addSave(film9);
        manager.addSave(film10);
        manager.addSave(film11);
        manager.addSave(film12);

        BillboardFilm[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        BillboardFilm[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllFilmLimit4() {

        BillboardFilm film1 = new BillboardFilm(011, " БЛАДШОТ ", "- боевик", 1);
        BillboardFilm film2 = new BillboardFilm(022, " ВПЕРЕД ", "- мультфильм", 2);
        BillboardFilm film3 = new BillboardFilm(033, " ОТЕЛЬ БЕЛГРАД ", "- комедия", 3);
        BillboardFilm film4 = new BillboardFilm(044, " ДЖЕНТЕЛЬМЕНЫ ", "- боевик", 4);
        BillboardFilm film5 = new BillboardFilm(055, " ЧЕЛОВЕК-НЕВИДИМКА ", "- ужасы", 5);
        BillboardFilm film6 = new BillboardFilm(066, " ТРОЛИЮ МИРОВОЙ ТУР ", "- мультфильм", 6);
        BillboardFilm film7 = new BillboardFilm(077, " НОМЕР ОДИН ", "- комедия", 7);
        BillboardFilm film8 = new BillboardFilm(88, " И ГАСНЕТ СВЕТ ", "- ужасы", 8);
        BillboardFilm film9 = new BillboardFilm(99, " ЗЕРКАЛА ", "- ужасы", 9);
        BillboardFilm film10 = new BillboardFilm(1010, " ПОБЕГ ", "- триллер", 10);
        BillboardFilm film11 = new BillboardFilm(1111, " ПОЧЕМУ ОН? ", "- комедия", 11);
        BillboardFilm film12 = new BillboardFilm(1212, " КРЕСТНЫЙ ОТЕЦ ГАРЛЕМА ", "- триллер", 12);

        BillboardFilmManager manager = new BillboardFilmManager(13);

        manager.addSave(film1);
        manager.addSave(film2);
        manager.addSave(film3);
        manager.addSave(film4);
        manager.addSave(film5);
        manager.addSave(film6);
        manager.addSave(film7);
        manager.addSave(film8);
        manager.addSave(film9);
        manager.addSave(film10);
        manager.addSave(film11);
        manager.addSave(film12);

        BillboardFilm[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        BillboardFilm[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllFilmLimit5() {

        BillboardFilm film1 = new BillboardFilm(011, " БЛАДШОТ ", "- боевик", 1);
        BillboardFilm film2 = new BillboardFilm(022, " ВПЕРЕД ", "- мультфильм", 2);
        BillboardFilm film3 = new BillboardFilm(033, " ОТЕЛЬ БЕЛГРАД ", "- комедия", 3);
        BillboardFilm film4 = new BillboardFilm(044, " ДЖЕНТЕЛЬМЕНЫ ", "- боевик", 4);
        BillboardFilm film5 = new BillboardFilm(055, " ЧЕЛОВЕК-НЕВИДИМКА ", "- ужасы", 5);
        BillboardFilm film6 = new BillboardFilm(066, " ТРОЛИЮ МИРОВОЙ ТУР ", "- мультфильм", 6);
        BillboardFilm film7 = new BillboardFilm(077, " НОМЕР ОДИН ", "- комедия", 7);
        BillboardFilm film8 = new BillboardFilm(88, " И ГАСНЕТ СВЕТ ", "- ужасы", 8);
        BillboardFilm film9 = new BillboardFilm(99, " ЗЕРКАЛА ", "- ужасы", 9);
        BillboardFilm film10 = new BillboardFilm(1010, " ПОБЕГ ", "- триллер", 10);
        BillboardFilm film11 = new BillboardFilm(1111, " ПОЧЕМУ ОН? ", "- комедия", 11);
        BillboardFilm film12 = new BillboardFilm(1212, " КРЕСТНЫЙ ОТЕЦ ГАРЛЕМА ", "- триллер", 12);

        BillboardFilmManager manager = new BillboardFilmManager(1);

        manager.addSave(film1);
        manager.addSave(film2);
        manager.addSave(film3);
        manager.addSave(film4);
        manager.addSave(film5);
        manager.addSave(film6);
        manager.addSave(film7);
        manager.addSave(film8);
        manager.addSave(film9);
        manager.addSave(film10);
        manager.addSave(film11);
        manager.addSave(film12);

        BillboardFilm[] expected = {film12};
        BillboardFilm[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllFilmLimit6() {

        BillboardFilm film1 = new BillboardFilm(011, " БЛАДШОТ ", "- боевик", 1);
        BillboardFilm film2 = new BillboardFilm(022, " ВПЕРЕД ", "- мультфильм", 2);
        BillboardFilm film3 = new BillboardFilm(033, " ОТЕЛЬ БЕЛГРАД ", "- комедия", 3);
        BillboardFilm film4 = new BillboardFilm(044, " ДЖЕНТЕЛЬМЕНЫ ", "- боевик", 4);
        BillboardFilm film5 = new BillboardFilm(055, " ЧЕЛОВЕК-НЕВИДИМКА ", "- ужасы", 5);
        BillboardFilm film6 = new BillboardFilm(066, " ТРОЛИЮ МИРОВОЙ ТУР ", "- мультфильм", 6);
        BillboardFilm film7 = new BillboardFilm(077, " НОМЕР ОДИН ", "- комедия", 7);
        BillboardFilm film8 = new BillboardFilm(88, " И ГАСНЕТ СВЕТ ", "- ужасы", 8);
        BillboardFilm film9 = new BillboardFilm(99, " ЗЕРКАЛА ", "- ужасы", 9);
        BillboardFilm film10 = new BillboardFilm(1010, " ПОБЕГ ", "- триллер", 10);
        BillboardFilm film11 = new BillboardFilm(1111, " ПОЧЕМУ ОН? ", "- комедия", 11);
        BillboardFilm film12 = new BillboardFilm(1212, " КРЕСТНЫЙ ОТЕЦ ГАРЛЕМА ", "- триллер", 12);

        BillboardFilmManager manager = new BillboardFilmManager(2);

        manager.addSave(film1);
        manager.addSave(film2);
        manager.addSave(film3);
        manager.addSave(film4);
        manager.addSave(film5);
        manager.addSave(film6);
        manager.addSave(film7);
        manager.addSave(film8);
        manager.addSave(film9);
        manager.addSave(film10);
        manager.addSave(film11);
        manager.addSave(film12);

        BillboardFilm[] expected = {film12, film11};
        BillboardFilm[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllFilmLimit7() {

        BillboardFilm film1 = new BillboardFilm(011, " БЛАДШОТ ", "- боевик", 1);
        BillboardFilm film2 = new BillboardFilm(022, " ВПЕРЕД ", "- мультфильм", 2);
        BillboardFilm film3 = new BillboardFilm(033, " ОТЕЛЬ БЕЛГРАД ", "- комедия", 3);
        BillboardFilm film4 = new BillboardFilm(044, " ДЖЕНТЕЛЬМЕНЫ ", "- боевик", 4);
        BillboardFilm film5 = new BillboardFilm(055, " ЧЕЛОВЕК-НЕВИДИМКА ", "- ужасы", 5);
        BillboardFilm film6 = new BillboardFilm(066, " ТРОЛИЮ МИРОВОЙ ТУР ", "- мультфильм", 6);
        BillboardFilm film7 = new BillboardFilm(077, " НОМЕР ОДИН ", "- комедия", 7);
        BillboardFilm film8 = new BillboardFilm(88, " И ГАСНЕТ СВЕТ ", "- ужасы", 8);
        BillboardFilm film9 = new BillboardFilm(99, " ЗЕРКАЛА ", "- ужасы", 9);
        BillboardFilm film10 = new BillboardFilm(1010, " ПОБЕГ ", "- триллер", 10);
        BillboardFilm film11 = new BillboardFilm(1111, " ПОЧЕМУ ОН? ", "- комедия", 11);
        BillboardFilm film12 = new BillboardFilm(1212, " КРЕСТНЫЙ ОТЕЦ ГАРЛЕМА ", "- триллер", 12);

        BillboardFilmManager manager = new BillboardFilmManager(0);

        manager.addSave(film1);
        manager.addSave(film2);
        manager.addSave(film3);
        manager.addSave(film4);
        manager.addSave(film5);
        manager.addSave(film6);
        manager.addSave(film7);
        manager.addSave(film8);
        manager.addSave(film9);
        manager.addSave(film10);
        manager.addSave(film11);
        manager.addSave(film12);

        BillboardFilm[] expected = {};
        BillboardFilm[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

}