package com.app.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.app.databinding.databinding.ActivityTwoWayDataBindingBinding;

public class TwoWayDataBindingActivity extends AppCompatActivity {

    ActivityTwoWayDataBindingBinding activityTwoWayDataBindingBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_two_way_data_binding);

        activityTwoWayDataBindingBinding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_data_binding);
        //set the tool bar
        setSupportActionBar(activityTwoWayDataBindingBinding.twoWayToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TwoWayDtBinding twoWayDtBinding =
                new TwoWayDtBinding(activityTwoWayDataBindingBinding.editTextFName.getText().toString(),
                        activityTwoWayDataBindingBinding.editTextLastName.getText().toString());

        activityTwoWayDataBindingBinding.setTwoWayDtBinding(twoWayDtBinding);


    }
}
