package com.example.coursemanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CourseListFragment : Fragment() {
    lateinit var addButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_course_list, container, false)
        val courses = listOf("Course 1", "Course 2", "Course 3") // List of courses
        val recyclerView: RecyclerView = view.findViewById(R.id.CoursesRecyclerView1)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        recyclerView.adapter = CoursesAdapter(courses) { course ->
        }
        addButton=view.findViewById(R.id.btnCircular1)
        addButton.setOnClickListener{
            findNavController().navigate(R.id.action_courseListFragment_to_addTaskFragment)
        }
        return view
    }
}