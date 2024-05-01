package com.example.postermakerapplication;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.opengl.Visibility;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class PostEditActivity extends AppCompatActivity {

    ImageView editPageImage;
    LinearLayout editingInformationBtn,editingFontStyleBtn,editingFontColorBtn,editingFontSizeBtn;
    TextView txtImageCompanyName,txtImageWebsite,txtImagePhone;
    TextInputEditText infoCompanyEdt,infoWebsiteEdt,infoPhoneEdt;
    Button generateBtn,dialogDoneBtn;
    TextInputLayout infoCompanyLayout,infoWebsiteLayout,infoPhoneLayout;
    LinearLayout rubikMediumLayout,libreFranklinMediumLayout,loraMediumLayout,merriWeatherRegulerLayout,josefinsansRegulerLayout,cormorantuprightBoldLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_edit);

        initBinding();

        Intent intent1 = getIntent();

        int e_one = intent1.getIntExtra("ek",0);

        editPageImage.setImageResource(e_one);

        editingInformationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialogInfo();
            }
        });
        editingFontStyleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog2();
            }
        });
        editingFontColorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog3();
            }
        });
        editingFontSizeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    void initBinding()
    {
        generateBtn=findViewById(R.id.generateBtn);
        editPageImage=findViewById(R.id.editPageImage);
        editingInformationBtn=findViewById(R.id.editingInformationBtn);
        editingFontStyleBtn=findViewById(R.id.editingFontStyleBtn);
        editingFontColorBtn=findViewById(R.id.editingFontColorBtn);
        editingFontSizeBtn=findViewById(R.id.editingFontSizeBtn);
    }
    void dialogInfo()
    {
        Dialog dialog = new Dialog(PostEditActivity.this);
        dialog.setContentView(R.layout.info_dialog);
        dialog.show();

        infoCompanyLayout=dialog.findViewById(R.id.infoCompanyLayout);
        infoWebsiteLayout=dialog.findViewById(R.id.infoWebsiteLayout);
        infoPhoneLayout=dialog.findViewById(R.id.infoPhoneLayout);
        infoCompanyEdt=dialog.findViewById(R.id.infoCompanyEdt);
        infoWebsiteEdt=dialog.findViewById(R.id.infoWebsiteEdt);
        infoPhoneEdt=dialog.findViewById(R.id.infoPhoneEdt);
        dialogDoneBtn=dialog.findViewById(R.id.dialogDoneBtn);

        txtImageCompanyName=findViewById(R.id.txtImageCompanyName);
        txtImageWebsite=findViewById(R.id.txtImageWebsite);
        txtImagePhone=findViewById(R.id.txtImagePhone);

        dialogDoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String company=infoCompanyEdt.getText().toString();
                String web=infoWebsiteEdt.getText().toString();
                String phone=infoPhoneEdt.getText().toString();

                if(company.isEmpty())
                {
                    infoCompanyLayout.setErrorEnabled(true);
                    infoCompanyLayout.setError("Company Name Required !");
                }
                else if (web.isEmpty())
                {
                    infoWebsiteLayout.setErrorEnabled(true);
                    infoWebsiteLayout.setError("Website Is Required !");
                }
                else if(phone.isEmpty())
                {
                    infoPhoneLayout.setErrorEnabled(true);
                    infoPhoneLayout.setError("Phone No Is Required !");
                }
                else
                {
                    infoCompanyLayout.setErrorEnabled(false);
                    infoWebsiteLayout.setErrorEnabled(false);
                    infoPhoneLayout.setErrorEnabled(false);
                    dialog.dismiss();

                    txtImageCompanyName.setText(company);
                    txtImageCompanyName.setVisibility(View.VISIBLE);
                    txtImageWebsite.setText(web);
                    txtImageWebsite.setVisibility(View.VISIBLE);
                    txtImagePhone.setText(phone);
                    txtImagePhone.setVisibility(View.VISIBLE);

                }
            }
        });


    }
    void dialog2()
    {
        Dialog dialog_two = new Dialog(PostEditActivity.this);
        dialog_two.setContentView(R.layout.font_style_dialog);
        dialog_two.show();

        rubikMediumLayout=dialog_two.findViewById(R.id.rubikMediumLayout);
        libreFranklinMediumLayout=dialog_two.findViewById(R.id.libreFranklinMediumLayout);
        loraMediumLayout=dialog_two.findViewById(R.id.loraMediumLayout);
        merriWeatherRegulerLayout=dialog_two.findViewById(R.id.merriWeatherRegulerLayout);
        josefinsansRegulerLayout=dialog_two.findViewById(R.id.josefinsansRegulerLayout);
        cormorantuprightBoldLayout=dialog_two.findViewById(R.id.cormorantuprightBoldLayout);

        rubikMediumLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Typeface rubik = getResources().getFont(R.font.rubik_medium);
                txtImageWebsite.setTypeface(rubik);
                txtImageCompanyName.setTypeface(rubik);
                txtImagePhone.setTypeface(rubik);
                dialog_two.dismiss();
            }
        });
        libreFranklinMediumLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Typeface libre = getResources().getFont(R.font.librefranklin_medium);
                txtImageWebsite.setTypeface(libre);
                txtImageCompanyName.setTypeface(libre);
                txtImagePhone.setTypeface(libre);
                dialog_two.dismiss();
            }
        });
        loraMediumLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Typeface lora = getResources().getFont(R.font.lora_medium);
                txtImageWebsite.setTypeface(lora);
                txtImageCompanyName.setTypeface(lora);
                txtImagePhone.setTypeface(lora);
                dialog_two.dismiss();
            }
        });
        merriWeatherRegulerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Typeface merri = getResources().getFont(R.font.merriweather_regular);
                txtImageWebsite.setTypeface(merri);
                txtImageCompanyName.setTypeface(merri);
                txtImagePhone.setTypeface(merri);
                dialog_two.dismiss();
            }
        });
        josefinsansRegulerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Typeface josefin = getResources().getFont(R.font.josefinsans_regular);
                txtImageWebsite.setTypeface(josefin);
                txtImageCompanyName.setTypeface(josefin);
                txtImagePhone.setTypeface(josefin);
                dialog_two.dismiss();
            }
        });
        cormorantuprightBoldLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Typeface cormorant = getResources().getFont(R.font.cormorantupright_bold);
                txtImageWebsite.setTypeface(cormorant);
                txtImageCompanyName.setTypeface(cormorant);
                txtImagePhone.setTypeface(cormorant);
                dialog_two.dismiss();
            }
        });
    }
    void dialog3()
    {
        Dialog dialog_three = new Dialog(PostEditActivity.this);
        dialog_three.setContentView(R.layout.font_color_dialog);
        dialog_three.show();


    }
}