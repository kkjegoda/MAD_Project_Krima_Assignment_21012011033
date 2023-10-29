package com.example.mad_project_21012011033

import android.annotation.SuppressLint
import android.content.DialogInterface.OnClickListener
import android.icu.number.IntegerWidth
import android.nfc.tech.NfcV
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

 class MainActivity() : AppCompatActivity() {

                    fun ADD(v: View) {
                        val et1: EditText = findViewById(R.id.editTextNumber)
                        val et2: EditText = findViewById(R.id.editTextNumber2)
                        val et3: EditText = findViewById(R.id.editTextNumber3)

                        val n1 = et1.text.toString().toInt()
                        val n2 = et2.text.toString().toInt()
                        val result = n1 + n2

                        et3.setText("Total value" + result)

                    }


                    fun SUBTRACT(v: View) {
                        val et1: EditText = findViewById(R.id.editTextNumber)
                        val et2: EditText = findViewById(R.id.editTextNumber2)
                        val et3: EditText = findViewById(R.id.editTextNumber3)

                        val n1 = et1.text.toString().toInt()
                        val n2 = et2.text.toString().toInt()
                        val result = n1 - n2

                        et3.setText("Subtract value" + result)

                    }

                    fun MULTIPLY(v: View) {
                        val et1: EditText = findViewById(R.id.editTextNumber)
                        val et2: EditText = findViewById(R.id.editTextNumber2)
                        val et3: EditText = findViewById(R.id.editTextNumber3)

                        val n1 = et1.text.toString().toInt()
                        val n2 = et2.text.toString().toInt()
                        val result = n1 * n2

                        et3.setText("Multiply" + result)

                    }

                    fun DIVIDE(v: View) {
                        val et1: EditText = findViewById(R.id.editTextNumber)
                        val et2: EditText = findViewById(R.id.editTextNumber2)
                        val et3: EditText = findViewById(R.id.editTextNumber3)

                        val n1 = et1.text.toString().toInt()
                        val n2 = et2.text.toString().toInt()
                        val result = n1 / n2

                        et3.setText("Divide" + result)


                    }

                    fun PERCENTAGE(v: View) {
                        val et1: EditText = findViewById(R.id.editTextNumber)
                        val et2: EditText = findViewById(R.id.editTextNumber2)
                        val et3: EditText = findViewById(R.id.editTextNumber3)

                        val n1 = et1.text.toString().toInt()
                        val n2 = et2.text.toString().toInt()
                        val result = n1 % n2

                        et3.setText("Percentage" + result)


                    }

                }











