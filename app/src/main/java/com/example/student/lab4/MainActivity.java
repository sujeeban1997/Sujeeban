package com.example.student.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.student.lab4.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //context context = getApplicationContext ();
        //CharSequence text = "Hello toast!";
       // int duration  =  Toast.LENGTH_SHORT;

        //Toast toast = Toast.makeText(context, text, duration);
        //toast.setGravity(Gravity.TOPGravity.LEFT, xOffset: 0, yOffest: 0);
        //toast.show();

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate( R.layout.cus_toast,(ViewGroup)findViewById(R.id.custom_toast_container));

        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("This is a custom toast");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
        hhh
    }
}
