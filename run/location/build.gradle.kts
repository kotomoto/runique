plugins {
    alias(libs.plugins.runique.android.library)
}

android {
    namespace = "com.koto.run.location"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.material3)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.google.android.gms.play.services.location)

    debugImplementation(libs.androidx.compose.ui.tooling)

    implementation(projects.core.domain)
    implementation(projects.run.domain)
}