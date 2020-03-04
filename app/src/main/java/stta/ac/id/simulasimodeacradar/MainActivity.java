package stta.ac.id.simulasimodeacradar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_mode_a,btn_mode_c,btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    public void initComponent(){
        btn_mode_a = findViewById(R.id.btn_mode_a);
        btn_mode_c = findViewById(R.id.btn_mode_c);
        btn_exit = findViewById(R.id.btn_exit);

        btn_mode_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModeAActivity.class);
                startActivity(intent);
            }
        });

        btn_mode_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModeCActivity.class);
                startActivity(intent);
            }
        });

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupClose();
            }
        });
    }

    public void showPopupClose(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, R.style.DialogeTheme);
        builder.setTitle("Peringatan");
        builder.setMessage("Apa kamu ingin keluar aplikasi?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //usually called after the user logs out of your app
                        finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.about, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle item selection
        switch (item.getItemId()) {

            case R.id.tentang:
                Intent intentTentang = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intentTentang);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
