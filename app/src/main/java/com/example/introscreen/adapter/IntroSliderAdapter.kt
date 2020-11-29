package com.example.introscreen.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.introscreen.R
import com.example.introscreen.data.IntroSlide
import kotlinx.android.synthetic.main.activity_main.view.*

class IntroSliderAdapter(private val introSlider: List<IntroSlide>):
RecyclerView.Adapter<IntroSliderAdapter.IntroSliderViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSliderViewHolder {
        return IntroSliderViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slide_item_container,
                parent,false
            )
        )
    }

    override fun getItemCount(): Int {
        return introSlider.size
    }

    override fun onBindViewHolder(holder: IntroSliderViewHolder, position: Int) {
        holder.bind(introSlider [position])
    }

    inner class IntroSliderViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private  val textTitleee =view.findViewById<TextView>(R.id.textTitlee)
        private  val textDescrip1 =view.findViewById<TextView>(R.id.textDescription1)
        private  val textDescrip2 =view.findViewById<TextView>(R.id.textDescription2)
        private  val imageSs =view.findViewById<ImageView>(R.id.imageSlideIcon)

        fun bind( introSlider: IntroSlide){
            textTitleee.text = introSlider.title
            textDescrip1.text = introSlider.description
            textDescrip2.text = introSlider.description2
            imageSs.setImageResource(introSlider.icon)
        }
    }

}