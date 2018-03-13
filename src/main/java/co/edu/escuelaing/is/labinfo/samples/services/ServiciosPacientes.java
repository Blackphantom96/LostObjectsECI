/*
 * Copyright (C) 2015 hcadavid
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


import co.edu.escuelaing.is.labinfo.samples.entities.Eps1;
import java.util.Date;

import java.util.List;

/**
 *
 * @author hcadavid
 */
public interface ServiciosPacientes {
    

    /**
     * Obtiene todas las EPSs registradas en el sistema
     * @return Lista con todas las EPSs registradas.
     * @throws ExcepcionServiciosPacientes si se presenta algún error lógico
     * o de persistencia.
     */
    public abstract List<Eps1> obtenerEPSsRegistradas() throws ExcepcionServiciosPacientes;
    
    public abstract void insertEps(Eps1 e) throws ExcepcionServiciosPacientes;
    
    public abstract void updateEps(Eps1 e) throws ExcepcionServiciosPacientes;
}
