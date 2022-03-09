package com.example.tablestest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.tablestest.ui.theme.TablesTestTheme

class MainActivity : ComponentActivity() {

    val names = listOf(
        "Mushegh",
        "Stephan",
        "Anna",
        "Victor",
        "Natan",
        "Oliver",
        "James",
        "Amelia",
        "Sophia",
        "Charlotte",
        "William",
        "Liam",
        "Noah",
        "Harper",
        "Mia",
        "James",
        "Benjamin",
        "Lucas",
        "Henry",
        "Benjamin",
        "Alexander",
        "Isabella",
        "Emma",
        "Olga",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TablesTestTheme {
                Scaffold {
                    MyTable()
                }
            }
        }
    }

    @Preview
    @Composable
    fun MyTable() {
        LazyColumn() {

            itemsIndexed(items = names) { index, item ->

                Text(text = item)

            }

        }
    }

}

