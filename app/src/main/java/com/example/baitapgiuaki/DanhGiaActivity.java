package com.example.baitapgiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DanhGiaActivity  extends AppCompatActivity {
    TextView tvtt;
    RatingBar sao;
    EditText eddanhgia;
    Button btnxacnhan;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhgia);
        tvtt=findViewById(R.id.tvTieuDe);
        sao=findViewById(R.id.sao);
        eddanhgia=findViewById(R.id.edDanhGia);
        btnxacnhan=findViewById(R.id.btnXacNhan);
        Intent intent=getIntent();
        String ten=intent.getStringExtra("ten");
        String coso=intent.getStringExtra("coso");
        String mon=intent.getStringExtra("monan");
        tvtt.setText("ten:"+ten+"co so"+coso+"mon an"+mon);
        btnxacnhan.setOnClickListener(v->{});
        int s=(int) sao.getRating();
        String dg=eddanhgia.getText().toString();
        Intent result=new Intent();
        result.putExtra("ten",ten);
        result.putExtra("coso",coso);
        result.putExtra("monan",mon);
        setResult(RESULT_OK,result);

    }
}
