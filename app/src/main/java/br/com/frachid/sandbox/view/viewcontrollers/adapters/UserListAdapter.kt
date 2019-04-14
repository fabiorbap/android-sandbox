package br.com.frachid.sandbox.view.viewcontrollers.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import br.com.frachid.sandbox.model.models.UserModel
import br.com.frachid.sandbox.view.components.Cell

class UserListAdapter(var users: List<UserModel>? = listOf()) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        return ViewHolder(Cell(p0.context))
    }

    override fun getItemCount(): Int {
        return users?.size ?: 0
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        val userCell = p0.itemView as Cell
        with(userCell){
            setTopText(users?.get(p1)?.name ?: "")
            setBottomText(users?.get(p1)?.email ?: "")
        }
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

}