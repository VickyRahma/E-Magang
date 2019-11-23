package vickyrahma.smkn9.e_magang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AkuntansiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akuntansi);
    }

    public void dbkantorakl(View view) {
        Intent intent = new Intent(AkuntansiActivity.this, DataKantorAklActivity.class);
        startActivity(intent);
    }

    public void dbsiswaakl(View view) {
        Intent intent = new Intent(AkuntansiActivity.this, DataSiswaAklActivity.class);
        startActivity(intent);
    }
}
