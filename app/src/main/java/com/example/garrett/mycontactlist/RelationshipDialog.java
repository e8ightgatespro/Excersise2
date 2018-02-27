package com.example.garrett.mycontactlist;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.select_relationship, container);
        getDialog().setTitle("Select Relationship Status");
        final RadioButton Friend = view.findViewById(R.id.rdbFriend);
        final RadioButton Family = view.findViewById(R.id.rdbFamily);
        final RadioButton Coworker = view.findViewById(R.id.rdbCoworker);
        final RadioButton Acquaintance = view.findViewById(R.id.rdbAcquaintance);
        final RadioGroup radioGroup = view.findViewById(R.id.radioGroup);
        Button OK = view.findViewById(R.id.btnOK);

        OK.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Friend.isChecked()) {
                    saveItem("Friend");
                }
                else if(Family.isChecked()) {
                    saveItem("Family");
                }
                else if (Coworker.isChecked()) {
                    saveItem("Coworker");
                }
                else if (Acquaintance.isChecked()){
                    saveItem("Acquaintance");
                }
            }
        });
        Button Cancel = view.findViewById(R.id.btnCancel);
        Cancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                saveItem("Not Set");
            }
        });

        return view;


    }

    private void saveItem(String Relationship) {
        SaveRelationshipListener activity = (SaveRelationshipListener) getActivity();
        activity.didFinishRelationshipPicker((Relationship));
        getDialog().dismiss();
    }

}