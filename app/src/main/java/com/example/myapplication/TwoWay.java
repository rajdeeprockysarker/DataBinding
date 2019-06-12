package com.example.myapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class TwoWay extends BaseObservable {

    private String name;

    public TwoWay(String name) {
        this.name = name;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
