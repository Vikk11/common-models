plugins {
    kotlin("jvm") version "1.9.0"
    `java-library`
    `maven-publish`
}

group = "com.savvy"
version = "1.0.0"

repositories {
    mavenCentral()
}

java {
    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = "com.savvy"
            artifactId = "common-models"
            version = "1.0.0"
        }
    }
    repositories {
        maven {
            url = uri("file:///app/common-models-repo")
        }
    }
}