package springTutorials.springDemo;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import springTutorials.componentScan.ComponentPersonDataObjectAccess;



@Configuration
@ComponentScan(value = "springTutorials.componentScan")  // we need to look for another package since here we are inside  springTutorials.springDemo
public class SpringDemoComponentScanApplication {

        private static Logger LOGGER =  LoggerFactory.getLogger(SpringDemoComponentScanApplication.class);


    public static void main (String[] args){
        //////////////////////////////////////////////////// app context //////////////////////////////////////////////////////////////////
                 ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SpringDemoComponentScanApplication.class) ;
       ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        ComponentPersonDataObjectAccess componentPersonDataObjectAccess = applicationContext.getBean(ComponentPersonDataObjectAccess.class);
        LOGGER.info("  ====> componentPersonDataObjectAccess ===> {}:  ",componentPersonDataObjectAccess );



        /////////////////////////////////////////////////////  app is running ////////////////////////////////////////////////////////////////
        System.out.println(" ========  Component Scan Applications is running =========  ");
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

}
