package springTutorials.componentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentPersonDataObjectAccess {

    @Autowired
    ComponentJdbcConnection componentJdbcConnection;

    public ComponentJdbcConnection getJdbcConnection() {
        return this.componentJdbcConnection;
    }

    public void setJdbcConnection(ComponentJdbcConnection passedComponentJdbcConnection) {
        this.componentJdbcConnection = passedComponentJdbcConnection;
    }
}
