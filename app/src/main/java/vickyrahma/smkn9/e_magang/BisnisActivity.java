package vickyrahma.smkn9.e_magang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BisnisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisnis);
    }

    public void dbsiswabdp(View view) {
        Intent intent = new Intent(BisnisActivity.this, DataSiswaBdpActivity.class);
        startActivity(intent);
    }

    public void dbkantorbdp(View view) {
        Intent intent = new Intent(BisnisActivity.this, DataSiswaBdpActivity.class);
        startActivity(intent);
    }
}
