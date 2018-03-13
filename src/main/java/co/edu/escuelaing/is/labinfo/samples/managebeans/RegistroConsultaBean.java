/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.is.labinfo.samples.managebeans;

import co.edu.escuelaing.is.labinfo.samples.entities.Eps1;
import co.edu.escuelaing.is.labinfo.samples.services.ExcepcionServiciosPacientes;
import co.edu.escuelaing.is.labinfo.samples.services.ServiciosHistorialPacientesFactory;
import co.edu.escuelaing.is.labinfo.samples.services.ServiciosPacientes;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 2106913
 */
@ManagedBean(name = "HistorialPacientes")
@SessionScoped
public class RegistroConsultaBean implements Serializable {
    private Eps1 temp;
    private Eps1 selectEps;
    public final ServiciosPacientes servicepacientes= ServiciosHistorialPacientesFactory.getInstance().getServiciosPaciente();
    public RegistroConsultaBean() {
        temp = new Eps1();
        temp.setFoundDate(new Date());
    }
    
    public List<Eps1> getEps() throws ExcepcionServiciosPacientes{
        return servicepacientes.obtenerEPSsRegistradas();
    }

    public Eps1 getTemp() {
        return temp;
    }

    public void setTemp(Eps1 temp) {
        this.temp = temp;
    }
    
    public void insert() throws ExcepcionServiciosPacientes{
        //System.out.println(temp.getName() + " " + temp.getFoundBy()+ " " + temp.getDescription() +" " + temp.getFoundDate());
        servicepacientes.insertEps(temp);
        temp = new Eps1();
        temp.setFoundDate(new Date());
        
    }
    
    public void update() throws ExcepcionServiciosPacientes {
        servicepacientes.updateEps(selectEps);
    }

    public Eps1 getSelectEps() {
        return selectEps;
    }

    public void setSelectEps(Eps1 selectEps) {
        this.selectEps = selectEps;
    }
    
}