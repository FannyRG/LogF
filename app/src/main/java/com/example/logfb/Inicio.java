package com.example.logfb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    public void shareContentBtn(View view){//Metodo publico para ejecutar el metodo privado
        shareLinkContent();
    }

    private void shareLinkContent(){
        ShareDialog shareDialog = new ShareDialog(this);//Indicando que el dialogo compartido es desde aqui
        ShareLinkContent shareLinkContent = new ShareLinkContent.Builder()//Construyendo la acción y mandando a llamar el link desde String
                .setContentUrl(Uri.parse(getString(R.string.youtube_url))).build();
        shareDialog.show(shareLinkContent);//Visualizando el resultado
    }

    public void salir(View view){
        Intent intencion = new Intent(this, MainActivity.class);// Pasar a otra pantalla llamada inicio
        startActivity(intencion);
    }
}