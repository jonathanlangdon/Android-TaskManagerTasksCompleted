package com.example.taskmanager_taskscompleted

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun PageText(title: String, encourage: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                )
        )
        Text(
            text = encourage,
            fontSize = 16.sp,
            modifier = Modifier
        )
    }
}

@Composable
fun TasksCompletedPage(title: String, encourage: String, modifier: Modifier = Modifier) {
    val checkMarkImage = painterResource(R.drawable.ic_task_completed)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = checkMarkImage,
            contentDescription = null,
            contentScale = ContentScale.None
        )
        PageText(
            title = title, encourage = encourage, modifier = Modifier
        )
    }
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