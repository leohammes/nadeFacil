package br.com.nadefacil.listener;

import java.util.Properties;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.dbcp.BasicDataSourceProvider;
import org.mybatis.guice.datasource.helper.JdbcHelper;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import br.com.nadefacil.mapper.HintMapper;
import br.com.nadefacil.mapper.ImageMapper;
import br.com.nadefacil.service.HintService;
import br.com.nadefacil.service.ImageService;
import br.com.nadefacil.service.impl.HintServiceImpl;
import br.com.nadefacil.service.impl.ImageServiceImpl;

public class GuiceContextListener implements ServletContextListener {

	Injector injector;
	
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.removeAttribute(Injector.class.getName());
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		this.injector = Guice.createInjector(new MyBatisModule() {
			@Override
			protected void initialize() {
				install(JdbcHelper.MySQL);

				environmentId("development");
				bindDataSourceProviderType(BasicDataSourceProvider.class);
				bindTransactionFactoryType(JdbcTransactionFactory.class);
				Names.bindProperties(binder(), createServerProperties());

				// add singleton service class
				bind(HintService.class).to(HintServiceImpl.class).in(Singleton.class);
				bind(ImageService.class).to(ImageServiceImpl.class).in(Singleton.class);

				// add MyBatis Service class
				addMapperClass(HintMapper.class);
				addMapperClass(ImageMapper.class);
			}
		});
		
		
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.setAttribute("injector", injector);
	}

	protected static Properties createServerProperties() {
		Properties myBatisProperties = new Properties();
		myBatisProperties.setProperty("JDBC.username", "root");
		myBatisProperties.setProperty("JDBC.password", "admin");
		myBatisProperties.setProperty("JDBC.schema", "nadefacil");
		myBatisProperties.setProperty("JDBC.autoCommit", "false");
		return myBatisProperties;
	}

}