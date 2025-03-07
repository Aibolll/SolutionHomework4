# Chat Service & Configuration Manager

## 📌 Project Overview
This project demonstrates the use of **Singleton** and **Adapter** design patterns in a Java application. It consists of a **Configuration Manager** (Singleton) for managing application settings and a **Chat Service Adapter** (Adapter) for integrating legacy chat functionality.

## 📂 Project Structure
```
src/
├── com/
│   ├── myapp/
│   │   ├── Main.java
│   │   ├── chat/
│   │   │   ├── ChatService.java
│   │   │   ├── ChatServiceAdapter.java
│   │   │   ├── LegacyChatService.java
│   │   ├── config/
│   │   │   ├── ConfigurationManager.java
```

## 🚀 Features
- **Singleton Pattern:** `ConfigurationManager` ensures a single instance for managing application configurations.
- **Adapter Pattern:** `ChatServiceAdapter` allows the new `ChatService` to work with the old `LegacyChatService`.

## 🛠️ Installation & Setup
1. Clone the repository:
   ```sh
   git clone <repository-url>
   ```
2. Open the project in **IntelliJ IDEA**.
3. Ensure **JDK 11+** is installed.
4. Build and run the project:
   ```sh
   javac -d out src/com/myapp/*.java
   java -cp out com.myapp.Main
   ```

## 📜 Usage
Run `Main.java`, and you should see output demonstrating both design patterns:
```sh
Max Players: 100
Configuration Settings: {...}
Legacy Chat: Hello world!
```

## 📌 Notes
- Make sure `Main.java` is inside the `com.myapp` package to avoid package errors.
- If facing issues, **rebuild the project** (Ctrl + F9 in IntelliJ IDEA).

## 📝 License
This project is licensed under the **MIT License**.

