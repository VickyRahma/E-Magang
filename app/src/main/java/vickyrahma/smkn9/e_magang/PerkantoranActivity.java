package vickyrahma.smkn9.e_magang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PerkantoranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkantoran);
    }

    public void dbsiswaotp(View view) {
        Intent intent = new Intent(PerkantoranActivity.this, DataSiswaOtpActivity.class);
        startActivity(intent);
    }

    public void dbkantorotp(View view) {
        Intent intent = new Intent(PerkantoranActivity.this, DataSiswaOtpActivity.class);
        startActivity(intent);
    }
}
