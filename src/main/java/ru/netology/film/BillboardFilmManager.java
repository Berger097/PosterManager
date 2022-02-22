package ru.netology.film;

public class BillboardFilmManager {
    private BillboardFilm[] films = new BillboardFilm[0];
    private int limit = 10;


    public BillboardFilmManager(int limit) {
        this.limit = limit;
    }

    public BillboardFilmManager() {
    }


    public BillboardFilm[] getAddFilm(){
       return this.films;
    }

    public void addSave (BillboardFilm film) {
        int length = films.length + 1;
        BillboardFilm[] tmp = new BillboardFilm[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public BillboardFilm[] findAll() {
        return films;
    }

    public BillboardFilm[] findLast() {
        int resultLength = films.length;
        if (resultLength > limit) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }


        BillboardFilm[] result = new BillboardFilm[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }



}
