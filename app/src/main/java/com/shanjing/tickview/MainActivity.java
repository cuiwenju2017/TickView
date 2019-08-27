package com.shanjing.tickview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.chengang.library.OnCheckedChangeListener;
import com.github.chengang.library.TickAnimatorListener;
import com.github.chengang.library.TickView;

public class MainActivity extends AppCompatActivity {

    TickView tickView;
    TickView tickViewAccent;
    Button btn_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tickView = findViewById(R.id.tick_view);
        tickViewAccent = findViewById(R.id.tick_view_accent);
        btn_cancel = findViewById(R.id.btn_cancel);

        tickViewAccent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tickViewAccent.setChecked(true);
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tickView.setChecked(false);
                tickViewAccent.setChecked(false);
            }
        });

    }
}
