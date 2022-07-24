package br.com.rfpereira.linguagens.api;

import java.rmi.server.UID;

import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection = "principaisLinguagens")
public class Linguagem {

    private String id;
    private String name;
    private String urlImage;
    private int ranking;

    public Linguagem() {
        
    }

    public Linguagem(String name, String urlImage, int ranking) {
        this.name = name;
        this.urlImage = urlImage;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public int getRanking() {
        return ranking;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
