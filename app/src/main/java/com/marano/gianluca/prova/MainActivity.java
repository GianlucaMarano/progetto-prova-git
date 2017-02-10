package com.marano.gianluca.prova;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;

/**
 * Created by gianl on 08/02/2017.
 */

public class MainActivity extends Activity implements View.OnClickListener {

    Button leggi1Btn, leggi2Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leggi1Btn = (Button) findViewById(R.id.main_leggi1_btn);
        leggi1Btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_leggi1_btn:
                Snackbar.make(findViewById(android.R.id.content), "Scemo chi legge", Snackbar.LENGTH_LONG).show();
                break;
        }
    }
}
