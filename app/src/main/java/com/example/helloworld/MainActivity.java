package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("Создание");
        Log.d(TAG, "Создание: Aктивность создана");
        Log.e(TAG, "Ошибка: это пример Log.e()");
        Log.w(TAG, "Предупреждение: это пример Log.w()");
        Log.i(TAG, "Информация: это пример Log.i()");
        Log.v(TAG, "Вербозный: это пример Log.v()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showToast("Старт");
        Log.d(TAG, "Старт: Aктивность стартовала");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast("Воспроизведение");
        Log.d(TAG, "Воспроизведение: Активность возобновлена");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToast("Пауза");
        Log.d(TAG, "Пауза: Активность приостановлена");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("Перезапущено");
        Log.d(TAG, "Перезапуск: Активность перезапущена");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("Остановлено");
        Log.d(TAG, "Остановлено: Aктивность остановлена");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("Уничтожение");
        Log.d(TAG, "Уничтожение: Aктивность уничтожена");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
