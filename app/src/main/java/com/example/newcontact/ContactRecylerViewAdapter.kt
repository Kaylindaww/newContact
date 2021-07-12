package com.example.newcontact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactRecylerViewAdapter(var contactLst:List< Contacts>):RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
      var currentContacts=contactLst[position]
        holder.name.text=currentContacts.name
        holder.phoneNumber.text=currentContacts.PhoneNumber
        holder.email.text=currentContacts.Email
        Picasso.get().load(currentContacts.image).into(holder.person)
    }

    override fun getItemCount(): Int {
     return  contactLst.size
    }
}


class ContactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var name=itemView.findViewById<TextView>(R.id.tvName)
    var phoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var email=itemView.findViewById<TextView>(R.id.tvEmail)
    var person=itemView.findViewById<ImageView>(R.id.imgPerson)
}