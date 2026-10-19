# 📦 Full-Stack Inventory Dashboard

A modern, responsive full-stack inventory management application built to demonstrate enterprise backend architecture paired with a reactive single-page frontend.

---

## 🛠️ Tech Stack

### Backend
* **Java 17**
* **Spring Boot 4.1.1**
* **Spring Data JPA**
* **H2 In-Memory Database** (Zero configuration required for local testing)
* **Spring Web / RESTful APIs**

### Frontend
* **Angular** (Standalone Architecture)
* **TypeScript**
* **RxJS**
* **HTML5 / Modern CSS3** (Flexbox, Grid, custom UI styling)

---

## ✨ Features

* **Real-Time Inventory Tracking:** Instant synchronization between the frontend dashboard and the backend database.
* **Add Products:** Form inputs to create new inventory items with name, quantity, and price validation.
* **Instant Search Filtering:** Filter through large inventory lists dynamically by product name.
* **Live Calculations:** Automatic calculation of total inventory items and overall inventory valuation.
* **Delete Operations:** Remove products seamlessly with RESTful DELETE endpoints.

---

## 📂 Project Structure

```text
fullstack-inventory-dashboard/
├── backend/                  # Spring Boot Maven project
│   ├── src/main/java/        # Models, Repositories, Controllers
│   └── src/main/resources/   # Application properties & H2 config
└── frontend/                 # Angular CLI standalone project
    └── src/app/              # Components, Services, and Models
cd frontend

Install dependencies(Terminal):
Bash
npm install

Start the Angular development server(Terminal):
Bash
npx ng serve
