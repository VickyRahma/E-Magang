package vickyrahma.smkn9.e_magang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void rplpindah(View view) {
        Intent intent = new Intent(HomeActivity.this, RplActivity.class);
        startActivity(intent);
    }

    public void bdppindah(View view) {
        Intent intent = new Intent(HomeActivity.this, BisnisActivity.class);
        startActivity(intent);
    }

    public void aklpindah(View view) {
        Intent intent = new Intent(HomeActivity.this, AkuntansiActivity.class);
        startActivity(intent);
    }

    public void otppindah(View view) {
        Intent intent = new Intent(HomeActivity.this, PerkantoranActivity.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_items, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.menulogout){
            startActivity(new Intent(this, LoginActivity.class));
        }
        return true;
    }
}
