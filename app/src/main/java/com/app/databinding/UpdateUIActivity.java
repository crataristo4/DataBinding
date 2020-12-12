package com.app.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.app.databinding.databinding.ActivityUpdateUiBinding;

public class UpdateUIActivity extends AppCompatActivity {
    public static Users users;
    private UpdateUIClickHandler updateUIClickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_update_ui);

        ActivityUpdateUiBinding updateUiBinding = DataBindingUtil.setContentView(this, R.layout.activity_update_ui);
        setSupportActionBar(updateUiBinding .toolbarUpdateUI);
        // Users users = new Users(getString(R.string.fnameIs) + " Kofi", getString(R.string.lnameIs) + " Amoah");

        users = new Users();
        users.setFirstName(getString(R.string.fnameIs) + " Kofi");
        users.setLastName(getString(R.string.lnameIs) + " Amoah");
        updateUiBinding.setUsers(users);

        updateUIClickHandler = new UpdateUIClickHandler(updateUiBinding.edtFname, updateUiBinding.edtLname);
        updateUiBinding.setUpdateViews(updateUIClickHandler);


    }


}
