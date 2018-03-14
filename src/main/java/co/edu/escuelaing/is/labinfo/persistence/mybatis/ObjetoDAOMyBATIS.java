/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.is.labinfo.persistence.mybatis;

import com.google.inject.Inject;
import co.edu.escuelaing.is.labinfo.persistence.ObjetoDAO;
import co.edu.escuelaing.is.labinfo.persistence.PersistenceException;
import co.edu.escuelaing.is.labinfo.persistence.mappers.ObjetoMapper;
import co.edu.escuelaing.is.labinfo.samples.entities.Objeto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author blackphantom
 */
public class ObjetoDAOMyBATIS implements ObjetoDAO {

    @Inject
    ObjetoMapper eMapper;

    @Override
    public List<Objeto> load() throws PersistenceException {
        try {
            return eMapper.loadAllObjeto();
        } catch (Exception e) {
            throw new PersistenceException("Error al argas las Objeto %n" + e);
        }
    }
    @Override
    public void save(Objeto e) throws PersistenceException {
        eMapper.save(e.getName(),e.getFoundBy(),e.getDescription(),e.getFoundDate());
    }

    @Override
    public void update(Objeto e) throws PersistenceException {
        eMapper.update(e);
    }


}
