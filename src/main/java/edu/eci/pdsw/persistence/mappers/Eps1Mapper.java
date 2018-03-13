/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.persistence.mappers;
import edu.eci.pdsw.samples.entities.Eps1;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 *
 * @author blackphantom
 */
public interface Eps1Mapper {
    public List<Eps1> loadAllEPS();
    public void save(@Param("name") String name, @Param("foundBy") String foundBy, @Param("description") String description,@Param("foundDate") Date foundDate);
    public void update(@Param("e") Eps1 e);
}
