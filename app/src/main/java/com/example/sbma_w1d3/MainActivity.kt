package com.example.sbma_w1d3

import android.content.res.Configuration
import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sbma_w1d3.ui.theme.SBMAw1d3Theme
import com.example.sbma_w1d3.ui.theme.md_theme_light_primary


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SBMAw1d3Theme {
                Surface(
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.background
                ) {
                    MessageCard(Message("Lexi", "Jetpack Compose"))
                }
            }
        }
    }
}
data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: com.example.sbma_w1d3.Message) {
    Column {

        Box(
            modifier = Modifier
                .height(10.dp)
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(8.dp)
                    .padding(end = 0.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    modifier = Modifier,
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(5.dp))
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(8.dp)
                    .padding(end = 10.dp)
                    .align(Alignment.TopEnd)
            ) {
                Icon(
                    imageVector = Icons.Default.ThumbUp,
                    modifier = Modifier,
                    contentDescription = null
                )
            }
        }
        Card(
            modifier = Modifier
                .height(350.dp)
                .padding(top = 55.dp)
                .padding(5.dp)
        ) {

            Column {
                Image(
                    painter = painterResource(id = R.drawable.patric),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.6F),
                    contentScale = ContentScale.FillWidth
                )
            }
            Row {
                Image(
                    painter = painterResource(R.drawable.humu),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(8.dp)
                        .size(45.dp)
                        .clip(CircleShape)
                        .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Column {
                    Text(
                        text = msg.author,
                        color = MaterialTheme.colorScheme.secondary,
                        style = MaterialTheme.typography.titleSmall
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Surface(shape = MaterialTheme.shapes.medium, shadowElevation = 1.dp) {
                        Text(
                            text = msg.body,
                            modifier = Modifier.padding(all = 4.dp),
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.End)
            ) {
                Icon(imageVector = Icons.Default.Send, contentDescription = null)
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = "Send")
            }
        }
    }
    Box(
        modifier = Modifier
            .background(md_theme_light_primary)
            .fillMaxWidth()
            .height(60.dp)
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(8.dp)
                .padding(end = 0.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                modifier = Modifier,
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(5.dp))
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(8.dp)
                .padding(end = 10.dp)
                .align(Alignment.TopEnd)
        ) {
            Icon(
                imageVector = Icons.Default.ThumbUp,
                modifier = Modifier,
                contentDescription = null
            )
        }
    }
}
@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Composable
fun PreviewMessageCard() {
    SBMAw1d3Theme {
        Surface {
            MessageCard(
                msg = Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!")
            )
        }
    }
}

