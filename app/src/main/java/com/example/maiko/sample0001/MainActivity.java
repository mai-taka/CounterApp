package com.example.maiko.sample0001;


        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;

// 追加
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    // 追加
    int count = 0;
    private TextView counter_text;
    private Button push_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 追加：画面のアイテムと紐付け
        counter_text = (TextView)findViewById(R.id.textView);
        push_btn = (Button)findViewById(R.id.button4);

        // 追加：クリック
        push_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                count++;
                counter_text.setText(String.valueOf(count));
            }
        });

    }

//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
    }
//}