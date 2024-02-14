package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter /* Step 3a: Provide Adapter Parent */
    (_numbers: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

        private val numbers = _numbers

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView)

    //Step 3b: Complete function definitions for adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder (
            TextView(
                parent.context
            ).apply {
                layoutParams = ViewGroup.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            }
        )
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.textSize = numbers[position].toFloat()
        holder.textView.text = numbers[position].toString()
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

}