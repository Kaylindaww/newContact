package com.example.newcontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var contact:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contact=findViewById(R.id.rvContacts)

        var allContacts= listOf(Contacts("Kay Linda","+256712345678","kaylinda@gmail.com","link"),
            Contacts("Victorine Amani","+256712345678","victorineamani@gmail.com","link"),
            Contacts("Sophie Robert","+256712345678","sophierobert@gmail.com","link"),
            Contacts("Resty Sandra","+256712345678","restysandra@gmail.com","link"),
            Contacts("Stella Chepu","+256712345678","stellachepu@gmail.com","link"),
            Contacts("Favour Kim","+256712345678","favourkim@gmail.com","link"))

        var contactAdapter=ContactRecylerViewAdapter(allContacts)
        contact.layoutManager=LinearLayoutManager(baseContext)
        contact.adapter=contactAdapter


    }
}