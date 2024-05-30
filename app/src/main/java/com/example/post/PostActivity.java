package com.example.post;

import static android.app.ProgressDialog.show;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

public class PostActivity extends AppCompatActivity {
    EditText title;
    EditText description;
    TextView link;
    Button post,cancel;
    CheckBox checkBox;
    ImageView imageView,imageView2,img1,img3_1,img3_2,img3_3,img4_1,img4_2,img4_3,img4_4,img5_1,img5_2,img5_3,img5_4,img5_5,img6_1,img6_2,img6_3,img6_4,img6_5,img6_6,img7_1,img7_2,img7_3,img7_4,img7_5,img7_6,img7_7,img8_1,img8_2,img8_3,img8_4,img8_5,img8_6,img8_7,img8_8,
    img9_1,img9_2,img9_3,img9_4,img9_5,img9_6,img9_7,img9_8,img9_9;
    LinearLayout layout2;
    RelativeLayout layout_3,layout_4,layout_5,layout_6,layout_7,layout_8,layout_9;
    Uri imagePath ;
    ArrayList<String>store= new ArrayList<>();
    Bitmap imageToStore ;
ArrayList<People>people;
    SharedPreferences sharedPreferences;
    Gson gson;
   int REQUEST_CODE_PERMISSION=100;
    int STORAGE_PERMISSION_CODE=100;
    private static final int PICK_IMAGE_MULTIPLE=99;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        img1=findViewById(R.id.imqe_1);
        img3_1=findViewById(R.id.image_3_1);
        img3_2=findViewById(R.id.image_3_2);
        img3_3=findViewById(R.id.image_3_3);
        img4_1=findViewById(R.id.image_4_1);
        img4_2=findViewById(R.id.image_4_2);
        img4_3=findViewById(R.id.image_4_3);
        img4_4=findViewById(R.id.image_4_4);
        img5_1=findViewById(R.id.image_5_1);
        img5_2=findViewById(R.id.image_5_2);
        img5_3=findViewById(R.id.image_5_3);
        img5_4=findViewById(R.id.image_5_4);
        img5_5=findViewById(R.id.image_5_5);
        img6_1=findViewById(R.id.image_6_1);
        img6_2=findViewById(R.id.image_6_2);
        img6_3=findViewById(R.id.image_6_3);
        img6_4=findViewById(R.id.image_6_4);
        img6_5=findViewById(R.id.image_6_5);
        img6_6=findViewById(R.id.image_6_6);
        img7_1=findViewById(R.id.image_7_1);
        img7_2=findViewById(R.id.image_7_2);
        img7_3=findViewById(R.id.image_7_3);
        img7_4=findViewById(R.id.image_7_4);
        img7_5=findViewById(R.id.image_7_5);
        img7_6=findViewById(R.id.image_7_6);
        img7_7=findViewById(R.id.image_7_7);
        img8_1=findViewById(R.id.image_8_1);
        img8_2=findViewById(R.id.image_8_2);
        img8_3=findViewById(R.id.image_8_3);
        img8_4=findViewById(R.id.image_8_4);
        img8_5=findViewById(R.id.image_8_5);
        img8_6=findViewById(R.id.image_8_6);
        img8_7=findViewById(R.id.image_8_7);
        img8_8=findViewById(R.id.image_8_8);
        img9_1=findViewById(R.id.image_9_1);
        img9_2=findViewById(R.id.image_9_2);
        img9_3=findViewById(R.id.image_9_3);
        img9_4=findViewById(R.id.image_9_4);
        img9_5=findViewById(R.id.image_9_5);
        img9_6=findViewById(R.id.image_9_6);
        img9_7=findViewById(R.id.image_9_7);
        img9_8=findViewById(R.id.image_9_8);
        img9_9=findViewById(R.id.image_9_9);
        layout2=findViewById(R.id.layout1);
        layout_3=findViewById(R.id.layout_3);
        layout_4=findViewById(R.id.layout_4);layout_7=findViewById(R.id.layout_7);
        layout_5=findViewById(R.id.layout_5);
        layout_6=findViewById(R.id.layout_6);layout_8=findViewById(R.id.layout_8);
        layout_9=findViewById(R.id.layout_9);
        link=findViewById(R.id.link);
link.setOnClickListener(v -> {
Intent intent=new Intent(this,WebActivity.class);
startActivity(intent);

});
        post=findViewById(R.id.post);
        cancel=findViewById(R.id.cancel);
        cancel.setOnClickListener(v -> {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);

        });
        title=findViewById(R.id.title_body);
        description=findViewById(R.id.dec_body);
        checkBox=findViewById(R.id.checkBox);
        title.setFilters(new InputFilter[]{new InputFilter.LengthFilter(90)});
        sharedPreferences=getSharedPreferences("think",MODE_PRIVATE);
         gson=new Gson();
        if (ContextCompat.checkSelfPermission(
                PostActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE) ==
                PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    this, Manifest.permission.READ_EXTERNAL_STORAGE)) {
            } else {
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, REQUEST_CODE_PERMISSION);
            }
        }
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chosenImage();
            }
        });
        checkBox.setOnClickListener(v -> {
            if(checkBox.isChecked()) {
                    post.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Log.d("TAG", "onClick1: " + store);
                            people = loadData();
                            String field1 = title.getText().toString();
                            String field2 = description.getText().toString();

                            People data = new People(field1, field2, store);
                            people.add(data);
                            saveData();
                            Toast.makeText(PostActivity.this, "Saved Array List to Shared preferences. ", Toast.LENGTH_SHORT).show();
                            Intent resultIntent = new Intent(getApplicationContext(), MainActivity.class);

                            startActivity(resultIntent);
                            finish();
                        }
                    });
                }
        });
    }

    private void saveData() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String json = gson.toJson(people);
