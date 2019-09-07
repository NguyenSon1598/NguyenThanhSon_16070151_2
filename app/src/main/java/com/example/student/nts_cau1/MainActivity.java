package com.example.student.nts_cau1;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ettaikhoan, etmatkhau;
    CheckBox cbluuthongtin;
    Button btndangnhap;
    TextView tvketqua;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ettaikhoan = (EditText) findViewById(R.id.ettaikhoan);
        etmatkhau = (EditText) findViewById(R.id.etmatkhau);
        cbluuthongtin = (CheckBox) findViewById(R.id.cbluuthongtin);
        btndangnhap = (Button) findViewById(R.id.btndangnhap);
        tvketqua = (TextView)findViewById(R.id.tvketqua);
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbluuthongtin.isChecked())
                    tvketqua.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                else
                    tvketqua.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
            }
        });

    }
}
