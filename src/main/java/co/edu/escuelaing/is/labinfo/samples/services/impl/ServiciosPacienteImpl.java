/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.is.labinfo.samples.services.impl;

import com.google.inject.Inject;
import co.edu.escuelaing.is.labinfo.persistence.EPS1DAO;
import co.edu.escuelaing.is.labinfo.persistence.PersistenceException;
import co.edu.escuelaing.is.labinfo.samples.entities.Eps1;
import co.edu.escuelaing.is.labinfo.samples.services.ExcepcionServiciosPacientes;
import co.edu.escuelaing.is.labinfo.samples.services.ServiciosPacientes;
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
public class ServiciosPacienteImpl implements ServiciosPacientes {

    @Inject
    private EPS1DAO eDAO;

    @Transactional
    @Override
    public List<Eps1> obtenerEPSsRegistradas() throws ExcepcionServiciosPacientes {
        try {
            return eDAO.load();
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosPacientes("no se pudo cargar las eps");
        }
    }

    @Override
    public void insertEps(Eps1 e) throws ExcepcionServiciosPacientes{
        try {
            eDAO.save(e);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosPacientes("no se pudo guardar la eps");
        }
    }

    @Override
    public void updateEps(Eps1 e) throws ExcepcionServiciosPacientes {
        try {
            eDAO.update(e);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosPacientes("no se pudo actualizar la eps");
        }
    }

}
