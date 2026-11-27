package me.doruk.plumwatch.ui

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.togetherWith
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale
import kotlinx.coroutines.delay

private data class SimulatorApp(
    val name: String,
    val glyph: String,
    val accent: Color,
    val description: String
)

private val simulatorApps = listOf(
    SimulatorApp("Activity", "⌁", Color(0xFFEF5261), "Daily movement and activity"),
    SimulatorApp("Heart Rate", "♥", Color(0xFFFF526C), "Heart-rate sensor preview"),
    SimulatorApp("Settings", "⚙", Color(0xFF9CA3AF), "Watch preferences"),
    SimulatorApp("Calculator", "÷", Color(0xFF8B79F7), "Quick calculations"),
    SimulatorApp("Stopwatch", "◷", Color(0xFF55A8E8), "Elapsed time"),
    SimulatorApp("Music", "♫", Color(0xFFCF79E8), "Playback controls"),
    SimulatorApp("Weather", "☼", Color(0xFFF1B95B), "Local weather preview"),
    SimulatorApp("Calendar", "27", Color(0xFF69B987), "Calendar"),
    SimulatorApp("Messages", "●", Color(0xFF5CBE8A), "Notifications")
)

@Composable
fun FirmwareSimulatorScreen(onBack: () -> Unit) {
    BackHandler(onBack = onBack)

    var display by rememberSaveable { mutableStateOf("face") }
    var selectedApp by rememberSaveable { mutableStateOf("Activity") }
    var currentTime by remember { mutableStateOf(LocalDateTime.now()) }

    LaunchedEffect(Unit) {
        while (true) {
            currentTime = LocalDateTime.now()
            delay(1_000L)
        }
    }

    val clockText = remember(currentTime) {
        currentTime.format(DateTimeFormatter.ofPattern("HH:mm"))
    }
    val dateText = remember(currentTime) {
        currentTime.format(DateTimeFormatter.ofPattern("EEE, d MMM", Locale.getDefault()))
            .uppercase(Locale.getDefault())
    }
    val crownAction: () -> Unit = {
        display = when (display) {
            "face" -> "menu"
            "menu" -> "face"
            else -> "menu"
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(horizontal = 18.dp)
            .padding(top = 18.dp, bottom = 112.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape)
                    .clickable(onClick = onBack),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Outlined.ArrowBack,
                    contentDescription = "Back to My Watch",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
            Text(
                text = "Simulator",
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = 28.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = (-0.7).sp
            )
            Text(
                text = "PREVIEW",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.2.sp
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .width(248.dp)
                        .height(312.dp)
                        .shadow(20.dp, RoundedCornerShape(58.dp))
                        .clip(RoundedCornerShape(58.dp))
                        .background(
                            Brush.linearGradient(
                                listOf(
                                    Color(0xFF747982),
                                    Color(0xFF282B32),
                                    Color(0xFF555A63),
                                    Color(0xFF202329)
                                )
                            )
                        )
                        .border(
                            width = 1.dp,
                            brush = Brush.linearGradient(
                                listOf(Color(0xFFD5D8DE), Color(0xFF41454D), Color(0xFFAEB3BC))
                            ),
                            shape = RoundedCornerShape(58.dp)
                        )
                        .padding(10.dp)
                        .clip(RoundedCornerShape(48.dp))
                        .background(Color(0xFF020305))
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 7.dp, vertical = 8.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 5.dp, vertical = 1.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text("●", color = Color(0xFF72CE94), fontSize = 7.sp)
                            Text("84%", color = Color(0xFFB8BBC3), fontSize = 8.sp)
                        }

                        AnimatedContent(
                            targetState = display,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 4.dp),
                            transitionSpec = {
                                (fadeIn(tween(180)) + scaleIn(
                                    initialScale = 0.96f,
                                    animationSpec = tween(220)
                                )) togetherWith (fadeOut(tween(120)) + scaleOut(
                                    targetScale = 1.03f,
                                    animationSpec = tween(150)
                                ))
                            },
                            label = "simulator-watch-screen"
                        ) { activeDisplay ->
                            when (activeDisplay) {
                                "face" -> WatchFacePreview(
                                    time = clockText,
                                    date = dateText,
                                    onOpenMenu = { display = "menu" }
                                )
                                "menu" -> WatchAppMenu(
                                    apps = simulatorApps,
                                    onAppSelected = { app ->
                                        selectedApp = app.name
                                        display = "app"
                                    }
                                )
                                else -> WatchAppPreview(
                                    app = simulatorApps.firstOrNull { it.name == selectedApp }
                                        ?: simulatorApps.first(),
                                )
                            }
                        }
                    }
                }

                Box(
                    modifier = Modifier
                        .width(37.dp)
                        .height(312.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .offset(x = (-5).dp, y = (-22).dp)
                            .size(38.dp)
                            .shadow(5.dp, CircleShape)
                            .clip(CircleShape)
                            .background(
                                Brush.linearGradient(
                                    listOf(Color(0xFFE0E3E8), Color(0xFF777D86), Color(0xFFD0D4DB))
                                )
                            )
                            .border(1.dp, Color(0xFF343840), CircleShape)
                            .clickable(onClick = crownAction),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                            repeat(3) {
                                Box(
                                    modifier = Modifier
                                        .width(2.dp)
                                        .height(17.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFF51565F))
                                )
                            }
                        }
                    }

                    Box(
                        modifier = Modifier
                            .offset(x = (-1).dp, y = 38.dp)
                            .width(12.dp)
                            .height(44.dp)
                            .shadow(3.dp, RoundedCornerShape(topEnd = 5.dp, bottomEnd = 5.dp))
                            .clip(RoundedCornerShape(topEnd = 5.dp, bottomEnd = 5.dp))
                            .background(
                                Brush.horizontalGradient(
                                    listOf(Color(0xFF373B42), Color(0xFF9DA3AC), Color(0xFF555A62))
                                )
                            )
                            .border(0.5.dp, Color(0xFFB8BDC5), RoundedCornerShape(topEnd = 5.dp, bottomEnd = 5.dp))
                    )
                }
            }
        }

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(
                text = "DIGITAL CROWN",
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 11.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 1.2.sp
            )
            Text(
                text = "Tap to open the menu, return to the watch face, or exit an app.",
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 12.sp,
                lineHeight = 17.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = "Interactive UI preview · watch sensors are simulated",
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.72f),
                fontSize = 10.sp,
                textAlign = TextAlign.Center
            )
        }

        // Keep the lambda referenced in composition so the visible crown remains the primary control.
        @Suppress("UNUSED_EXPRESSION")
        crownAction
    }
}

