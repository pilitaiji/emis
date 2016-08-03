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

        FileInputStream fis = null;
        StringBuilder sb = new StringBuilder();
        try {
            fis = openFileInput("note.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String str = "";
            while ((str = br.readLine()) != null) {
                sb.append(str);
            }
            br.close();
            isr.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        package_name.setText(sb);
    }

    public void save(View view) {
        FileOutputStream fos = null;

        try {
            fos = openFileOutput("note.txt", Context.MODE_PRIVATE);
            fos.write(package_name.getText().toString().getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
