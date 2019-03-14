package com.example.android02.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount;
    TextView mTextVIew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         mTextVIew = findViewById(R.id.textView);
    }

    public void showtoast(View view) {
        Toast toast = Toast.makeText(this,"hello toast",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        mTextVIew.setTextColor(getResources().getColor(R.color.pari));
        if (mCount%2==0) {
            mTextVIew.setTextColor(getResources().getColor(R.color.pari));
            mTextVIew.setText(Integer.toString(mCount));
        }else{
            mTextVIew.setTextColor(getResources().getColor(R.color.dispari));
            mTextVIew.setText(Integer.toString(mCount));
        }
    }

    public void reset(View view) {
        mCount=0;
        mTextVIew.setTextColor(getResources().getColor(R.color.pari));
        mTextVIew.setText(Integer.toString(mCount));
    }
}
