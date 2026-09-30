plugins {
    id("rikkahub.android.library.compose")
}

android {
    namespace = "me.rerere.material3"
    sourceSets {
        named("main") {
            srcDir("material-color-utilities/kotlin")
        }
    }
}

dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("com.google.android.material:material-color-utilities:1.0.0")
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
}
