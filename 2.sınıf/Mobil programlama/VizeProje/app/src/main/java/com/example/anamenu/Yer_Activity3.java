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

public class Yer_Activity3 extends AppCompatActivity {

    private ListView listview_kck3;
    private ArrayAdapter<String> adapter_kck3;
    private String[] satirlar_kck3 = {"Pekmezli Kaçamak", "Şerbetli Tatlılar","Hayrabolu Tatlısı"};
    private String[] satirlarAciklama_kck3 = {"Mübadeleler ve göçler seneler içinde Kırklareli’ni Trakya’nın farklı bölgelerinden gelen insanların yaşam alanı yapmış. Benzerlikleri olduğu kadar farklılıkları da olan bu insanlar, Kırklareli’nin zengin mutfağının temel kaynağı. Bir göçmen yemeği olan kaçamak, mısır unundan yapılıyor ve kıvamını tutturmak pek de kolay değil. Kırklareli’de Poyralı pancar pekmezi ile servis edilen yemeği; lor peyniri, kavurma ve yoğurtla da yiyebilirsiniz.",
            "Kırklareli mutfağında ağırlıklı olarak şerbetli tatlılar yer almaktadır. Baklava, irmik tatlısı, hurma tatlısı, hanımgöbeği, ekmek kadayıfı ve kabak tatlısı, şehirde sık tüketilmektedir. Sadece Kırklareli’ne özgü bir tatlı denemek isteyenler için şehrin en meşhur tatlısı sütle hazırlanan kaymaçina tatlısıdır. ",
            "Hayrabolu Tatlısı; Tekirdağ ili Hayrabolu ilçesinin Trakya şivesinde söylenişi Hayrabol ismiyle de bilinen ana malzemesi irmik ve tuzsuz peynir olan şerbetli bir yöresel tatlıdır. 1972 yılında Hayrabolu’da üretilmeye başlanan tatlı, ilk yıllarda “Kadı Göbeği Tatlısı” olarak adlandırılsa da zaman içerisinde “Hayrabolu Tatlısı” olarak anılmaya başlamıştır.Hayrabolu Tatlısı, pişirilip kurutulmuş halde paketli olarak ve şerbeti dökülmüş olarak iki şekilde satışa sunulur. Kurutulmuş halde satılan Hayrabolu Tatlısı, fırınlanarak 8 ay süreyle muhafaza edilebilir."};
    private int[] satırlarResim_kck3 = {R.drawable.pekmezlikacamak,R.drawable.serbetlitatli,R.drawable.hayrabolutatlisi};
    private Intent TarihiyerIntent_kck3;
    static public Bitmap SecilenSatir_kck3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yer3);

        this.setTitle("Kırklareli Yöresel Tatlıları");

        listview_kck3 = (ListView) findViewById(R.id.main_activity_listview_kck3);
        adapter_kck3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,satirlar_kck3);
        listview_kck3.setAdapter(adapter_kck3);

        listview_kck3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(i);
                Class<? extends Activity> ustclass;

                switch (i) {
                    case 0:
                        ustclass = Tatli_activity.class;
                        break;
                    case 1:
                        ustclass = Yer_Activity3.class;
                        break;
                    case 2:
                        ustclass = Yer_Activity3.class;
                        break;
                    default:
                        ustclass = Yer_Activity3.class;
                }
                if (i == 0) {
                    TarihiyerIntent_kck3 = new Intent(Yer_Activity3.this, Tatli_activity.class);
                    TarihiyerIntent_kck3.putExtra("tatliismi", satirlar_kck3[i]);
                    TarihiyerIntent_kck3.putExtra("satiraciklama", satirlarAciklama_kck3[i]);
                    SecilenSatir_kck3 = BitmapFactory.decodeResource(getApplicationContext().getResources(), satırlarResim_kck3[i]);
                    startActivity(TarihiyerIntent_kck3);
                }
                else if(i==1){
                    TarihiyerIntent_kck3 = new Intent(Yer_Activity3.this, Tatli_activity.class);
                    TarihiyerIntent_kck3.putExtra("tatliismi", satirlar_kck3[i]);
                    TarihiyerIntent_kck3.putExtra("satiraciklama", satirlarAciklama_kck3[i]);
                    SecilenSatir_kck3 = BitmapFactory.decodeResource(getApplicationContext().getResources(), satırlarResim_kck3[i]);
                    startActivity(TarihiyerIntent_kck3);
                }else if(i==2){
                    TarihiyerIntent_kck3 = new Intent(Yer_Activity3.this, Tatli_activity.class);
                    TarihiyerIntent_kck3.putExtra("tatliismi", satirlar_kck3[i]);
                    TarihiyerIntent_kck3.putExtra("satiraciklama", satirlarAciklama_kck3[i]);
                    SecilenSatir_kck3 = BitmapFactory.decodeResource(getApplicationContext().getResources(), satırlarResim_kck3[i]);
                    startActivity(TarihiyerIntent_kck3);
                }
                else {
                    System.out.println(ustclass);
                    startActivity(TarihiyerIntent_kck3);
                }
            }

        });
    }
}
