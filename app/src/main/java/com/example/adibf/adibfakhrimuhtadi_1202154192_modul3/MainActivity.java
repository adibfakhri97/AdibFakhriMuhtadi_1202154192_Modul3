package com.example.adibf.adibfakhrimuhtadi_1202154192_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView RecyclerV; //variable untuk RecylerView
    private List<methodAir> aMenu; //variable untuk array list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RecyclerV = (RecyclerView) findViewById(R.id.recyclerview); //meletakkan variable RecyclerV ke recyclerview pada file xml berdasarkan ID

        int gridColumn = getResources().getInteger(R.integer.grid_column_count); //membuat variable untuk grid layout dengan mengambil integer landscape

        RecyclerV.setLayoutManager(new GridLayoutManager(this, gridColumn)); //membuat layout berbentuk grid


      //  RecyclerV.setHasFixedSize(true);


        aMenu = new ArrayList<>();

        //isi data air
        aMenu.add(new methodAir(1, "ADES", R.drawable.ades, "Ini adalah ADES. Air adalah senyawa yang penting bagi semua bentuk kehidupan yang diketahui sampai saat ini di Bumi, tetapi tidak di planet lain. Air menutupi hampir 71% permukaan Bumi. Terdapat 1,4 triliun kilometer kubik (330 juta mil³) tersedia di Bumi. Air sebagian besar terdapat di laut (air asin) dan pada lapisan-lapisan es (di kutub dan puncak-puncak gunung), akan tetapi juga dapat hadir sebagai awan, hujan, sungai, muka air tawar, danau, uap air, dan lautan es. Air dalam objek-objek tersebut bergerak mengikuti suatu siklus air, yaitu: melalui penguapan, hujan, dan aliran air di atas permukaan tanah (runoff, meliputi mata air, sungai, muara) menuju laut. Air bersih penting bagi kehidupan manusia."));
        aMenu.add(new methodAir(2, "AMIDIS", R.drawable.amidis, "Ini adalah AMIDIS. Air adalah senyawa yang penting bagi semua bentuk kehidupan yang diketahui sampai saat ini di Bumi, tetapi tidak di planet lain. Air menutupi hampir 71% permukaan Bumi. Terdapat 1,4 triliun kilometer kubik (330 juta mil³) tersedia di Bumi. Air sebagian besar terdapat di laut (air asin) dan pada lapisan-lapisan es (di kutub dan puncak-puncak gunung), akan tetapi juga dapat hadir sebagai awan, hujan, sungai, muka air tawar, danau, uap air, dan lautan es. Air dalam objek-objek tersebut bergerak mengikuti suatu siklus air, yaitu: melalui penguapan, hujan, dan aliran air di atas permukaan tanah (runoff, meliputi mata air, sungai, muara) menuju laut. Air bersih penting bagi kehidupan manusia."));
        aMenu.add(new methodAir(3, "AQUA", R.drawable.aqua, "Ini adalah AQUA. Air adalah senyawa yang penting bagi semua bentuk kehidupan yang diketahui sampai saat ini di Bumi, tetapi tidak di planet lain. Air menutupi hampir 71% permukaan Bumi. Terdapat 1,4 triliun kilometer kubik (330 juta mil³) tersedia di Bumi. Air sebagian besar terdapat di laut (air asin) dan pada lapisan-lapisan es (di kutub dan puncak-puncak gunung), akan tetapi juga dapat hadir sebagai awan, hujan, sungai, muka air tawar, danau, uap air, dan lautan es. Air dalam objek-objek tersebut bergerak mengikuti suatu siklus air, yaitu: melalui penguapan, hujan, dan aliran air di atas permukaan tanah (runoff, meliputi mata air, sungai, muara) menuju laut. Air bersih penting bagi kehidupan manusia."));
        aMenu.add(new methodAir(4, "CLEO", R.drawable.cleo, "Ini adalah CLEO. Air adalah senyawa yang penting bagi semua bentuk kehidupan yang diketahui sampai saat ini di Bumi, tetapi tidak di planet lain. Air menutupi hampir 71% permukaan Bumi. Terdapat 1,4 triliun kilometer kubik (330 juta mil³) tersedia di Bumi. Air sebagian besar terdapat di laut (air asin) dan pada lapisan-lapisan es (di kutub dan puncak-puncak gunung), akan tetapi juga dapat hadir sebagai awan, hujan, sungai, muka air tawar, danau, uap air, dan lautan es. Air dalam objek-objek tersebut bergerak mengikuti suatu siklus air, yaitu: melalui penguapan, hujan, dan aliran air di atas permukaan tanah (runoff, meliputi mata air, sungai, muara) menuju laut. Air bersih penting bagi kehidupan manusia."));
        aMenu.add(new methodAir(5, "CLUB", R.drawable.club, "Ini adalah CLUB. Air adalah senyawa yang penting bagi semua bentuk kehidupan yang diketahui sampai saat ini di Bumi, tetapi tidak di planet lain. Air menutupi hampir 71% permukaan Bumi. Terdapat 1,4 triliun kilometer kubik (330 juta mil³) tersedia di Bumi. Air sebagian besar terdapat di laut (air asin) dan pada lapisan-lapisan es (di kutub dan puncak-puncak gunung), akan tetapi juga dapat hadir sebagai awan, hujan, sungai, muka air tawar, danau, uap air, dan lautan es. Air dalam objek-objek tersebut bergerak mengikuti suatu siklus air, yaitu: melalui penguapan, hujan, dan aliran air di atas permukaan tanah (runoff, meliputi mata air, sungai, muara) menuju laut. Air bersih penting bagi kehidupan manusia."));
        aMenu.add(new methodAir(6, "EQUIL", R.drawable.equil, "Ini adalah EQUIL. Air adalah senyawa yang penting bagi semua bentuk kehidupan yang diketahui sampai saat ini di Bumi, tetapi tidak di planet lain. Air menutupi hampir 71% permukaan Bumi. Terdapat 1,4 triliun kilometer kubik (330 juta mil³) tersedia di Bumi. Air sebagian besar terdapat di laut (air asin) dan pada lapisan-lapisan es (di kutub dan puncak-puncak gunung), akan tetapi juga dapat hadir sebagai awan, hujan, sungai, muka air tawar, danau, uap air, dan lautan es. Air dalam objek-objek tersebut bergerak mengikuti suatu siklus air, yaitu: melalui penguapan, hujan, dan aliran air di atas permukaan tanah (runoff, meliputi mata air, sungai, muara) menuju laut. Air bersih penting bagi kehidupan manusia."));
        aMenu.add(new methodAir(7, "EVIAN", R.drawable.evian, "Ini adalah EVIAN. Air adalah senyawa yang penting bagi semua bentuk kehidupan yang diketahui sampai saat ini di Bumi, tetapi tidak di planet lain. Air menutupi hampir 71% permukaan Bumi. Terdapat 1,4 triliun kilometer kubik (330 juta mil³) tersedia di Bumi. Air sebagian besar terdapat di laut (air asin) dan pada lapisan-lapisan es (di kutub dan puncak-puncak gunung), akan tetapi juga dapat hadir sebagai awan, hujan, sungai, muka air tawar, danau, uap air, dan lautan es. Air dalam objek-objek tersebut bergerak mengikuti suatu siklus air, yaitu: melalui penguapan, hujan, dan aliran air di atas permukaan tanah (runoff, meliputi mata air, sungai, muara) menuju laut. Air bersih penting bagi kehidupan manusia."));
        aMenu.add(new methodAir(8, "LE MINERALE", R.drawable.leminerale, "Ini adalah Le Minerale. Air adalah senyawa yang penting bagi semua bentuk kehidupan yang diketahui sampai saat ini di Bumi, tetapi tidak di planet lain. Air menutupi hampir 71% permukaan Bumi. Terdapat 1,4 triliun kilometer kubik (330 juta mil³) tersedia di Bumi. Air sebagian besar terdapat di laut (air asin) dan pada lapisan-lapisan es (di kutub dan puncak-puncak gunung), akan tetapi juga dapat hadir sebagai awan, hujan, sungai, muka air tawar, danau, uap air, dan lautan es. Air dalam objek-objek tersebut bergerak mengikuti suatu siklus air, yaitu: melalui penguapan, hujan, dan aliran air di atas permukaan tanah (runoff, meliputi mata air, sungai, muara) menuju laut. Air bersih penting bagi kehidupan manusia."));
        aMenu.add(new methodAir(9, "NESTLE", R.drawable.nestle, "Ini adalah NESTLE. Air adalah senyawa yang penting bagi semua bentuk kehidupan yang diketahui sampai saat ini di Bumi, tetapi tidak di planet lain. Air menutupi hampir 71% permukaan Bumi. Terdapat 1,4 triliun kilometer kubik (330 juta mil³) tersedia di Bumi. Air sebagian besar terdapat di laut (air asin) dan pada lapisan-lapisan es (di kutub dan puncak-puncak gunung), akan tetapi juga dapat hadir sebagai awan, hujan, sungai, muka air tawar, danau, uap air, dan lautan es. Air dalam objek-objek tersebut bergerak mengikuti suatu siklus air, yaitu: melalui penguapan, hujan, dan aliran air di atas permukaan tanah (runoff, meliputi mata air, sungai, muara) menuju laut. Air bersih penting bagi kehidupan manusia."));
        aMenu.add(new methodAir(10, "PRISTINE", R.drawable.pristine, "Ini adalah PRISTINE. Air adalah senyawa yang penting bagi semua bentuk kehidupan yang diketahui sampai saat ini di Bumi, tetapi tidak di planet lain. Air menutupi hampir 71% permukaan Bumi. Terdapat 1,4 triliun kilometer kubik (330 juta mil³) tersedia di Bumi. Air sebagian besar terdapat di laut (air asin) dan pada lapisan-lapisan es (di kutub dan puncak-puncak gunung), akan tetapi juga dapat hadir sebagai awan, hujan, sungai, muka air tawar, danau, uap air, dan lautan es. Air dalam objek-objek tersebut bergerak mengikuti suatu siklus air, yaitu: melalui penguapan, hujan, dan aliran air di atas permukaan tanah (runoff, meliputi mata air, sungai, muara) menuju laut. Air bersih penting bagi kehidupan manusia."));
        aMenu.add(new methodAir(11, "VIT", R.drawable.vit, "Ini adalah VIT. Air adalah senyawa yang penting bagi semua bentuk kehidupan yang diketahui sampai saat ini di Bumi, tetapi tidak di planet lain. Air menutupi hampir 71% permukaan Bumi. Terdapat 1,4 triliun kilometer kubik (330 juta mil³) tersedia di Bumi. Air sebagian besar terdapat di laut (air asin) dan pada lapisan-lapisan es (di kutub dan puncak-puncak gunung), akan tetapi juga dapat hadir sebagai awan, hujan, sungai, muka air tawar, danau, uap air, dan lautan es. Air dalam objek-objek tersebut bergerak mengikuti suatu siklus air, yaitu: melalui penguapan, hujan, dan aliran air di atas permukaan tanah (runoff, meliputi mata air, sungai, muara) menuju laut. Air bersih penting bagi kehidupan manusia."));


        adapterList adapter = new adapterList(this, aMenu);

        RecyclerV.setAdapter(adapter);
    }
}
