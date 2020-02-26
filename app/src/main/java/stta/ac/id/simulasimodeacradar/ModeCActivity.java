package stta.ac.id.simulasimodeacradar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class ModeCActivity extends AppCompatActivity {
    String[] option_d2 = new String[]{"Pilih Nilai D2","0", "1"};
    String[] option_d4 = new String[]{"Pilih Nilai D4","0", "1"};
    String[] option_a1 = new String[]{"Pilih Nilai A1","0", "1"};
    String[] option_a2 = new String[]{"Pilih Nilai A2","0", "1"};
    String[] option_a4 = new String[]{"Pilih Nilai A4","0", "1"};
    String[] option_b1 = new String[]{"Pilih Nilai B1","0", "1"};
    String[] option_b2 = new String[]{"Pilih Nilai B2","0", "1"};
    String[] option_b4 = new String[]{"Pilih Nilai B4","0", "1"};
    String[] option_c1 = new String[]{"Pilih Nilai C1","0", "1"};
    String[] option_c2 = new String[]{"Pilih Nilai C2","0", "1"};
    String[] option_c4 = new String[]{"Pilih Nilai C4","0", "1"};
    Spinner spinner_d2,spinner_d4,spinner_a1,spinner_a2,spinner_a4,spinner_b1,spinner_b2,spinner_b4,spinner_c1,
            spinner_c2,spinner_c4;
    Button btn_proses_mode_c;
    String d2,d4,a1,a2,a4,b1,b2,b4,c1,c2,c4;
    String x_d2,x_d4,x_a1,x_a2,x_a4,x_b1,x_b2,x_b4,x_c1,x_c2,x_c4;
    String xor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_c);
        initComponent();
    }

    public void initComponent(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Simulasi Mode C");

        btn_proses_mode_c = findViewById(R.id.btn_proses_mode_c);
        btn_proses_mode_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (d2.equals("Pilih Nilai D2")){
                    Toast.makeText(ModeCActivity.this, "Silahkan pilih nilai D2 terlebih dahulu", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (d4.equals("Pilih Nilai D4")){
                    Toast.makeText(ModeCActivity.this, "Silahkan pilih nilai D4 terlebih dahulu", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (a1.equals("Pilih Nilai A1")){
                    Toast.makeText(ModeCActivity.this, "Silahkan pilih nilai A1 terlebih dahulu", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (a2.equals("Pilih Nilai A2")){
                    Toast.makeText(ModeCActivity.this, "Silahkan pilih nilai A2 terlebih dahulu", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (a4.equals("Pilih Nilai A4")){
                    Toast.makeText(ModeCActivity.this, "Silahkan pilih nilai A4 terlebih dahulu", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (b1.equals("Pilih Nilai B1")){
                    Toast.makeText(ModeCActivity.this, "Silahkan pilih nilai B1 terlebih dahulu", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (b2.equals("Pilih Nilai B2")){
                    Toast.makeText(ModeCActivity.this, "Silahkan pilih nilai B2 terlebih dahulu", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (b4.equals("Pilih Nilai B4")){
                    Toast.makeText(ModeCActivity.this, "Silahkan pilih nilai B4 terlebih dahulu", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (c1.equals("Pilih Nilai C1")){
                    Toast.makeText(ModeCActivity.this, "Silahkan pilih nilai C1 terlebih dahulu", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (c2.equals("Pilih Nilai C2")){
                    Toast.makeText(ModeCActivity.this, "Silahkan pilih nilai C2 terlebih dahulu", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (c4.equals("Pilih Nilai C4")){
                    Toast.makeText(ModeCActivity.this, "Silahkan pilih nilai C4 terlebih dahulu", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    if (d2.equals("0")){
                        x_d2 = "0";
                    } else {
                        x_d2 = "1";
                    }
                    if (x_d2.equals("0") && d4.equals("0") || x_d2.equals("1") && d4.equals("1")){
                        x_d4 = "0";
                    }
                    showResultSimulation();
                }
            }
        });

        spinner_d2 = findViewById(R.id.spinner_d2);
        ArrayAdapter<String> adapter_d2= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, option_d2);
        spinner_d2.setAdapter(adapter_d2);
        spinner_d2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                d2 = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        spinner_d4 = findViewById(R.id.spinner_d4);
        ArrayAdapter<String> adapter_d4= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, option_d4);
        spinner_d4.setAdapter(adapter_d4);
        spinner_d4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                d4 = (String) parent.getItemAtPosition(position);
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
                a1 = (String) parent.getItemAtPosition(position);
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
                a2 = (String) parent.getItemAtPosition(position);
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
                a4 = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        spinner_b1 = findViewById(R.id.spinner_b1);
        ArrayAdapter<String> adapter_b1= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, option_b1);
        spinner_b1.setAdapter(adapter_b1);
        spinner_b1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                b1 = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        spinner_b2 = findViewById(R.id.spinner_b2);
        ArrayAdapter<String> adapter_b2= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, option_b2);
        spinner_b2.setAdapter(adapter_b2);
        spinner_b2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                b2 = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        spinner_b4 = findViewById(R.id.spinner_b4);
        ArrayAdapter<String> adapter_b4= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, option_b4);
        spinner_b4.setAdapter(adapter_b4);
        spinner_b4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                b4 = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        spinner_c1 = findViewById(R.id.spinner_c1);
        ArrayAdapter<String> adapter_c1= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, option_c1);
        spinner_c1.setAdapter(adapter_c1);
        spinner_c1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                c1 = (String) parent.getItemAtPosition(position);
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
                c2 = (String) parent.getItemAtPosition(position);
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
                c4 = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
    }

    private void showResultSimulation() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); // before
        dialog.setContentView(R.layout.popup_mode_c);
        dialog.setCancelable(false);

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;

        ((ImageButton) dialog.findViewById(R.id.bt_close)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                spinner_d2.setSelection(0);
                spinner_d4.setSelection(0);
                spinner_a1.setSelection(0);
                spinner_a2.setSelection(0);
                spinner_a4.setSelection(0);
                spinner_b1.setSelection(0);
                spinner_b2.setSelection(0);
                spinner_b4.setSelection(0);
                spinner_c1.setSelection(0);
                spinner_c2.setSelection(0);
                spinner_c4.setSelection(0);
            }
        });

        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }

    public String XOR(String A, String B){
        if (A.equals("0") && B.equals("0")){
            xor = "0";
        }
        return xor;
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
