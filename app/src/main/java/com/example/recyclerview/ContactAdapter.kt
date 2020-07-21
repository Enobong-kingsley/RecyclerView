package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class ContactAdapter internal constructor(context : Context) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder> (){
    var contactlist = ArrayList<Contacts>()
    val layoutInflator : LayoutInflater = LayoutInflater.from(context)
    private lateinit var onContactClicked: OnContactClicked

    fun setOnClickedListener(OnContactClicked: OnContactClicked){
        this.onContactClicked = OnContactClicked
    }

    interface OnContactClicked{
        fun onClicked(contact: Contacts)
    }

    class ContactViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val name : TextView = itemView.findViewById(R.id.contactName)
        val profileImage : CircleImageView = itemView.findViewById(R.id.profile_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
       val view:View= layoutInflator.inflate(R.layout.contact_list,parent,false)
        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contactlist.size

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact : Contacts = contactlist[position]
        holder.name.text = currentContact.Name
        holder.profileImage.setImageResource(currentContact.ProfileImage)
        holder.itemView.setOnClickListener { onContactClicked.onClicked(currentContact) }
    }
    fun setdata (contacts: ArrayList<Contacts>, context: Context){
         this.contactlist =contacts
        notifyDataSetChanged()

    }
}