package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView edt_input;
    private TextView tv_result;

    private String input = "";
    private String result = "";
    private String body_tv_result;
    //private String body_edt_input;
    private int resultInt;
    private float resultFloat;
    private int isLoadingPhepToan;
    private int isLoadingPhepToanSub;
    private int itemPhay;
    private int feel;

    private Button btn_number0, btn_number1, btn_number2, btn_number3, btn_number4, btn_number5, btn_number6, btn_number7, btn_number8, btn_number9;
    private Button btn_number_cong, btn_number_C, btn_number_tru, btn_number_AC, btn_number_nhan, btn_number_phay, btn_number_chia, btn_number_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();
        setClickItem();

    }

    public void anhxa() {
        edt_input = (TextView) findViewById(R.id.edt_input);
        tv_result = (TextView) findViewById(R.id.txt_result);

        btn_number0 = (Button) findViewById(R.id.btn_number0);
        btn_number1 = (Button) findViewById(R.id.btn_number1);
        btn_number2 = (Button) findViewById(R.id.btn_number2);
        btn_number3 = (Button) findViewById(R.id.btn_number3);
        btn_number4 = (Button) findViewById(R.id.btn_number4);
        btn_number5 = (Button) findViewById(R.id.btn_number5);
        btn_number6 = (Button) findViewById(R.id.btn_number6);
        btn_number7 = (Button) findViewById(R.id.btn_number7);
        btn_number8 = (Button) findViewById(R.id.btn_number8);
        btn_number9 = (Button) findViewById(R.id.btn_number9);

        btn_number_cong = (Button) findViewById(R.id.btn_number_cong);
        btn_number_tru = (Button) findViewById(R.id.btn_number_tru);
        btn_number_nhan = (Button) findViewById(R.id.btn_number_nhan);
        btn_number_chia = (Button) findViewById(R.id.btn_number_chia);
        btn_number_C = (Button) findViewById(R.id.btn_number_C);
        btn_number_AC = (Button) findViewById(R.id.btn_number_AC);
        btn_number_phay = (Button) findViewById(R.id.btn_number_phay);
        btn_number_result = (Button) findViewById(R.id.btn_number_result);
    }

    public void setClickItem() {
        btn_number0.setOnClickListener(this);
        btn_number1.setOnClickListener(this);
        btn_number2.setOnClickListener(this);
        btn_number3.setOnClickListener(this);
        btn_number4.setOnClickListener(this);
        btn_number5.setOnClickListener(this);
        btn_number6.setOnClickListener(this);
        btn_number7.setOnClickListener(this);
        btn_number8.setOnClickListener(this);
        btn_number9.setOnClickListener(this);
        btn_number_cong.setOnClickListener(this);
        btn_number_tru.setOnClickListener(this);
        btn_number_nhan.setOnClickListener(this);
        btn_number_chia.setOnClickListener(this);
        btn_number_C.setOnClickListener(this);
        btn_number_AC.setOnClickListener(this);
        btn_number_phay.setOnClickListener(this);
        btn_number_result.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        body_tv_result = tv_result.getText().toString();
        switch (v.getId()) {
            case R.id.btn_number0: {
                feel = 1;
                clearData();

                input = input + "0";
                edt_input.setText("" + input);

                setSubIsLoading();
            }
            break;
            case R.id.btn_number1: {
                feel = 1;

                clearData();

                input = input + "1";
                edt_input.setText("" + input);

                setSubIsLoading();
            }
            break;
            case R.id.btn_number2: {

                feel = 1;
                clearData();

                input = input + "2";
                edt_input.setText("" + input);

                setSubIsLoading();
            }
            break;
            case R.id.btn_number3: {

                feel = 1;
                clearData();

                input = input + "3";
                edt_input.setText("" + input);

                setSubIsLoading();
            }
            break;
            case R.id.btn_number4: {
                feel = 1;
                clearData();

                input = input + "4";
                edt_input.setText("" + input);

            }
            break;
            case R.id.btn_number5: {

                feel = 1;
                clearData();

                input = input + "5";
                edt_input.setText("" + input);
            }
            break;
            case R.id.btn_number6: {
                feel = 1;
                clearData();

                input = input + "6";
                edt_input.setText("" + input);
            }
            break;
            case R.id.btn_number7: {
                feel = 1;
                clearData();

                input = input + "7";
                edt_input.setText("" + input);
            }
            break;
            case R.id.btn_number8: {

                feel = 1;
                clearData();

                input = input + "8";
                edt_input.setText("" + input);
            }
            break;
            case R.id.btn_number9: {
                feel = 1;
                clearData();

                input = input + "9";
                edt_input.setText("" + input);


            }
            break;
            case R.id.btn_number_cong: {
                feel = 0;
                input = edt_input.getText().toString();
                if (input.equals("")) {
                    Toast.makeText(this, "Xin moi nhap so", Toast.LENGTH_SHORT).show();
                } else {
                    isLoadingPhepToanSub++;
                    if (isLoadingPhepToanSub >= 2) {
                        Toast.makeText(this, "Vui long khong kick hai lan dau + ", Toast.LENGTH_SHORT).show();
                        clearDataAll();
                    } else {
                        Log.e("isLoadingPhepToan: ", "+ 0");
                        loadPhepToan(1);
                        cong();

                    }
                }
            }
            break;
            case R.id.btn_number_tru: {
                loadPhepToan(2);
            }
            break;
            case R.id.btn_number_nhan: {

                loadPhepToan(3);
                nhan();
            }
            break;
            case R.id.btn_number_chia: {
                loadPhepToan(4);
            }
            break;
            case R.id.btn_number_C: {

            }
            break;
            case R.id.btn_number_AC: {
                clearDataAll();
            }
            break;
            case R.id.btn_number_phay: {
                itemPhay++;
                input = input + ".";
                edt_input.setText("" + input);
            }
            break;
            case R.id.btn_number_result: {
                resultData();
            }
            break;
        }
    }

    public void clearData() {
        if (!body_tv_result.equals("")) {
            input = "";
            resultInt = 0;
            resultFloat = 0;
            result = "";
            tv_result.setText(result + "");
        }
    }

    public void clearDataAll() {

        input = "";

        resultInt = 0;
        resultFloat = 0;
        result = "";
        body_tv_result = "";

        itemPhay = 0;
        edt_input.setText("" + input);
        tv_result.setText("");
        isLoadingPhepToan = 0;
    }

    public void resultData() {

        if (feel == 0) {
            Toast.makeText(this, "phep toan sai", Toast.LENGTH_SHORT).show();
        } else {

            if (itemPhay == 0 && isLoadingPhepToan == 1) {
                input = "";
                input = edt_input.getText().toString();
                result = resultInt + Integer.parseInt(input) + "";
                resultInt = resultInt + Integer.parseInt(input);
                tv_result.setText(result + "");

            } else if (itemPhay == 0 && isLoadingPhepToan == 2) {

            } else if (itemPhay == 0 && isLoadingPhepToan == 3) {
                if (resultInt == 0) {
                    resultInt = 1;
                }
                input = "";
                result = resultInt * Integer.parseInt(edt_input.getText().toString()) + "";
                tv_result.setText(result + "");
            } else if (itemPhay == 0 && isLoadingPhepToan == 4) {

            } else if (itemPhay > 0) {
                resultFloat = Float.parseFloat(edt_input.getText().toString());
            }
        }
    }

    public void loadPhepToan(int isLoadingPhepToan) {
        this.isLoadingPhepToan = isLoadingPhepToan;
    }

    public int getPhepToan() {
        return isLoadingPhepToan;
    }

    public void cong() {
        if (itemPhay == 0) {
            //Log.e()

            input = edt_input.getText().toString();
            resultInt = resultInt + Integer.parseInt(input);  // cau lenh se dung khi cong lien tiep va ko click dau bang
            input = "";
            edt_input.setText(resultInt + "");

        } else if (itemPhay > 0) {
            resultFloat = Float.parseFloat(edt_input.getText().toString());
        }
    }

    public void tru() {

    }

    public void nhan() {
        if (itemPhay == 0) {
            //Log.e()

            if (resultInt == 0) {
                resultInt = 1;
            }

            input = edt_input.getText().toString();
            resultInt = resultInt * Integer.parseInt(input);
            input = "";
            edt_input.setText(resultInt + "");

        } else if (itemPhay > 0) {
            resultFloat = Float.parseFloat(edt_input.getText().toString());
        }
    }

    public void chia() {

    }

    public void callBackspace() {
        BaseInputConnection back = new BaseInputConnection(edt_input, true);
        back.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
    }

    public String DeleteEnd(String number) {

        int lengtht = number.length();
        String cut = number.substring(0, lengtht - 1);
        return cut;
    }

    public void setSubIsLoading() {

        if (isLoadingPhepToanSub > 0)
            isLoadingPhepToanSub = 0;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        input = edt_input.getText().toString();
        outState.putString("Kinput", "" + input);
        body_tv_result = tv_result.getText().toString();
        outState.putString("Kresult", "" + body_tv_result);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if (savedInstanceState != null) {

            input = savedInstanceState.getString("Kinput");
            body_tv_result = savedInstanceState.getString("Kresult");

            tv_result.setText("" + body_tv_result);
            edt_input.setText("" + input);

            resultInt = Integer.parseInt(body_tv_result);
        }
    }
}