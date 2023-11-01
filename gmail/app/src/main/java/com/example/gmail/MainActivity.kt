package com.example.gmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private lateinit var emailAdapter: EmailAdapter
    private var emailList = ArrayList<EmailModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tạo dữ liệu giả
        generateFakeData()

        listView = findViewById(R.id.listView)
        emailAdapter = EmailAdapter(emailList)
        listView.adapter = emailAdapter
    }

    private fun generateFakeData() {
        // Tạo và thêm dữ liệu giả vào danh sách emailList
        emailList.add(EmailModel("Yamato", "Goalllll", "avatar11", "11:00 AM", true))
        emailList.add(EmailModel("Luffy", "Kingggg", "avatar12", "12:20 AM", false))
        emailList.add(EmailModel("Rorono Zora", "Queeeeen", "avatar13", "Yesterday", true))
        emailList.add(EmailModel("Mganga", "Buggggggyyyyy", "avatar14", "2h ago", false))
        emailList.add(EmailModel("Mgenlang", "Shankssss", "avatar7", "11:45 AM", false))
        emailList.add(EmailModel("Nami", "Shakeeee", "avatar8", "12:30 PM", true))
        emailList.add(EmailModel("Sanji", "He!He!", "avatar9", "Yesterday", false))
        emailList.add(EmailModel("Ussop", "Bach phat bach trung", "avatar10", "1 days ago", true))
        emailList.add(EmailModel("Chopper", "Mai gap lai nha", "avatar3", "10:15 AM", true))
        emailList.add(EmailModel("Jinbei", "Ca vang", "avatar4", "Yesterday", false))
        emailList.add(EmailModel("Brook", "Khong biet noi gi", "avatar5", "2 days ago", false))
        emailList.add(EmailModel("Robin", "Hoaaaaa", "avatar6", "Last week", true))
    }
}