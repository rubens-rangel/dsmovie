package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_score")
public class Score implements Serializable {
    public static final long serialVersionUID = 1L;

    @EmbeddedId
    private Scorepk id = new Scorepk();

    private Double value;

    public Score() {
    }

    public  void setMovie(Movie movie){
        id.setMovie(movie);
    }

    public void seUser(User user){
        id.setUser(user);
    }

    public Scorepk getId() {
        return id;
    }

    public void setId(Scorepk id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
