plugins {
	java
	id("org.springframework.boot") version "3.2.0"
	id("io.spring.dependency-management") version "1.1.4"
	id("org.sonarqube") version "4.4.1.3373"
	
}

group = "id.ilmudata"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

sonarqube {
    properties {
        property("sonar.projectName", "hello-springboot-gradle")
        property("sonar.projectKey", "hello-springboot-gradle")
        property("sonar.host.url", "http://localhost:9000") // Change to your SonarQube server URL
        property("sonar.gradle.skipCompile", true)        
    }
}
