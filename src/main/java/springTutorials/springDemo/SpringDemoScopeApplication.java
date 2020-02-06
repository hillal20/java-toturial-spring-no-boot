package springTutorials.springDemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springTutorials.springDemo.scopeExample.PersonDataObjectAccess;

@Configuration
@ComponentScan
public class SpringDemoScopeApplication {

     // just a logger to show what is happening in terminal
    private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoScopeApplication.class);

    public static void main (String [] args){

     AnnotationConfigApplicationContext  applicationContext = new AnnotationConfigApplicationContext(SpringDemoScopeApplication.class);


       PersonDataObjectAccess personDataObjectAccess =  applicationContext.getBean(PersonDataObjectAccess.class);
       PersonDataObjectAccess personDataObjectAccess2 =  applicationContext.getBean(PersonDataObjectAccess.class);

//        System.out.println(" personDataObjectAccess ==> " + personDataObjectAccess);
//        System.out.println(" personDataObjectAccess 2 ==> " + personDataObjectAccess2);

         LOGGER.info("PDOA 1 ===>  {}", personDataObjectAccess); // scope singleton
        LOGGER.info("PDOA conn 1  ===> {}", personDataObjectAccess.getJdbcConnection()); // scope prototype



        LOGGER.info("PDOA 2 ===>  {}", personDataObjectAccess2); // scope singleton
        LOGGER.info("PDOA conn 2  ===> {}", personDataObjectAccess2.getJdbcConnection()); // scope prototype









 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println(" ==== scope application is running  ====> ");
    }
}
