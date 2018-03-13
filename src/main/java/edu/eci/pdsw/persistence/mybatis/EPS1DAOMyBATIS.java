/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.persistence.mybatis;

import com.google.inject.Inject;
import edu.eci.pdsw.persistence.EPS1DAO;
import edu.eci.pdsw.persistence.PersistenceException;
import edu.eci.pdsw.persistence.mappers.Eps1Mapper;
import edu.eci.pdsw.samples.entities.Eps1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author blackphantom
 */
public class EPS1DAOMyBATIS implements EPS1DAO {

    @Inject
    Eps1Mapper eMapper;

    @Override
    public List<Eps1> load() throws PersistenceException {
        try {
            return eMapper.loadAllEPS();
        } catch (Exception e) {
            throw new PersistenceException("Error al argas las eps %n" + e);
        }
    }
    @Override
    public void save(Eps1 e) throws PersistenceException {
        eMapper.save(e.getName(),e.getFoundBy(),e.getDescription(),e.getFoundDate());
    }

    @Override
    public void update(Eps1 e) throws PersistenceException {
        eMapper.update(e);
    }

//    public Eps1 loadById(int nit) throws PersistenceException {
//        try {
//            return eMapper.loadEPSByNit(nit);
//        } catch (Exception e) {
//            throw new PersistenceException("Error al cargar la eps" + nit + "%n" + e);
//        }
//    }
//
//    public void save(Eps1 e) throws PersistenceException {
//        try {
//            eMapper.registreEps(e);
//        } catch (Exception ex) {
//            throw new PersistenceException("Error al guardar la eps" + e.getNombre()+ "%n" + ex);
//        }
//    }
//
//    public void update(Eps1 e) throws PersistenceException {
//        try {
//            eMapper.udpateEps(e);
//        } catch (Exception ex) {
//            throw new PersistenceException("Error al actualizar la eps "+ e.getNombre()+ "%n"  + ex);
//        }
//    }

    

}
