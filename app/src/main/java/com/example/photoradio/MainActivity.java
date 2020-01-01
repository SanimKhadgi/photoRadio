package com.example.photoradio;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    RadioButton RadioA,RadioB ,RadioC;
    ImageView ImgV;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioA=findViewById(R.id.radioA);
        radioB=findViewById(R.id.radioB);
        radioC=findViewById(R.id.radioC);
        ImgV=findViewById(R.id.IMGV);
        RadioA.setOnClickListener(this);
        RadioB.setOnClickListener(this);
        RadioC.setOnClickListener(this);
        builder=new AlertDialog.Builder(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.radioA:
                a.png.setimageResouce(R.drawable.a);
                break;

            case R.id.radioB:
                b.png.setimageResouce(R.drawable.b);
                break;

            case R.id.radioC:
                builder.setMessage("Do you want to open the Image Cake").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(ImageViewActivity.this, "The image is shown", Toast.LENGTH_SHORT).show();
                                ivImage.setImageResource(R.drawable.c);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                Toast.makeText(ImageViewActivity.this, "The image was canceld", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog= builder.create();
                dialog.setTitle("Open dialog for Cake");
                dialog.show();
                break;

        }


    }
}
