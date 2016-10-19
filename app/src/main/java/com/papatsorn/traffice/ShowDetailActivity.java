package com.papatsorn.traffice;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetailActivity extends AppCompatActivity {

    //Explicic
    private TextView showTitleTextViwe, showDetailTextView;
    private ImageView showTrafficImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        //Bind Widget
        bindWidget();

        //Shoe Widget
        showWidget();
    } //onCreate
    private void bindWidget(){
        showTitleTextViwe = (TextView) findViewById(R.id.txtTitleDetail);
        showDetailTextView = (TextView) findViewById(R.id.txtDetail);
        showTrafficImageView = (ImageView) findViewById(R.id.imvTrafficDetail);
    }//bindWidget
    private void showWidget(){

        //Receive from Intent
        int intClick = getIntent().getIntExtra("click",0);

        //show Title
        Mydata objMydata = new Mydata();
        String[] strTitle = objMydata.title();
        showTitleTextViwe.setText(strTitle[intClick]);

        //Show Traffic Image
        int[] intDrawable = objMydata.icon();
        showTrafficImageView.setImageResource(intDrawable[intClick]);

        //show Detail
        String[] strDetail = getResources().getStringArray(R.array.traffic_detail);
        showDetailTextView.setText(strDetail[intClick]);
    }//Show Widget
}
