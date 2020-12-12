package com.app.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.app.databinding.databinding.LayoutUsersDetailsBinding;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsAdapter extends RecyclerView.Adapter<UserDetailsAdapter.UserViewHolder> {
    private List<UsersDetails> usersArrayList = new ArrayList<>();
    private Context context;
//    // sparse boolean array for checking the state of the items
//    private SparseBooleanArray itemStateArray= new SparseBooleanArray();

    public UserDetailsAdapter() {
    }

    public UserDetailsAdapter(Context context, List<UsersDetails> usersArrayList) {
        this.usersArrayList = usersArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutUsersDetailsBinding layoutUsersDetailsBinding = DataBindingUtil.inflate
                (LayoutInflater.from(viewGroup.getContext()),
                R.layout.layout_users_details, viewGroup, false);

        return new UserViewHolder(layoutUsersDetailsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int position) {

        UsersDetails usersDetails = usersArrayList.get(position);
        userViewHolder.layoutUsersDetailsBinding.setUsersDetails(usersDetails);


    }

    @Override
    public int getItemCount() {
        return usersArrayList.size();
    }


    class UserViewHolder extends RecyclerView.ViewHolder {

        LayoutUsersDetailsBinding layoutUsersDetailsBinding;

        UserViewHolder(@NonNull LayoutUsersDetailsBinding itemView) {
            super(itemView.getRoot());

            layoutUsersDetailsBinding = itemView;


        }


    }

}
