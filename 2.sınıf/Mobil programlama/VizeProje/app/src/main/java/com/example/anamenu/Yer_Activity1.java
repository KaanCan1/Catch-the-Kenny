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
import android.widget.ImageView;
import android.widget.ListView;

public class Yer_Activity1 extends AppCompatActivity {

    private ListView listview_kck1;
    private ArrayAdapter<String> adapter_kck1;
    private String[] satirlar_kck1 = {"Dupnisa Mağarası", "Sokullu Mehmet Paşa Külliyesi",
            "Vize Kalesi"};
    private String[] satirlarAciklama_kck1 = {"Kırklareli ilinde yer alan tarihi bir mağaradır. Mağara, Demirköy ilçesinde, İstanbul'a yaklaşık 200 km mesafededir. Mağara, Trakya bölgesinde yer alır ve tarihi kalıntılar açısından oldukça zengindir. Mağaranın tarihi, MÖ 4. binyıla kadar uzanmaktadır. Mağara, tarih boyunca insanlar tarafından kullanılmış ve yer altı şehri olarak da kullanılmıştır. Mağara, günümüzde turistlerin ziyaretine açıktır ve zengin tarihi dokusu ile ilgi çekmektedir. Ayrıca mağarada yapılan arkeolojik kazılar, bölgenin tarihine dair önemli ipuçları sunmaktadır.",
            "Rivayete göre Osmanlı’nın en az padişahlar kadar bilinen sadrazamı Sokullu Mehmet Paşa, 14 yaşında devşirilerek Topkapı Sarayı‘na getirilir. Bu uzun yolu kat ederken yorulurlar ve Lüleburgaz’da dururlar. Orada yaşayan bir kadın da Sokullu Mehmet Paşa’ya yemesi için bir şeyler verir.  Sokullu, devlet kademelerinde yükselse bile kendisine yapılan bu iyiliği unutmaz ve Lüleburgaz’a bir külliye yapılmasını ister. Kanuni Sultan Süleyman’ın sadrazamlığını yaptığı dönemde, tarihin en büyük mimarlarından biri olan Mimar Sinan yaşamaktadır.1569 senesinde yapılarak günümüzde hala dimdik duran muazzam bir külliye Lüleburgaz’ın siluetini süslemektedir.  Külliye içinde bir adet cami, medrese ve revaklı havlu, şadırvan, arasta ve dua kubbesi, kervansaray, imaret, sıbyan mektebi, çifte hamam, Zindan Baba Türbesi külliyeyi tamamlayan başlıca yapılardır.",
            "Vize ilçe merkezinde yer alan Vize Kalesi, 4 metre yüksekliğinde taş bloklardan oluşmuş tarihi bir yapıdır. Günümüze kale yapısının surlarından çok az bir bölüm kalmıştır ve 3-4 metre yüksekliğindedir. Kentin en yüksek tepesinde akropolde olan kalenin, ovaya doğru uzanan kalıntıları günümüze kadar gelmiş. Kalenin yapım tarihinin ise Roma döneminin MÖ 72-76 yıllarına dayandığı biliniyor.  Neden gitmeliyim? Vize’nin en yüksek yerlerinden olması nedeniyle burası tarihi dokusunun yanı sıra nefes kesen Vize manzarasını seyretmek için de gidilmesi gereken noktalar arasında yer almaktadır.",
    };
    private int[] satırlarResim_kck1 = {R.drawable.dupnisa,R.drawable.sokullu,R.drawable.vizekalesi};
    private Intent TarihiyerIntent_kck1;
    static public Bitmap SecilenSatir_kck1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yer1);

        this.setTitle("Kırklarelinde Bulunan Tarihi Yerler");

        listview_kck1 = (ListView) findViewById(R.id.main_activity_listview_kck1);
        adapter_kck1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,satirlar_kck1);
        listview_kck1.setAdapter(adapter_kck1);

        listview_kck1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(i);
                Class<? extends Activity> ustclass;

                switch (i) {
                    case 0:
                        ustclass = Dupnisa_activity.class;
                        break;
                    case 1:
                        ustclass = Yer_Activity1.class;
                        break;
                    case 2:
                        ustclass = Yer_Activity1.class;
                        break;
                    default:
                        ustclass = Yer_Activity1.class;
                }
                if (i == 0) {
                    TarihiyerIntent_kck1 = new Intent(Yer_Activity1.this, Dupnisa_activity.class);
                    TarihiyerIntent_kck1.putExtra("sehirismi", satirlar_kck1[i]);
                    TarihiyerIntent_kck1.putExtra("satiraciklama", satirlarAciklama_kck1[i]);
                    SecilenSatir_kck1 = BitmapFactory.decodeResource(getApplicationContext().getResources(), satırlarResim_kck1[i]);
                    startActivity(TarihiyerIntent_kck1);
                }
                else if(i==1){
                    TarihiyerIntent_kck1 = new Intent(Yer_Activity1.this, Dupnisa_activity.class);
                    TarihiyerIntent_kck1.putExtra("sehirismi", satirlar_kck1[i]);
                    TarihiyerIntent_kck1.putExtra("satiraciklama", satirlarAciklama_kck1[i]);
                    SecilenSatir_kck1 = BitmapFactory.decodeResource(getApplicationContext().getResources(), satırlarResim_kck1[i]);
                    startActivity(TarihiyerIntent_kck1);
                }else if(i==2){
                    TarihiyerIntent_kck1 = new Intent(Yer_Activity1.this, Dupnisa_activity.class);
                    TarihiyerIntent_kck1.putExtra("sehirismi", satirlar_kck1[i]);
                    TarihiyerIntent_kck1.putExtra("satiraciklama", satirlarAciklama_kck1[i]);
                    SecilenSatir_kck1 = BitmapFactory.decodeResource(getApplicationContext().getResources(), satırlarResim_kck1[i]);
                    startActivity(TarihiyerIntent_kck1);
                }
                else {
                    System.out.println(ustclass);
                    startActivity(TarihiyerIntent_kck1);
                }
            }

        });
}}