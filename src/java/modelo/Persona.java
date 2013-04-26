package modelo;
// Generated 25/04/2013 10:50:31 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Persona generated by hbm2java
 */
@Entity
@Table(name="persona"
    ,catalog="dbakihabara"
    , uniqueConstraints = @UniqueConstraint(columnNames="idDireccionR") 
)
public class Persona  implements java.io.Serializable {


     private Integer idPersona;
     private Direccion direccion;
     private String nombreC;
     private String apellidoP;
     private String apellidoM;
     private Date fechaNac;
     private Date fechaAlta;
     private String sexo;
     private String correo;
     private String telefono;
     private String tipoTelefono;
     private Set<Rolesusarios> rolesusarioses = new HashSet<Rolesusarios>(0);
     private Set<Rolesusarios> rolesusarioses_1 = new HashSet<Rolesusarios>(0);
     private Set<Empleado> empleados = new HashSet<Empleado>(0);
     private Set<Empleado> empleados_1 = new HashSet<Empleado>(0);
     private Set<Cliente> clientes = new HashSet<Cliente>(0);
     private Set<Cliente> clientes_1 = new HashSet<Cliente>(0);

    public Persona() {
    }

	
    public Persona(Direccion direccion, String nombreC, String apellidoP, Date fechaNac, Date fechaAlta, String sexo, String correo) {
        this.direccion = direccion;
        this.nombreC = nombreC;
        this.apellidoP = apellidoP;
        this.fechaNac = fechaNac;
        this.fechaAlta = fechaAlta;
        this.sexo = sexo;
        this.correo = correo;
    }
    public Persona(Direccion direccion, String nombreC, String apellidoP, String apellidoM, Date fechaNac, Date fechaAlta, String sexo, String correo, String telefono, String tipoTelefono, Set<Rolesusarios> rolesusarioses, Set<Rolesusarios> rolesusarioses_1, Set<Empleado> empleados, Set<Empleado> empleados_1, Set<Cliente> clientes, Set<Cliente> clientes_1) {
       this.direccion = direccion;
       this.nombreC = nombreC;
       this.apellidoP = apellidoP;
       this.apellidoM = apellidoM;
       this.fechaNac = fechaNac;
       this.fechaAlta = fechaAlta;
       this.sexo = sexo;
       this.correo = correo;
       this.telefono = telefono;
       this.tipoTelefono = tipoTelefono;
       this.rolesusarioses = rolesusarioses;
       this.rolesusarioses_1 = rolesusarioses_1;
       this.empleados = empleados;
       this.empleados_1 = empleados_1;
       this.clientes = clientes;
       this.clientes_1 = clientes_1;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idPERSONA", unique=true, nullable=false)
    public Integer getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idDireccionR", unique=true, nullable=false)
    public Direccion getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Column(name="nombreC", nullable=false, length=100)
    public String getNombreC() {
        return this.nombreC;
    }
    
    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }
    
    @Column(name="apellidoP", nullable=false, length=45)
    public String getApellidoP() {
        return this.apellidoP;
    }
    
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    
    @Column(name="apellidoM", length=45)
    public String getApellidoM() {
        return this.apellidoM;
    }
    
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="fechaNac", nullable=false, length=10)
    public Date getFechaNac() {
        return this.fechaNac;
    }
    
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fechaAlta", nullable=false, length=19)
    public Date getFechaAlta() {
        return this.fechaAlta;
    }
    
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    @Column(name="sexo", nullable=false, length=1)
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Column(name="correo", nullable=false, length=45)
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Column(name="telefono", length=18)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Column(name="tipoTelefono", length=10)
    public String getTipoTelefono() {
        return this.tipoTelefono;
    }
    
    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Rolesusarios> getRolesusarioses() {
        return this.rolesusarioses;
    }
    
    public void setRolesusarioses(Set<Rolesusarios> rolesusarioses) {
        this.rolesusarioses = rolesusarioses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Rolesusarios> getRolesusarioses_1() {
        return this.rolesusarioses_1;
    }
    
    public void setRolesusarioses_1(Set<Rolesusarios> rolesusarioses_1) {
        this.rolesusarioses_1 = rolesusarioses_1;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Empleado> getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Empleado> getEmpleados_1() {
        return this.empleados_1;
    }
    
    public void setEmpleados_1(Set<Empleado> empleados_1) {
        this.empleados_1 = empleados_1;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Cliente> getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Cliente> getClientes_1() {
        return this.clientes_1;
    }
    
    public void setClientes_1(Set<Cliente> clientes_1) {
        this.clientes_1 = clientes_1;
    }




}

