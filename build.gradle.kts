plugins {
    id("java")
}

group = "datastructures"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:latest"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation ("org.mockito:mockito-core:latest")
    testImplementation("org.hamcrest:hamcrest:latest")
    testImplementation("org.hamcrest:hamcrest-library:latest")
}

tasks.test {
    useJUnitPlatform()
}