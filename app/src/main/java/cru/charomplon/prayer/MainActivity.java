package cru.charomplon.prayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private ImageView content1IMageView, content2ImageView,
            content3ImageView, content4ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind widget คือการ ผูกความสัมพันธ์ ระหว่างตัวแปร และ Widget ที่อยู่บน Activity
        bindWidget();

        //Image Controller คือการทำให้ รูปภาพที่อยู่บนจอ สามารถคลิกได้
        imageController();

    }   //onCrate นี่เมธอตหลัก เมธาตนี่จะเริ่มต้นการทำงานก่อน


    // เมธอต ตัวนี้จะทำงาน ก็ต่อเมื่อ คลิกรูปภาพ About Me
    public void clickAboutMe(View view) {

        //Intent คือ การเคลื่อนย้ายการทำงาน จาก Activiy หลักไป aboutMeActivity
        Intent objIntent = new Intent(MainActivity.this, AboutMeActivity.class);
        startActivity(objIntent);
    }



    public void clickMenu(View view) {

        Intent objIntent = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(objIntent);

    }


    private void imageController() {

        // content1IMageView.setOnClickListener(this);
        content2ImageView.setOnClickListener(this);
        content3ImageView.setOnClickListener(this);


    }   // imageController

    private void bindWidget() {

        content1IMageView = (ImageView) findViewById(R.id.imageView);
        content2ImageView = (ImageView) findViewById(R.id.imageView2);
        content3ImageView = (ImageView) findViewById(R.id.imageView3);


    }   //bindwidget

    @Override
    public void onClick(View view) {

        int intImage = 0;

        switch (view.getId()) {

            case R.id.imageView2:
                intImage = 1;
                break;
            case R.id.imageView3:
                intImage = 2;
                break;

            default:
                intImage = 0;
                break;




        }   //switch

        //Intent to ListviewActivity
        intentToListView(intImage);

    }   // onClick

    private void intentToListView(int intImage) {

        Intent objIntent = new Intent(MainActivity.this, ListviewActivity.class);
        objIntent.putExtra("index", intImage);
        startActivity(objIntent);


    }   // intent to ListView

}   // minclass
