# Quiz Game

## Overview
A quiz game made in Java using SQL where you, as the developer, can choose what questions to use. This project allows you to create your own quizzes in the future.

## Project Structure
The `src` directory contains two subdirectories, `Quiz` and `Test`. The key parts that users are supposed to customize are highlighted.

## Database Configuration (Database.java)
The `Database.java` file allows you to connect to your database by inserting the URL, username, and password. At the end of the game, the player's name and score will be added to your database. Ensure that your database is set up appropriately, with the first column for player names and the second for player scores.

## Question Setup (Questions.txt)
The `Questions.txt` file is where you write your questions and answers. Each row represents a new question. Here's an example format: Capital of France?Paris
