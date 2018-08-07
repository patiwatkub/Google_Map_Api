package com.example.inkza.google_map_api;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ToiletAdd extends AppCompatActivity {
    Button mButton;
    TextView mTextView1,mTextView2,mTextView3,mTextView4,mTextView5,mTextView6,mTextView7,mTextView8,mTextView9,mTextView10,mTextView11;
    CheckBox mCheckBox1,mCheckBox2,mCheckBox3,mCheckBox4,mCheckBox5,mCheckBox6,mCheckBox7,mCheckBox8,mCheckBox9,mCheckBox10,mCheckBox11;
    private Spinner mThaiSpinner;
    private ArrayList<String> mThaiClub = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet_add);

        mThaiSpinner = (Spinner) findViewById(R.id.thai_club);
        createThaiClubData();
        ArrayAdapter<String> adapterThai = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, mThaiClub);
        mThaiSpinner.setAdapter(adapterThai);


        mTextView1=(TextView) findViewById( R.id.TV1);
            mCheckBox1= ( CheckBox ) findViewById( R.id.checkBox1);
            mCheckBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
            {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
                {
                    if ( isChecked )
                    {
                        mTextView1.setEnabled(true);

                    }else{
                        mTextView1.setEnabled(false);
                    }

                }
            });

        mTextView2=(TextView) findViewById( R.id.TV2);
        mCheckBox2= ( CheckBox ) findViewById( R.id.checkBox2);
        mCheckBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    mTextView2.setEnabled(true);

                }else{
                    mTextView2.setEnabled(false);
                }

            }
        });

        mTextView3=(TextView) findViewById( R.id.TV3);
        mCheckBox3= ( CheckBox ) findViewById( R.id.checkBox3);
        mCheckBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    mTextView3.setEnabled(true);

                }else{
                    mTextView3.setEnabled(false);
                }

            }
        });

        mTextView4=(TextView) findViewById( R.id.TV4);
        mCheckBox4= ( CheckBox ) findViewById( R.id.checkBox4);
        mCheckBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    mTextView4.setEnabled(true);

                }else{
                    mTextView4.setEnabled(false);
                }

            }
        });



        mTextView5=(TextView) findViewById( R.id.TV5);
        mCheckBox5= ( CheckBox ) findViewById( R.id.checkBox5);
        mCheckBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    mTextView5.setEnabled(true);

                }else{
                    mTextView5.setEnabled(false);
                }

            }
        });

        mTextView6=(TextView) findViewById( R.id.TV6);
        mCheckBox6= ( CheckBox ) findViewById( R.id.checkBox6);
        mCheckBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    mTextView6.setEnabled(true);

                }else{
                    mTextView6.setEnabled(false);
                }

            }
        });


        mTextView7=(TextView) findViewById( R.id.TV7);
        mCheckBox7= ( CheckBox ) findViewById( R.id.checkBox7);
        mCheckBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    mTextView7.setEnabled(true);

                }else{
                    mTextView7.setEnabled(false);
                }

            }
        });

        mTextView8=(TextView) findViewById( R.id.TV8);
        mCheckBox8= ( CheckBox ) findViewById( R.id.checkBox8);
        mCheckBox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    mTextView8.setEnabled(true);

                }else{
                    mTextView8.setEnabled(false);
                }

            }
        });

        mTextView9=(TextView) findViewById( R.id.TV9);
        mCheckBox9= ( CheckBox ) findViewById( R.id.checkBox9);
        mCheckBox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    mTextView9.setEnabled(true);

                }else{
                    mTextView9.setEnabled(false);
                }

            }
        });
        mTextView10=(TextView) findViewById( R.id.TV10);
        mCheckBox10= ( CheckBox ) findViewById( R.id.checkBox10);
        mCheckBox10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    mTextView10.setEnabled(true);

                }else{
                    mTextView10.setEnabled(false);
                }

            }
        });

        mTextView11=(TextView) findViewById( R.id.TV11);
        mCheckBox11= ( CheckBox ) findViewById( R.id.checkBox11);
        mCheckBox11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    mTextView11.setEnabled(true);

                }else{
                    mTextView11.setEnabled(false);
                }

            }
        });







    }
    private void createThaiClubData() {

        mThaiClub.add("สุขารวมรวม");
        mThaiClub.add("สุขาชาย");
        mThaiClub.add("สุขาหญิงหญิง");


    }
}
