package com.cookandroid.capstone2;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.cookandroid.capstone2.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements
        GoogleMap.OnMyLocationButtonClickListener,
        GoogleMap.OnMyLocationClickListener,
        OnMapReadyCallback {

    private GoogleMap mMap;
    private int MY_LOCATION_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    } //구글맵 사용코드

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == MY_LOCATION_REQUEST_CODE) {
            if (permissions.length == 1 &&
                    permissions[0] == Manifest.permission.ACCESS_FINE_LOCATION &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED &&
                        checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) !=
                                PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(this, new String[] {
                            Manifest.permission.ACCESS_FINE_LOCATION,
                            Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
                }
                mMap.setMyLocationEnabled(true);
            } //구글맵 코드권한 허용
        }
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED &&
                checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[] {
                    Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION
            }, 1);
        }
        mMap.setMyLocationEnabled(true);
        mMap.setOnMyLocationButtonClickListener(this);
        mMap.setOnMyLocationClickListener(this); //구글맵 코드사용

        LatLng tour = new LatLng(36.336343199999945, 127.4588648);
        mMap.addMarker(new MarkerOptions()
                .position(tour)
                .title("대전대학교")
                .snippet("대전에 있는 대학교")
        );

        tour = new LatLng(36.33676889999994, 127.45932349999977);
        mMap.addMarker(new MarkerOptions()
                .position(tour)
                .title("혜화문화관")
                .snippet("혜화문화관에 학생 식당")
        );

        tour = new LatLng(36.33578789999983, 127.45963859999931);
        mMap.addMarker(new MarkerOptions()
                .position(tour)
                .title("카페네스카페")
                .snippet("30주년기념관에있는 카페")
        );

        tour = new LatLng(36.33407539999999, 127.46191869999969);
        mMap.addMarker(new MarkerOptions()
                .position(tour)
                .title("5생활관식당")
                .snippet("대전대학교 5생활관에 있는 학생 식당")
        );

        mMap.moveCamera(CameraUpdateFactory.newLatLng(tour));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tour,16));
        //  mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tour,20));

        tour = new LatLng(36.336868400000164, 127.45891179999937);
        mMap.addMarker(new MarkerOptions()
                .position(tour)
                .title("혜화문화관카페")
                .snippet("혜화문화관에 있는 카페")
        ); //위도와 경도를 바탕으로 마커표시와 설명을 해주는 코드



        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                if (marker.getTitle().equals("혜화문화관")) {
                    Intent intent = new Intent(MapsActivity.this, Haehwa.class);
                    startActivity(intent);
                }
                if (marker.getTitle().equals("5생활관식당")) {
                    Intent intent = new Intent(MapsActivity.this, Lunchroom.class);
                    startActivity(intent);
                }
                if (marker.getTitle().equals("혜화문화관카페")) {
                    Intent intent = new Intent(MapsActivity.this, Cafe.class);
                    startActivity(intent);
                }
                if (marker.getTitle().equals("카페네스카페")) {
                    Intent intent = new Intent(MapsActivity.this, Cafebene.class);
                    startActivity(intent);
                }
                if (marker.getTitle().equals("대전대학교")) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://192.168.35.197:8080/"));
                    startActivity(intent);
                }
                return false;
            }// 마커표시를 클릭시 넘어가는 화면전환코드
        });
    }

    @Override
    public void onMyLocationClick(@NonNull Location location) {
        Toast.makeText(this, "Current location:\n" + location, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onMyLocationButtonClick() {
        Toast.makeText(this, "MyLocation button clicked", Toast.LENGTH_SHORT).show();
        return false;
    }
}