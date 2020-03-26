package com.example.comletogerson


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_hasil.*
import kotlinx.android.synthetic.main.fragment_ipunt.*

/**
 * A simple [Fragment] subclass.
 */
class HasilFragment : Fragment() {
    lateinit var nav : NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hasil, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nav = Navigation.findNavController(view)
        buttonBackHasil.setOnClickListener{
            nav.navigate(R.id.action_hasilFragment_to_ipuntFragment)
        }
        val hasilTangkap = arguments?.getString("args")

        textHasil.text = hasilTangkap
    }
}
