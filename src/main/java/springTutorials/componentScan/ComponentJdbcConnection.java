package springTutorials.componentScan;



import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component  // the proxy bellow is to force to get 2 different instances in the parent class (PersonDataObjectAccess) because the scope of the parent class is singletonScope
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection {

public ComponentJdbcConnection(){
    System.out.println(" ====== component jdbc connection ===> ");
}


}
