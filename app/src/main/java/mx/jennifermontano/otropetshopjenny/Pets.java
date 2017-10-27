package mx.jennifermontano.otropetshopjenny;

/**
 * Created by Jennifer on 22/10/2017.
 */

public class Pets {
    private String nombre,likes;
    private int foto;
    public Pets(int foto, String nombre, String likes){
        this.foto       =   foto;
        this.nombre     =   nombre;
        this.likes      =   likes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
