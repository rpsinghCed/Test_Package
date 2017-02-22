package a.test_package;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by cedcoss on 22/2/17.
 */
public class Second extends ActionBarActivity {
    ListView list_view;
    static final String[] numbers = new String[] { "one", "two", "three",
            "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen", "twenty", "twenty one",
            "twenty two" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);
        list_view= (ListView) findViewById(R.id.list_view);

        //code to add header and footer to listview
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup header = (ViewGroup) inflater.inflate(R.layout.header, list_view,
                false);
        ViewGroup footer = (ViewGroup) inflater.inflate(R.layout.footer, list_view,
                false);
        list_view.addHeaderView(header, null, false);
        list_view.addFooterView(footer, null, false);

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, numbers);

        list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


             //   Toast.makeText(Second.this,position,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
