package com.example.weather_now;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        String instanceState;
//        if (savedInstanceState == null){
//            instanceState = "Первый запуск!";
//        }
//        else{
//            instanceState = "Повторный запуск!";
//        }
//        Toast.makeText(getApplicationContext(), instanceState + " - onCreate()", Toast.LENGTH_SHORT).show();
//        Log.d("onCreate", "onCreate");
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
//        Log.d("on start", "start");
//    }
//
//
//    public void onClick(View view) {
//        Intent intent = new Intent(MainActivity.this, ChoiceTownActivity.class);
//        startActivity(intent);
//        Toast.makeText(getApplicationContext(), "changeActivity", Toast.LENGTH_SHORT).show();
//        Log.d("changeActivity", "changeActivity");
//    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle saveInstanceState){
//        super.onRestoreInstanceState(saveInstanceState);
//        Toast.makeText(getApplicationContext(), "Повторный запуск!! - onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
//        Log.d("onRestoreInstanceState", "onRestoreInstanceState");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT).show();
//        Log.d("onResume", "onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(getApplicationContext(), "onPause()", Toast.LENGTH_SHORT).show();
//        Log.d("onPause", "onPause");
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle saveInstanceState){
//        super.onSaveInstanceState(saveInstanceState);
//        Toast.makeText(getApplicationContext(), "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
//        Log.d("onSaveInstanceState", "onSaveInstanceState");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(getApplicationContext(), "onStop()", Toast.LENGTH_SHORT).show();
//        Log.d("onStop", "onStop");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(getApplicationContext(), "onRestart()", Toast.LENGTH_SHORT).show();
//        Log.d("onRestart", "onRestart");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(getApplicationContext(), "onDestroy()", Toast.LENGTH_SHORT).show();
//        Log.d("onDestroy", "onDestroy");
//    }
}