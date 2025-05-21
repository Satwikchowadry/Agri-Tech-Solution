# 🌱 **AgriTech Solutions**

AgriTech Solutions is a full-stack web application designed to assist farmers and gardeners in selecting optimal crops (vegetables, flowers, herbs) based on season, soil type, and weather. It provides crop info, task reminders, and real-time weather updates for smarter farming decisions.

---

## 🎥 Video Demonstration

> 🔗 [Watch the Demo on YouTube](https://drive.google.com/file/d/1jvlrEI8wQNHFQx45TqFLB62S-FIAnfNv/view?usp=sharing)
>
> 
## 📄 Project Documents


- [📘 Software Requirements Specification (SRS)](https://github.com/Satwikchowadry/Agri-Tech-Solution/blob/main/Project%20Software%20Design%20Specification.pdf)
- [🛠️ Software Design Specification (SDS)](https://github.com/Satwikchowadry/Agri-Tech-Solution/blob/main/Project%20Software%20Design%20Specification.pdf)
- [🛠️ Test Plan (TP)](https://drive.google.com/file/d/13cEGzpiv32_gFHjhwZ5-M0u3llzpGZ99/view?usp=drivesdk)


## 🚀 **Features**

### 🌿 Plant Database
- Detailed information about various crops (soil requirements, fertilizers, pests, etc.)

### 📅 Reminders
- Set reminders for gardening tasks like watering, fertilizing, and harvesting

### 🌤 Weather Integration
- Real-time weather updates powered by **OpenWeatherMap API**, tailored to user location

### 🔍 Smart Crop Suggestions
- Recommends crops based on soil type and season

### 👥 User Management
- Create and manage user accounts

---

## 🛠 **Tech Stack**

| **Layer**           | **Technology**                                 |
|---------------------|------------------------------------------------|
| 🖥️ Frontend         | HTML5, CSS3, JavaScript (Vanilla)              |
| 🌍 Frontend Hosting | Netlify                                        |
| 🧠 Backend          | Spring Boot (Java) REST API                    |
| 🧪 API Testing      | Swagger UI, Postman                            |
| 🌿 NoSQL Database   | MongoDB Atlas (for plant data)                 |
| 📝 SQL Database     | MySQL / PostgreSQL (for users & reminders)     |
| 🌦 Weather API      | OpenWeatherMap API                             |

---

## 🧾 **Setup Instructions**

### 1️⃣ Frontend

- No build tools required — just static files.
- Run locally:

-bash
open index.html
Or deploy to Netlify by dragging and dropping your project folder.

2️⃣ Backend
Clone the Spring Boot backend repo:

bash
git clone https://github.com/your-repo/agritech-backend.git


Set your application.properties:

properties
spring.data.mongodb.uri = YOUR_MONGODB_URI

spring.datasource.url = YOUR_SQL_URL

spring.datasource.username = YOUR_SQL_USERNAME

spring.datasource.password = YOUR_SQL_PASSWORD

Run the Spring Boot app:
bash
./mvnw spring-boot:run


🧪 Testing

	•	✅ API endpoints tested using Swagger UI & Postman
 
	•	✅ Functional testing with a spreadsheet documenting test cases, inputs, and expected results.

Functional testing documented using test cases, inputs, and expected results


🔒 Future Enhancements


✅ Full user authentication (JWT or OAuth2)

✅ Admin panel for dynamic plant management

✅ Cloud backend deployment (e.g., Render, Heroku)


📸 Demo Screenshots / UI (optional)

Add screenshots or a demo video link here for a quick visual reference!


🤝 Contributing

Fork the repository

1)Create a new branch

2)Commit your changes

3)Push to the branch

4)Create a Pull Request


📄 License

This project was created as part of an academic course by students of Mahindra University.
It is intended for educational and demonstration purposes only.


















