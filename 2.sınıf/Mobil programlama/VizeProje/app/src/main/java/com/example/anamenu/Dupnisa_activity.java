package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Dupnisa_activity extends AppCompatActivity {

    private TextView sehirIsmi_kck1, sehirAciklama_kck1;
    private ImageView sehirResmi_kck1;
    private Intent getIntent_kck1;
    private String aciklama_kck1, sehirisim_kck1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dupnisa);

        sehirIsmi_kck1 = (TextView)findViewById(R.id.tarihiYer_activity_textviewSehirIsmi);
        sehirAciklama_kck1 = (TextView) findViewById(R.id.tarihceYer_activity_aciklamaKismi);
        sehirResmi_kck1 = (ImageView) findViewById(R.id.tarihiYer_activity_imageViewSehirResmi);

        this.setTitle("Kırklarelinde Bulunan Tarihi Yerler");
        getIntent_kck1= getIntent();
        sehirisim_kck1 = getIntent_kck1.getStringExtra("sehirismi");
        aciklama_kck1 = getIntent_kck1.getStringExtra("satiraciklama");

        if (!TextUtils.isEmpty(sehirisim_kck1) && !TextUtils.isEmpty(aciklama_kck1))
        {
            sehirIsmi_kck1.setText(sehirisim_kck1);
            sehirAciklama_kck1.setText(aciklama_kck1);
            sehirResmi_kck1.setImageBitmap(Yer_Activity1.SecilenSatir_kck1);

        }
    }
}