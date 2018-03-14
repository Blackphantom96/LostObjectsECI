/*
 * Copyright (C) 2015 BlackPhantom96
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package co.edu.escuelaing.is.labinfo.samples.services;


import co.edu.escuelaing.is.labinfo.samples.entities.Objeto;
import java.util.Date;

import java.util.List;

/**
 *
 * @author BlackPhantom96
 */
public interface Servicios {
    

    /**
     * Obtiene todas las Objetos registradas en el sistema
     * @return Lista con todas las Objetos registradas.
     * @throws ExcepcionServicios si se presenta algún error lógico
     * o de persistencia.
     */
    public abstract List<Objeto> obtenerObjetosRegistradas() throws ExcepcionServicios;
    
    public abstract void insertObjeto(Objeto e) throws ExcepcionServicios;
    
    public abstract void updateObjeto(Objeto e) throws ExcepcionServicios;
}
