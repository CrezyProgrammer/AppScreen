package com.masum.appscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button, R.id.button2, R.id.button3, R.id.button4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button:
                startActivity(new Intent(this, Principal.class));
                
                break;
            case R.id.button2:
                startActivity(new Intent(this, Calificaciones.class));
                
                break;
            case R.id.button3:
                startActivity(new Intent(this, TabActivity.class));
                
                break;
            case R.id.button4:
                startActivity(new Intent(this, Deberes.class));
                
                break;
        }
    }
}
