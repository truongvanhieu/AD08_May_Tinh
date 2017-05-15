package com.android.hkh.ad08_may_tinh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;//step 1
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private TextView tv_diplay = null;
    private Button btn_so0, btn_so1, btn_so2, btn_so3, btn_so4, btn_so5, btn_so6, btn_so7, btn_so8, btn_so9;
    private Button btn_cong, btn_tru, btn_nhan, btn_chia, btn_delete, btn_cleanall, btn_bang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_diplay = (TextView) findViewById(R.id.tv_display);
        btn_so0 = (Button) findViewById(R.id.btn_so0);
        btn_so1 = (Button) findViewById(R.id.btn_so1);
        btn_so2 = (Button) findViewById(R.id.btn_so2);
        btn_so3 = (Button) findViewById(R.id.btn_so3);
        btn_so4 = (Button) findViewById(R.id.btn_so4);
        btn_so5 = (Button) findViewById(R.id.btn_so5);
        btn_so6 = (Button) findViewById(R.id.btn_so6);
        btn_so7 = (Button) findViewById(R.id.btn_so7);
        btn_so8 = (Button) findViewById(R.id.btn_so8);
        btn_so9 = (Button) findViewById(R.id.btn_so9);

        btn_cong = (Button) findViewById(R.id.btn_cong);
        btn_tru = (Button) findViewById(R.id.btn_tru);
        btn_nhan = (Button) findViewById(R.id.btn_nhan);
        btn_chia = (Button) findViewById(R.id.btn_chia);

        btn_delete = (Button) findViewById(R.id.btn_delete);
        btn_cleanall = (Button) findViewById(R.id.btn_clean_all);
        btn_bang = (Button) findViewById(R.id.btn_bang);
        //Đăng ký listner for button
        btn_so0.setOnClickListener(this);
        btn_so1.setOnClickListener(this);
        btn_so2.setOnClickListener(this);
        btn_so3.setOnClickListener(this);
        btn_so4.setOnClickListener(this);
        btn_so5.setOnClickListener(this);
        btn_so6.setOnClickListener(this);
        btn_so7.setOnClickListener(this);
        btn_so8.setOnClickListener(this);
        btn_so9.setOnClickListener(this);

        btn_cong.setOnClickListener(this);
        btn_tru.setOnClickListener(this);
        btn_nhan.setOnClickListener(this);
        btn_chia.setOnClickListener(this);
        btn_delete.setOnClickListener(this);
        btn_cleanall.setOnClickListener(this);
        btn_bang.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_so0:
                tv_diplay.setText(tv_diplay.getText().toString() +btn_so0.getText().toString());
                break;
            case R.id.btn_so1:
                tv_diplay.setText(tv_diplay.getText().toString() +btn_so1.getText().toString());
                break;
            case R.id.btn_so2:
                tv_diplay.setText(tv_diplay.getText().toString() +btn_so2.getText().toString());
                break;
            case R.id.btn_so3:
                tv_diplay.setText(tv_diplay.getText().toString() +btn_so3.getText().toString());
                break;
            case R.id.btn_so4:
                tv_diplay.setText(tv_diplay.getText().toString() +btn_so4.getText().toString());
                break;
            case R.id.btn_so5:
                tv_diplay.setText(tv_diplay.getText().toString() +btn_so5.getText().toString());
                break;
            case R.id.btn_so6:
                tv_diplay.setText(tv_diplay.getText().toString() +btn_so6.getText().toString());
                break;
            case R.id.btn_so7:
                tv_diplay.setText(tv_diplay.getText().toString() +btn_so7.getText().toString());
                break;
            case R.id.btn_so8:
                tv_diplay.setText(tv_diplay.getText().toString() +btn_so8.getText().toString());
                break;
            case R.id.btn_so9:
                tv_diplay.setText(tv_diplay.getText().toString() +btn_so9.getText().toString());
                break;
            case R.id.btn_chia:
                //tv_diplay.setText(tv_diplay.getText().toString() +btn_so0.getText().toString());
                break;
            case R.id.btn_cong:
                tv_diplay.setText(tv_diplay.getText().toString() +btn_cong.getText().toString());
                break;
            case R.id.btn_tru:
                tv_diplay.setText(tv_diplay.getText().toString() +btn_tru.getText().toString());
                break;
            case R.id.btn_nhan:
                break;
            case R.id.btn_delete:
                String str = tv_diplay.getText().toString();
                str = str.substring(0, str.length()-2);
                tv_diplay.setText(str);
                break;
            case R.id.btn_clean_all:
                tv_diplay.setText("");
                break;
            case R.id.btn_bang:
                break;
        }
    }
}
