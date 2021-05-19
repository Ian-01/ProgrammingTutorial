package com.example.programmingtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {


    private lateinit var vpCategories: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        vpCategories = findViewById(R.id.vp_categories)


        bindViewPager()

    }


    private fun bindViewPager() {
        val tempViewPagerAdapter = CategoriesViewPagerAdapter(supportFragmentManager)

        tempViewPagerAdapter.addFragment(PythonTutorialFragment())
        tempViewPagerAdapter.addFragment(ComingSoonTutorialFragment())

        vpCategories.adapter = tempViewPagerAdapter


    }
}