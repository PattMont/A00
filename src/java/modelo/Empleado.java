package modelo;
// Generated 25/04/2013 10:50:31 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Empleado generated by hbm2java
 */
@Entity
@Table(name="empleado"
    ,catalog="dbakihabara"
)
public class Empleado  implements java.io.Serializable {


     private int idEmpleado;
     private Persona persona;
     private CatPuestos catPuestos;
     private Departamento departamento;
     private Date fechaContrato;
     private Date fechaFinalizacionContrato;
     private Set<Venta> ventas = new HashSet<Venta>(0);
     private Set<Venta> ventas_1 = new HashSet<Venta>(0);
     private Set<Compra> compras = new HashSet<Compra>(0);
     private Set<Compra> compras_1 = new HashSet<Compra>(0);

    public Empleado() {
    }

	
    public Empleado(int idEmpleado, Persona persona, CatPuestos catPuestos, Departamento departamento, Date fechaContrato) {
        this.idEmpleado = idEmpleado;
        this.persona = persona;
        this.catPuestos = catPuestos;
        this.departamento = departamento;
        this.fechaContrato = fechaContrato;
    }
    public Empleado(int idEmpleado, Persona persona, CatPuestos catPuestos, Departamento departamento, Date fechaContrato, Date fechaFinalizacionContrato, Set<Venta> ventas, Set<Venta> ventas_1, Set<Compra> compras, Set<Compra> compras_1) {
       this.idEmpleado = idEmpleado;
       this.persona = persona;
       this.catPuestos = catPuestos;
       this.departamento = departamento;
       this.fechaContrato = fechaContrato;
       this.fechaFinalizacionContrato = fechaFinalizacionContrato;
       this.ventas = ventas;
       this.ventas_1 = ventas_1;
       this.compras = compras;
       this.compras_1 = compras_1;
    }
   
     @Id 
    
    @Column(name="idEMPLEADO", unique=true, nullable=false)
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idEMPLEADO", unique=true, nullable=false, insertable=false, updatable=false)
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="puesto_R", nullable=false)
    public CatPuestos getCatPuestos() {
        return this.catPuestos;
    }
    
    public void setCatPuestos(CatPuestos catPuestos) {
        this.catPuestos = catPuestos;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="departamento_R", nullable=false)
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="fechaContrato", nullable=false, length=10)
    public Date getFechaContrato() {
        return this.fechaContrato;
    }
    
    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="fechaFinalizacionContrato", length=10)
    public Date getFechaFinalizacionContrato() {
        return this.fechaFinalizacionContrato;
    }
    
    public void setFechaFinalizacionContrato(Date fechaFinalizacionContrato) {
        this.fechaFinalizacionContrato = fechaFinalizacionContrato;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="empleado")
    public Set<Venta> getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set<Venta> ventas) {
        this.ventas = ventas;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="empleado")
    public Set<Venta> getVentas_1() {
        return this.ventas_1;
    }
    
    public void setVentas_1(Set<Venta> ventas_1) {
        this.ventas_1 = ventas_1;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="empleado")
    public Set<Compra> getCompras() {
        return this.compras;
    }
    
    public void setCompras(Set<Compra> compras) {
        this.compras = compras;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="empleado")
    public Set<Compra> getCompras_1() {
        return this.compras_1;
    }
    
    public void setCompras_1(Set<Compra> compras_1) {
        this.compras_1 = compras_1;
    }




}


