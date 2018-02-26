package com.example.garrett.mycontactlist;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RelationshipDialog extends DialogFragment {

    public interface SaveRelationshipListener {
        void didFinishRelationshipPicker(String relationship);
    }

    public RelationshipDialog() {
        //empty constructor
    }

    @Override
    public View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.select_relationship, container);
        getDialog().setTitle("Select Relationship Status");
        RadioButton Friend = view.findViewById(R.id.rdbFriend);
        RadioButton Family = view.findViewById(R.id.rdbFamily);
        RadioButton Coworker = view.findViewById(R.id.rdbCoworker);
        RadioButton Acquaintance = view.findViewById(R.id.rdbAcquaintance);
        RadioGroup radioGroup = view.findViewById(R.id.radioGroup);
        Button OK = view.findViewById(R.id.btnOK);

        OK.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button Cancel = view.findViewById(R.id.btnCancel);


    }

}