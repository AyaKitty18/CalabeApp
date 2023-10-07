package com.example.calabe

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val boutonFragment1 = view.findViewById<Button>(R.id.buttonBleu)

        boutonFragment1.setOnClickListener {
            val intent = Intent(activity, cp::class.java)
            startActivity(intent)
        }
        val boutonFragment2 = view.findViewById<Button>(R.id.buttonRouge)

        boutonFragment2.setOnClickListener {
            val intent = Intent(activity, act::class.java)
            startActivity(intent)
        }
    }
}
