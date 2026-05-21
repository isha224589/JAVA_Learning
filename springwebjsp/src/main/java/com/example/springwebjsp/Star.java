package com.example.springwebjsp;


public class Star {
    private int aid;
    private String anime;

    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Override
    public String toString(){
        return "Star [aid=" + aid + ", anime=" + anime + "]";
    }
}
