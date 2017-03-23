package com.example.administrator.cycleviewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_shouye);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.button_saoyisao, R.id.button_fenxiang, R.id.button_fankui ,R.id.button_yingxiao})
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button_saoyisao:

                Intent intentsys = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intentsys);
                break;

            case R.id.button_fenxiang:

                Intent intentfx = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intentfx);
                break;

            case R.id.button_fankui:

                Intent intentfk = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(intentfk);
                break;

            case R.id.button_yingxiao:

                Intent intentyx = new Intent(MainActivity.this, FifthActivity.class);
                startActivity(intentyx);
                break;

            default:
                break;

        }

    }
}
