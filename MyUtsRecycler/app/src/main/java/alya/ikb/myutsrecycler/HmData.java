package alya.ikb.myutsrecycler;

import java.util.ArrayList;

public class HmData {

    public static String[][] data = new String[][]{
            {"0", "Popuri", "Gadis ini mewarnai rambutnya menjadi merah muda dan sangat menyukai binatang-binatang yang ada di hutan. Ia dapat kamu temui sekitar jam 08.00 pagi-10.00 pagi (8.00 am-10.00 am) di dekat mata air panas di gunung. Ulang tahunnya tanggal 3 musim panas (Summer 3rd).","https://i.postimg.cc/fRKwHxct/popuri.jpg"},
            {"1", "Elli", "Gadis cantik berambut coklat dan dipotong pendek. Biasanya ia bekerja di rumah sakit/ klinik. Ulang tahunnya tanggal 16 musim semi (Spring 16th).","https://i.postimg.cc/LsnrzfNM/elli.jpg"},
            {"2", "Mary", "Gadis berambut hitam dan berkacamata. Bekerja dan menghabiskan sebagian waktunya di perpustakaan. Ulang tahunnya tanggal 20 musim dingin (Winter 20th).","https://i.postimg.cc/d1GNB9Cg/mary.jpg"},
            {"3", "Karen", "Seorang gadis berambut pirang, biasanya ia berada di supermarket dari jam 01.00-04.00 (1.00 pm-4.00pm). Ulang tahunnya tanggal 15 musim gugur (Fall 15th).","https://i.postimg.cc/vH0q3T18/karen.jpg"},
            {"4", "Ann", "Gadis berambut pirang ini akan terlihat lebih manis jika kamu sudah mengenalnya dengan baik. Ia biasanya bekerja di restoran sekitar jam 01.00 – 03.00 sore ( 1.00pm-3.00pm). Ulang tahunnya tanggal 17 musim panas (Summer 17th).","https://i.postimg.cc/pr2CBMRn/ann.jpg"}
    };

    public static ArrayList<Hm>getListData(){
        ArrayList<Hm> list = new ArrayList<>();
        for (String[] aData:data){
            Hm hm = new Hm();
            hm.setId(Integer.parseInt(aData[0]));
            hm.setName(aData[1]);
            hm.setDescription(aData[2]);
            hm.setPhoto(aData[3]);

            list.add(hm);
        }
        return list;
    }
}
