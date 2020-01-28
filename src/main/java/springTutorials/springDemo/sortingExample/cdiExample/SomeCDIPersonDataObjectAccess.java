package springTutorials.springDemo.sortingExample.cdiExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springTutorials.springDemo.scopeExample.JdbcConnection;

import javax.inject.Inject;
import javax.inject.Named;

@Named // instead of @component
public class SomeCDIPersonDataObjectAccess {

    @Inject // instead of @Autowired
    SomeCDIBusiness someCDIBusiness;

    public SomeCDIBusiness getJdbcConnection() {
        return this.someCDIBusiness;
    }

    public void setJdbcConnection(SomeCDIBusiness passedSomeCDIBusiness) {
        this.someCDIBusiness = passedSomeCDIBusiness;
    }
}
