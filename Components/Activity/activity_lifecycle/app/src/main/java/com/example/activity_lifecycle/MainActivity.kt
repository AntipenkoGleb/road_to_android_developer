package com.example.activity_lifecycle

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView : TextView


    /*
     When the activity created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = this.findViewById(R.id.textView)
        addStateText("Create")
    }

    /*
        When the activity visible to the user.
     */
    override fun onStart() {
        super.onStart()
        addStateText("Start")
    }

    /*
      This is the state in which the app interacts with the user.
    */
    override fun onResume() {
        super.onResume()
        addStateText("Resume\n==========")
    }

    /*
      When the user is leaving the activity, it indicates that the activity is no longer in the foreground.
    */
    override fun onPause() {
        super.onPause()
        addStateText("Pause")
    }

    /*
       When your activity is no longer visible to the user
    */
    override fun onStop() {
        super.onStop()
        addStateText("Stop")
    }

    /*
       Called after the activity has been stopped, prior to it being started again.
    */
    override fun onRestart() {
        super.onRestart()
        addStateText("Restart")
    }

    /*
       Called before the activity is destroyed
    */
    override fun onDestroy() {
        Toast.makeText(this,"Destroy",Toast.LENGTH_LONG).show()
        super.onDestroy()
    }

    @SuppressLint("SetTextI18n")
    private fun addStateText(str:String){
        textView.text = "${textView.text}\n$str"
    }
}