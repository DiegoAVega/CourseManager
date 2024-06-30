package com.example.coursemanager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CoursesAdapter(private val courses: List<Course>, private val callback: (Int) -> Unit):
    RecyclerView.Adapter<CoursesAdapter.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_course, parent, false)
        return CourseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.setup(courses[position])
        holder.itemView.setOnClickListener { callback(position) }
    }

    override fun getItemCount(): Int = courses.size

    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val courseTitle: TextView = itemView.findViewById(R.id.courseTitle)

        fun setup(course: Course) {
            courseTitle.text = course.toString()
        }
    }
}