package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Tatli_activity extends AppCompatActivity {
    private TextView sehirIsmi_kck3, sehirAciklama_kck3;
    private ImageView sehirResmi_kck3;
    private Intent getIntent_kck3;
    private String aciklama_kck3, sehirisim_kck3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatli);

        sehirIsmi_kck3 = (TextView)findViewById(R.id.tatli_activity_textviewIsmi);
        sehirAciklama_kck3 = (TextView) findViewById(R.id.tatli_activity_aciklamaKismi);
        sehirResmi_kck3 = (ImageView) findViewById(R.id.tatli_activity_imageViewResmi);

        this.setTitle("Kırklareli Yöresel Tatlıları");
        getIntent_kck3= getIntent();
        sehirisim_kck3 = getIntent_kck3.getStringExtra("tatliismi");
        aciklama_kck3 = getIntent_kck3.getStringExtra("satiraciklama");

        if (!TextUtils.isEmpty(sehirisim_kck3) && !TextUtils.isEmpty(aciklama_kck3))
        {
            sehirIsmi_kck3.setText(sehirisim_kck3);
            sehirAciklama_kck3.setText(aciklama_kck3);
            sehirResmi_kck3.setImageBitmap(Yer_Activity3.SecilenSatir_kck3);
        }
    }
}