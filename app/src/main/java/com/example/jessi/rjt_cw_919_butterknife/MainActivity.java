package com.example.jessi.rjt_cw_919_butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.textView3)
    TextView textView3;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.textView5)
    TextView textView5;
    @BindView(R.id.editText)
    EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick({R.id.textView, R.id.textView2, R.id.textView3, R.id.textView4, R.id.textView5})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.textView:
                break;
            case R.id.textView2:
                break;
            case R.id.textView3:
                break;
            case R.id.textView4:
                break;
            case R.id.textView5:
                break;
        }
    }

    @OnClick(R.id.editText)
    public void onViewClicked() {
    }
}
