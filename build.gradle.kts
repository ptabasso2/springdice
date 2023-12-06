plugins {
	java
	//id("org.springframework.boot") version "2.7.18"
	id("org.springframework.boot") version "3.2.0"
	id("io.spring.dependency-management") version "1.1.4"
}

configurations.all {
	resolutionStrategy.eachDependency {
		if (requested.group == "io.opentelemetry" && requested.name !in listOf("opentelemetry-semconv", "opentelemetry-api-events", "opentelemetry-extension-incubator")) {
			useVersion("1.32.0")

		}
	}
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("io.opentelemetry:opentelemetry-api:1.32.0")
	implementation("io.opentelemetry:opentelemetry-sdk:1.32.0")
	implementation("io.opentelemetry:opentelemetry-sdk-metrics:1.32.0")
	implementation("io.opentelemetry:opentelemetry-exporter-logging:1.32.0")
	implementation("io.opentelemetry:opentelemetry-semconv:1.23.0-alpha")
	implementation("io.opentelemetry:opentelemetry-sdk-extension-autoconfigure:1.32.0")
	implementation("io.opentelemetry:opentelemetry-sdk-extension-autoconfigure-spi:1.32.0")
	implementation("io.opentelemetry:opentelemetry-exporter-otlp:1.32.0")

}




