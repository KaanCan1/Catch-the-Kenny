package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Yemek_activity extends AppCompatActivity {
    private TextView sehirIsmi_kck2, sehirAciklama_kck2;
    private ImageView sehirResmi_kck2;
    private Intent getIntent_kck2;
    private String aciklama_kck2, sehirisim_kck2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek);

        sehirIsmi_kck2 = (TextView)findViewById(R.id.yoreselYemek_activity_textviewIsmi);
        sehirAciklama_kck2 = (TextView) findViewById(R.id.yoreselYemek_activity_aciklamaKismi);
        sehirResmi_kck2 = (ImageView) findViewById(R.id.yoreselYemek_activity_imageViewResmi);

        this.setTitle("Kırklareli Yöresel Yemekleri");
        getIntent_kck2= getIntent();
        sehirisim_kck2 = getIntent_kck2.getStringExtra("yemekismi");
        aciklama_kck2 = getIntent_kck2.getStringExtra("satiraciklama");

        if (!TextUtils.isEmpty(sehirisim_kck2) && !TextUtils.isEmpty(aciklama_kck2))
        {
            sehirIsmi_kck2.setText(sehirisim_kck2);
            sehirAciklama_kck2.setText(aciklama_kck2);
            sehirResmi_kck2.setImageBitmap(Yer_Activity2.SecilenSatir_kck2);
        }
    }
}