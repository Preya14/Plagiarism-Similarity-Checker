# 📄 Plagiarism Similarity Checker (LCS Based)

## 📌 Description
This project detects similarity between two texts using the Longest Common Subsequence (LCS) algorithm. It is designed for computer engineering students to understand dynamic programming and its real-world application.

---

## 🎯 Features
- Compare two texts manually or using .txt files
- Uses LCS (Dynamic Programming)
- Word-level comparison for better accuracy
- Displays similarity percentage
- Shows common words (LCS)

---

## 🛠️ Tech Stack
- Java
- VS Code
- Git & GitHub

---

## ⚙️ How It Works
1. Input is taken (manual or file)
2. Text is preprocessed (lowercase, cleaned)
3. LCS algorithm is applied
4. Similarity percentage is calculated

---

## 📊 Formula Used
Similarity (%) = (2 × LCS length) / (len1 + len2) × 100

---

## ▶️ How to Run

```bash
javac src/*.java
java -cp src Main

## 🌐 Web Demo

Try the web version here:
👉 https://java-link-maker--preyagajjar.replit.app

### Instructions:
- Enter two texts
- Press Enter after each input
- View similarity percentage and common words