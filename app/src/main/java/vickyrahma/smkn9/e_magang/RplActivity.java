package vickyrahma.smkn9.e_magang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RplActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpl);
    }

    public void dbsiswarpl(View view) {
        Intent intent = new Intent(RplActivity.this, DataSiswaRplActivity.class);
        startActivity(intent);
    }

    public void dbkantorrpl(View view) {
        Intent intent = new Intent(RplActivity.this, DataKantorRplActivity.class);
        startActivity(intent);
    }

}
