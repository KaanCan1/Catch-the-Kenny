package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Kirklareli_Tarihcesi extends AppCompatActivity {

    private TextView sehirIsmi_kck, sehirAciklama_kck;
    private ImageView sehirResmi_kck;
    private Intent getIntent_kck;
    private String aciklama_kck, sehirisim_kck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kirklareli_tarihcesi);

        sehirIsmi_kck = (TextView)findViewById(R.id.tarihce_activity_textviewSehirIsmi_kck);
        sehirAciklama_kck = (TextView) findViewById(R.id.tarihce_activity_aciklamaKismi_kck);
        sehirResmi_kck = (ImageView) findViewById(R.id.tarihce_activity_imageViewSehirResmi_kck);

        this.setTitle("Kırklareli Tarihçesi");
        getIntent_kck= getIntent();
        sehirisim_kck = getIntent_kck.getStringExtra("sehirismi");
        aciklama_kck = getIntent_kck.getStringExtra("satiraciklama");

        if (!TextUtils.isEmpty(sehirisim_kck) && !TextUtils.isEmpty(aciklama_kck))
        {
            sehirIsmi_kck.setText(sehirisim_kck);
            sehirAciklama_kck.setText(aciklama_kck);
            sehirResmi_kck.setImageBitmap(MainActivity.SecilenSatir_kck);

        }
    }
}