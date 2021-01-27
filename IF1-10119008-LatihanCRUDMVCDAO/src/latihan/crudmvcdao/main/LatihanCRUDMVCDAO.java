package latihan.crudmvcdao.main;

import latihan.crudmvcdao.database.KingBarbershopDatabase;
import latihan.crudmvcdao.entity.Pelanggan;
import latihan.crudmvcdao.error.PelangganException;
import latihan.crudmvcdao.service.PelangganDao;
import latihan.crudmvcdao.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author
 * NIM : 10119008
 * NAMA : Raihan Giffari
 * KELAS : IF-1
 */

public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

}