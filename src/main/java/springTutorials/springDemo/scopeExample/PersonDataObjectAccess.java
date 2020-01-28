package springTutorials.springDemo.scopeExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDataObjectAccess {

    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return this.jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection passedJdbcConnection) {
        this.jdbcConnection = passedJdbcConnection;
    }
}
