package com.app.databinding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.v4.content.ContextCompat;

import de.hdodenhof.circleimageview.CircleImageView;

public class UsersDetails {
    public int image;
    public String name, email;

    UsersDetails(int image, String name, String email) {
        this.image = image;
        this.name = name;
        this.email = email;
    }

    @BindingAdapter("imageProfileUrl")
    public static void loadImages(CircleImageView view, int image) {

        Context context = view.getContext();

        //CircleImageView imageView = (CircleImageView) view;
        view.setImageDrawable(ContextCompat.getDrawable(context, image));

    }

}
