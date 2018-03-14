/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.is.labinfo.samples.services.impl;

import com.google.inject.Inject;
import co.edu.escuelaing.is.labinfo.persistence.ObjetoDAO;
import co.edu.escuelaing.is.labinfo.persistence.PersistenceException;
import co.edu.escuelaing.is.labinfo.samples.entities.Objeto;
import co.edu.escuelaing.is.labinfo.samples.services.ExcepcionServicios;
import co.edu.escuelaing.is.labinfo.samples.services.Servicios;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mybatis.guice.transactional.Transactional;

/**
 *
 * @author blackphantom
 */
public class ServiciosImpl implements Servicios {

    @Inject
    private ObjetoDAO eDAO;

    @Transactional
    @Override
    public List<Objeto> obtenerObjetosRegistradas() throws ExcepcionServicios {
        try {
            return eDAO.load();
        } catch (PersistenceException ex) {
            throw new ExcepcionServicios("no se pudo cargar las Objeto");
        }
    }

    @Override
    public void insertObjeto(Objeto e) throws ExcepcionServicios{
        try {
            eDAO.save(e);
        } catch (PersistenceException ex) {
            throw new ExcepcionServicios("no se pudo guardar la Objeto");
        }
    }

    @Override
    public void updateObjeto(Objeto e) throws ExcepcionServicios {
        try {
            eDAO.update(e);
        } catch (PersistenceException ex) {
            throw new ExcepcionServicios("no se pudo actualizar la Objeto");
        }
    }

}
