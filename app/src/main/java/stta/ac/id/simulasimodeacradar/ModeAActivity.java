package stta.ac.id.simulasimodeacradar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ModeAActivity extends AppCompatActivity {
    String[] option_f1 = new String[]{"1"};
    String[] option_c1 = new String[]{"Pilih Nilai C1","0", "1"};
    String[] option_a1 = new String[]{"Pilih Nilai A1","0", "1"};
    String[] option_c2 = new String[]{"Pilih Nilai C2","0", "1"};
    String[] option_a2 = new String[]{"Pilih Nilai A2","0", "1"};
    String[] option_c4 = new String[]{"Pilih Nilai C4","0", "1"};
    String[] option_a4 = new String[]{"Pilih Nilai A4","0", "1"};
    Spinner spinner_f1,spinner_c1,spinner_a1,spinner_c2,spinner_a2,spinner_c4,spinner_a4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_a);
        initComponent();
    }

    public void initComponent(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Simulasi Mode A");

        spinner_f1 = findViewById(R.id.spinner_f1);
        ArrayAdapter<String> adapter_f1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, option_f1);
        spinner_f1.setAdapter(adapter_f1);
        spinner_f1.setEnabled(false);

        spinner_c1 = findViewById(R.id.spinner_c1);
        ArrayAdapter<String> adapter_c1= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, option_c1);
        spinner_c1.setAdapter(adapter_c1);
        spinner_c1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Toast.makeText(ModeAActivity.this, (String) parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        spinner_a1 = findViewById(R.id.spinner_a1);
        ArrayAdapter<String> adapter_a1= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, option_a1);
        spinner_a1.setAdapter(adapter_a1);
        spinner_a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Toast.makeText(ModeAActivity.this, (String) parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        spinner_c2 = findViewById(R.id.spinner_c2);
        ArrayAdapter<String> adapter_c2= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, option_c2);
        spinner_c2.setAdapter(adapter_c2);
        spinner_c2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Toast.makeText(ModeAActivity.this, (String) parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        spinner_a2 = findViewById(R.id.spinner_a2);
        ArrayAdapter<String> adapter_a2= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, option_a2);
        spinner_a2.setAdapter(adapter_a2);
        spinner_a2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Toast.makeText(ModeAActivity.this, (String) parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        spinner_c4 = findViewById(R.id.spinner_c4);
        ArrayAdapter<String> adapter_c4= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, option_c4);
        spinner_c4.setAdapter(adapter_c4);
        spinner_c4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Toast.makeText(ModeAActivity.this, (String) parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        spinner_a4 = findViewById(R.id.spinner_a4);
        ArrayAdapter<String> adapter_a4= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, option_a4);
        spinner_a4.setAdapter(adapter_a4);
        spinner_a4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Toast.makeText(ModeAActivity.this, (String) parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case android.R.id.home:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
