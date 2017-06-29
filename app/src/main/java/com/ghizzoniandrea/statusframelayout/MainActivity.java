package com.ghizzoniandrea.statusframelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ghizzoniandrea.statusframelayout.lib.StatusFrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnShowLoading;
    private Button btnShowContent;
    private Button btnShowError;
    private Button btnShowEmpty;
    private Button btnShowCustom;
    private StatusFrameLayout statusLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowLoading = (Button) findViewById(R.id.btn_show_loading);
        btnShowContent = (Button) findViewById(R.id.btn_show_content);
        btnShowError = (Button) findViewById(R.id.btn_show_error);
        btnShowEmpty = (Button) findViewById(R.id.btn_show_empty);
        btnShowCustom = (Button) findViewById(R.id.btn_show_custom);
        statusLayout = (StatusFrameLayout) findViewById(R.id.status_layout);

        btnShowLoading.setOnClickListener(this);
        btnShowContent.setOnClickListener(this);
        btnShowError.setOnClickListener(this);
        btnShowEmpty.setOnClickListener(this);
        btnShowCustom.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_show_loading:
                statusLayout.showLoading();
                break;
            case R.id.btn_show_content:
                statusLayout.showContent();
                break;
            case R.id.btn_show_error:
                statusLayout.showError("出错啦~", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "点击了", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case R.id.btn_show_empty:
                statusLayout.showEmpty();
                break;
            case R.id.btn_show_custom:
//                statusLayout.showCustom();
                break;
            default:
                break;
        }
    }
}
