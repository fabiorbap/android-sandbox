package br.com.frachid.sandbox.view.viewcontrollers

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import br.com.frachid.sandbox.R
import br.com.frachid.sandbox.view.viewcontrollers.adapters.UserListAdapter
import br.com.frachid.sandbox.viewmodel.UserFormViewModel
import br.com.frachid.sandbox.viewmodel.UserListViewModel
import kotlinx.android.synthetic.main.activity_user_list.*

class UserListActivity : BaseActivity() {

    private val viewModel by lazy{  ViewModelProviders.of(this).get(UserListViewModel::class.java) }

    private val adapter by lazy { UserListAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_user_list)
        setupFAB()
        setupToolbar(showBackButton = true, toolbarTitle = getString(R.string.user_list_title))
        setupRecyclerView()
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        adapter.users = viewModel.getUsers()
        adapter.notifyDataSetChanged()
        super.onStart()
    }

    private fun setupFAB() {
        userListAddUser.setOnClickListener {
            startActivity(Intent(this, UserFormActivity::class.java))
        }
    }

    private fun setupRecyclerView(){
        userList.layoutManager = LinearLayoutManager(this)
        userList.adapter = adapter
    }



}