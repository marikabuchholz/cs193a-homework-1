package com.example.marikabuchholz.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.AbsListView.LayoutParams;


public class Homework1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework1);

    }

    public void onRadioButtonClicked(View view) {

        RadioButton rbHome = (RadioButton) findViewById(R.id.home);
        RadioButton rbSchool = (RadioButton) findViewById(R.id.school);
        RadioButton rbWork = (RadioButton) findViewById(R.id.work);

        if (view.getId() == R.id.home) {
            rbSchool.setChecked(false);
            rbWork.setChecked(false);
            Toast.makeText(this, "Reminder for home!", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.school) {
            rbHome.setChecked(false);
            rbWork.setChecked(false);
            Toast.makeText(this, "Reminder for school!", Toast.LENGTH_SHORT).show();

        } else if (view.getId() == R.id.work) {
            rbHome.setChecked(false);
            rbSchool.setChecked(false);
            Toast.makeText(this, "Reminder for work!", Toast.LENGTH_SHORT).show();

        }
    }


    public void newReminder_click(View view) {
        Toast.makeText(this, "Reminder submitted! Haha, not really.", Toast.LENGTH_LONG).show();
    }

}
