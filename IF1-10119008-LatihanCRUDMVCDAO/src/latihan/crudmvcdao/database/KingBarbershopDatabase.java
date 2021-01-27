package latihan.crudmvcdao.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import latihan.crudmvcdao.impl.PelangganDaoImpl;
import latihan.crudmvcdao.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author
 * NIM : 10119008
 * NAMA : Raihan Giffari
 * KELAS : IF-1
 */

public class KingBarbershopDatabase {

    private static Connection connection;
    private static PelangganDao pelangganDao;

    public static Connection getConnection() throws SQLException{
        if(connection==null) {

            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }

        return connection;
    }

    public static PelangganDao getPelangganDao() throws SQLException {
        if (pelangganDao==null) {
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
    }

}