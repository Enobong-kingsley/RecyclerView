package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), ContactAdapter.OnContactClicked {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView : RecyclerView = findViewById(R.id.recyclerview)
        var contactsAdapter = ContactAdapter(this)

        recyclerView.adapter= contactsAdapter
        recyclerView.layoutManager =  LinearLayoutManager(this)
        contactsAdapter.setOnClickedListener(this)
        contactsAdapter.setdata(dataSource(), this)


    }
    fun dataSource () : ArrayList<Contacts>{
        val contactList = ArrayList<Contacts>()
        contactList.add(Contacts("Enobong Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Percy ", "07038751089", R.drawable.ic_launcher_background))
        contactList.add(Contacts("Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Enobong Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Percy ", "07038751089", R.drawable.ic_launcher_background))
        contactList.add(Contacts("Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Enobong Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Percy ", "07038751089", R.drawable.ic_launcher_background))
        contactList.add(Contacts("Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Enobong Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Percy ", "07038751089", R.drawable.ic_launcher_background))
        contactList.add(Contacts("Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Enobong Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Percy ", "07038751089", R.drawable.ic_launcher_background))
        contactList.add(Contacts("Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Enobong Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Percy ", "07038751089", R.drawable.ic_launcher_background))
        contactList.add(Contacts("Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Enobong Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Percy ", "07038751089", R.drawable.ic_launcher_background))
        contactList.add(Contacts("Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Enobong Kingsley", "08155676415", R.drawable.percy))
        contactList.add(Contacts("Percy ", "07038751089", R.drawable.ic_launcher_background))
        contactList.add(Contacts("Kingsley", "08155676415", R.drawable.percy))
        return contactList
    }

    override fun onClicked(contact: Contacts) {
        val intent = Intent(this,ContactDetails :: class.java)
        startActivity(intent)
        Toast.makeText(this,"contact clicked is $contact", Toast.LENGTH_LONG).show()
    }
}