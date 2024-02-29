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

public class Yer_Activity2 extends AppCompatActivity {

    private ListView listview_kck2;
    private ArrayAdapter<String> adapter_kck2;
    private String[] satirlar_kck2 = {"Kırklareli Köftesi", "Papara","Sütlü Hamur Çorbası"};
    private String[] satirlarAciklama_kck2 = {"Ülkemizin hemen hemen her yerinde olduğu gibi Kırklareli’nin de kendine has bir köftesi mevcut. Kırklareli’de kasap-restoran kültürü hakim. Bu tarz yerlerde istediğiniz eti seçiyorsunuz ve her şeyi gözünüzün önünde hazırlıyorlar. Yanında soğan ve özel domates sosu ile servis edilen Kırklareli köftesi, size farklı bir lezzet deneyimi yaşatacak.",
            "“Paparayı yedik” lafı, diğer deyimler gibi mecaz anlamlı olsa da bunu gerçeğe çevirmek sizin elinizde. Ana maddesi bayat ekmek olan papara için “yokluktan doğan lezzet” denilebilir. Su, tereyağ ve bayat ekmek ile hazırlanan paparayı zenginleştirmek size kalmış. Su yerine et suyu tercih edebileceğiniz gibi; lor peyniri de ekleyebilirsiniz.",
            "Trakya mutfağına Rumeli göçmenler tarafından taşınan sütlü hamur çorbası, Kırklareli’nin de yöresel lezzetlerinden biri haline gelmiş. Tekirdağ’da farklı yorumunu göreceğiniz çorba, Kırklareli’nde kuru nane ile servis ediliyor.  İçerisinde erişte, kuru nane ve yumurta yer alıyor.",};
    private int[] satırlarResim_kck2 = {R.drawable.kirklareli_kofte,R.drawable.papara,R.drawable.sutluhamurcorbasi};
    private Intent TarihiyerIntent_kck2;
    static public Bitmap SecilenSatir_kck2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yer2);

        this.setTitle("Kırklareli Yöresel Yemekleri");

        listview_kck2 = (ListView) findViewById(R.id.main_activity_listview_kck2);
        adapter_kck2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,satirlar_kck2);
        listview_kck2.setAdapter(adapter_kck2);

        listview_kck2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(i);
                Class<? extends Activity> ustclass;

                switch (i) {
                    case 0:
                        ustclass = Yemek_activity.class;
                        break;
                    case 1:
                        ustclass = Yer_Activity2.class;
                        break;
                    case 2:
                        ustclass = Yer_Activity2.class;
                        break;
                    default:
                        ustclass = Yer_Activity2.class;
                }
                if (i == 0) {
                    TarihiyerIntent_kck2 = new Intent(Yer_Activity2.this, Yemek_activity.class);
                    TarihiyerIntent_kck2.putExtra("yemekismi", satirlar_kck2[i]);
                    TarihiyerIntent_kck2.putExtra("satiraciklama", satirlarAciklama_kck2[i]);
                    SecilenSatir_kck2 = BitmapFactory.decodeResource(getApplicationContext().getResources(), satırlarResim_kck2[i]);
                    startActivity(TarihiyerIntent_kck2);
                }
                else if(i==1){
                    TarihiyerIntent_kck2 = new Intent(Yer_Activity2.this, Yemek_activity.class);
                    TarihiyerIntent_kck2.putExtra("yemekismi", satirlar_kck2[i]);
                    TarihiyerIntent_kck2.putExtra("satiraciklama", satirlarAciklama_kck2[i]);
                    SecilenSatir_kck2 = BitmapFactory.decodeResource(getApplicationContext().getResources(), satırlarResim_kck2[i]);
                    startActivity(TarihiyerIntent_kck2);
                }else if(i==2){
                    TarihiyerIntent_kck2 = new Intent(Yer_Activity2.this, Yemek_activity.class);
                    TarihiyerIntent_kck2.putExtra("yemekismi", satirlar_kck2[i]);
                    TarihiyerIntent_kck2.putExtra("satiraciklama", satirlarAciklama_kck2[i]);
                    SecilenSatir_kck2 = BitmapFactory.decodeResource(getApplicationContext().getResources(), satırlarResim_kck2[i]);
                    startActivity(TarihiyerIntent_kck2);
                }
                else {
                    System.out.println(ustclass);
                    startActivity(TarihiyerIntent_kck2);
                }
            }

        })
;}}