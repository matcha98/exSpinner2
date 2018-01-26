package com.wanna.exspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputStream is = getResources().openRawResource(R.raw.mydata);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder sb = new StringBuilder();
        String str;
        try {
            str = br.readLine();
            sb.append(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            while((str = br.readLine()) !=null)
//            {
//                sb.append(str);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String str1 = sb.toString();
        HashMap<String,Object> m1=new HashMap<>();
        m1.put(str1.concat("CityName"),"台北");
        Log.d("NET",str1);

    }
}
