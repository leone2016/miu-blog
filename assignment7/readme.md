# Java Spring Boot Deployment to AWS EC2

This project demonstrates how to deploy a simple Java Spring Boot web API to a public AWS EC2 instance.

---



## Project Info

- **API**: `GET /api/students`
- **Tech**: Java 17, Maven, Spring Boot
- **Deployment Target**: AWS EC2 (Ubuntu 22.04)

---

## Prerequisites

- AWS Account with Free Tier
- EC2 key pair (`.pem` file)
- Java 17 and Maven installed locally
- Git Bash or PowerShell (for SCP and SSH)

---

## Steps to Deploy

### 1. Clone and Run Locally

```bash
git clone https://github.com/Thao-V/maven-starter-for-ec2.git
cd maven-starter-for-ec2
mvn spring-boot:run

Test in browser:

http://localhost:8080/api/students

### 2. Build the Project

mvn clean package
Output: target/hw6-0.0.1-SNAPSHOT.jar

3. Launch EC2 Instance
OS: Ubuntu 22.04

Type: t2.micro (Free Tier)

Open ports:

22 (SSH)

8080 (Spring Boot)

Key pair: springboot-key-pair.pem

4. Upload the JAR to EC2
From local terminal:
scp -i C:/Users/**/Downloads/springboot-key-pair.pem "C:/Users/**/Documents/MIU/SWE/maven-starter-for-ec2/target/hw6-0.0.1-SNAPSHOT.jar" ubuntu@<EC2_PUBLIC_IP>:~/app.jar

5. SSH into EC2 and Install Java
ssh -i springboot-key-pair.pem ubuntu@<EC2_PUBLIC_IP>

On EC2:
sudo apt update
sudo apt install openjdk-17-jdk -y

6. Run the Application
java -jar app.jar

7. Test the API
Open in browser:
http://<EC2_PUBLIC_IP>:8080/api/students

[
  { "id": "1", "name": "Alice", "email": "alice@example.com" },
  { "id": "2", "name": "Bob", "email": "bob@example.com" },
  { "id": "3", "name": "Charlie", "email": "charlie@example.com" }
]

Cleanup
To avoid charges:

Go to EC2 → select instance → Instance state → Terminate

Author:
Amine Atmani

```

## ScreenShots

![](/Users/leone/Documents/MIU/miu-blog/assignment7/instance ec2.png)<small>Instance EC2 running</small>

![](/Users/leone/Documents/MIU/miu-blog/assignment7/image.png)<small>Screenshots the API using the public IP/DNS of the above EC2.</small>
