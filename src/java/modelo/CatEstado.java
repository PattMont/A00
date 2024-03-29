package modelo;
// Generated 25/04/2013 10:50:31 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CatEstado generated by hbm2java
 */
@Entity
@Table(name="cat_estado"
    ,catalog="dbakihabara"
)
public class CatEstado  implements java.io.Serializable {


     private String idEstado;
     private String descripcion;
     private Set<Game> games = new HashSet<Game>(0);
     private Set<Game> games_1 = new HashSet<Game>(0);

    public CatEstado() {
    }

	
    public CatEstado(String idEstado) {
        this.idEstado = idEstado;
    }
    public CatEstado(String idEstado, String descripcion, Set<Game> games, Set<Game> games_1) {
       this.idEstado = idEstado;
       this.descripcion = descripcion;
       this.games = games;
       this.games_1 = games_1;
    }
   
     @Id 
    
    @Column(name="idEstado", unique=true, nullable=false, length=45)
    public String getIdEstado() {
        return this.idEstado;
    }
    
    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }
    
    @Column(name="descripcion")
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="catEstado")
    public Set<Game> getGames() {
        return this.games;
    }
    
    public void setGames(Set<Game> games) {
        this.games = games;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="catEstado")
    public Set<Game> getGames_1() {
        return this.games_1;
    }
    
    public void setGames_1(Set<Game> games_1) {
        this.games_1 = games_1;
    }




}


