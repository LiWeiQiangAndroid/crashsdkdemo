package com.lwq.crashsdkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by： liwq.
 * Created Time: 2020/4/19
 * Description：测试崩溃
 */
public class SecondActivity extends AppCompatActivity {

    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //测试崩溃
        mTextView = findViewById(R.id.bt_crash);
        mTextView.setText(0);

    }
}
