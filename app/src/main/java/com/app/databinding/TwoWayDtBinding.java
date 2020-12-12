package com.app.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class TwoWayDtBinding extends BaseObservable {
    private int id;
    private String userFirstName, userLastName;

    public TwoWayDtBinding(String userFirstName, String userLastName) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
    }

    @Bindable
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
        notifyPropertyChanged(BR.userFirstName);
    }

    @Bindable
    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
        notifyPropertyChanged(BR.userLastName);
    }
}
