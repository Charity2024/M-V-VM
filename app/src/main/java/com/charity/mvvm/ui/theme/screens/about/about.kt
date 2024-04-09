import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charity.mvvm.navigation.ROUTE_ABOUT
import com.charity.mvvm.navigation.ROUTE_HOME


@Composable
fun AboutScreen (navcontroller: NavHostController){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(text = "This is AboutScreen",
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Magenta
        )
        Spacer(modifier = Modifier.height(25.dp))
        Button(onClick = {
            navcontroller.navigate(ROUTE_HOME)
        },
            modifier= Modifier
                .width(300.dp)) {
            Text(text = "Home page")

        }


    }
}
@Preview
@Composable
private fun Homeprev(){
    AboutScreen(navcontroller = rememberNavController())
}