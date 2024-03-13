package ua.edu.lntu.cw_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.cw_3.ui.theme.IPZ_CW_3_Zhuk_IlliaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_3_Zhuk_IlliaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardColumn()
                }
            }
        }
    }
}

@Composable
fun CardColumn()
{
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        repeat(5) {
            CardItem(index = it)
        }
    }
}

@Composable
fun CardItem(index: Int)
{
    var isExpanded by remember { mutableStateOf(false) }
    val cardHeight = if (isExpanded) 225.dp else 100.dp

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(cardHeight)
            .clickable { isExpanded = !isExpanded },
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text()
            Image()
            if (isExpanded)
            {
                Text()
            }
        }
    }
}
