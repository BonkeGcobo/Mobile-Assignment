package com.example.mobileassignment2002

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import  android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionbar=supportActionBar;
        if (actionbar != null) {
            actionbar.setTitle(resources.getString(R.string.app_name))
            actionbar.setSubtitle(resources.getString(R.string.overview_title))
        }
        setContentView(R.layout.activity_main)
        var a = 0

        val btnA= findViewById<Button>(R.id.btnA);
        btnA.setOnClickListener(this)

       // btnA.setOnClickListener(this);
        val btnB= findViewById<Button>(R.id.btnB);
        btnB.setOnClickListener(this);
        val btnC= findViewById<Button>(R.id.btnC);
        btnC.setOnClickListener(this)
        val btnD= findViewById<Button>(R.id.btnD);
        btnD.setOnClickListener(this)
        val btnE= findViewById<Button>(R.id.btnE);
        btnE.setOnClickListener(this)
        val btnF= findViewById<Button>(R.id.btnF);
        btnF.setOnClickListener(this)
        val btnG= findViewById<Button>(R.id.btnG);
        btnG.setOnClickListener(this)
        val btnH= findViewById<Button>(R.id.btnH);
        btnH.setOnClickListener(this)
        val btnI= findViewById<Button>(R.id.btnI);
        btnI.setOnClickListener(this)
        val btnJ= findViewById<Button>(R.id.btnJ);
        btnJ.setOnClickListener(this)
        val btnK= findViewById<Button>(R.id.btnK);
        btnK.setOnClickListener(this)
        val btnL= findViewById<Button>(R.id.btnL);
        btnL.setOnClickListener(this)
        val btnM= findViewById<Button>(R.id.btnM);
        btnM.setOnClickListener(this)
        val btnN= findViewById<Button>(R.id.btnN);
        btnN.setOnClickListener(this)
        val btnO= findViewById<Button>(R.id.btnO);
        btnO.setOnClickListener(this)
        val btnP= findViewById<Button>(R.id.btnP);
        btnP.setOnClickListener(this);
        val btnQ= findViewById<Button>(R.id.btnQ);
        btnQ.setOnClickListener(this)
        val btnR= findViewById<Button>(R.id.btnR);
        btnR.setOnClickListener(this)
        val btnS= findViewById<Button>(R.id.btnS);
        btnS.setOnClickListener(this)
        val btnT= findViewById<Button>(R.id.btnT);
        btnT.setOnClickListener(this)
        val btnU= findViewById<Button>(R.id.btnU);
        btnU.setOnClickListener(this)
        val btnV= findViewById<Button>(R.id.btnV);
        btnV.setOnClickListener(this)
        val btnW= findViewById<Button>(R.id.btnW);
        btnW.setOnClickListener(this)
        val btnX= findViewById<Button>(R.id.btnX);
        btnX.setOnClickListener(this)
        val btnY= findViewById<Button>(R.id.btnY);
        btnY.setOnClickListener(this)
        val btnZ= findViewById<Button>(R.id.btnZ);
        btnZ.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var letter_element =0;
        when(p0?.id){
            R.id.btnA -> {
                val intent  = Intent(this,Letter::class.java)
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }

            R.id.btnB -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =1
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }

            R.id.btnC -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =2
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }

            R.id.btnD -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =3
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnE -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =4
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnF -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =5
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnG -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =6
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnH -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =7
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnI -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =8
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnJ -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =9
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnK -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =10
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnL -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =11
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnM -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =12
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnN -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =13
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnO -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =14
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnP -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =15
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnQ -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =16
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnR -> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =17
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnS-> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =18
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnT-> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =19
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnU-> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =20
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnV-> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =21
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnW-> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =22
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnX-> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =23
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnY-> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =24
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
            R.id.btnZ-> {
                val intent  = Intent(this,Letter::class.java)
                letter_element =25
                intent.putExtra(resources.getString(R.string.letter_postion),letter_element)
                startActivity(intent)
            }
        }
    }
}