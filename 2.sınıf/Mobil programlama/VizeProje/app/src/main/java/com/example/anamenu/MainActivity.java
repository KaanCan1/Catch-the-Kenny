package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listview_kck;
    private ArrayAdapter<String> adapter_kck;
    private String[] satirlar_kck = {"Kırklareli Tarihçesi", "Kırklareli'nde Bulunan Tarihi Yerler",
            "Kırklareli Yöresel Yemekleri", "Kırklareli Yöresel Tatlıları"};

    private String[] satirlarAciklama_kck = {"Süleyman Çelebi ve kardeşi Musa Çelebi'nin eline geçen Kırklareli ve çevresi, 1369 yılında I.Murat tarafından alınıp Osmanlı Devleti'ne katılmıştır. Tanzimattan sonra Kırklareli, Edirne Vilayeti'nin altı sancağından birine merkez oldu. Balkan Savaşı sırasında Kırklareli Bulgarlar tarafından işgal edilmiştir.",};
    private int[] satırlarResim_kck = {R.drawable.kirklareli};
    private Intent TarihceIntent_kck;
    static public Bitmap SecilenSatir_kck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Ana Menü");


        listview_kck = (ListView) findViewById(R.id.main_activity_listview_kck);
        adapter_kck = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,satirlar_kck);
        listview_kck.setAdapter(adapter_kck);

        listview_kck.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(i);
                Class<? extends Activity> ustclass;

                switch (i) {
                    case 0:
                        ustclass = Kirklareli_Tarihcesi.class;
                        break;
                    case 1:
                        ustclass = Yer_Activity1.class;
                        break;
                    case 2:
                        ustclass = Yer_Activity2.class;
                        break;
                    case 3:
                        ustclass = Yer_Activity3.class;
                        break;
                    default:
                        ustclass = MainActivity.class;
                }
                TarihceIntent_kck = new Intent(MainActivity.this, ustclass);
                if (i == 0) {
                    TarihceIntent_kck.putExtra("sehirismi", satirlar_kck[i]);
                    TarihceIntent_kck.putExtra("satiraciklama", satirlarAciklama_kck[i]);
                    SecilenSatir_kck = BitmapFactory.decodeResource(getApplicationContext().getResources(), satırlarResim_kck[i]);
                    startActivity(TarihceIntent_kck);
                } else {
                    System.out.println(ustclass);
                    startActivity(TarihceIntent_kck);
                }
            }
        });
    }
}
