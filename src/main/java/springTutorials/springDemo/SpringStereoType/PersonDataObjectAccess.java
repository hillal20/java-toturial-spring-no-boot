package springTutorials.springDemo.SpringStereoType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springTutorials.springDemo.scopeExample.JdbcConnection;

@Component
public class PersonDataObjectAccess {

    @Autowired
    springTutorials.springDemo.scopeExample.JdbcConnection jdbcConnection;

    public springTutorials.springDemo.scopeExample.JdbcConnection getJdbcConnection() {
        return this.jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection passedJdbcConnection) {
        this.jdbcConnection = passedJdbcConnection;
    }
}
