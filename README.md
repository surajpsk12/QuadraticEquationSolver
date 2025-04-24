# Quadratic Equation Solver 📐

A simple Android application that solves quadratic equations of the form **ax² + bx + c = 0**. The app accepts the coefficients of the quadratic equation, calculates the roots, and displays the results in real-time.

---

## Features ✨

- **Real-time Calculation**: Provides the roots (X1 and X2) of the quadratic equation as soon as the user inputs the coefficients.
- **User-friendly Interface**: Simple UI with clear instructions and results.
- **Error Handling**: Displays appropriate error messages when no real solution is found (when the discriminant is negative).
- **Real-Time Data Binding**: Uses Android's data binding feature for seamless updates and calculations.
- **Clear UI Design**: Utilizes Android's ConstraintLayout for a clean and responsive layout.

---

## App Flow 🔄

1. **Input Coefficients**: The user enters the values of **a**, **b**, and **c** for the quadratic equation.
2. **Solve**: Upon clicking the "Solve" button, the app calculates the roots using the quadratic formula:
   \[
   x = \frac{-b \pm \sqrt{b^2 - 4ac}}{2a}
   \]
3. **Display Results**: The roots are displayed on the screen. If the equation has no real roots (discriminant < 0), an error message is shown.

---

## Technologies Used 🛠️

- **Android Studio**: The primary IDE for building and running the Android app.
- **Java**: The programming language used for logic and backend functionality.
- **Android Data Binding**: Used to bind the UI components to the app’s data for real-time updates.
- **ConstraintLayout**: Used for the layout design to ensure a responsive and scalable interface.

---


## How to Use 📲

1. Clone this repository to your local machine.
   ```bash
   git clone https://github.com/surajpsk12/quadratic-equation-solver.git
   ```

2. Open the project in **Android Studio**.

3. Run the app on an emulator or a physical Android device.

4. Input the coefficients **a**, **b**, and **c**, and click the **Solve** button to calculate the roots.

---

## Installation 🏗️

To run the app on your own machine, make sure you have **Android Studio** installed. Follow these steps:

1. Download and install **Android Studio**:  
   [Download Android Studio](https://developer.android.com/studio)

2. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/surajpsk12/quadratic-equation-solver.git
   ```

3. Open the project in Android Studio and build the project:
   - Go to **File > Open** and select the cloned repository.
   - Click **Run** or press **Shift + F10** to launch the app on an emulator or connected device.

---

## How the Quadratic Equation Solver Works 🧮

The app uses the quadratic formula to solve equations of the form:

\[
ax^2 + bx + c = 0
\]

The discriminant (Δ) is calculated as:

\[
Δ = b^2 - 4ac
\]

- If **Δ > 0**, two real roots exist and are displayed.
- If **Δ = 0**, there is exactly one real root (repeated root).
- If **Δ < 0**, no real roots exist, and an error message is displayed.

---

## Contributing 🤝

If you'd like to contribute to this project:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-name`).
3. Make your changes and commit (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Open a pull request.

---

## License 📄

This project is licensed under the MIT License – see the [LICENSE](LICENSE) file for details.

---

## Acknowledgments 🙏

- **Android Developers**: For the wonderful tools and documentation.
- **Stack Overflow**: For helping with debugging and solutions.
- **Google Material Design**: For the UI/UX inspiration.

---

