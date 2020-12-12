package com.app.databinding;

import android.view.View;
import android.widget.EditText;

public class UpdateUIClickHandler {

    private EditText fName, lName;


    UpdateUIClickHandler(EditText fName, EditText lName) {
        this.fName = fName;
        this.lName = lName;


    }

    public void updateUIComponents(View view) {
        String fname = fName.getText().toString();
        String lname = lName.getText().toString();

        if (!fname.isEmpty() && !lname.isEmpty()) {

            UpdateUIActivity.users.setFirstName("First name updated is> " + fName.getText().toString());
            UpdateUIActivity.users.setLastName("Last name updated is> " + lName.getText().toString());
            //reset edit text
            fName.getText().clear();
            lName.getText().clear();
        } else {
            fName.setEnabled(true);
            fName.setError("first name cannot be empty");
            lName.setEnabled(true);
            lName.setError("last name cannot be empty");

        }


        if (fname.isEmpty()) {
            fName.setEnabled(true);
            fName.setError("first name cannot be empty");

        } else if (lname.isEmpty()) {
            lName.setEnabled(true);
            lName.setError("last name cannot be empty");

        }


    }

}

