plugins {
    alias(libs.plugins.runique.android.library)
}

android {
    namespace = "com.koto.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}