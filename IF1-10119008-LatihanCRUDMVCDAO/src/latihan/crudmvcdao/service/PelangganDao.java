package latihan.crudmvcdao.service;

import latihan.crudmvcdao.entity.Pelanggan;
import latihan.crudmvcdao.error.PelangganException;
import java.util.List;

/**
 *
 * @author
 * NIM : 10119008
 * NAMA : Raihan Giffari
 * KELAS : IF-1
 */

public interface PelangganDao {

    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;

    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;

    public void deletePelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(String email) throws PelangganException;

    public List<Pelanggan> selectAllPelanggan() throws PelangganException;

}