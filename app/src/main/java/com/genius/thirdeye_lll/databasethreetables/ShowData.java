package com.genius.thirdeye_lll.databasethreetables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.genius.thirdeye_lll.databasethreetables.database.DbHelper;
import com.genius.thirdeye_lll.databasethreetables.database.DbManager;

public class ShowData extends AppCompatActivity {


    DbManager dbManager;
    String[] data1;
    String[] data2;
    String[] data3;
    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        dbManager = new DbManager(new DbHelper(getApplicationContext()));
        tv1= (TextView) findViewById(R.id.ouptput1);
        tv2 = (TextView) findViewById(R.id.ouptput2);
        tv3 = (TextView) findViewById(R.id.ouptput3);

        data1 = dbManager.getTableOneData();
        data2 = dbManager.getTableTwoData();
        data3 = dbManager.getTableThreeData();

        fetchTableOne();
        fetchTableTwo();
        fetchTableThree();





    }


    private void fetchTableOne(){
        String s = "";
        for (int i=0; i<data1.length; i++){
            s = s+data1[i];

        }
        tv1.setText(s);
    }

    private void fetchTableTwo(){
        String s = "";
        for (int i=0; i<data2.length; i++){
            s = s+data2[i];

        }
        tv2.setText(s);

    }

    private void fetchTableThree(){
        String s = "";

        for (int i=0; i<data3.length; i++){
            s = s+data3[i];

        }
        tv3.setText(s);
    }
}
