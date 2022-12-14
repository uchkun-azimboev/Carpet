package uz.pdp.carpet.ui.main.factory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.pdp.carpet.R
import uz.pdp.carpet.databinding.FragmentEmployeeBinding
import uz.pdp.carpet.databinding.FragmentFactoryBinding


class FactoryFragment : Fragment() {

    private var _bn: FragmentFactoryBinding? = null
    private val bn get() = _bn!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _bn = FragmentFactoryBinding.inflate(inflater, container, false)
        return bn.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _bn = null
    }
}