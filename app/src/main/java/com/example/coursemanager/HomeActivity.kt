package com.example.coursemanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val courses = listOf("Course 1", "Course 2", "Course 3") // List of courses
        val recyclerView: RecyclerView = findViewById(R.id.CoursesRecyclerView1)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CoursesAdapter(courses) { course ->
            openDetailFragment(course)
        }
    }

    private fun openDetailFragment(course: String) {
        val fragment = DetailCourseFragment()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }}