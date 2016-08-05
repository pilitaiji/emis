package tw.com.pilitaiji.emis;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class collectDataActivity extends AppCompatActivity {

    EditText package_name;
    EditText case_name;
    EditText time_name;
    EditText location_name;
    EditText disaster_category_name;
    EditText site_conditions_name;
    EditText deal_with_name;
    EditText hurt_name;
    EditText police_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect_data);

        package_name = (EditText)findViewById(R.id.package_name);
        case_name = (EditText)findViewById(R.id.case_name);
        time_name = (EditText)findViewById(R.id.time_name);
        location_name = (EditText)findViewById(R.id.location_name);
        disaster_category_name = (EditText)findViewById(R.id.disaster_category_name);
        site_conditions_name = (EditText)findViewById(R.id.site_conditions_name);
        deal_with_name = (EditText)findViewById(R.id.deal_with_name);
        hurt_name = (EditText)findViewById(R.id.hurt_name);
        police_number = (EditText)findViewById(R.id.police_number);

//package_name
        FileInputStream fis_package_name = null;
        StringBuilder sb_package_name = new StringBuilder();
        try {
            fis_package_name = openFileInput("package_name.txt");
            InputStreamReader isr_package_name = new InputStreamReader(fis_package_name);
            BufferedReader br_package_name = new BufferedReader(isr_package_name);
            String str = "";
            while ((str = br_package_name.readLine()) != null) {
                sb_package_name.append(str);
            }
            br_package_name.close();
            isr_package_name.close();
            fis_package_name.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        package_name.setText(sb_package_name);

//case_name
        FileInputStream fis_case_name = null;
        StringBuilder sb_case_name = new StringBuilder();
        try {
            fis_case_name = openFileInput("case_name.txt");
            InputStreamReader isr_case_name = new InputStreamReader(fis_case_name);
            BufferedReader br_case_name = new BufferedReader(isr_case_name);
            String str = "";
            while ((str = br_case_name.readLine()) != null) {
                sb_case_name.append(str);
            }
            br_case_name.close();
            isr_case_name.close();
            fis_case_name.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        case_name.setText(sb_case_name);

//time_name
        FileInputStream fis_time_name = null;
        StringBuilder sb_time_name = new StringBuilder();
        try {
            fis_time_name = openFileInput("time_name.txt");
            InputStreamReader isr_time_name = new InputStreamReader(fis_time_name);
            BufferedReader br_time_name = new BufferedReader(isr_time_name);
            String str = "";
            while ((str = br_time_name.readLine()) != null) {
                sb_time_name.append(str);
            }
            br_time_name.close();
            isr_time_name.close();
            fis_time_name.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        time_name.setText(sb_time_name);

//location_name
        FileInputStream fis_location_name = null;
        StringBuilder sb_location_name = new StringBuilder();
        try {
            fis_location_name = openFileInput("location_name.txt");
            InputStreamReader isr_location_name = new InputStreamReader(fis_location_name);
            BufferedReader br_location_name = new BufferedReader(isr_location_name);
            String str = "";
            while ((str = br_location_name.readLine()) != null) {
                sb_location_name.append(str);
            }
            br_location_name.close();
            isr_location_name.close();
            fis_location_name.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        location_name.setText(sb_location_name);
    }

    public void save(View view) {
//package_name
        FileOutputStream fos_package_name = null;
        try {
            fos_package_name = openFileOutput("package_name.txt", Context.MODE_PRIVATE);
            fos_package_name.write(package_name.getText().toString().getBytes());
            fos_package_name.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//case_name
        FileOutputStream fos_case_name = null;
        try {
            fos_case_name = openFileOutput("case_name.txt", Context.MODE_PRIVATE);
            fos_case_name.write(case_name.getText().toString().getBytes());
            fos_case_name.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//time_name
        FileOutputStream fos_time_name = null;
        try {
            fos_time_name = openFileOutput("time_name.txt", Context.MODE_PRIVATE);
            fos_time_name.write(time_name.getText().toString().getBytes());
            fos_time_name.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//location_name
        FileOutputStream fos_location_name = null;
        try {
            fos_location_name = openFileOutput("location_name.txt", Context.MODE_PRIVATE);
            fos_location_name.write(location_name.getText().toString().getBytes());
            fos_location_name.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
