package com.example.comletogerson


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_ipunt.*
import kotlinx.android.synthetic.main.fragment_utama.*

/**
 * A simple [Fragment] subclass.
 */
class IpuntFragment : Fragment() {
    lateinit var nav : NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ipunt, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        buttonSubmit.setOnClickListener{
            if(editText.text.toString().isNotEmpty()){
                val input = editText.text.toString()
                val bundle = Bundle()
                bundle.putString("args", input)

                nav.navigate(R.id.action_ipuntFragment_to_hasilFragment, bundle)
            }
        }
        buttonBackInput.setOnClickListener{
            nav.navigate(R.id.action_ipuntFragment_to_utamaFragment)
        }
    }
}
