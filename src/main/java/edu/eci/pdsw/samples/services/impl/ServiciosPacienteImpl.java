/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.pdsw.persistence.EPS1DAO;
import edu.eci.pdsw.persistence.PersistenceException;
import edu.eci.pdsw.samples.entities.Eps1;
import edu.eci.pdsw.samples.services.ExcepcionServiciosPacientes;
import edu.eci.pdsw.samples.services.ServiciosPacientes;
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
