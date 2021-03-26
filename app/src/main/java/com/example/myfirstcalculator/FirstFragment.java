package com.example.myfirstcalculator;

import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {
    double resultNumber = 0;
    String itemToOperate = "";
    String operation = "";

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public String getFinaStringResult(String key, String item, String resultText, double totalNumber) {
        if (item != "" || totalNumber != 0) {
            return resultText + key;
        }
        return key;
    };

    public double getFinaIntResult(String item, double total, String operator) {
        double numberToOperate = 0;
        if (item != "") {
            numberToOperate = Double.parseDouble(item);
        }

        if (operation == "add" && total != 0) {
            return total + numberToOperate;
        }
        if (operation == "reduce" && total != 0) {
            return total - numberToOperate;
        }
        if (operation == "division" && total != 0) {
            return total / numberToOperate;
        }
        if (operation == "multiply" && total != 0) {
            return total * numberToOperate;
        }
        return numberToOperate;
    };

    public void setResults(String operator) {
        resultNumber = getFinaIntResult(itemToOperate, resultNumber, operator);
        itemToOperate = "";
        operation = operator;
    };

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView resultText = view.findViewById(R.id.textView2);
        Button number1 = view.findViewById(R.id.button1);
        Button number2 = view.findViewById(R.id.button2);
        Button number3 = view.findViewById(R.id.button3);
        Button number4 = view.findViewById(R.id.button4);
        Button number5 = view.findViewById(R.id.button5);
        Button number6 = view.findViewById(R.id.button6);
        Button number7 = view.findViewById(R.id.button7);
        Button number8 = view.findViewById(R.id.button8);
        Button number9 = view.findViewById(R.id.button9);
        Button number0 = view.findViewById(R.id.zero);

        Button result = view.findViewById(R.id.result);
        Button add = view.findViewById(R.id.add);
        Button reduce = view.findViewById(R.id.reduce);
        Button division = view.findViewById(R.id.division);
        Button multiply = view.findViewById(R.id.multiply);
        Button clear = view.findViewById(R.id.clear);

        resultText.setText(String.valueOf(resultNumber));

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("1", itemToOperate, currentInput, resultNumber));
                itemToOperate = itemToOperate + "1";
            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("2", itemToOperate, currentInput, resultNumber));
                itemToOperate = itemToOperate + "2";
            }
        });

        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("3", itemToOperate, currentInput, resultNumber));
                itemToOperate = itemToOperate + "3";
            }
        });

        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("4", itemToOperate, currentInput, resultNumber));
                itemToOperate = itemToOperate + "4";
            }
        });

        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("5", itemToOperate, currentInput, resultNumber));
                itemToOperate = itemToOperate + "5";
            }
        });

        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("6", itemToOperate, currentInput, resultNumber));
                itemToOperate = itemToOperate + "6";
            }
        });

        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("7", itemToOperate, currentInput, resultNumber));
                itemToOperate = itemToOperate + "7";
            }
        });

        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("8", itemToOperate, currentInput, resultNumber));
                itemToOperate = itemToOperate + "8";
            }
        });

        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("9", itemToOperate, currentInput, resultNumber));
                itemToOperate = itemToOperate + "9";
            }
        });

        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("0", itemToOperate, currentInput, resultNumber));
                itemToOperate = itemToOperate + "0";
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("+", itemToOperate, currentInput, resultNumber));
                setResults("add");
            }
        });

        reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("-", itemToOperate, currentInput, resultNumber));
                setResults("reduce");
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("%", itemToOperate, currentInput, resultNumber));
                setResults("division");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = (String) resultText.getText();
                resultText.setText(getFinaStringResult("*", itemToOperate, currentInput, resultNumber));
                setResults("multiply");
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double finalResult = getFinaIntResult(itemToOperate, resultNumber, operation);
                resultText.setText(String.valueOf(finalResult));
                resultNumber = finalResult;
                itemToOperate = String.valueOf(finalResult);
                operation = "";
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText("");
                resultNumber = 0;
                itemToOperate = "";
                operation = "";
            }
        });
    }
}