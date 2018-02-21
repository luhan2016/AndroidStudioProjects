package com.example.luhan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupUI();
    }

    private void setupUI(){
        setContentView(R.layout.activity_main);
        mTextView = (TextView)findViewById(R.id.textView);
    }

    private final static String LOG_TAG = MainActivity.class.getSimpleName();

    public void buttonPressed(View view){
        Log.i(LOG_TAG, "buttonPressed(View) called");

        String stringValue = "Hello World!";

        mTextView.setText(StringVlaue);

        Log.v(LOG_TAG,"text change to:", stringValue);

        log.d(LOG_TAG, "buttonPresssed(View) finished");
    }
}
