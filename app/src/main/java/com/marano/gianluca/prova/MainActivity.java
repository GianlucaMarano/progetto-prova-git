package com.marano.gianluca.prova;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by gianl on 08/02/2017.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent (this, LoginActivity.class);
        startActivity(intent);

    }
}
