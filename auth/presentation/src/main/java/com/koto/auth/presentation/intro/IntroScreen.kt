package com.koto.auth.presentation.intro

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.koto.core.presentation.designsystem.RuniqueTheme
import com.koto.core.presentation.designsystem.components.GradientBackground

@Composable
fun IntroScreenRoot(
    onSignUpClick: () -> Unit,
    onSignInClick: () -> Unit,
) {
    IntroScreen(
        onAction = { action ->
            when(action) {
                IntroAction.OnSignInClick -> onSignInClick()
                IntroAction.OnSignUpClick -> onSignUpClick()
            }
        }
    )
}

@Composable
fun IntroScreen(
    onAction: (IntroAction) -> Unit
) {
    GradientBackground {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center,
        ) {
            // todo
        }
    }
}

@Preview
@Composable
private fun IntroScreenPreview() {
    RuniqueTheme {
        IntroScreen(
            onAction = {}
        )
    }
}