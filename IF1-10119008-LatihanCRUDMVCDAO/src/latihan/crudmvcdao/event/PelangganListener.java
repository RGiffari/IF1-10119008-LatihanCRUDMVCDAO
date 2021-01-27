package latihan.crudmvcdao.event;

import latihan.crudmvcdao.entity.Pelanggan;
import latihan.crudmvcdao.model.PelangganModel;

/**
 *
 * @author
 * NIM : 10119008
 * NAMA : Raihan Giffari
 * KELAS : IF-1
 */

public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);
}
