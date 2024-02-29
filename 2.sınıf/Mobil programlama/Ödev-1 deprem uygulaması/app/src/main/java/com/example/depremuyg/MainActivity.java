package com.example.depremuyg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    SensorManager sensorManager_kck;
    Sensor ivme_kck;
    float ivmelenme_kck;
    float simdikiIvmelenme_kck;
    float birOncekiIvmelenme_kck;
    TextView txt_kck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Vibrator vibrator_kck = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        txt_kck = findViewById(R.id.txtGoster_kck);


        sensorManager_kck = (SensorManager) getSystemService(SENSOR_SERVICE);
        ivme_kck = sensorManager_kck.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        sensorManager_kck.registerListener(this, ivme_kck, SensorManager.SENSOR_DELAY_NORMAL);

        TextView textView_kck = findViewById(R.id.txtGoster_kck);
        textView_kck.setTextSize(22);
        textView_kck.setTypeface(null, Typeface.BOLD);
        textView_kck.setTypeface(null, Typeface.BOLD_ITALIC);
        String text_kck = textView_kck.getText().toString();

        int index_kck = text_kck.indexOf("!!");
        if(index_kck >= 0){

            SpannableString spannableString = new SpannableString(text_kck);
            spannableString.setSpan(new RelativeSizeSpan(2.5f), index_kck,index_kck+2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            textView_kck.setText(spannableString);
        }

        //ilk değerler
        ivmelenme_kck = 0.00f;
        simdikiIvmelenme_kck = SensorManager.GRAVITY_EARTH;
        birOncekiIvmelenme_kck = SensorManager.GRAVITY_EARTH;
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        float x = sensorEvent.values[0];
        float y = sensorEvent.values[1];
        float z = sensorEvent.values[2];

        birOncekiIvmelenme_kck = simdikiIvmelenme_kck;
        simdikiIvmelenme_kck = (float) Math.sqrt(x*x+y*y+z*z);

        float degisim_kck = simdikiIvmelenme_kck - birOncekiIvmelenme_kck;

        ivmelenme_kck = ivmelenme_kck * 0.9f + degisim_kck;

        if (ivmelenme_kck > 2){
            txt_kck.setBackgroundColor(Color.YELLOW);
            txt_kck.setTextColor(Color.GREEN);

            Vibrator vibrator_kck = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
            if (Build.VERSION.SDK_INT >= 26){
                vibrator_kck.vibrate(VibrationEffect.createOneShot(2000,VibrationEffect.DEFAULT_AMPLITUDE));
            }
            else{
                vibrator_kck.vibrate(2000);
            }


            Toast.makeText(this, "DEPREM OLUYOR", Toast.LENGTH_SHORT).show();

            Uri notificationSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Ringtone r_kck = RingtoneManager.getRingtone(getApplicationContext(), notificationSound);
            r_kck.play();

            MediaPlayer mediaPlayer = MediaPlayer.create(this, notificationSound);
            mediaPlayer.setLooping(true);
            mediaPlayer.start();



            CountDownTimer timer_kck = new CountDownTimer(Long.MAX_VALUE, 1000) {

                boolean visible=true;
                @Override
                public void onTick(long l) {
                    txt_kck.setVisibility(visible ? View.VISIBLE : View.INVISIBLE);
                    visible = !visible;
                }

                @Override
                public void onFinish() {

                }
            };
            timer_kck.start();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sensorManager_kck.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
