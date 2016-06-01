package br.com.nadefacil.service;

import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.builtin.PooledDataSourceProvider;
import org.mybatis.guice.datasource.dbcp.BasicDataSourceProvider;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

import br.com.nadefacil.mapper.HintMapper;

public class GuiceContextListener implements ServletContextListener {

	Injector injector;
	AppService service;
	
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.removeAttribute(Injector.class.getName());
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		this.injector = Guice.createInjector(new MyBatisModule() {
			@Override
			protected void initialize() {
				install(JdbcHelper.SQL_Server_MS_Driver);

				environmentId("development");
				bindDataSourceProviderType(BasicDataSourceProvider.class);
				bindTransactionFactoryType(JdbcTransactionFactory.class);
				Names.bindProperties(binder(), createServerProperties());

				// add singleton service class
				bind(AppService.class).to(AppServiceImpl.class).in(Singleton.class);

				// add MyBatis Service class
				addMapperClass(HintMapper.class);
			}
		});
		
		
		
		
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.setAttribute("injector", injector);
		
		
		service = this.injector.getInstance(AppService.class);
		this.service.doSimpleThing();
	}

	protected static Properties createServerProperties() {
		Properties myBatisProperties = new Properties();

//		myBatisProperties.setProperty("JDBC.url", "jdbc:sqlserver://localhost\\sqlexpress;");
		myBatisProperties.setProperty("JDBC.username", "nadefacil");
//		myBatisProperties.setProperty("JDBC.driver", "com.microsoft.jdbc.SQLServerDriver");
		myBatisProperties.setProperty("JDBC.password", "admin");
		myBatisProperties.setProperty("JDBC.schema", "NadeFacil");
		myBatisProperties.setProperty("JDBC.autoCommit", "false");
		return myBatisProperties;
	}

}