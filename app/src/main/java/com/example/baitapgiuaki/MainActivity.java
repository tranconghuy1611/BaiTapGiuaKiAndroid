package com.example.baitapgiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edTen;
    Spinner spcoso;
    Spinner spmonan;
    Button btndanhgia;
    TextView tvKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edTen = findViewById(R.id.edTen);
        spcoso = findViewById(R.id.spcoso);
        spmonan = findViewById(R.id.spmonan);
        btndanhgia = findViewById(R.id.btndanhgia);

        String[] monan = {"cơm chiên", "hủ tiêu", "bánh mì"};
        String[] Coso = {"quận 1", "quận 2", "quận 2"};
        ArrayAdapter<String> adaptermonan = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, monan);
        ArrayAdapter<String> adaptercoso = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, Coso);
        spmonan.setAdapter(adaptermonan);
        spcoso.setAdapter(adaptercoso);
        btndanhgia.setOnClickListener(v->{
            String ten=edTen.getText().toString().trim();
            String coso=spcoso.getSelectedItem().toString();
            String Monan=spmonan.getSelectedItem().toString();
            Intent intent=new Intent();
            intent.putExtra("ten",ten);
            intent.putExtra("coso",coso);
            intent.putExtra("monan",monan);

        });

    }

}