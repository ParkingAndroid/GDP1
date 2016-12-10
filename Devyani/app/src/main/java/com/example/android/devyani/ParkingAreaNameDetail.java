package com.example.android.devyani;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ParkingAreaNameDetail extends AppCompatActivity {


    TextView countValueTextView;
    TextView areaTextView;
    Button parkButton;
    Button vaccantButton;
    Button logoutButton;
    int fixValue;
    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_area_name_detail);

        countValueTextView = (TextView) findViewById(R.id.countValueTextView);
        areaTextView = (TextView) findViewById(R.id.areaTextView);
        parkButton = (Button) findViewById (R.id.parkButton);
        vaccantButton = (Button) findViewById(R.id.vaccantButton);
        logoutButton =(Button)findViewById(R.id.logoutButton);

        fixValue = Integer.parseInt(countValueTextView.getText().toString());

        Intent intent = getIntent();
        int result = intent.getIntExtra("area",0);

        switch (result)
        {
            case 0: areaTextView.setText("McKemy ");
                countValueTextView.setText("50");
                break;

            case 1: areaTextView.setText("Colden Hall");
                countValueTextView.setText("38");
                break;

            case 2: areaTextView.setText("Station");
                countValueTextView.setText("50");
                break;

            case 3: areaTextView.setText("B.D. Owens");
                countValueTextView.setText("78");
                break;

            case 4: areaTextView.setText("Admin Bldg");
                countValueTextView.setText("27");
                break;

        }

    }
    //int fixValue = Integer.parseInt(countValueTextView.getText().toString());
    public void parkAdd(View v)
    {
         value = Integer.parseInt(countValueTextView.getText().toString());

        System.out.println("zzzValue: " + value);
        System.out.println("zzzfixValue" + fixValue);
            if (value == (fixValue))
            {
                System.out.println("zzzValue1: " + value);
                value = value - 1;
                String countString = Integer.toString(value);
                countValueTextView.setText(countString);
           }


    }
    public void vaccantMinus(View v)
    {
       // value = Integer.parseInt(countValueTextView.getText().toString());
        //int fixValue = Integer.parseInt(countValueTextView.getText().toString());
        System.out.println("aaaValue  & fix" + value + "  " + fixValue);
      if (value == (fixValue-1))
        {
            value = value + 1;
            String countString = Integer.toString(value);
            countValueTextView.setText(countString);
        }



    }
    public void logoutMethod(View v)
    {
        Intent intent = new Intent(ParkingAreaNameDetail.this, MainActivity.class);
        startActivity(intent);
    }
}
