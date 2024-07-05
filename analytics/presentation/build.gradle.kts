plugins {
    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "com.koto.analytics.presentation"
}

dependencies {
    implementation(projects.analytics.domain)
}