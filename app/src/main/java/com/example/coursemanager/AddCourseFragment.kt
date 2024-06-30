package com.example.coursemanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class AddCourseFragment : Fragment() {
    lateinit var addButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_course, container, false)

        addButton=view.findViewById(R.id.saveButtonCourse)
        addButton.setOnClickListener{
            findNavController().popBackStack()
        }

        return view
    }
}