# AnimationBall
This is basically a minor project made by java awt , i made this in my initial day of coding while i practicing the frame work of java.

![alt text](<Screenshot 2024-07-02 172116.png>)
![alt text](<Screenshot 2024-07-02 172103.png>)

## Description

`AnimationBall` is a simple Java program that creates an animated ball within a graphical window using the AWT (Abstract Window Toolkit). The ball moves within the frame, bouncing off the edges.

## Features

- Graphical window with a moving ball.
- Ball changes direction when it hits the boundaries of the window.
- Customizable window title, size, background color, and icon image.

## Requirements

- Java Development Kit (JDK) 8 or higher.

## How to Run

1. **Compile the Java file:**
   ```bash
   javac AnimationBall.java


## Code Structure
### Imports:

java.awt.*: For graphical components.
java.awt.event.WindowAdapter: For handling window events.

## Class AnimationBall:

Extends Frame and implements Runnable to create a window and handle the animation in a separate thread.
Constructor:

Sets up the window, initializes the ball's position and direction, and starts the animation thread.
Methods:

paint(Graphics g): Draws the red ball at the current coordinates.
run(): Main animation loop that updates the ball's position and handles collisions.
Main Method:

Initializes and configures the window (title, icon, background color, size) and makes it visible.
Customization
## Icon Image:

Update the file path in the main method to change the icon image:
java
Copy code
Image logoImage = Toolkit.getDefaultToolkit().getImage("path_to_your_image.jpg");
Background Color:

Update the background color in the main method:
java
## Copy code
animationBall.setBackground(Color.YOUR_COLOR);
## Notes
Ensure the icon image path is correct and accessible from your system.
Adjust the window size and ball speed as needed.