//        Log.d("TAG", "onClick: ",);
        editor.putString("dataList", json);
        editor.apply();

    }

    private ArrayList<People> loadData() {
        String json = sharedPreferences.getString("dataList", null);
        Type type = new TypeToken<ArrayList<People>>() {
        }.getType();
        if (json != null) {
            return gson.fromJson(json, type);
        } else {
            return new ArrayList<>();
        }
    }

@Override
public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);

    if (requestCode == STORAGE_PERMISSION_CODE) {
        // If request is cancelled, the result arrays are empty.
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            // Permission was granted

        } else {
            // Permission denied
            Toast.makeText(this, "Storage Permission Denied", Toast.LENGTH_SHORT).show();
        }
    }
}
private void chosenImage() {
        try {

            Intent intent=new Intent();
            intent.setType("image/*");
            intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE,true);
            intent.setAction(Intent.ACTION_GET_CONTENT);
            startActivityForResult(intent,PICK_IMAGE_MULTIPLE);
        }catch(Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        try{ super.onActivityResult(requestCode, resultCode, data);
            if(requestCode==PICK_IMAGE_MULTIPLE&&resultCode==RESULT_OK&&data!=null){
                if(data.getClipData()!=null) {
                    ClipData clipData = data.getClipData();
                    int count = clipData.getItemCount();


                    for (int i = 0; i < count; i++) {
                        imagePath = data.getClipData().getItemAt(i).getUri();
                        imageToStore = MediaStore.Images.Media.getBitmap(getContentResolver(), imagePath);
                        store.add(imagePath.toString());
                        Log.d("TAG", "onActivityResult: " + store);
                    }
                }
                Log.d("TAG", "onActivityResult: " + store.size());
                if (store.size()  <=1) {
                    img1.setImageURI(Uri.parse(store.get(0)));
                    Log.d("TAG", "onActivityResult_3: " + Uri.parse(store.get(0)));


                }
                else if (store.size() ==2) {
                    img1.setVisibility(View.GONE);
                    Log.d("TAG", "onActivityResult_3: " + Uri.parse(store.get(0)));
                    imageView.setImageURI(Uri.parse(store.get(0)));
                    imageView2.setImageURI(Uri.parse(store.get(1)));
                    layout2.setVisibility(View.VISIBLE);
                }
                else if (store.size() ==3) {
                    img1.setVisibility(View.GONE);

                    img3_1.setImageURI(Uri.parse(store.get(1)));

                    img3_2.setImageURI(Uri.parse(store.get(2)));

                    img3_3.setImageURI(Uri.parse(store.get(0)));
                    layout_3.setVisibility(View.VISIBLE);

                }
                else if (store.size() ==4) {
                    img1.setVisibility(View.GONE);

                    img4_1.setImageURI(Uri.parse(store.get(1)));
                    img4_2.setImageURI(Uri.parse(store.get(2)));
                    img4_3.setImageURI(Uri.parse(store.get(3)));
                    img4_4.setImageURI(Uri.parse(store.get(0)));
                    layout_4.setVisibility(View.VISIBLE);
                }
                else if (store.size() ==5) {
                    img1.setVisibility(View.GONE);

                    img5_1.setImageURI(Uri.parse(store.get(1)));
                    img5_2.setImageURI(Uri.parse(store.get(2)));
                    img5_3.setImageURI(Uri.parse(store.get(3)));
                    img5_4.setImageURI(Uri.parse(store.get(4)));
                    img5_5.setImageURI(Uri.parse(store.get(0)));
                    layout_5.setVisibility(View.VISIBLE);
                }
                else if (store.size() ==6) {
                    img1.setVisibility(View.GONE);

                    img6_1.setImageURI(Uri.parse(store.get(1)));
                    img6_2.setImageURI(Uri.parse(store.get(2)));
                    img6_3.setImageURI(Uri.parse(store.get(3)));
                    img6_4.setImageURI(Uri.parse(store.get(4)));
                    img6_5.setImageURI(Uri.parse(store.get(0)));
                    img6_6.setImageURI(Uri.parse(store.get(5)));
                    layout_6.setVisibility(View.VISIBLE);
                }


                else if (store.size() == 7) {
                    img1.setVisibility(View.GONE);  Log.d("TAG", "onActivityResult1: " + store.size());
                    layout_7.setVisibility(View.VISIBLE);
                    img7_1.setImageURI(Uri.parse(store.get(1)));
                    img7_2.setImageURI(Uri.parse(store.get(2)));
                    img7_3.setImageURI(Uri.parse(store.get(3)));
                    img7_4.setImageURI(Uri.parse(store.get(4)));
                    img7_5.setImageURI(Uri.parse(store.get(0)));
                    img7_6.setImageURI(Uri.parse(store.get(5)));
                    img7_7.setImageURI(Uri.parse(store.get(6)));

                }
                else if (store.size() ==8) {
                    img1.setVisibility(View.GONE);

                    img8_1.setImageURI(Uri.parse(store.get(1)));
                    img8_2.setImageURI(Uri.parse(store.get(2)));
                    img8_3.setImageURI(Uri.parse(store.get(3)));
                    img8_4.setImageURI(Uri.parse(store.get(4)));
                    img8_5.setImageURI(Uri.parse(store.get(0)));
                    img8_6.setImageURI(Uri.parse(store.get(5)));
                    img8_7.setImageURI(Uri.parse(store.get(6)));
                    img8_8.setImageURI(Uri.parse(store.get(7)));
                    layout_8.setVisibility(View.VISIBLE);
                }
                else if (store.size() ==9) {
                    img1.setVisibility(View.GONE);

                    img9_1.setImageURI(Uri.parse(store.get(1)));
                    img9_2.setImageURI(Uri.parse(store.get(2)));
                    img9_3.setImageURI(Uri.parse(store.get(3)));
                    img9_4.setImageURI(Uri.parse(store.get(4)));
                    img9_5.setImageURI(Uri.parse(store.get(0)));
                    img9_6.setImageURI(Uri.parse(store.get(5)));
                    img9_7.setImageURI(Uri.parse(store.get(6)));
                    img9_8.setImageURI(Uri.parse(store.get(7)));
                    img9_9.setImageURI(Uri.parse(store.get(8)));
                    layout_9.setVisibility(View.VISIBLE);
                }


                else if (data.getData()!=null) {
                    Uri imageUri = data.getData();
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), imageUri);
                    imageView.setImageURI(imageUri);

                }
            }
        }catch(Exception e) {
            Toast .makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();

        }
    }
}