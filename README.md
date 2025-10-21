# 📦 Cheapest Parcel

> **Spring Boot 4 (SNAPSHOT)** 기반의 **택배 요금 비교 서비스**  
> 여러 편의점/택배사 요금 데이터를 불러와 **가장 저렴한 요금**을 실시간으로 계산합니다.

---

## 🚀 Tech Stack

- **Java 25**
- **Spring Boot 4.0.0-SNAPSHOT**
  - Web / RestClient / Validation / Security
- **Gradle (Kotlin DSL)**
- **MapStruct 1.6.3**, **Lombok**
- **JUnit 5**, **Spring Boot Test**
- **GraalVM Native (Paketo Buildpacks)**
- **H2 Database (runtime only)**

---

## ⚙️ Build & Run

### 🔧 Build JAR

```bash
./gradlew clean build
```

### ▶️ Run Locally
```bash
java -jar build/libs/cheapest-parcel-0.0.1-SNAPSHOT.jar
```

### 🐳 Build Native Image
```bash
./gradlew bootBuildImage
```

- **이미지 이름: pleasegivemeacoke/cheapest-parcel:0.0.1-SNAPSHOT**
- **빌더: paketobuildpacks/builder-jammy-java-tiny**
- **아키텍처: linux/arm64**

### 🚀 Run Container
```bash
docker run --rm -p 8080:8080 pleasegivemeacoke/cheapest-parcel:0.0.1-SNAPSHOT
```

---

### 🧩 Features
- 📬 **요금 비교 엔진 — 편의점/택배사별 최저가 계산**
- ⚙️ **GraalVM Native — 빠른 부팅, 저메모리 실행**
- 🧰 **MapStruct Mapper — DTO ↔ Domain 자동 매핑**
- 🔒 **Spring Security & Validation — 안정적인 API 구조**

---

### 📚 Commands 
| Command                    | Description |
| -------------------------- | ----------- |
| `./gradlew bootRun`        | 로컬 실행       |
| `./gradlew test`           | 테스트 실행      |
| `./gradlew bootBuildImage` | 네이티브 이미지 빌드 |

---

### 🪪 License
MIT License © 2025 please-give-me-a-coke

---

> “Delivering cheaper parcels at native speed 🚀”
