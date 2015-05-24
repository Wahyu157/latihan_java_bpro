/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carimahasiswa;
/**
 *
 * @author www.toufik.web.id
 */
public class CariMahasiswa {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        System.out.print("Masukkan jumlah data yang akan di input: ");
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.input();
        mahasiswa.tampil();
        mahasiswa.cari();
    }

   
    }

   