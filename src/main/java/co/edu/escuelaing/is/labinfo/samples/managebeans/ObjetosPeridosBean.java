/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.is.labinfo.samples.managebeans;

import co.edu.escuelaing.is.labinfo.samples.entities.Objeto;
import co.edu.escuelaing.is.labinfo.samples.services.ExcepcionServicios;
import co.edu.escuelaing.is.labinfo.samples.services.ServiciosHistorialFactory;
import co.edu.escuelaing.is.labinfo.samples.services.Servicios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author BlackPhantom96
 */
@ManagedBean(name = "Historial")
@SessionScoped
public class ObjetosPeridosBean implements Serializable {
    private final String PASSWORD="Monitor20181";
    private Objeto temp;
    private Objeto selectObjeto;
    private String pass;
    public final Servicios servicepacientes = ServiciosHistorialFactory.getInstance().getServicios();

    public ObjetosPeridosBean() {
        temp = new Objeto();
        temp.setFoundDate(new Date());
    }

    public List<Objeto> getObjeto() throws ExcepcionServicios {
        return servicepacientes.obtenerObjetosRegistradas();
    }
    
    public List<Objeto> getObjetoNoEntrega() throws ExcepcionServicios {
        List<Objeto> res = new ArrayList<>();
        for(Objeto e : servicepacientes.obtenerObjetosRegistradas()) if(e.getReciver().equals(""))
            res.add(e);
        return res;
    }

    public Objeto getTemp() {
        return temp;
    }

    public void setTemp(Objeto temp) {
        this.temp = temp;
    }

    public void insert() throws ExcepcionServicios {
        //System.out.println(temp.getName() + " " + temp.getFoundBy()+ " " + temp.getDescription() +" " + temp.getFoundDate());
        if (pass.equals(PASSWORD)) {
            servicepacientes.insertObjeto(temp);
            temp = new Objeto();
            temp.setFoundDate(new Date());
        }
        pass="";
    }

    public void update() throws ExcepcionServicios {
        if (pass.equals(PASSWORD)) {
            servicepacientes.updateObjeto(selectObjeto);
        }
        pass="";
    }

    public Objeto getSelectObjeto() {
        return selectObjeto;
    }

    public void setSelectObjeto(Objeto selectObjeto) {
        this.selectObjeto = selectObjeto;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
