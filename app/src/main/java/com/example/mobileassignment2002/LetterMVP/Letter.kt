package com.example.mobileassignment2002


import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.ViewSwitcher
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity


class Letter : AppCompatActivity() {


    var letters = intArrayOf(
        R.drawable.slide1, R.drawable.slide2, R.drawable.slide3, R.drawable.slide4, R.drawable.slide5,
        R.drawable.slide6, R.drawable.slide7, R.drawable.slide8, R.drawable.slide9, R.drawable.slide10,
        R.drawable.slide11, R.drawable.slide12, R.drawable.slide13, R.drawable.slide14, R.drawable.slide15,
        R.drawable.slide16, R.drawable.slide17, R.drawable.slide18, R.drawable.slide19, R.drawable.slide20,
        R.drawable.slide21, R.drawable.slide22, R.drawable.slide23, R.drawable.slide24, R.drawable.slide25,
        R.drawable.slide26
    )
    var currentIndex  = 0


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val actionbar=supportActionBar;
        if (actionbar != null) {
            actionbar.setTitle(resources.getString(R.string.app_name))
        }

        setContentView(R.layout.activity_letter)
        currentIndex = intent.getIntExtra(resources.getString(R.string.letter_postion),0)
        val prev_button = findViewById<Button>(R.id.previous_btn)
        val next_button = findViewById<Button>(R.id.next_btn)
        val image_switcher = findViewById<ImageSwitcher>(R.id.imageSwitcher);


        image_switcher.setFactory(ViewSwitcher.ViewFactory {
            val imageView = ImageView(applicationContext)
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER)
             //returning imageview
            imageView
        })
        image_switcher.setImageResource(letters.get(currentIndex))

        prev_button.setOnClickListener{
            image_switcher.setInAnimation(this,R.anim.from_right)
            image_switcher.setInAnimation(this,R.anim.to_left)
            currentIndex--
            if(currentIndex<0)
                currentIndex=letters.size-1;
            image_switcher.setImageResource(letters.get(currentIndex))
        }

        next_button.setOnClickListener{
            image_switcher.setInAnimation(this,R.anim.from_left)
            image_switcher.setInAnimation(this,R.anim.to_right)
            currentIndex++
            if(currentIndex>25)
                currentIndex=0;
            image_switcher.setImageResource(letters.get(currentIndex))
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val image_switcher = findViewById<ImageSwitcher>(R.id.imageSwitcher);
        when(item.itemId){
            R.id.back -> {
                val intent  = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }

            R.id.firstPage -> {
                image_switcher.setImageResource(letters.get(0))
                currentIndex=0;
            }
            R.id.LastPage -> {
                image_switcher.setImageResource(letters.get(25))
                currentIndex=25
            }
        }
        return super.onOptionsItemSelected(item)
    }

}