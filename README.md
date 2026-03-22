# LAB2 – Calculateur d'impôts locaux

A simple Android tax calculator built as part of a mobile development lab. The user enters a surface area, number of rooms, and whether the property has a swimming pool — the app calculates the total local tax.

---

## Demo



https://github.com/user-attachments/assets/6a33ea9c-8eb3-4e25-8b7b-20ad7ea53ada


---

## Screenshots

| Project Setup | App Running |
|---|---|
| ![Setup](https://github.com/user-attachments/assets/10b98901-e81f-46e1-a806-2949c2059788) | ![App](https://github.com/user-attachments/assets/a05d4d24-5706-4cfe-b1c8-c99a2cfc0461) |

---

## Features

- Enter surface area in m²
- Enter number of rooms
- Toggle swimming pool option via CheckBox
- Tap **"Calculer"** to compute the total tax
- Result displayed instantly on screen

---

## Tax Formula

| Component | Calculation |
|---|---|
| Base tax | Surface × 2.0 DH |
| Room supplement | Rooms × 50 DH |
| Pool supplement | +100 DH if checked |
| **Total** | **Base + Room + Pool** |

---

## Project Structure

```
LAB2-ImpotCalculator/
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/lab2/
│           │   └── MainActivity.java
│           └── res/
│               └── layout/
│                   └── activity_main.xml
└── README.md
```

---

## Tech Stack

- **Language:** Java
- **Platform:** Android
- **Min SDK:** API 24 (Android 7.0)
- **IDE:** Android Studio

---

## Key Concepts Used

| Concept | Description |
|---|---|
| `EditText` | Input field for user to type values |
| `CheckBox` | Boolean toggle for swimming pool option |
| `Double.parseDouble()` | Converts String input to decimal number |
| `Integer.parseInt()` | Converts String input to whole number |
| `isChecked()` | Reads the state of the CheckBox |
| `setText()` | Updates the result TextView |
| Ternary operator | `piscine ? 100 : 0` compact if/else |

---

## How to Run

1. Clone this repository
```bash
git clone https://github.com/Laila071/LAB2-ImpotCalculator.git
```
2. Open the project in **Android Studio**
3. Run it on an emulator or a physical device using the **Run** button

---

## Author

- **Name:** Laila ELAMIRI
- **Course:** Mobile Development
- **Year:** 2026
