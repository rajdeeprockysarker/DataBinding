package com.example.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements OnclickinterfaceforButton{

    ActivityMainBinding activityMainBinding;

    ModelClass modelClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setTest("Simple Variable Text");


        modelClass = new ModelClass("Raaj","Jalpaiguri",5).build();
        activityMainBinding.setModelClassObj(modelClass);


        activityMainBinding.setMainactivity(this);


    }

    @Override
    public void onclick() {
        Toast.makeText(this,"asjdfsdjds",Toast.LENGTH_LONG).show();
    }
}
