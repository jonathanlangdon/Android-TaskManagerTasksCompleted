package com.example.taskmanager_taskscompleted

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.taskmanager_taskscompleted.ui.theme.TaskManagerTasksCompletedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTasksCompletedTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TasksCompletedPage(
                        title = stringResource(R.string.all_tasks_completed),
                        encourage = stringResource(R.string.nice_work)
                    )
                }
            }
        }
    }
}

@Composable
fun TasksCompletedPage(title: String, encourage: String, modifier: Modifier = Modifier) {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTasksCompletedTheme {
        TasksCompletedPage(
            title = stringResource(R.string.all_tasks_completed),
            encourage = stringResource(R.string.nice_work)
        )
    }
}