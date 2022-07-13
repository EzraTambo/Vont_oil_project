package com.example.vont_oil_project.navdrawer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.vont_oil_project.R
import com.example.vont_oil_project.databinding.ActivityDashboardBinding
import com.example.vont_oil_project.registerlogin.LoginActivity
import com.google.firebase.auth.FirebaseAuth


class DashboardActivity : AppCompatActivity() {


    private val binding: ActivityDashboardBinding by lazy {
        ActivityDashboardBinding.inflate(layoutInflater)
    }
    private lateinit var user: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        user=FirebaseAuth.getInstance()

        if (user.currentUser != null) {
            user.currentUser?.let {

                binding.EmailId.text=it.email
            }
        }
        binding.signout.setOnClickListener {
            user.signOut()
            startActivity(
                Intent(this, LoginActivity::class.java)


            )
            finish()
        }
        binding.tow.setOnClickListener {

            val intent=Intent(this, MapsActivity::class.java).apply {

            };
            startActivity(intent);
        }
        binding.gasstation.setOnClickListener {

            val intent=Intent(this, MapsActivity::class.java).apply {

            };
            startActivity(intent);
        }
        binding.garage12.setOnClickListener {

            val intent=Intent(this, MapsActivity::class.java).apply {

            };
            startActivity(intent);
        }
        binding.mechanic12.setOnClickListener {

            val intent=Intent(this, MapsActivity::class.java).apply {

            };
            startActivity(intent);
        }

        binding.OilDelivery12.setOnClickListener {

            val intent=Intent(this, MapsActivity::class.java).apply {

            };
            startActivity(intent);


        }


    }

    fun getgarage(view: View) {

        val intent=Intent(this, MapsActivity::class.java).apply {

        };
        startActivity(intent)
    }

    fun CarTow(view: View) {


        val intent=Intent(this, MapsActivity::class.java).apply {

        };
        startActivity(intent)
    }

    fun oilDelivery(view: View) {

        val intent=Intent(this, MapsActivity::class.java).apply {

        };
        startActivity(intent)
    }

    fun Mechanic(view: View) {

        val intent=Intent(this, MapsActivity::class.java).apply {

        };
        startActivity(intent)
    }
}
