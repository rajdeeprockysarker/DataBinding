package com.example.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements OnclickinterfaceforButton{

    ActivityMainBinding activityMainBinding;

    ModelClass modelClass;

    String EdittextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setTest("Simple Variable Text");

        activityMainBinding.idSimpleSet.setText("Without create FindVieById");


        modelClass = new ModelClass("Raaj","Jalpaiguri",5).build();
        activityMainBinding.setModelClassObj(modelClass);


        activityMainBinding.setMainactivity(this);


    }

    @Override
    public void onclick() {
        Toast.makeText(this,"asjdfsdjds",Toast.LENGTH_LONG).show();
    }

    public void afterUserNameChange(CharSequence s)
    {
        //Log.i("truc", s.toString());
        this.EdittextName = s.toString();
        Log.i("truc", EdittextName);
    }

}
