package com.example.logindatabase

class ApiEndPoint {
    companion object {
        private val SERVER = "http://localhost/phpmyadmin/sql.php?server=1&db=login_database&table=table_users&pos=0"
        val TABLE_USERS = "users"

        val KEY_ID = "id"

        val KEY_USER_NAME = "username"

        val KEY_EMAIL = "email"

        val KEY_PASSWORD = "password"
    }
}