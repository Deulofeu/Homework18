package com.example.homework18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listPofPicture = listOf(
            "https://images.hindustantimes.com/img/2021/06/26/1600x900/Leopard_viral_picture_1624693839680_1624693862848.jpg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSv368u_xFgCkrQDDMUU4OY74kTuFljz9Kfjw&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQLY4y_Zzvs554g7Ex12zW2cR983ptLH7c7WA&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyFqJgLEdJQFuVs8wo18AVP9uuEj9ZxvCrTzR_VjXnE0HthP6VqKR6wyq98tmDUchC48w&usqp=CAU",
            "https://www.imagineforest.com/blog/wp-content/uploads/2021/12/fantasy-4231252_640.jpg",
            "https://media.istockphoto.com/id/675172642/photo/pura-ulun-danu-bratan-temple-in-bali.jpg?s=612x612&w=0&k=20&c=_MPdmDviIyhldqhf7t6s63C-bZbTGfNHMlJP9SIa8Y0=",
            "https://img.jagranjosh.com/images/2022/December/6122022/find-mistake-in-woodcutter-picture.jpg",
            "https://www.imagineforest.com/blog/wp-content/uploads/2021/12/asian-woman-5450041_640.jpg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrdDVYMKfaeqEwL2yoSkUoDo9DwubtBWPoFQ&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSsT1ywvpJygR-nbbyfsWaUc3yp_nfs6DVXyWZL3jGual4NmFBOWNW32D8u3OL9PYhDyr0&usqp=CAU"
        )
        val picture = findViewById<TextView>(R.id.picture)
        val imageView = findViewById<ImageView>(R.id.imageView)
        var count = 0
        picture.setOnClickListener {
                if (count != 10) {
                    Glide
                        .with(this)
                        .load(listPofPicture[count])
                        .into(imageView)
                    count++
                } else {
                    count = 0
                    Glide
                        .with(this)
                        .load(listPofPicture[count])
                        .into(imageView)
                    count++
                }
            }
        }
}