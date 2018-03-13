/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.is.labinfo.samples.services;

import com.google.inject.AbstractModule;
import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import co.edu.escuelaing.is.labinfo.persistence.EPS1DAO;
import co.edu.escuelaing.is.labinfo.persistence.mybatis.EPS1DAOMyBATIS;
import co.edu.escuelaing.is.labinfo.samples.services.impl.ServiciosPacienteImpl;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

/**
 *
 * @author hcadavid
 */
public class ServiciosHistorialPacientesFactory {

    private static final ServiciosHistorialPacientesFactory instance = new ServiciosHistorialPacientesFactory();

    private static Injector injector;

    public ServiciosHistorialPacientesFactory() {

        injector = createInjector(new XMLMyBatisModule() {

            @Override
            protected void initialize() {
                install(JdbcHelper.MySQL);
                setClassPathResource("mybatis-config.xml");
                bind(ServiciosPacientes.class).to(ServiciosPacienteImpl.class);
                bind(EPS1DAO.class).to(EPS1DAOMyBATIS.class);
                //bind(PacienteDAO.class).to(PacienteDAOMyBATIS.class);
            }

        }
        );
        

    }

    public ServiciosPacientes getServiciosPaciente() {
        return injector.getInstance(ServiciosPacientes.class);
    }

    public static ServiciosHistorialPacientesFactory getInstance() {
        return instance;
    }

}
