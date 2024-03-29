package modelo;
// Generated 25/04/2013 10:50:31 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DetalleCompraId generated by hbm2java
 */
@Embeddable
public class DetalleCompraId  implements java.io.Serializable {


     private int idCompraR;
     private int idGameR;

    public DetalleCompraId() {
    }

    public DetalleCompraId(int idCompraR, int idGameR) {
       this.idCompraR = idCompraR;
       this.idGameR = idGameR;
    }
   

    @Column(name="idCompraR", nullable=false)
    public int getIdCompraR() {
        return this.idCompraR;
    }
    
    public void setIdCompraR(int idCompraR) {
        this.idCompraR = idCompraR;
    }

    @Column(name="idGameR", nullable=false)
    public int getIdGameR() {
        return this.idGameR;
    }
    
    public void setIdGameR(int idGameR) {
        this.idGameR = idGameR;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DetalleCompraId) ) return false;
		 DetalleCompraId castOther = ( DetalleCompraId ) other; 
         
		 return (this.getIdCompraR()==castOther.getIdCompraR())
 && (this.getIdGameR()==castOther.getIdGameR());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdCompraR();
         result = 37 * result + this.getIdGameR();
         return result;
   }   


}


