package com.koto.run.location

import android.location.Location
import com.koto.core.domain.location.LocationWithAltitude

fun Location.toLocationWithAltitude(): LocationWithAltitude {
    return LocationWithAltitude(
        location = com.koto.core.domain.location.Location(
            lat = latitude,
            long = longitude,
        ),
        altitude = altitude
    )
}
