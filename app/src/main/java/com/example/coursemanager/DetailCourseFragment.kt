package com.example.coursemanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class DetailCourseFragment : Fragment() {
    lateinit var addButton: Button
    val args: DetailCourseFragmentArgs by navArgs()
    private lateinit var titleTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_detail_course, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.CoursesRecyclerView2)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        recyclerView.adapter = CoursesAdapter(InfoProvider.courses) { position ->

            findNavController().navigate(DetailCourseFragmentDirections.actionDetailCourseFragmentToTaskDetailFragment(position))
        }


        println(args.position)

        addButton = view.findViewById(R.id.btnCircular2)
        addButton.setOnClickListener{
            findNavController().navigate(R.id.action_detailCourseFragment_to_addTaskFragment)}
        titleTextView = view.findViewById(R.id.textViewTitle)
        titleTextView.text = InfoProvider.courses[args.position].toString()
        return view
    }

}