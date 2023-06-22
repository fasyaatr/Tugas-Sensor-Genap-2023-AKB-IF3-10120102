package Tugas_Sensor_AKB_10120102.example.tugas_sensor_akb_10120102;

/*
 * NIM  : 10120102
 *Nama  : Fasya Mutiara Pagi
 *Kelas : IF3
 *Email : fasyamutiara12@gmail.com
 * */

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tugas_sensor_akb_10119107.R;

public class ViewpagerActivity extends AppCompatActivity {

    ViewPager viewpager;
    viewpageradapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        viewpager = findViewById(R.id.view_pager);
        viewPagerAdapter = new viewpageradapter(this);

        viewpager.setAdapter(viewPagerAdapter);
    }

    public void onClick(View view){
        Intent intent = new Intent(ViewpagerActivity.this, MainActivity.class);
        startActivity(intent);
    }
}