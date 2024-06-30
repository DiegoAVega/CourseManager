package com.example.coursemanager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
class AddTaskFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=inflater.inflate(R.layout.fragment_add_task, container, false)

        val taskNameEditText = view.findViewById<EditText>(R.id.editTextText)
        val taskDescriptionEditText = view.findViewById<EditText>(R.id.editTextTextMultiLine)
        val saveButton = view.findViewById<Button>(R.id.saveButton)


        saveButton.setOnClickListener {

            val taskName = taskNameEditText.text.toString()
            val taskDescription = taskDescriptionEditText.text.toString()


            val task = Task(taskName,taskDescription)
            InfoProvider.addTask(task)

            findNavController().popBackStack()
    }
        return view

    }

}