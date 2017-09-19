package by.insight.test_task_qulix_system.view.activity.base;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import by.insight.test_task_qulix_system.R;
import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;


public class BaseActivity extends AppCompatActivity {
    private static final int PERMISSIONS_INTERNET = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        permissionsInternet();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @AfterPermissionGranted(PERMISSIONS_INTERNET)
    public void permissionsInternet() {
        if (EasyPermissions.hasPermissions(this, Manifest.permission.INTERNET)) {

        } else {
            EasyPermissions.requestPermissions(this, getResources().getString(R.string.permissions_internet),
                    PERMISSIONS_INTERNET,
                    Manifest.permission.INTERNET);
        }
    }
}
