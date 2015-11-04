package cru.charomplon.prayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    //Explicit
    private TextView titlTextView, detaTextView;
    private ImageView iconImageView;
    private int modeAnInt, positionAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //Bind Widget
        bindwidget();

        //Show View
        showView();

    }   // onCreate

    public void clickListView(View view) {
        finish();
    }

    public void clickHome(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    private void showView() {

        //Receive from Intent
        modeAnInt = getIntent().getIntExtra("Mode",0);
        positionAnInt = getIntent().getIntExtra("Position", 0);


        //Show Title
        String strTinle;
        String[] strDetail = null;


        switch (modeAnInt) {
            case 0:
                strTinle = getResources().getString(R.string.content1);
                strDetail = getResources().getStringArray(R.array.contentldescription);
                break;
            case 1:
                strTinle = getResources().getString(R.string.content2);
                strDetail = getResources().getStringArray(R.array.content_content2);
                break;
            case 2:
                strTinle = getResources().getString(R.string.content3);
                strDetail = getResources().getStringArray(R.array.content_content3);
                break;
            case 4:
                strTinle = getResources().getString(R.string.content4);
                strDetail = getResources().getStringArray(R.array.content_content4);
                break;
            case 5:
                strTinle = getResources().getString(R.string.content5);
                strDetail = getResources().getStringArray(R.array.content_content5);
                break;
            case 6:
                strTinle = getResources().getString(R.string.content6);
                strDetail = getResources().getStringArray(R.array.content_content6);
                break;
            case 7:
                strTinle = getResources().getString(R.string.content7);
                strDetail = getResources().getStringArray(R.array.content_content7);
                break;
            case 8:
                strTinle = getResources().getString(R.string.content8);
                strDetail = getResources().getStringArray(R.array.content_content8);
                break;
            default:
                strTinle = getResources().getString(R.string.content8);
                strDetail = getResources().getStringArray(R.array.content_content8);
                break;
        }   // switch

        titlTextView.setText(strTinle);

        //show Datail
        detaTextView.setText(strDetail[positionAnInt]);




    }   // showView

    private void bindwidget() {
        titlTextView = (TextView) findViewById(R.id.txtReaultTitle);
        detaTextView = (TextView) findViewById(R.id.txtResulrDetail);

    }

}   // Main Class
