/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.is.labinfo.samples.services;

import com.google.inject.AbstractModule;
import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import co.edu.escuelaing.is.labinfo.persistence.ObjetoDAO;
import co.edu.escuelaing.is.labinfo.persistence.mybatis.ObjetoDAOMyBATIS;
import co.edu.escuelaing.is.labinfo.samples.services.impl.ServiciosImpl;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

/**
 *
 * @author BlackPhantom96
 */
public class ServiciosHistorialFactory {

    private static final ServiciosHistorialFactory instance = new ServiciosHistorialFactory();

    private static Injector injector;

    public ServiciosHistorialFactory() {

        injector = createInjector(new XMLMyBatisModule() {

            @Override
            protected void initialize() {
                install(JdbcHelper.MySQL);
                setClassPathResource("mybatis-config.xml");
                bind(Servicios.class).to(ServiciosImpl.class);
                bind(ObjetoDAO.class).to(ObjetoDAOMyBATIS.class);
                //bind(DAO.class).to(DAOMyBATIS.class);
            }

        }
        );
        

    }

    public Servicios getServicios() {
        return injector.getInstance(Servicios.class);
    }

    public static ServiciosHistorialFactory getInstance() {
        return instance;
    }

}
