package modelo;
// Generated 25/04/2013 10:50:31 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * CatPlataforma generated by hbm2java
 */
@Entity
@Table(name="cat_plataforma"
    ,catalog="dbakihabara"
)
public class CatPlataforma  implements java.io.Serializable {


     private String plataforma;
     private String descripcion;
     private Set<Game> games = new HashSet<Game>(0);

    public CatPlataforma() {
    }

	
    public CatPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public CatPlataforma(String plataforma, String descripcion, Set<Game> games) {
       this.plataforma = plataforma;
       this.descripcion = descripcion;
       this.games = games;
    }
   
     @Id 
    
    @Column(name="plataforma", unique=true, nullable=false, length=45)
    public String getPlataforma() {
        return this.plataforma;
    }
    
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    @Column(name="descripcion", length=45)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinTable(name="gameplataforma", catalog="dbakihabara", joinColumns = { 
        @JoinColumn(name="plataforma", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="idgameR", nullable=false, updatable=false) })
    public Set<Game> getGames() {
        return this.games;
    }
    
    public void setGames(Set<Game> games) {
        this.games = games;
    }




}


