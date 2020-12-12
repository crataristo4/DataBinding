package com.app.databinding;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class ClickHandler {
 private Context context;

    ClickHandler(Context context) {
        this.context = context;
    }

    //simple click
    public void onButtonClicked(View view){
        Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show();
    }

    //long click
    public boolean onLongClickPressed(View view){
        Toast.makeText(context, "Long click pressed", Toast.LENGTH_SHORT).show();
        return false;
    }

    //button click with parameter
    public void onButtonClickedWithParam(View view,Contact contact){
        Toast.makeText(context, "Button is clicked with data\n"+
                        ":>> " + contact.firstName + "\n"+
                        ":>> " + contact.otherName + "\n"
                        +":>> " + contact.surName + "\n"

                , Toast.LENGTH_LONG).show();
    }


    public void gotoUpdateUI(View view) {
        context.startActivity(new Intent(context,UpdateUIActivity.class));
    }

    public void gotoRecyclerView(View view) {
        context.startActivity(new Intent(context,RecyclerViewActivity.class));
    }
    public void gotoTwoWayBingding(View view) {
        context.startActivity(new Intent(context,TwoWayDataBindingActivity.class));
    }

}
