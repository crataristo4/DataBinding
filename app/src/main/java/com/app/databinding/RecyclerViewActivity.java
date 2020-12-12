package com.app.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.app.databinding.databinding.ActivityRecyclerViewBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    ActivityRecyclerViewBinding activityRecyclerViewBinding;
    UserDetailsAdapter userDetailsAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_recycler_view);

        activityRecyclerViewBinding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);
        setSupportActionBar(activityRecyclerViewBinding.toolbarRecycler);

        //recycler view
        recyclerView = activityRecyclerViewBinding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        userDetailsAdapter = new UserDetailsAdapter(this, prepareList());
        recyclerView.setAdapter(userDetailsAdapter);


    }

    //Method to Add all items to the data
    private List<UsersDetails> prepareList() {

        //copies the names array string to variable names
        List<String> names = Arrays.asList(getResources().getStringArray(R.array.names));

//copies the emails array string to variable emails
        List<String> emails = Arrays.asList(getResources().getStringArray(R.array.email));
//array of images

        int[] images = {R.drawable.phone, R.drawable.dsffd, R.drawable.dsf, R.drawable.cc, R.drawable.bbbb,
                R.drawable.bbb, R.drawable.bb, R.drawable.a, R.drawable.phone, R.drawable.a};

        //counter for items to loop through
        List<UsersDetails> usersDetails = new ArrayList<>();
        int counter = 0;
        for (String name : names) {
            usersDetails.add(new UsersDetails(images[counter], name, emails.get(counter)));

            counter++;
        }

        return  usersDetails;
    }
}
