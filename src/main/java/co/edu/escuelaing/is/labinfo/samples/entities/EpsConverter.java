/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.is.labinfo.samples.entities;

import co.edu.escuelaing.is.labinfo.samples.managebeans.RegistroConsultaBean;
import co.edu.escuelaing.is.labinfo.samples.services.ExcepcionServiciosPacientes;
import co.edu.escuelaing.is.labinfo.samples.services.ServiciosHistorialPacientesFactory;
import co.edu.escuelaing.is.labinfo.samples.services.ServiciosPacientes;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author blackphantom
 */
@FacesConverter("epsConverter")
public class EpsConverter implements Converter {

    private Eps1 eps;

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        try {
            ServiciosPacientes a = ServiciosHistorialPacientesFactory.getInstance().getServiciosPaciente();
            for (Eps1 q : a.obtenerEPSsRegistradas()) {
                if (q.getName().equals(string))
                    return q;
            }
        } catch (ExcepcionServiciosPacientes ex) {
            Logger.getLogger(EpsConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        if (o instanceof Eps1) {
            return ((Eps1) o).getName();
        }
        return null;
    }

}
