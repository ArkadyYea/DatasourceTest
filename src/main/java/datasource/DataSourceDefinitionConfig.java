package datasource;

import java.util.logging.Logger;

import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

@DataSourceDefinition(
	    name = "java:app/jdbc/MyDS",
	    className = "org.h2.jdbcx.JdbcDataSource",
	    //url = "jdbc:h2:d:/aa/TestDatasource2/Data",
	    url = "jdbc:h2:mem:test",
	    user = "user",
	    password = "pass"
	)

@Singleton
@Startup
public class DataSourceDefinitionConfig {
	

	@Produces
    public Logger produceLogger(InjectionPoint injectionPoint) {  
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());  
    }
}
