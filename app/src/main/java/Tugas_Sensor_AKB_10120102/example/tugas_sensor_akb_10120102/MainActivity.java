package Tugas_Sensor_AKB_10120102.example.tugas_sensor_akb_10120102;

/*
 * NIM  : 10120102
 *Nama  : Fasya Mutiara Pagi
 *Kelas : IF3
 *Email : fasyamutiara12@gmail.com
 * */

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tugas_sensor_akb_10119107.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProfilFragment()).commit();

        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()){
                    case R.id.nav_profil:
                        selectedFragment = new ProfilFragment();
                        break;
                    case R.id.nav_tempatmaps:
                        selectedFragment = new TempatFragment();
                        break;
                    case R.id.nav_maps:
                        selectedFragment = new LokasiFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                return true;

            }
        });
    }
}