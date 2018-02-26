package com.moconsulting.framework;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public abstract class AbstractDataProvider implements Serializable
{
  private static final long serialVersionUID = 1L;

  /**
   * Return file name (hibernate config) for this provider.
   * 
   * @return
   */
  protected abstract String getConfigFileName();
  
  public AbstractDataProvider()
  {
    createSessionFactory();
  }
  
  /**
   * Create the SessionFactory for this Data Provider.
   */
  private void createSessionFactory()
  {
    if (DataProviderFactory.getInstance().getSessionFactory(getConfigFileName()) == null)
    {
    /*	
      Configuration configuration = new Configuration();
      configuration.configure(getConfigFileName());
      ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
      SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
      DataProviderFactory.getInstance().putSessionFactory(getConfigFileName(), sessionFactory);      
      */
        Configuration configuration = new Configuration();
        configuration.configure(getConfigFileName());
        //ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

       // ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
       // SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        DataProviderFactory.getInstance().putSessionFactory(getConfigFileName(), sessionFactory); 
    }
  }
  
  /**
   * Return the SessionFactory instance for this provider.
   * 
   * @return
   */
  public SessionFactory getSessionFactory()
  {
    return DataProviderFactory.getInstance().getSessionFactory(getConfigFileName());
  }
  
  /**
   * Open and return a new Session from this provider.
   * 
   * @return
   */
  public Session getSession()
  {
    return getSessionFactory().openSession();
    //return getSessionFactory().getCurrentSession();
  }
}
