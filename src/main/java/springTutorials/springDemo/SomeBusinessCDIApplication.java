package springTutorials.springDemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springTutorials.springDemo.sortingExample.cdiExample.SomeCDIBusiness;
import springTutorials.springDemo.sortingExample.cdiExample.SomeCDIPersonDataObjectAccess;

@Configuration
@ComponentScan
public class SomeBusinessCDIApplication {

    private static  Logger LOGGER  = LoggerFactory.getLogger(SomeBusinessCDIApplication.class);

    public  static  void main (String[] args ){


        ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SomeBusinessCDIApplication .class);
        SomeCDIBusiness someCDIBusiness= applicationContext.getBean(SomeCDIBusiness.class);



        LOGGER.info(" ==== someCDIBusiness ====>  {} ===== ", someCDIBusiness);







        System.out.println("========= Business CDI Application is running =============");
    }
}
