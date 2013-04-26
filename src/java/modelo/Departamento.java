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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Departamento generated by hbm2java
 */
@Entity
@Table(name="departamento"
    ,catalog="dbakihabara"
)
public class Departamento  implements java.io.Serializable {


     private int idDepartamento;
     private Sucursal sucursal;
     private CatDepartamento catDepartamento;
     private Set<Empleado> empleados = new HashSet<Empleado>(0);
     private Set<Empleado> empleados_1 = new HashSet<Empleado>(0);

    public Departamento() {
    }

	
    public Departamento(int idDepartamento, Sucursal sucursal, CatDepartamento catDepartamento) {
        this.idDepartamento = idDepartamento;
        this.sucursal = sucursal;
        this.catDepartamento = catDepartamento;
    }
    public Departamento(int idDepartamento, Sucursal sucursal, CatDepartamento catDepartamento, Set<Empleado> empleados, Set<Empleado> empleados_1) {
       this.idDepartamento = idDepartamento;
       this.sucursal = sucursal;
       this.catDepartamento = catDepartamento;
       this.empleados = empleados;
       this.empleados_1 = empleados_1;
    }
   
     @Id 
    
    @Column(name="idDEPARTAMENTO", unique=true, nullable=false)
    public int getIdDepartamento() {
        return this.idDepartamento;
    }
    
    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idSucursal", nullable=false)
    public Sucursal getSucursal() {
        return this.sucursal;
    }
    
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="departamento_R", nullable=false)
    public CatDepartamento getCatDepartamento() {
        return this.catDepartamento;
    }
    
    public void setCatDepartamento(CatDepartamento catDepartamento) {
        this.catDepartamento = catDepartamento;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="departamento")
    public Set<Empleado> getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="departamento")
    public Set<Empleado> getEmpleados_1() {
        return this.empleados_1;
    }
    
    public void setEmpleados_1(Set<Empleado> empleados_1) {
        this.empleados_1 = empleados_1;
    }




}


