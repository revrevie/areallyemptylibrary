package com.hall;

public class Comic {

    private String comicTitle;
    private String comicAuthors;
    private String comicArtists;
    private int comicEdition;


    public Comic(String comicTitle, String comicAuthors, String comicArtists, int comicEdition) {
        this.comicTitle = comicTitle;
        this.comicAuthors = comicAuthors;
        this.comicArtists = comicArtists;
        this.comicEdition = comicEdition;
    }

    public Comic() {

    }

    public String getComicTitle() {
        return comicTitle;
    }

    public void setComicTitle(String comicTitle) {
        this.comicTitle = comicTitle;
    }

    public String getComicAuthors() {
        return comicAuthors;
    }

    public void setComicAuthors(String comicAuthors) {
        this.comicAuthors = comicAuthors;
    }

    public String getComicArtists() {
        return comicArtists;
    }

    public void setComicArtists(String comicArtists) {
        this.comicArtists = comicArtists;
    }

    public int getComicEdition() {
        return comicEdition;
    }

    public void setComicEdition(int comicEdition) {
        this.comicEdition = comicEdition;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "comicTitle='" + comicTitle + '\'' +
                ", comicAuthors='" + comicAuthors + '\'' +
                ", comicArtists='" + comicArtists + '\'' +
                ", comicEdition=" + comicEdition +
                '}';
    }
}
