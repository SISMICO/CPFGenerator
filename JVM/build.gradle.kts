import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
    application
}

group = "br.com.sismico.cpfgenerator"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.5.31")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

//tasks.withType<Jar> {
//    manifest {
//        //attributes["Main-Class"] = "br.com.sismico.cpfgenerator.MainKt"
//        //from(configurations.compileClasspath.map { config -> config.map { if (it.isDirectory) it else zipTree(it) } })
//    }
//}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "br.com.sismico.cpfgenerator.MainKt"
    }
    configurations["compileClasspath"].forEach { file: File ->
        from(zipTree(file.absoluteFile))
    }
}

application {
    mainClassName = "br.com.sismico.cpfgenerator.MainKt"
}