package com.zmei.a21lessonsarray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zmei.a21lessonsarray.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind : ActivityMainBinding
    var invest = arrayOf(1233, 4444, 2222, 5555, 90000, 550)
    var earn = arrayOf(1200, 33, 234,44,22222,4444)
    var resultList = arrayListOf<String>()



    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)

        val names = resources.getStringArray(R.array.names)

        for ((index, name) in names.withIndex()){

            resultList.add("Name: $name - earn = ${earn[index]-invest[index]}")

        }
        bind.textView.text = resultList[0]
        bind.textView2.text = resultList[1]
        bind.textView3.text = resultList[2]
        bind.textView4.text = resultList[3]
        bind.textView5.text = resultList[4]
        bind.textView6.text = resultList[5]

        val bad = 0..3
        val normal = 4..6
        val nice = 7..9
        val excellent = 10
        val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
        val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
        val badArray = ArrayList<String>()
        val normalArray = ArrayList<String>()
        val niceArray = ArrayList<String>()
        val excellentArray = ArrayList<String>()


        for (index in 0 until gradeArray.size ) {
        if (gradeArray[index] in bad){

            if (nameArray.indices == nameArray.indices) {
            Log.d("my log", "Плохие оценки: Ученик: ${nameArray[index]} -${gradeArray[index]}")}}}

        for (index in 0 until gradeArray.size ) {
        if (gradeArray[index] in normal){

            if (nameArray.indices == nameArray.indices) {
            Log.d("my log", "Нормальные оценки: Ученик: ${nameArray[index]} -${gradeArray[index]}")}}}

        for (index in 0 until gradeArray.size ) {
        if (gradeArray[index] in nice){

            if (nameArray.indices == nameArray.indices) {
            Log.d("my log", "Хорошие оценки: Ученик: ${nameArray[index]} -${gradeArray[index]}")}}}

        for (index in 0 until gradeArray.size ) {
        if (gradeArray[index] == excellent) {
                if (nameArray.indices == nameArray.indices) {
                    Log.d("my log", "Отличные оценки: Ученик:${nameArray[index]} - ${gradeArray[index]}")

                }}
        }

    }
}