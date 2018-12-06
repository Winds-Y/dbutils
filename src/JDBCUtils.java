import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtils {
    private static ComboPooledDataSource ds=new ComboPooledDataSource();
    public static Connection getConnction() throws SQLException {
        return ds.getConnection();
    }
    static ComboPooledDataSource getDataSource(){
        return ds;
    }
}
