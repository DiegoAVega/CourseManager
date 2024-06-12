package com.example.coursemanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs


class DetailCourseFragment : Fragment() {

    val args: DetailCourseFragmentArgs by navArgs()
    private lateinit var titleTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        println(args.position)
        val view = inflater.inflate(R.layout.fragment_detail_course, container, false)
        titleTextView = view.findViewById(R.id.textViewTitle)
        titleTextView.text = InfoProvider.courses[args.position]
        return view
    }


}