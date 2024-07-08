package com.koto.analytics.presentation

sealed interface AnalyticsAction {
    data object OnBackClick: AnalyticsAction
}
