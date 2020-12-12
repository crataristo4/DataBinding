package com.app.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ClickHandler clickHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //set the tool bar
        setSupportActionBar(activityMainBinding.toolbar);

        Contact contact = new Contact("First name: " + "Sam Loko", "Last name: " + "Edwin kroski");
        contact.surName = "Surname: " + "Amoahski";
        activityMainBinding.setContacts(contact);

//handle event listeners
        clickHandler = new ClickHandler(this);
        activityMainBinding.content.setClickHandler(clickHandler);


    }
}
