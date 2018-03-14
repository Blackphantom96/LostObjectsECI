/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.is.labinfo.persistence.mappers;
import co.edu.escuelaing.is.labinfo.samples.entities.Objeto;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 *
 * @author blackphantom
 */
public interface ObjetoMapper {
    public List<Objeto> loadAllObjeto();
    public void save(@Param("name") String name, @Param("foundBy") String foundBy, @Param("description") String description,@Param("foundDate") Date foundDate);
    public void update(@Param("e") Objeto e);
}
