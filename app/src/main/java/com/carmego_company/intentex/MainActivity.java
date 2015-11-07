package com.carmego_company.intentex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onCamera(View v){
        Intent tomarFoto= new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(tomarFoto);
    }

    public void onGallery(View v){
        Intent irGaleria= new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivity(irGaleria);
    }

    public void onEmail(View v){
        Intent email= new Intent(Intent.ACTION_SEND);
        email.setType("text/plain");
        email.putExtra(Intent.EXTRA_SUBJECT, "Ensayo Correo");
        email.putExtra(Intent.EXTRA_TEXT, "Carlos Medina enviò un mensaje de prueba");
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"carmego11@hotmail.com"});
        startActivity(email);
    }

    public void onWeb(View v){
        Intent web= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uao.edu.co/"));
        startActivity(web);
    }

    public void onCall(View v){
        Intent call= new Intent(Intent.ACTION_CALL, Uri.parse("tel:3175152265"));
        startActivity(call);
    }

    public void onMaps(View v){
        Intent maps= new Intent(Intent.ACTION_VIEW, Uri.parse("geo:3.3540418, -76.5219433"));
        startActivity(maps);
    }





}
