package com.genius.thirdeye_lll.databasethreetables;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.genius.thirdeye_lll.databasethreetables.database.DbHelper;
import com.genius.thirdeye_lll.databasethreetables.database.DbManager;
import com.genius.thirdeye_lll.databasethreetables.module.Student;

public class MainActivity extends AppCompatActivity {

    EditText eName,eDes,eGmail,ePhone,eId,eDepartment;
    Button save,show;

    SQLiteDatabase sql;
    DbManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = eName.getText().toString();
                String des = eDes.getText().toString();
                String email = eGmail.getText().toString();
                String phone = ePhone.getText().toString();
                String id = eId.getText().toString();
                String department = eDepartment.getText().toString();

                Student std = new Student(name,des,email,phone,id,department);
                manager.addDataToTableOne(std);
                manager.addDataToTableTwo(std);
                manager.addDataToTableThree(std);
                Toast.makeText(MainActivity.this, "Successfully!!!!!", Toast.LENGTH_SHORT).show();
            }
        });


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ShowData.class));
            }
        });

    }



    private void findView(){

        manager = new DbManager(new DbHelper(getApplicationContext()));
        eName = (EditText) findViewById(R.id.ed_name);
        eDes = (EditText) findViewById(R.id.ed_des);
        eGmail = (EditText) findViewById(R.id.ed_email);
        ePhone = (EditText) findViewById(R.id.ed_phone);
        eId = (EditText) findViewById(R.id.ed_id);
        eDepartment = (EditText) findViewById(R.id.ed_department);

        save = (Button) findViewById(R.id.save);
        show = (Button) findViewById(R.id.show);

    }
}
