package com.example.coursemanager

object InfoProvider {

     val courses = mutableListOf<String>("Course 01")

    fun addCourse(course: String) {
        courses.add(course)
    }

}