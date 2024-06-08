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
import com.example.coursemanager.InfoProvider.addCourse
import com.example.coursemanager.InfoProvider.courses

class CourseListFragment : Fragment() {
    lateinit var addButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_course_list, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.CoursesRecyclerView1)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        recyclerView.adapter = CoursesAdapter(courses) { position ->
            println(position)
            findNavController().navigate(R.id.action_courseListFragment_to_detailCourseFragment)
        }
        addButton=view.findViewById(R.id.btnCircular1)
        addButton.setOnClickListener{
            findNavController().navigate(R.id.action_courseListFragment_to_addTaskFragment)
        }
        return view
    }
}