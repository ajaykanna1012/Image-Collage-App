package com.example.post;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TextView addButton;
    private List<People> personList;
    private CustomAdapter customAdapter;
    private SharedPreferences sharedPreferences;
    private Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = findViewById(R.id.post_bt);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        sharedPreferences = getSharedPreferences("think", MODE_PRIVATE);
        gson = new Gson();

        personList = loadData();
        customAdapter = new CustomAdapter(personList, this);
        recyclerView.setAdapter(customAdapter);

        addButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PostActivity.class);
            startActivity(intent);
            finish();
        });
    }

    private List<People> loadData() {
        String json = sharedPreferences.getString("dataList", null);
        Type type = new TypeToken<ArrayList<People>>() {}.getType();

        if (json != null) {
            return gson.fromJson(json, type);
        } else {
            return new ArrayList<>();
        }
    }

    private void saveData() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String json = gson.toJson(personList);
        editor.putString("dataList", json);
        editor.apply();
    }

    @Override
    protected void onResume() {
        super.onResume();
        personList = loadData();
        customAdapter.updateData(personList);
    }

    @Override
    protected void onPause() {
        super.onPause();
        saveData();
    }
}
