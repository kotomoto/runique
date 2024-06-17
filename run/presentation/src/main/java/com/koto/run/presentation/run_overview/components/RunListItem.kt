@file:OptIn(ExperimentalFoundationApi::class)

package com.koto.run.presentation.run_overview.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.koto.core.domain.location.Location
import com.koto.core.domain.run.Run
import com.koto.core.presentation.designsystem.RuniqueTheme
import com.koto.run.presentation.run_overview.mapper.toRunUi
import com.koto.run.presentation.run_overview.model.RunDataUi
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
    var showDropdown by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(15.dp))
            .background(MaterialTheme.colorScheme.surface)
            .combinedClickable(
                onClick = {},
                onLongClick = {
                    showDropdown = true
                }
            )
            .padding(16.dp),
    ) {

    }
}

@Composable
private fun DataGridCell(
    modifier: Modifier = Modifier,
    runData: RunDataUi,
) {
    Column(
        modifier = modifier,
    ) {
        Text(
            text = runData.name,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            fontSize = 12.sp,
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = runData.value,
            color = MaterialTheme.colorScheme.onSurface,
        )
    }
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