@Composable
private fun WatchFacePreview(
    time: String,
    date: String,
    onOpenMenu: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(36.dp))
            .clickable(onClick = onOpenMenu)
            .padding(horizontal = 5.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "PLUM",
            color = Color(0xFFB18BFF),
            fontSize = 11.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 3.sp
        )
        Spacer(Modifier.height(13.dp))
        Text(
            text = date,
            color = Color(0xFFA1A1AA),
            fontSize = 10.sp,
            fontWeight = FontWeight.Medium,
            letterSpacing = 0.8.sp
        )
        Text(
            text = time,
            color = Color(0xFFF4F4F5),
            fontSize = 48.sp,
            fontWeight = FontWeight.Light,
            letterSpacing = (-2.3).sp
        )
        Spacer(Modifier.height(15.dp))
        Text(
            text = "Tap screen to open apps",
            color = Color(0xFF737780),
            fontSize = 9.sp
        )
    }
}

@Composable
private fun WatchAppMenu(
    apps: List<SimulatorApp>,
    onAppSelected: (SimulatorApp) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 3.dp, vertical = 5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "APPS",
            color = Color(0xFFB18BFF),
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 2.sp
        )
        Spacer(Modifier.height(8.dp))
        apps.chunked(3).forEach { rowApps ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                rowApps.forEach { app ->
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(13.dp))
                            .clickable { onAppSelected(app) }
                            .padding(vertical = 8.dp, horizontal = 2.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(39.dp)
                                .clip(CircleShape)
                                .background(app.accent.copy(alpha = 0.19f))
                                .border(1.dp, app.accent.copy(alpha = 0.5f), CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = app.glyph,
                                color = app.accent,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                        Text(
                            text = app.name,
                            color = Color(0xFFE4E4E7),
                            fontSize = 8.sp,
                            fontWeight = FontWeight.Medium,
                            maxLines = 1,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                repeat(3 - rowApps.size) {
                    Spacer(Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
private fun WatchAppPreview(app: SimulatorApp) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp, vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(62.dp)
                .clip(CircleShape)
                .background(app.accent.copy(alpha = 0.18f))
                .border(1.dp, app.accent.copy(alpha = 0.58f), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = app.glyph,
                color = app.accent,
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        Spacer(Modifier.height(13.dp))
        Text(
            text = app.name,
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(7.dp))
        Text(
            text = when (app.name) {
                "Activity" -> "Move more today\n\nSteps     0 / 10,000"
                "Heart Rate" -> "--\nBPM\n\nSensor not connected"
                "Settings" -> "Display\nSounds\nAbout"
                "Calculator" -> "0\n\n7  8  9\n4  5  6\n1  2  3"
                "Stopwatch" -> "00:00.00\n\nStart"
                "Music" -> "Nothing playing\n\nPrevious    Play    Next"
                "Weather" -> "--°\n\nWeather unavailable"
                "Calendar" -> "Today\n\nNo events"
                else -> "No new messages"
            },
            color = Color(0xFFD4D4D8),
            fontSize = 12.sp,
            lineHeight = 19.sp,
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(17.dp))
        Text(
            text = "Press crown to return",
            color = Color(0xFF858994),
            fontSize = 9.sp
        )
    }
}
