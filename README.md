# 🩸 Rakta-Vahini 

**Rakta-Vahini** is an intelligent, real-time blood donation network designed to eliminate the friction in blood emergencies. By leveraging modern Android technologies and real-time cloud synchronization, it connects eligible donors with hospitals and individuals in urgent need within seconds.

---

## 🚀 Key Features

### 🔍 Intelligent Donor Discovery
- **Proximity-Based Search**: Advanced location matching to find donors within a customizable radius (1km - 100km).
- **Smart Scoring**: Donors are ranked based on a composite score of distance, response speed, and historical contribution frequency.
- **Automated Eligibility**: Enforces a strict **90-day cooling period** to ensure donor health and safety.

### 🚨 Emergency SOS System
- **Real-Time Broadcasts**: Users can trigger an urgent SOS for specific blood groups and units.
- **Instant Updates**: SOS requests are synced instantly across the network using Cloud Firestore listeners.

### 🏥 Hospital & Blood Bank Network
- **Verified Directory**: A dedicated list of verified hospitals and blood banks.
- **One-Tap Communication**: Integrated secure call functionality for immediate coordination.

### 🏆 Heroism & Recognition
- **Digital Certificates**: Automated generation of "Certificate of Heroism" for every logged donation.
- **Donation History**: Transparent, real-time feed of donation activities across the network.

### 🌓 Modern User Experience
- **Declarative UI**: Built entirely with **Jetpack Compose** for a fluid and responsive interface.
- **Dynamic Theming**: Full support for high-contrast Light and Dark modes.
- **Haptic Integration**: Tactile feedback for critical actions (SOS, Call, Register).

---

## 🛠️ Tech Stack

- **UI Framework**: [Jetpack Compose](https://developer.android.com/jetpack/compose) (100% Kotlin)
- **Backend**: [Google Firebase](https://firebase.google.com/)
    - **Cloud Firestore**: Real-time NoSQL database for synchronization.
    - **Firebase Auth**: Secure backend user identification.
- **Architecture**: MVI-inspired State Management (`AppState`)
- **Navigation**: Animated Visibility and custom navigation overlays.
- **Build System**: Gradle Kotlin DSL (`.kts`)

---

## 📦 Installation & Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/vijaykumarGK-Developer/rakthavahini.git
   ```

2. **Firebase Configuration**:
   - Place your `google-services.json` in the `app/` directory.
   - Enable **Cloud Firestore** in the Firebase Console.
   - Set Firestore rules to allow read/write for testing.

3. **Build the Project**:
   Open the project in **Android Studio** (Ladybug or newer) and sync Gradle.

4. **Run**:
   Select your device/emulator and click **Run**.

---

## 📱 Screenshots

| Splash & Onboarding | Smart Search | SOS Broadcast |
| :---: | :---: | :---: |
| 🩸 | 🔍 | 🚨 |
*(Add your actual screenshots here)*

---

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

---
**Rakta-Vahini** - *Connecting Hearts, Saving Lives.*
