/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.is.labinfo.persistence;

import co.edu.escuelaing.is.labinfo.samples.entities.Objeto;
import java.util.List;
/**
 *
 * @author blackphantom
 */
public interface ObjetoDAO {
    public List<Objeto> load() throws PersistenceException;
    public void save(Objeto e) throws PersistenceException;
    public void update(Objeto e) throws PersistenceException;
}
