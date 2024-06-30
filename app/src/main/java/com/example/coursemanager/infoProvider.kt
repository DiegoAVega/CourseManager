package com.example.coursemanager

data class Task(val name: String, val description: String)

class Course(val name:String , val tasks:List<Task> = mutableListOf())
object InfoProvider {

     val courses = mutableListOf<Course>(Course("Course1", mutableListOf(Task("Homework 1","Description 1"))))
    val tasks = mutableListOf<Task>()

    fun addCourse(course:Course){
        courses.add(course)
    }

    fun addTask(task:Task){
        tasks.add(task)
    }

}