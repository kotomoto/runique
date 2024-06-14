package com.koto.run.presentation.run_overview.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.koto.core.domain.location.Location
import com.koto.core.domain.run.Run
import com.koto.core.presentation.designsystem.RuniqueTheme
import com.koto.run.presentation.run_overview.mapper.toRunUi
import com.koto.run.presentation.run_overview.model.RunUi
import java.time.ZonedDateTime
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

@Composable
fun RunListItem(
    modifier: Modifier = Modifier,
    runUi: RunUi,
    onDeleteClick: () -> Unit,
) {

}

@Preview
@Composable
private fun RunListItemPreview() {
    RuniqueTheme {
        RunListItem(
            runUi = Run(
                id = "123",
                duration = 10.minutes + 30.seconds,
                dateTimeUtc = ZonedDateTime.now(),
                distanceMeters = 2353,
                location = Location(0.0, 0.0),
                maxSpeedKmh = 15.345,
                totalElevationMeters = 123,
                mapPictureUrl = null,
            ).toRunUi(),
            onDeleteClick = {},
        )
    }
}
