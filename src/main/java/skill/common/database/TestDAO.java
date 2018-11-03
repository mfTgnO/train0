package skill.common.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDAO {
//    private final static String sql = "SELECT * FROM USER u WHERE u.USR_ID=9999";
//    private final static String sql = "SELECT * FROM yw_10 WHERE g01 = '1'";
    private final static String sql = "SELECT * FROM yw_10 WHERE g01 = '1' AND oid = '145'";
//    private final static String sql = "SELECT * FROM t1;";

    public void query(Connection conn) {
        try {
            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery(sql);
            result.close();
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
